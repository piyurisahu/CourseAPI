package com.piyuri.spring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	
	private static List<Topic> topics=new ArrayList(Arrays.asList(new Topic(1,"DataStructure","Stack,List,Arry etc"),
													new Topic(2,"Operating System","Linux,window,red hat"),
													new Topic(3,"Algorithm","quick sort,insertion sort etc")));
	
	
	public List<Topic> getAllTopics()
	{
		return topics;
	}


	public Topic getTopic(int id) {
		// TODO Auto-generated method stub
		
	for(Topic topic:topics)
	{
		if(topic.getId()==id)
			return topic;
	}
	return null;
	}


	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		 
			topics.add(topic);
	}


	public void updateTopic(Topic topic, int id) {
		// TODO Auto-generated method stub
		for(int i=0;i<topics.size();i++)
		{
			Topic c=topics.get(i);
			if(c.getId()==id)
				
			{
				topics.set(i, topic);
			}
			
		}
	}


	public void deleteTopic(int id) {
		// TODO Auto-generated method stub
		
		
		topics.removeIf(t->t.getId()==id)
		;
	}
	
	

	

}
