package utils;

import java.util.Comparator;

import com.app.core.Customers;

public class AmountSorter implements Comparator<Customers> {

	@Override
	public int compare(Customers o1, Customers o2) {
		return ((Double)o1.getRegAmt()).compareTo(o2.getRegAmt());
	}

}
