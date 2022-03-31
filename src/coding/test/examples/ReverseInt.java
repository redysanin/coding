package coding.test.examples;

public class ReverseInt {
	
	
	public static  int getReverseInt(int input) {
		if(input > -9 && input < 10) {
			return input;
		}
		String positiveNum=""+input;
		if(input<0) {
			positiveNum=""+(-1*input);
		}
		
		int finalValue=0;
		//new StringBuilder(positiveNum).reverse().toString();
		for(int i=positiveNum.length()-1;i>=0;i--) {
			String value=Character.toString(positiveNum.charAt(i));
			int newValue=Integer.parseInt(value)* (int)Math.pow(10, i);
			finalValue=finalValue+newValue;
		}
		if(input<0) {
			finalValue=-1*finalValue;
		}
		
		return finalValue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-540278 = "+getReverseInt(-540278));
	}

}
