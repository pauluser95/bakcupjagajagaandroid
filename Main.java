package utsandroid;


class ExampleClass {
	 public static int num = 20;
	 public int num2 = 30;
	 public static int calc (int a, int b){
	 return a+b;
	 }
	 public String echo (String e) {
	 return e;
	 }
	}

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
	public static String Caesar(String input) {
		StringBuilder abc= new StringBuilder(input.toUpperCase());
		for(int i=0;i<input.length();i++) {
			if(abc.charAt(i)==' ') {
				
			}else if(abc.charAt(i)+3<=90&&abc.charAt(i)>=65&&abc.charAt(i)<90){
				abc.setCharAt(i, (char)(abc.charAt(i)+3));
			}else if(abc.charAt(i)+3>90&&abc.charAt(i)>=65&&abc.charAt(i)<90) {
				abc.setCharAt(i, (char)(abc.charAt(i)+3-26));
			}
		}
		return abc.toString();
	}
	public static String ganjilgenap(int i) {
		if(i%2==0)return "genap";
		return "ganjil";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleClass no1 = new ExampleClass();
		System.out.println("no1 "+no1.echo(String.valueOf(no1.calc(ExampleClass.num, no1.num2))));
		System.out.println("no2a-1 "+Caesar("UJIAN TENGAH SEMESTER MOBILE PROGRAMMING"));
		System.out.println("no2a-2 "+Caesar("GO GO MOBILE PROGRAMMING GO"));
		System.out.println("no2b-1 "+ganjilgenap(1));
		System.out.println("no2b-2 "+ganjilgenap(2));
	}

}
