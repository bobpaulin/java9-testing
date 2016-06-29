package com.bobpaulin.impl;

import com.bobpaulin.AddService;

public class AddServiceImplTest {
	public static void main(String[] args) {
		AddService service = new AddServiceImpl();
		assert(service.add(4, 5)== 8):"4 + 5 is 9";
	}
}
