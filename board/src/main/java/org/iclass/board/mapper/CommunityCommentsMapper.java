package org.iclass.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.iclass.board.dto.CommunityCommentsDto;

@Mapper
public interface CommunityCommentsMapper {
    CommunityCommentsDto selectByPk(long idx);

    List<CommunityCommentsDto> selectAll();

    int insert(CommunityCommentsDto dto);

    int update(CommunityCommentsDto dto);

    int delete(CommunityCommentsDto dto);

}
