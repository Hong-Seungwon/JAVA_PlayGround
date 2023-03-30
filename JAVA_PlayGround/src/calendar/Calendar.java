package calendar;

public class Calendar {
	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] LEAP_MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 != 0)) {
			return true;
		} else {
			return false;
		}
	}

//	public int maxDaysOfMonth(int month) {
//		return MAX_DAYS[month -1];
//	}

	public int getMaxDaysOfMonth(int year, int month) {
		if (isLeapYear(year)) {
			return LEAP_MAX_DAYS[month - 1];
		} else {
			return MAX_DAYS[month - 1];
		}
	}

	public void printCalendar(int year, int month, int weekday) {
		System.out.printf("   <<%4d년%3d월>>\n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");

		// print blank space
		for (int i = 0; i < weekday; i++) {
			System.out.print("   ");
		}

		int maxDay = getMaxDaysOfMonth(year, month);

		for (int i = 1; i <= maxDay; i++) {
			System.out.printf("%3d", i);
			if((i + weekday) % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
//		System.out.println("Hello, Calendar");

//		System.out.println(" 일  월 화  수 목  금  토");
//		System.out.println("---------------------");
//		System.out.println(" 1  2  3  4  5  6  7");
//		System.out.println(" 8  9 10 11 12  13 14");
//		System.out.println(" 15 16 17 18 19 20 21");
//		System.out.println(" 22 23 24 25 26 27 28");	

		// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
//			Scanner sc = new Scanner(System.in);
//			System.out.println("달을 입력하세요");	
//			int month = sc.nextInt();

//			int[] maxdays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

//			System.out.printf("%d월은 %d일까지 있습니다.", month, maxdays[month - 1]);
//			sc.close();

//			Scanner sc = new Scanner(System.in);
//			Calendar cal = new Calendar();
//			System.out.println("달을 입력하세요");
//			int month = sc.nextInt();

//			System.out.printf("%d월은 %d일까지 있습니다. \n", month, cal.maxDaysOfMonth(month));
//			sc.close();

//			String PROMPT = "cal> ";
//			Scanner sc = new Scanner(System.in);
//			Calendar cal = new Calendar();

//			System.out.println("반복 횟수를 입력하세요.");
//			int repeat = sc.nextInt();

//			for(int i = 0; i < repeat; i++) {				
//				System.out.println("달을 입력하세요");
//				System.out.print(PRMOMPT);
//				int month = sc.nextInt();
//				System.out.printf("%d월은 %d일까지 있습니다. \n", month, cal.getMaxDaysOfMonth(month));
//			}
//			cal.printSampleCalendar();

//			int month = 1;

//			while(true) {
//				System.out.println("달을 입력하세요");
//				System.out.print(PROMPT);
//				month = sc.nextInt();
//				if(month == -1) {
//					break;
//				}

//				if(month > 12) {
//					continue;
//				}
//				System.out.printf("%d월은 %d일까지 있습니다. \n", month, cal.getMaxDaysOfMonth(month));
//			}

//			System.out.println("Bye~");
//			sc.close();
	}
}