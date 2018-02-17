package org.myProj.dpPractice.MediatorPattern;

import java.util.Date;

/**
 * mediator class
 * 
 * @author david
 *
 */
public class ChatRoom {
	public static void showMessage(User user, String message) {
		System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
	}
}
