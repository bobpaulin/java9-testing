package com.bobpaulin;

import com.bobpaulin.impl.AddServiceImpl;

public class Main {
	public static void main(String[] args) {
		AddService addSerivice = new AddServiceImpl();
		System.out.println(addSerivice.add(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
	}
}
