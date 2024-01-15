
class StartStar {

	//oneToHap // 1~10까지 더한 값 구하기
	//toHap // 특정 수를 정해서 더한 값 구하기
	
	public static double getCircleArea(double radius) {
		double area = 0;
		area = radius * radius * 3.14;
		return area;
	}
	
	public static int oneToHap() {
		int sum = 0;
		for(int i=1; i<=10;i++) {
			sum +=i;
		}
		return sum;
	}
	
	public static int toHap(int min, int max) {
		int sum = 0;
		for(int i= min ; i<= max; i++) {
			sum += i ;
		}
		return sum;
	}
	
	public static double avg(int x, int y, int z) {
		double avg = (x + y + z) / 3.0;
		return avg;
	}
	
	public static char grade(double avg) {
		char grade = ' ';
		if(avg >= 90) {
			grade = '수';
		}else if(avg >= 80) {
			grade = '우';
		}else if(avg >= 80) {
			grade = '미';
		}else if(avg >= 80) {
			grade = '양';
		}else
			grade = '가';
		return grade;
	}
	
	public static void main(String[] args) {
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 1; j <= 5 - i ; j++)
//				System.out.print(" ");
//			for(int j = 1; j <= i ; j++)
//				System.out.print("*");
//			System.out.println();
//		}
		char grade = grade(avg(90, 80, 100));
		System.out.println(grade +  " 입니다."); // 수입니다. "
		System.out.println(toHap(2, 10));
		System.out.println(oneToHap());
		System.out.println(getCircleArea(10));
	}

}
