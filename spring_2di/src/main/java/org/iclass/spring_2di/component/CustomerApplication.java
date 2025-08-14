package org.iclass.spring_2di.component;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication      // 스프링부트 애플리케이션의 시작점을 표시하고 설정, 자동, 구성, 컴포너트 스캔 기능을 한번에 켜주는 어노테이션
@Slf4j
public class CustomerApplication {

    public static void main(String[] args) {
        ApplicationContext context =
        SpringApplication.run(CustomerApplication.class, args);
        
		log.info("------------------------------------------");
		CustomerDao dao = context.getBean(CustomerDao.class);               // 타입으로 bean 매칭(bean 은 기본이 싱글톤)
        // CustomerDao dao2 = (CustomerDao) context.getBean("customerDao")  // 이름으로 bean
        // 매칭
		dao.setGroups();
		CustomerService service = context.getBean(CustomerService.class);
		service.test();
        CustomerController controller = context.getBean(CustomerController.class);
        controller.test();

    }
}

