package readers;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import core.Emp;

public class ReadSortSal {

	public static void main(String[] args) {

		List<Emp> arr = new ArrayList<Emp>();
		String filName="sortsal.dat";
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filName))){
			arr = (ArrayList<Emp>)ois.readObject();
			arr.stream().forEach(e->System.out.println(e));
			
		}catch(Exception e) {
			System.out.println("ReadSortSal error-" + e.getMessage());
			e.printStackTrace();
		}
	}
	
}
