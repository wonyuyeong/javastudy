package abc.pra;


public class Ex01 {
	
	private String name = "원유영" ;
	private  int age = 10 ;
	private String addr = "경기도" ;
	
	public Ex01() {
		System.out.println("기본 생성자 입닏.");
	}

	public Ex01(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

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
