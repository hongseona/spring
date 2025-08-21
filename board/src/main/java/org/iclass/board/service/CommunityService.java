package org.iclass.board.service;

import java.util.List;

import org.iclass.board.dto.CommunityDto;
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
