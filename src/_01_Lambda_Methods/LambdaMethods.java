package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((z)->{
			String s = "";
			for(int i = z.length() - 1; i>=0; i--) {
				s+=z.charAt(i);
			}
			System.out.println(s);
		}, "A String.");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((e)->{
			int count = 0;
			String s = "";
			for(int i = 0; i<e.length(); i++) {
				if(Character.isLetter(e.charAt(i))) {
					if(count%2 == 0) {
						s += e.substring(i, i+1).toLowerCase();
					}else {
						s += e.substring(i, i+1).toUpperCase();
					}
					count++;
				}else {
					s += e.substring(i, i+1);
				}
			}
			System.out.println(s);
		}, "I like cookies a lot!");
		
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((e)->{
			String s = "";
			for(int i = 0; i<e.length(); i++) {
				if(i!=e.length()-1) {
					s += e.charAt(i) + ".";
				}else {
					s += e.charAt(i);
				}
			}
			System.out.println(s);
		}, "Platypuses are mammals.");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((e)->{
			String s = "";
			for(int i = 0; i<e.length(); i++) {
				if(!(e.substring(i, i+1).toLowerCase().equals("e")||e.substring(i, i+1).toLowerCase().equals("i")||e.substring(i, i+1).toLowerCase().equals("o")||e.substring(i, i+1).toLowerCase().equals("u")||e.substring(i, i+1).toLowerCase().equals("a"))) {
					s += e.charAt(i);
				}
			}
			System.out.println(s);
		}, "Onomatopoeias are cool.");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
