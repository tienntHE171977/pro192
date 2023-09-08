/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FPT
 */

    // Abstract class


// Concrete class
public class Honda extends Car {
	// Hiding implementation details
	@Override public void stop()
	{
		System.out.println("Honda::Stop");
		System.out.println(
			"Mechanism to stop the car using break");
	}
}

public class Main {
	public static void main(String args[])
	{
		Car obj
			= new Honda(); // Car object =>contents of Honda
		obj.stop(); // call the method
	}
}

