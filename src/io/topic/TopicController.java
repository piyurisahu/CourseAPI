package io.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	
	@RequestMapping("/topics")
	public String getTopics()
	{
		return "topics";
	}
	@RequestMapping("/hellos")
	public String sayHello()
	{
		return "hello";
	}
}
