package com.SpringIdol.exec;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringIdol.contract.Performer;
import com.SpringIdol.entities.Stage;

public class App {
	public static void main (String [] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringIdolContext.xml");
		Stage stage = (Stage) context.getBean("stage");
		System.out.println("let our first Performer duke begin the show !");
		/*Performer performer = (Performer) context.getBean("duke");
		performer.perform();
		System.out.println("Duke decided to be more competetive and he recited a poem while JUGGLING !!");
		performer = (Performer) context.getBean("poeticDuke");
		performer.perform();
		System.out.println("Now Jack is about to play Many instruments");
		performer = (Performer) context.getBean("Jack");
		performer.perform();*/
		System.out.println("Now Kevin is about to play Many instruments");
		Performer performer = (Performer) context.getBean("Kevin");
		performer.perform();
		stage.turnOffLights();
	}
}
