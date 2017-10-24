package snishal;

import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.*;

public class HelloTag extends SimpleTagSupport {


	private String name;

	public void setName(String name){

		this.name = name;

	}  
	
	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		out.println("Hello " + this.name);
	}
 
}
