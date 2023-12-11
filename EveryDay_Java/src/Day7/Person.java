package Day7;

public class Person {

	String name;
	int age;
	String addr;

	// 생성자(메소드)
	Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	Person(){}
	Person(String name){
		this.name = name;
	}

	String getName() {
		return name;
	}

	int getAge() {
		return age;
	}

	String setAddr() {
		return addr;
	}

	void info() {
		System.out.println("이름은 " + name + ", 나이는 " + age + "살 입니다." + "거주 지역은 " + addr + " 입니다.");

	}

	void getAddr(String addr) {
		this.addr = addr;
	}
	
	
	
}
