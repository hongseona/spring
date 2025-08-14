package org.iclass.spring_2di.component;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component      // dao에 의존관계가 없더라도 컴포넌트를 하지 않으면 service가 가져갈 수 없음
@Slf4j
public class CustomerDao {
    private List<String> groups;

    public void setGroups() {   // setGroups 는 메소드
        this.groups = List.of("user", "admin", "manager");
        log.info("CustomerDao setter - groups : {}", groups.toString());
    }
}
