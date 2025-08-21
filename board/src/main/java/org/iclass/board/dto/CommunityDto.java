package org.iclass.board.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class CommunityDto {
    private  long idx;
    private  String writer;
    private  String title;
    private  String content;
    private  int readcount;
    private  Date createdat;
    private  String ip;
    private  String commentcount;
}
