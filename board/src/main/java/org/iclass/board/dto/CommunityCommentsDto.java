package org.iclass.board.dto;

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
    // private Date createdAt;          // 문자열 변환 출력 yyyy-mm-dd
    private String ip;
    private int heart;
}
