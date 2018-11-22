package com.wallmonkey.test;

import java.io.File;

import com.asprise.ocr.Ocr;

public class ReadCaptcha 
{
	public static void main(String[] args)
	{
		String path = "C:\\Users\\jogendras\\eclipse-workspace\\Wallmonkey\\src\\main\\resources\\captcha-1.png";
		
		Ocr.setUp();
		Ocr ocr = new Ocr();
		ocr.startEngine("eng", Ocr.SPEED_SLOW);
		
		String s = ocr.recognize(new File[] {new File(path)}, Ocr.RECOGNIZE_TYPE_ALL, Ocr.OUTPUT_FORMAT_PLAINTEXT);
		System.out.println("Result: " + s);
		ocr.stopEngine();
	}
	

}
