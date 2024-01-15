import java.util.Scanner;

public class MainCall {

	public static void main(String[] args) {
		int[] ar1;
		ar1 = new int[5];
		
		// 값을 올린다 = 값을 쓴다(write) = 값을 넣는다 = 값을 save한다
		ar1[0] = 1;
		ar1[1] = 2;
		ar1[2] = 3;
		ar1[3] = 4;
		ar1[4] = 5;
		
		// Create Read Update Delete : CRUD 
		for(int i = 0; i < ar1.length ; i++) {
			System.out.print(ar1[i]);
		}
			
		System.out.println();
		System.out.println();
		int[] ar10 = new int[10];
		int sum = 0;
		
		for(int i = 0; i < ar10.length; i++) {
			ar10[i] = i+1;	// 입력
			sum += ar10[i];	// 연산
		}
		System.out.println(sum); // 출력
		
		System.out.println();

		
		
		double[] ar2 = new double[7];
		
		float[] ar3;
		ar3 = new float[9]; // 4 * 9 = 36 바이트가 순차적으로
				
		System.out.println(ar1.length);
		System.out.println(ar2.length);
		System.out.println(ar3.length);
//		Box box = new Box("Camera");
//	//	System.out.println(box.toString());
//		System.out.println(box);
//		
//		String source = "1 3 5";
//		Scanner sc = new Scanner(source);
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int num3 = sc.nextInt();
//		
//		int sum = num1 + num2 + num3;
//		System.out.println(num1 + "+" +num2+"+"+num3+"="+ sum);
//		
//		Scanner sc1 = new Scanner(System.in);
//		String str1 = sc1.next();
//		System.out.println(str1);
	}

}
