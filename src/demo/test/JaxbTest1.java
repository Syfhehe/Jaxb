package demo.test;

import java.util.ArrayList;
import java.util.List;

import demo.JaxbUtil;
import demo.javabean.Event;
import demo.javabean.Eventmsg;
import demo.javabean.Parameter;

public class JaxbTest1 {
	
	public static void main(String[] args){
		Eventmsg eventMsg = new Eventmsg();
		
		Event event = new Event();
		event.setProcessApp("processApp");
		event.setSnapshot("snapshot");
		event.setUcaname("ucaname");
		event.setValue("eventName");
		
		Parameter parameter1 = new Parameter();
		parameter1.setKey("key1");
		parameter1.setValue("value1");
		Parameter parameter2 = new Parameter();
		parameter2.setKey("key2");
		parameter2.setValue("value2");
		
		List<Parameter> parameters = new ArrayList<Parameter>();
		parameters.add(parameter1);
		parameters.add(parameter2);
		
		eventMsg.setParameters(parameters);
		eventMsg.setQueue("queue");
		eventMsg.setEvent(event);
		eventMsg.setParameters(parameters);
		
		 String str = JaxbUtil.convertToXml(eventMsg); 
		 System.out.println(str);
	}
}
