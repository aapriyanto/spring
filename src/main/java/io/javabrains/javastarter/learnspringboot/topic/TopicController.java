package io.javabrains.javastarter.learnspringboot.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("java", "Java", "Java Description"),
				new Topic("javascript", "JavaScript", "JavaScript Description"),
				new Topic("spring", "Spring", "Spring Description"),
				new Topic("html", "HTML", "HTML Description")
				);
	}
}
