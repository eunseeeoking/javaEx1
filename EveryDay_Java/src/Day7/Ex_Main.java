package Day7;

import java.util.Arrays;

public class Ex_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person hong = new Person("홍길동",25);
		
//		hong.age = 30;
		// name = "홍길동" , age = 30;

		System.out.println(hong.getName());
		Person kim = new Person("김철수",20);

//		kim.age = 20;

		// name = "김철수" , age = 20;
		kim.info();

		Person lee = new Person("이영희",30); //매개변수 , 파라미터

//		lee.age = 25;

		System.out.println(lee.getAge());
		lee.info();
		hong.info();
		System.out.println(lee.addr);
		
		
		Calculator s = new Calculator();
		
		
		System.out.println(s.sum(2,3));
		System.out.println(s.sum(1,2,3));
		
		 
		
		
		
		
		
		}

}
