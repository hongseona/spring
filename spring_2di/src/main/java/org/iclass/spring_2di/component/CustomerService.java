package org.iclass.spring_2di.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class CustomerService {
    private CustomerDao dao;

    @Autowired      // => 자동 주입 없을 때 NullPoninterException 확인하기 (@Autowired 없으니까 setter를 자동으로 실행하지 않아 dao bean을 가져오지 않음.-> 아래 출력 모두 오류 )
    public void setDao(CustomerDao dao) {
        this.dao = dao;
        log.info("setDao 실행완료 !!");
    }

    public void test() {
        log.info("CustomerService setter- dao : {}", this.dao.getClass().toString());
        dao.setGroups();
    }

    public void print() {
        log.info("service message : HI~");
    }
}
