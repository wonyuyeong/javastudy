package abc.pra;

public class Ex04 {
	public static void main(String[] args) {
		//3989초 몇시간, 몇분, 몇초일까 ?
		
		int total = 3989;
		int h = total/(60*60);
		int res = total%(60*60);
		int m = res/(60);
		int s = res%60;
		
		System.out.println(h+"시간"+m+"분"+s+"초");
		
		
		
	}
}
