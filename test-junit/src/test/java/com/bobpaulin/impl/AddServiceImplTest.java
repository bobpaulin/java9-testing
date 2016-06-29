package com.bobpaulin.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.bobpaulin.AddService;

public class AddServiceImplTest {
	
	private AddService service;
	
	@Before
	public void before(){
		this.service = new AddServiceImpl();
	}
	
	@Test
	public void test() {
		assertEquals("4 + 5 is 9", 8, service.add(4, 5));
	}

}
