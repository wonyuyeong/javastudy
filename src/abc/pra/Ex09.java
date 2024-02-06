package abc.pra;

public class Ex09 {
	public static void main(String[] args) {
		//int k1이 90이상이면 "A학점", 80이상이면"B학점", 나머지는 "F학점"
		int k1 = 90;
		
		String result = (k1>=90) ? "A학점" : (k1>=80) ? "B학점" : "F학점" ;
		System.out.println(result);
		
		// char k2가 대문자인지, 소문자인지, 기타문자인지 판별하자
		char k2 = 'f';
		String result2 = (k2>='A' && k2<='Z')? "대문자" : (k2>='a' && k2<='z') ? "소문자": "기타문자" ;
		System.out.println("결과는 : "+result2);
		
		// int k3가 1 또는 3이면 남자, 나머지 여자
		int k3 = 1;
		String result3 = (k3==1 || k3==3) ? "남자" : "여자" ;
		System.out.println("결과 : "+ result3);
		
		// int k4가 1 또는 3이면 남자, 2 또는 4면 여자, 나머지 외계인
		
		int k4 = 1;
				String result4 = (k4==1 || k4 == 3) ?"남자" : (k4==2 || k4==4)? "여자":"외계인";
				System.out.println(result4);
				
		//   int k5 = 1이면 1900년대 태어난 남자, 3이면 2000년대 태어난 남자
		// 				 2이면 1900년대 태어난 여자, 4이면 2000년대 태어난 여자, 나머지 외계인
				int k5 = 1;
						String result5 = (k5==1 || k5==3) ? ((k5==1) ? "1900년대 태어난 남자 " : "2000년대 태어난 남자") : 
							(k5==2||k5==4)?( (k5==2) ? "1900년대 태어난 여자" : "2000년대 태어난 여자" ): "외계인" ;
						
						System.out.println(result5);
			
				
				
				
		// 두 수 중 큰 수를 구하자 (두 수는 임의로 정하기)
		int k6 = 4;
		int k7 = 7;
			System.out.println(Math.max(k6, k7));
		
		
		
	}
}
