package project.xyz;

import java.io.*;
import java.util.*;

public class ProgramDriver {
	public static void main (String[] args) {
		//Print screen and all seat
		try {
			ArrayList<Screen> screenList = ReadInput.availableScreen();
			for (int i=0; i<screenList.size(); i++) {
				System.out.println(screenList.get(i).printAllSeat());
			}
		}
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		//Print showtime and all screen and movie
		try {
			ArrayList<Showtime> showtimeList = ReadInput.availableShowtime();
			for (int i=0; i<showtimeList.size(); i++) {
				System.out.println(showtimeList.get(i).printProgram());
			}
		}
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println(e);
		}
		//Print all movie
		try {
			ArrayList<Movie> movieList = ReadInput.availableMovie();
			for (int i=0; i<movieList.size(); i++) {
				System.out.println(movieList.get(i).printAllInfo());
			}
		}
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		//Print all user
		User user1 = new User("user1", "1234", "user1@unb.ca");
		User user2 = new User("user2", "1234", "user2@unb.ca");
		User user3 = new User("user3", "1234", "user3@unb.ca");
		try {
			WriteOutput.createUserFile();
			WriteOutput.addUser(user1);
			WriteOutput.addUser(user2);
			WriteOutput.addUser(user3);
			ArrayList<User> users = ReadInput.userList();
			for (int i=0; i<users.size(); i++) {
				System.out.println(users.get(i).toString());
			}
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
