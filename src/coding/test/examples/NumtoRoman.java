package coding.test.examples;

import java.util.Arrays;
import java.util.List;

public class NumtoRoman {
	
	
	public static int getValue(int input,StringBuilder builder) {
		
		if (input >= 1000){
			builder.append("M");
			return input-1000;
		}else if (input >= 900){
			builder.append("CM");
			return input-900;
		}else if (input >= 500){
			builder.append("D");
			return input-500;
		}  else if (input >= 400){
			builder.append("CD");
			return input-400;
		}  else if (input >= 100){
			builder.append("C");
			return input-100;
		}   else if (input >= 90){
			builder.append("XC");
			return input-90;
		}  else if (input >= 50){
			builder.append("L");
			return input-50;
		}  else if (input >= 40){
			builder.append("XL");
			return input-40;
		}  else if (input >= 10){
			builder.append("X");
			return input-10;
		}  else if (input >= 9){
			builder.append("IX");
			return input-9;
		}  else if (input >= 5){
			builder.append("V");
			return input-5;
		}   else if (input >= 4){
			builder.append("IV");
			return input-4;
		}   else if (input >= 1){
			builder.append("I");
			return input-1;
		}  
		
		return 0;
		
	}
	
	public static String getNumtoRoman(int number) {
		
		StringBuilder sb = new StringBuilder();
		while (number > 0){
			number=getValue(number,sb);
		}
		return sb.toString();
	}
	

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		int num=545;
		String roman=getNumtoRoman(num);
		System.out.println(num+" to roman="+roman);
		System.out.println(roman+" Roman to num "+RomanToNum.getRomanToNum(roman));
		System.out.println(roman+" Roman 2 to num "+integerToRoman2(num));
		

	}
	
	//using  19541
	private static final int[] VALUES = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
	private static final String[] romanLiterals = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

	public static final String integerToRoman2(int number) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<VALUES.length;i++) {
			while(number>=VALUES[i]) {
				number=number-VALUES[i];
				sb.append(romanLiterals[i]);
			}
		}
		return sb.toString();
	}

}
