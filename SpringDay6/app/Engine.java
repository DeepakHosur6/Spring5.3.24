package com.xworkz.SpringDay6.app;

import java.awt.Window.Type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Engine {
	
	private String eName;
	private Type etype;
	private String enumber;
	@Value("4.0")
	private Double eversion;
	private String ecompany;
	private String estroke;


	@Autowired
	public Engine(@Qualifier("engName") String eName,@Qualifier("etype") Type etype, String ecompany) {
		super();
		this.eName = eName;
		this.etype = etype;
		this.ecompany = ecompany;
	}

	@Autowired
	@Qualifier("stroke")
	public void setEstroke(String estroke) {
		this.estroke = estroke;
	}

	@Override
	public String toString() {
		return "Engine [eName=" + eName + ", etype=" + etype + ", enumber=" + enumber + ", eversion=" + eversion
				+ ", ecompany=" + ecompany + ", estroke=" + estroke + "]";
	}
}
