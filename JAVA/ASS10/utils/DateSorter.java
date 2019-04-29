package utils;

import java.util.Comparator;

import com.app.core.Customers;

public class DateSorter implements Comparator<Customers> {

	@Override
	public int compare(Customers o1, Customers o2) {
		return o1.getRegDate().compareTo(o2.getRegDate());
	}

}
