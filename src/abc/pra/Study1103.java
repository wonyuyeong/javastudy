package abc.pra;

public class Study1103 {
	private String name ;
	private int age ;
	private boolean live;
	
	public Study1103() {
		name = "코끼리";
		age = 2 ;
		live = true ;
	}
	public Study1103(String name) {
		this.name = name;
	}



	//getter,setter
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
	public boolean isLive() {
		return live;
	}
	public void setLive(boolean live) {
		this.live = live;
	}
	
	
	
}
