package abc.pra;

public class Studyday1102 {
	public static void main(String[] args) {
		
		//기본생성자 객체 생성
		Study1101 study1101 = new Study1101() ;
		System.out.println(study1101.getName());
		System.out.println(study1101.getAge());
		System.out.println(study1101.getAddr());
		System.out.println();
		
		
		Study1101 study11012 = new Study1101("짱구", 8, "일본") ;
		System.out.println(study11012.getName());
		System.out.println(study11012.getAge());
		System.out.println(study11012.getAddr());
		System.out.println();
		
		study1101.setName("유리");
		study1101.setAddr("중국");
		System.out.println(study1101.getName());
		System.out.println(study1101.getAge());
		System.out.println(study1101.getAddr());
		
		
		
	}
}
