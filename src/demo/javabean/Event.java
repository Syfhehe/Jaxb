package demo.javabean;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "event", propOrder = { "processApp", "snapshot", "ucaname", })
public class Event {
	
	@XmlAttribute
	private String processApp;
	
	@XmlAttribute
	private String snapshot;
	
	@XmlAttribute
	private String ucaname;

	public String getProcessApp() {
		return processApp;
	}

	public void setProcessApp(String processApp) {
		this.processApp = processApp;
	}

	public String getSnapshot() {
		return snapshot;
	}

	public void setSnapshot(String snapshot) {
		this.snapshot = snapshot;
	}

	public String getUcaname() {
		return ucaname;
	}

	public void setUcaname(String ucaname) {
		this.ucaname = ucaname;
	}
	
}
