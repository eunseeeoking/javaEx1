package Day7;

public class Ex2_Obj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intArr[] = new int[5];
		String strArr[] = new String[5];
		Person personArr[] = new Person[5];
		
		Person p = new Person();
		
		Person n = new Person("김철수");
		
		Person hong = new Person("홍길동",20);
		//오버로딩 : 동일한 이름의 메소드가 여러개 정의되는 것
		hong.info();
		n.info();
		p.info();
		
		
		for (int i=0; i<personArr.length;i++) {
			personArr[i] = new Person();
			
		}
		
		personArr[0].name = "홍길동";
		personArr[0].age = 25;
		personArr[4].name = "김은석";
		personArr[1].name = "아무것도 없다.";
		System.out.println(personArr[1].name);
		
		System.out.println(personArr[0]);
		
		
		
	}

}
