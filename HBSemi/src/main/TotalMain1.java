package main;

import Member.*;
import form.*;

public class TotalMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReservationMain reser = new ReservationMain();
		LoginUI login = new LoginUI();
		JoinUI join = new JoinUI();
		
		MainUI main = new MainUI(join, login, reser);
		
		
		
	}

}
