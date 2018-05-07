package demo.javabean;


import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;  
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)  
@XmlRootElement
@XmlType( propOrder = { "event", "queue", "parameters" })  
public class Eventmsg {
	
    @XmlElement(name = "event")  
	private Event event;
	
    @XmlElement
	private String queue;
	
    @XmlElementWrapper(name = "parameters")  
    @XmlElement(name = "parameter")  
	private List<Parameter> parameters;

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public String getQueue() {
		return queue;
	}

	public void setQueue(String queue) {
		this.queue = queue;
	}

	public List<Parameter> getParameters() {
		return parameters;
	}

	public void setParameters(List<Parameter> parameters) {
		this.parameters = parameters;
	}


}
