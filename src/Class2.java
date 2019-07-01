import java.util.Scanner;


public class Class2 extends Class1{
	static int years;
	static int months;
	static int days;
	static int weeks;
	static int dayss;
	static int hours;
	static int minutes;
	static int seconds;

	Class2(int current_date, int current_month, int current_year,
			int birth_date, int birth_month, int birth_year, int current_hour,
			int current_minute, int current_second, int birth_hour,
			int birth_minute, int birth_second, int years, int months,
			int days, int weeks, int dayss, int hours, int minutes, int seconds) {
		super(current_date, current_month, current_year, birth_date,
				birth_month, birth_year, current_hour, current_minute,
				current_second, birth_hour, birth_minute, birth_second);
		this.years = years;
		this.months = months;
		this.days = days;
		this.weeks = weeks;
		this.dayss = dayss;
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;

	}
	public void findAge(){
		int month[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (birth_date >= current_date) {
			current_month = current_month - 1;
			current_date = current_date + month[birth_month - 1];
		}
		if (birth_month >= current_month) {
			current_year = current_year - 1;
			current_month = current_month + 12;
		}
		if ((birth_date == current_date && birth_month > current_month)||(birth_date > current_date && birth_month == current_month)){
			current_month = current_month - 1;
			current_date = current_date + month[birth_month - 1];
			current_year = current_year - 1;
			current_month = current_month + 12;
		}
		if(birth_minute > current_minute){
			current_date = current_date -1;
			current_hour = current_hour - 1;
			current_minute = current_minute + 60;
			
		}
		if(birth_hour > current_hour){
			current_hour = current_hour + 24;
		}
		if(birth_second > current_second){
			current_minute = current_minute - 1 ;
			current_second = current_second + 60;
		}
	
	}
	public int getYears() {
		return (years = current_year - birth_year);

	}

	public int getMonths() {
		return (months = current_month - birth_month);

	}

	public int getDays() {
		return (days = current_date - birth_date);

	}

	public int getWeeks() {
		return (weeks = (52 * days) / 365);
	}

	public int getDayss() {
		return (dayss = days - 7 * weeks);
	}

	public int getHours() {
		return (hours = current_hour - birth_hour);
	}

	public int getMinutes() {
		return (minutes = current_minute - birth_minute);
	}

	public int getSeconds() {
		return (seconds = current_second - birth_second);
	}

	public String toString() {
		System.out.println("present age");
		return years + " years, " + months + " Months, " + weeks + " weeks ,"
				+ dayss + " dayss," + hours + " hours, " + minutes
				+ " minutes , " + seconds + " seconds ";
	}

	static int dayofweek(int d, int m, int y) {
		int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
		y -= (m < 3) ? 1 : 0;
		return (y + y / 4 - y / 100 + y / 400 + t[m - 1] + d) % 7;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter current_date");
		int current_date = in.nextInt();
		Scanner in1 = new Scanner(System.in);
		System.out.println("enter current_month");
		int current_month = in1.nextInt();
		Scanner in2 = new Scanner(System.in);
		System.out.println("enter current_year");
		int current_year = in2.nextInt();
		Scanner in3 = new Scanner(System.in);
		System.out.println("enter birth_date");
		int birth_date = in3.nextInt();
		Scanner in4 = new Scanner(System.in);
		System.out.println("enter birth_month");
		int birth_month = in4.nextInt();
		Scanner in5 = new Scanner(System.in);
		System.out.println("enter birth_year");
		int birth_year = in5.nextInt();
		Scanner in6 = new Scanner(System.in);
		System.out.println("enter current_hour");
		int current_hour = in6.nextInt();
		Scanner in7 = new Scanner(System.in);
		System.out.println("enter current_minute");
		int current_minute = in7.nextInt();
		Scanner in0 = new Scanner(System.in);
		System.out.println("enter current_second");
		int current_second = in0.nextInt();
		Scanner in8 = new Scanner(System.in);
		System.out.println("enter birth_hour");
		int birth_hour = in8.nextInt();
		Scanner in9 = new Scanner(System.in);
		System.out.println("enter birth_minute");
		int birth_minute = in9.nextInt();
		Scanner in10 = new Scanner(System.in);
		System.out.println("enter birth_second");
		int birth_second = in10.nextInt();
		Class2 cc = new Class2(current_date, current_month, current_year,
				birth_date, birth_month, birth_year, current_hour,
				current_minute, current_second, birth_hour, birth_minute,
				birth_second, years, months, days, weeks, dayss, hours,
				minutes, seconds);
		cc.findAge();
		cc.getYears();

		cc.getMonths();
		cc.getDays();
		cc.getWeeks();
		cc.getDayss();
		cc.getHours();
		cc.getMinutes();
		cc.getSeconds();

		System.out.println(cc.toString());

		int day = dayofweek(birth_date, birth_month, birth_year);
		System.out
				.print(day
						+ "  "
						+ ("(sunday=0,monday=1,tuesday=2,wednesday=3,thursday=4,friday=5,saturday=6)"));

	}


}
