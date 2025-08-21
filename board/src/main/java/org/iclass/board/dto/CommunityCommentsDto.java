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
@NoArgsConstructor
@Builder
public class CommunityCommentsDto {
    private int idx;
    private int mref;
    private String writer;
    private String content;
    private Date createdAt;
    private String ip;
    private int heart;
}
