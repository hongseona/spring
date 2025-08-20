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
public class CommunityDto {
    private  Integer idx;
    private  String writer;
    private  String title;
    private  String content;
    private  Integer readcount;
    private  Date createdat;
    private  Integer ip;
    private  Integer commentcount;
}
