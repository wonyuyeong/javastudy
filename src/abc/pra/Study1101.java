package abc.pra;

public class Study1101 {
	private String name = "원유영" ;
	private int age = 28 ;
	private String addr = "경기도" ;
	 
	// 기본생성자
	public Study1101() {
		System.out.println("기본생성자 입니다");
	}

	public Study1101(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	//getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	
	
	
}
