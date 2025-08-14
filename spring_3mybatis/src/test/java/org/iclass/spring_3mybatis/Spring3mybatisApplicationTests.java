package org.iclass.spring_3mybatis;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.iclass.spring_3mybatis.dto.CustomerDto;
import org.iclass.spring_3mybatis.mapper.BuyMapper;
import org.iclass.spring_3mybatis.mapper.ProductMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class Spring3mybatisApplicationTests {
// ✅단위 테스트 내용: mapper 인터페이스의 구현체의 동작 확인.
// 참고: 테스트 클래스는 필드 주입 사용합니다.
//		 @Test 테스트 메소드는 success, fail 로 결과를 표시합니다. 
//		 ㄴ 검증 메소드 assertXXXX(테스트 대상) 입니다. XXXX 은 기대값의 상태를 나타내는 키워드

@Autowired
private BuyMapper buyMapper;
@Autowired
private ProductMapper productMapper;

	@Test	// 테스트할 메소드에 표시하는 어노테이션
	void contextLoads() {
		assertNotNull(buyMapper);			// "buyMapper 의 내용이 NotNull일 것이라고 기대한다"
		assertNotNull(productMapper);
	}

	@Test
	void select() {
		log.info("{}", buyMapper.selectAllCountByYear());
		assertNotEquals(0,buyMapper.selectAllCountByYear().size());		// "0"이 아니길 기대한다
	}

	@Test
	void mapper2() {
		assertNotNull(productMapper);
	}

	// @Test
	// void join() {
	// 	customerMapper.insert(new CustomerDto("jjangu","김장구","jj@korea,kr",25,null));
	// assertEquals(1, result);
	// }

}
