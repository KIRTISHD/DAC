package worker;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import core.Emp;

public class Getting {

	public static void main(String[] args) {
		
		try (ObjectInputStream coming = new ObjectInputStream(new FileInputStream("hahaha.ser"))){
			Emp e1;
			//System.out.println(coming.readObject());
			e1 = (Emp)coming.readObject();
			System.out.println(e1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
