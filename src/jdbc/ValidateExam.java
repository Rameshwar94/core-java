package jdbc;

import java.util.stream.Stream;

public class ValidateExam {

	public static void main(String[] args) {
		Validate result = (str1, str2)->(Stream.of("ABC").equals(str1)  && Stream.of("xyz").equals(str2) );
		boolean resultString = result.isValidate("ABC", "xyz");
		
		System.out.println(resultString);

	}

	public boolean isValidate(String user, String pass) {

		Validate result = (str1, str2)->(str1.equals("ABC") && str2.equals("xyz"));
		boolean resultString = result.isValidate(user, pass);
		return resultString;
	}
}

@FunctionalInterface
interface Validate{
	boolean isValidate(String userNm, String pass);
}
