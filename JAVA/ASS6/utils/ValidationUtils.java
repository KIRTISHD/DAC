package utils;


public class ValidationUtils {
	
	public static void checkEmail(String st) throws Exception{
		if (st.length() < 5 || st.length()>10) {
			throw new ThrowErrorClass("Email Length not within limits");
		}
		if (!st.contains("@")) {
			throw new ThrowErrorClass("Email does not have @");
		}
		
	}
	
	public static void checkBasic(double sal) throws Exception{
		if (sal %1000 != 0) {
			throw new ThrowErrorClass("Basic is not a multiple of 1000");
		}
	}
	
	public static void checkDept(String s) throws Exception{
		if (s != "Sales" || s != "HR" || s != "RND" ||s != "Marketing" ) {
			throw new ThrowErrorClass("No such Department");
		}
	}

}
