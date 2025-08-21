package org.iclass.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.iclass.board.dto.CommunityDto;

@Mapper
public interface CommunityMapper {

    int getAllCount();

    List<CommunityDto> selectAll();

    int insert(CommunityDto dto);

    CommunityDto selectByIdx(long idx);

    int setReadCount(long idx);

    int update(CommunityDto dto);

    int delete(long idx);
}
