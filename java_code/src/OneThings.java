import java.util.Scanner;

class OneThings {

	public static void HelloWorld() {
		System.out.println("Hello World");
	}
	
	public static void hiEveryOne(int age) {
		System.out.println("제 나이는 "+age+"세 입니다.");
	}
	
	public static void hiEveryOne(int age, double height) {
		System.out.println("제 나이는 "+age+"세 입니다.");
		System.out.println("저의 키는 "+height+"cm 입니다.");
	}
	
	public static void hiEveryOne() {
		System.out.println("다음에 뵙겠습니다.");
	}
	
	public static int adder(int num1, int num2) {
		int addresult = num1 + num2;
		return addresult;
	}
	
	public static double square(double num) {
		return num * num ; 
	}
	
	public static int hap(int num1, int num2) {
		int x = 0;
		for(int n = num1; n <= num2 ; n++)
			x += n;
		return x;
	}
	public static int getHap(int num1, int num2) {
		int sum = 0;
		for(int n = num1; n <= num2 ; n++)
			sum += n;
		return sum;
	}
	
	public static int get57(int num1, int num2) {
		int count = 0;
		for(int x = num1; x <= num2 ; x++) {
			if((x % 5)!= 0 || (x % 7)!= 0)
				continue;
			count++;
		}
		return count;
	}
	
	public static double getCircleArea(double num) {
		double PI = 3.14;
		double area = num * num * PI;
		return area;
	}
	
	public static void printGuGudan(int dan) {
		for(int i = 1; i <= 9 ; i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
	}
	
	public static double getRecArea(double width , double height) {
		//사각형 넓이
		return width * height;
	}
	public static double getRecCirlce(double radius) {
		//원넓이
		double PI = 3.14;
		return radius * radius * PI;
	}
	public static double getTriangleArea(double width , double height) {
		//삼각형 넓이
		return (width * height)/2;
	}
	public static void getSeason(int month) {
		if(month >= 3 && month <= 5)
			System.out.println("봄입니다.");
		else if(month >= 6 && month <= 8)
			System.out.println("여름입니다.");
		else if(month >= 9 && month <= 11)
			System.out.println("가을입니다.");
		else
			System.out.println("겨울입니다.");
	}
	
	public static void divide(int num1, int num2) {
		if(num2 == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return;
		}
		System.out.println("나눗셈 결과 : " + (num1/num2));
	}
	
//	public static double getRecArea(double width, double height) {
//		double area = 0;
//		area = width * height;
//		return area;
//	}
	
	public static void starPrint(int count) {
		System.out.println("출력");
		for(int i = 1 ; i <= count ; i++) {
			for(int j = 1; j < i  ;j++) {
				System.out.print(" ");
			}
			for(int j = 0; j <= count - i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void danPrint(int num) {
		for(int i = 1 ; i <= 9 ; i++) {
//			if(i != num)
//				continue;
//			System.out.println(num+"단");
//			for(int j = 1; j <= 9 ; j++)
//				System.out.println(i+" * "+j+" = "+(i*j));
			System.out.println(num+" * "+i+" = "+(i*num));
		}
	}
	
	public static char getGrade(double avg) {
		char grade = 0;
		if(avg >= 90) {
			grade = '수';
		}else if(avg >= 80){
			grade = '우';
		}else if(avg >= 70){
			grade = '미';
		}else if(avg >= 60){
			grade = '양';
		}else{
			grade = '가';
		}		
		return grade;
	}
	
	public static void showHi(int cnt) {
		System.out.println("hi");
		if(cnt == 1)
			return;
		cnt--;
		showHi(cnt);
	}
	
	public static int factorial(int n) {
		if(n == 1)
			return 1;
		else
			return n * factorial(n-1);
	}
	
	public static void cycle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요. ");
		int kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세요. ");
		int eng = sc.nextInt();
		System.out.print("영어 점수를 입력하세요. ");
		int math = sc.nextInt();
		
		
		double avg = (kor + eng + math)/3.0;
		
		System.out.println("국어 점수는 "+kor+"입니다.");
		System.out.println("영어 점수는 "+eng+"입니다.");
		System.out.println("수학 점수는 "+math+"입니다.");
		
		System.out.println("평균 등급은 "+getGrade(avg)+"입니다.");
	}
	public static void main(String[] args) {
		//HelloWorld();
		// TODO Auto-generated method stub
		// System.out.println(factorial(4));
		
//		Scanner sc = new Scanner(System.in); // 키보드로 입력 받기
//		System.out.print("자신의 1과목 점수(국어)를 넣으세요. ");
//		int kor = sc.nextInt(); // 숫자입력받기
//		
//		System.out.print("자신의 2과목 점수(영어)를 넣으세요. ");
//		int eng = sc.nextInt(); // 숫자입력받기
//				
//		System.out.println("1과목 점수는 " + kor + "입니다.");
//		System.out.println("2과목 점수는 " + eng + "입니다.");
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("정수를 넣으세요.");
//		
//		int num = sc.nextInt();
//		
//		if(num > 0) {
//			System.out.println("양수입니다.");
//		}else if(num < 0) {
//			System.out.println("음수입니다.");
//		}else {
//			System.out.println("0입니다.");
//		}
		String x = ""; 
		x = sc.next();
		String y = "y"; 
		while( x.equals(y)){ 
			// x == y 와 x.equals(y)는 다르다고 한다.
			cycle();
			System.out.println("더 하시겠습니까?(x,y)");
			// x = sc.next();
		}
//		do{
//			cycle();
//			System.out.println("더 하시겠습니까?(x,y)");
//			x = sc.next();
//		}while( x.equals("y"));
//		System.out.print("국어 점수를 입력하세요. ");
//		int kor = sc.nextInt();
//		System.out.print("영어 점수를 입력하세요. ");
//		int eng = sc.nextInt();
//		System.out.print("영어 점수를 입력하세요. ");
//		int math = sc.nextInt();
//		
//		
//		int total = kor + eng + math;
//		
//		System.out.println("국어 점수는 "+kor+"입니다.");
//		System.out.println("영어 점수는 "+eng+"입니다.");
//		System.out.println("수학 점수는 "+math+"입니다.");
//		
//		System.out.println("총 점수는 "+total+"입니다.");
//		
		double x1 = 6.0;
//		getSeason(7);
//		printGuGudan(3);
//		System.out.println(get57(1, 100));
//		int x = 73;
//		System.out.println(getGrade(x));
//		starPrint(6);
//		danPrint(3);
//		hiEveryOne(10);
//		hiEveryOne(20);
//		hiEveryOne(30);
//		hiEveryOne(40);
//		hiEveryOne(40,180.5);
//		hiEveryOne(10,140.5);
//		for(int i = 1; i <= 5 ; i++)
//			hiEveryOne();
//		int x = adder(3, 5);
//		double y = square(6);
//		System.out.println("x : " + x + ", y : " + y);
//		
//		int z = hap(1,100);
//		System.out.println(z);
//		
//		double xx = getCircleArea(100);
//		System.out.println(xx);
//		
//		double yy = getRecArea(10, 10);
//		System.out.println(yy);
		
		
	}
}
