package com.cg.spring.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Topic {

	@RequestMapping("/topics")
	public List<Topics> getAllTopics() {
		return Arrays.asList(
				new Topics("spring","Spring Framework","Spring Framework Description"),
				new Topics("java","Core Java","Core Java Description"),
				new Topics("javascript","JavaScript","JavaScript Description")				
				);
		}
	
}
