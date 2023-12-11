package Day7;

public class Ex3_Ref_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human hong = new Human("홍길동", 30);
		Human kim = new Human("김철수", 20);

		int num = 10;

		hong.numAdd(num);
		System.out.println(num);

		// hong의 주소 : qwer123
		// hong.age == qwer123.age
		hong.newYear(hong);

		// hong.age == qwer123.age == 31

		String str1 = "테스트";
		String str2 = new String("테스트");
		
		
		//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
		
		
		
	}
}