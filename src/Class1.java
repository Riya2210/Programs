
abstract class Class1 {
	 int current_date;
	 int current_month;
	 int current_year;
 int birth_date, birth_month, birth_year;
	int current_hour,current_minute,current_second;
	 int birth_hour,birth_minute,birth_second;
	

	public Class1(int current_date, int current_month, int current_year,
			int birth_date, int birth_month, int birth_year,int current_hour,int current_minute,int current_second,
	int birth_hour,int birth_minute,int birth_second) {

		this.current_date = current_date;
		this.current_month = current_month;
		this.current_year = current_year;
		this.birth_date = birth_date;
		this.birth_month = birth_month;
		this.birth_year = birth_year;
		this.current_hour = current_hour;
		this. current_minute =  current_minute;
	    this.current_second = current_second;
		this. birth_hour = birth_hour;
		this. birth_minute = birth_minute;
		this.birth_second = birth_second;
	}
 
public abstract void findAge(); 
}
