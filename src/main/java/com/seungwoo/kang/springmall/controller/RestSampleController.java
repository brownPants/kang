package com.seungwoo.kang.springmall.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seungwoo.kang.springmall.vo.Sample;

@RestController
public class RestSampleController { // Rest API
	
	@RequestMapping(value="/sample/getRestSample")
	public Sample getRestSample() {
		return new Sample(1, "guest", "1234"); // {"sampleNo":1, ...
	}
	
}
