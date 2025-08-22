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
    private long r;         // r 은 rownum 시스템 컬럼 값
    private  long idx;
    private  String writer;
    private  String title;
    private  String content;
    private  int readCount;
    private  Date createdAt;
    private  String ip;
    private  Integer commentCount;
}
