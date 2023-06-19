package com.shubham.ems;

import org.junit.jupiter.api.MethodOrderer.Random;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestMethodOrder(value = Random.class)
class EmsApplicationTests {
	
	@RepeatedTest(value = 3)
	public void name() {
		
	}

	

	@Test
	@Order(value = 0)
	void contextLoads() {
		
	}
	
	@Test
	@Order(value = 1)
	public void test2() {
		// TODO Auto-generated method stub

	}

}
