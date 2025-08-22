package org.iclass.board.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.iclass.board.dto.CommunityDto;
import org.iclass.board.dto.PageResponseDto;
import org.iclass.board.mapper.CommunityMapper;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor		
// private CommunityMapper mapper; 를 파라미터로 받는 생성자를 자동 생성.
// => 위 어노테이션을 통해 스프링이 communityMapper 자동 주입 가능
@Slf4j
// 디버깅용으로 log.info() 사용 가능
@Service
public class CommunityService {
	private CommunityMapper mapper;		
	// mybatis가 만들어둔 CommunityMapper bean이 주입됨
	// 이 mapper 의 메소드들은 XML 의 mapper id=...와 연결되어 sql 실행됨

	public List<CommunityDto> selectAll() {		// 게시글 전체 목록을 가져옴
		return mapper.selectAll();
		// service -> mapper 로 위임
	}

	public PageResponseDto getPageList(int currentPage) {
		Map<String, Integer> map = new HashMap<>();
		// map.put("startNo", 1); map.put("endNo", 10);// 1페이지 글의 행번호
		int pageSize = 7; // 한 페이지에 글 몇개인지 설정 변수. 다른 값으로 변경 가능
		int startNo = (currentPage - 1) * pageSize + 1;
		int endNo = startNo + (pageSize - 1);
		map.put("startNo", startNo);
		map.put("endNo", endNo);

		// 글 전체 갯수
		int totalCount = mapper.getAllCount();

		// 페이지 개수 공식
		double temp = (double) totalCount / pageSize; // 실수값 -> 297/10 = 29.7
		int totalPages = (int) Math.ceil(temp); // 반올림해서 정수로 29.7을 정수로 반올림 30.0

		// 현재 페이지를 기준으로 ✅페이지목록(10개 페이지 지정) 시작번호
		// currentPage 가 1~10 , 11~20 , 21~30 은 각각 모두 같은 startPage 가 계산됩니다.
		int s = 7; // 다른 값 5,7,10,20 .... => 페이지 버튼의 갯수
		int startPage = (currentPage - 1) / s * s + 1; // s=10 일때 ,currentPage 21~30 은 모두 21
		int endPage = startPage + (s - 1); // 모두 30
		endPage = Math.min(totalPages, endPage); // endPage 는 totalPages 보다 크면 안됩니다.

		PageResponseDto responseDTO = PageResponseDto.builder()
				.totalCount(totalCount)
				.totalPages(totalPages)
				.startPage(startPage)
				.endPage(endPage)
				.list(mapper.selectPageList(map))
				.build();

		return responseDTO;
	}

	// 단일 게시글 상세 조회
	public CommunityDto read(long idx, boolean readCount) {	// readCount=true -> 조회수 +1
		if (readCount) 
			mapper.setReadCount(idx);		// 조회수 증가
		return mapper.selectByIdx(idx);
		
	}

	// 새 게시글 등록
	public void write(CommunityDto dto) {	// dto(작성자,제목,내용 등) 를 그대로 매퍼에 전달
		mapper.insert(dto);
	}

	// 글 수정
	public void save(CommunityDto dto) {	// dto 에 담긴 idx 를 기준으로 수정
		mapper.update(dto);
	}

	// 글 삭제
	public void remove(int idx) {
		mapper.delete(idx);
		// 메소드/매퍼는 대부분 long 을 사용
	}




}
