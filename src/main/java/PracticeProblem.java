import java.util.Scanner;

public class PracticeProblem {
	static Scanner sc;
	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();		
	}

	public static void q1(){
		sc = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String num = sc.nextLine();
		System.out.println(Integer.parseInt("5" + num) + 5);
	}

	public static void q2(){
		sc = new Scanner(System.in);
		System.out.print("Input a number: ");
		String num = sc.nextLine();
		System.out.println(Double.parseDouble("4" + num + "3") + 3.4);
	}

	public static void q3(){
		sc = new Scanner(System.in);
		System.out.print("Input a boolean: ");
		String bool = sc.nextLine();
		System.out.println(!Boolean.parseBoolean(bool));
	}

	public static void q4(){
		sc = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String num = sc.nextLine();
		System.out.println((char)(Integer.parseInt(num + "3") + 2));
	}

	public static void q5(){
		sc = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String num = sc.nextLine();
		System.out.println((double)((Integer.parseInt(num + "1"))/2));
	}

	public static void q6(){
		sc = new Scanner(System.in);
		System.out.print("Input a number: ");
		String num = sc.nextLine();
		System.out.println((int)(Double.parseDouble("1" + num)));
	}

}
