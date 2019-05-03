package collection;

import java.util.ArrayList;
import java.util.List;
import static java.time.LocalDate.parse;

import core.Emp;
public class CollectionUtils {
	
	public static List<Emp> populateData(){
		List<Emp> e1 = new ArrayList<Emp>();
		e1.add(new Emp("ABC",24,"Pune",24000,parse("2019-01-15"),"RND"));
		e1.add(new Emp("MNO",29,"Pune",26000,parse("2018-12-15"),"PROD"));
		e1.add(new Emp("XYZ",26,"Nashik",12000,parse("2019-03-15"),"SALES"));
		e1.add(new Emp("EFG",23,"Mumbai",5000,parse("2018-09-15"),"RND"));
		e1.add(new Emp("IJK",23,"Mumbai",1000,parse("2018-05-15"),"PROD"));
		return e1;
	}

}
