package org.iclass.board.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class CommunityCommentsDto {
    private Integer idx;
    private Integer mref;
    private String writer;
    private String content;
    private Date creatDat;
    private Integer ip;
    private Integer heart;
}
