package org.iclass.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.iclass.board.dto.CommunityDto;

@Mapper
public interface CommunityMapper {
    CommunityDto selectByPk(Integer idx);

    List<CommunityDto> selectAll();

    int insert(CommunityDto dto);

    int update(CommunityDto dto);

    int delete(CommunityDto dto);
}
