package org.iclass.spring_1demo.old;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DemoService {
    private DemoDao dao;

    public DemoService() {
        this.dao = new DemoDao();   // 객체를 직접 생성하여 할당
        log.info("DemoService 생성자 - dao : {}", this.dao.getClass().toString());
        // this.getClass()
    }
}
