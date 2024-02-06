package abc.pra;

public class Ex05 {
	public static void main(String[] args) {
		//카페모카 6500원이다.
		// 친구와 둘이서 15000원을 내고 주문했다.
		// 잔돈은 얼마인가?(단, 가격에  부가세 10% 포함 시키자)
		
		int a = 15000;
		int b = 6500;
		int c = b*2;
		
		int d = (int)(c*0.1) ;
		System.out.println(a-(c+d)+"원");
		
		
		
	}
}
