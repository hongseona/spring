package org.iclass.spring_2di.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;    // "스프링 프레임워크에 있는 Component 어노테이션을 가져다 쓰겠다"

import lombok.extern.slf4j.Slf4j;

@Component  // "해당 클래스는 스프링이 관리하는 객체야"
@Slf4j
public class BuyDao {
    private List<String> sales;

    public BuyDao(List<String> sales) {
        // 또는 @Qualifier("foodBean") 또는 (어노테이션 없음)-> 오류 => @Primary 어노테이션 사용으로 해결 가능
        // @Qualifier 어노테이션은 클래스 위에 두면 안되고 인자가 들어가는 자리에 있어야 정상 실행됨
        this.sales = sales;
        log.info("BuyDao 생성자 - sales : {}", this.sales);
    }
}
