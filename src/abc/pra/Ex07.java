package abc.pra;

public class Ex07 {
	public static void main(String[] args) {
		//삼항 연산자
				// 형식) 자료형 변수 = (조건식) ? 참 일 때 실행할 문장 : 거짓일때 실행할 문장 ;
				// int k1 이 홀수인지 짝수인지 판별하자
				// 힌트 ) 어떤 수를 2로 나눈 나머지가 0이면 짝수, 1이면 홀수
		
		int k1 = 4;
		int res = k1%2;
		String result = (res==0)? "짝수":"홀수";
		
		System.out.println("k1은 "+result+"입니다.");
		
		 //int k2가 60 이상이면 합격, 아니면 불합격
		
		int k2 = 30;
		String result2 = (k2>=60) ?"합격" :"불합격";
		System.out.println("결과는 : "+result2+"입니다.");
		
		 // k3가 1이면 1000원짜리에 0.1 할인 한다.(얼마에 살 수 있나?)
		
		int k3= 1;
		int price = 1000;
		int result3 = (k3==1) ? price-(int)(price*0.1) : price ;
		System.out.println("가격은 : "+result3+"입니다.");
		
		 //char k4 = 대문자 인지 대문자가 아닌지 판별하자
		 char k4 = 'E';
		 String result4 = (k4>='A' && k4<='Z') 	? "대문자" : "대문자 아님" ;
		 System.out.println("k4는 : "+result4);
		 
		 // 근무시간이 8시간 까지는 시간당 9860 이고
		 // 8시간 초과한 시간 만큼은 1.5배 지급한다.
		 // 현재 근무한 시간이 10시간 이다.
		 // 얼마를 받아야 하는가?
		 
		 int time = 10;
		 int mon = 9860;
		 int a = time*mon ;
		 int b = 8;
		 
		 
		 int result5 = (time>b ) ? (b*mon)+(int)(mon*(time-b)*1.5) : a;
		 System.out.println(result5);
		
		
		
		
		
		
		
		
		
		
	}
}
