package edu.neu.cs5200.rest.hello;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello") //this class maps to hello--after rest if follow hello--maps to this class
public class Hello {
	
	@GET
	@Path("/objs")
	@Produces(MediaType.APPLICATION_JSON) //how to choose type?
	public List<HelloMessage> sayManyHello()
	{
		HelloMessage myObj1=new HelloMessage("Hello 1", 123);
		HelloMessage myObj2=new HelloMessage("Hello 2", 234);
		HelloMessage myObj3=new HelloMessage("Hello 3", 345);
		HelloMessage myObj4=new HelloMessage("Hello 4", 456);
		HelloMessage myObj5=new HelloMessage("Hello 5", 567);
		List<HelloMessage> messages=new ArrayList<HelloMessage>();
		messages.add(myObj1);
		messages.add(myObj2);
		messages.add(myObj3);
		messages.add(myObj4);
		messages.add(myObj5);
		return messages;
		
	}
	
	@GET
	@Path("/obj/{theMessage}/{theSize}")
	@Produces(MediaType.APPLICATION_JSON)
	public HelloMessage sayHelloMessage(@PathParam("theMessage") String message,@PathParam("theSize") int size)
	{
		HelloMessage myObj=new HelloMessage(message,size);
		return myObj;
	}
	
	
	
	@GET
	@Path("/add/{a}/{b}")
	@Produces(MediaType.TEXT_PLAIN)   //convert what we return into various types
	public String add(@PathParam("a") int A, @PathParam("b") int B) //convert into data type
	{
		return (A+B)+"";  //what does mean?
  	}
	
	@GET
	@Path("/message/{theMessage}") //{theMessage} is a variable
	public String sayMessage(@PathParam ("theMessage") String message) //return the variable after /message/
	{
		return "Hello"+message;
	}
	
	@GET  //if it`s a http get
	@Path("/world")
	public String sayHelloWorld()
	{
		return "Hello World!!!!!";
	}
	
	@GET
	@Path("/")
	public String SayHello()
	{
		return "Hello";
	}

}
