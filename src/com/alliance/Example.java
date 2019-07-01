package com.alliance;

public class Example {
	public static void main(String[] args) {
		int width = 10;
		Drawable d2 = () -> {
			System.out.println("drawing" + width);
		};
		d2.draw();
	}
}
