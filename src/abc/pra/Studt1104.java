package abc.pra;

public class Studt1104 {
	public static void main(String[] args) {
		Study1103 study1103 = new Study1103() ;
		System.out.println("이름 : "+study1103.getName());
		System.out.println("나이 : "+study1103.getAge());
		if (study1103.isLive()== true) {
			System.out.println("살아있음");
		}else {
			System.out.println("죽음");
		}
		System.out.println();
		
		Study1103 study11032 = new Study1103("비둘기") ;
		System.out.println("이름 : " + study1103.getName());
		
		
		
		
		
	}
}
