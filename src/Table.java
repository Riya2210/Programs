class Simple {
	void message() {
		System.out.println("Hello Java");
	}
}

public class Table {
	@SuppressWarnings("rawtypes")
	public static void main(String args[]) {
		try {
			Class c = Class.forName("Simple");
			Simple s = (Simple) c.newInstance();
			s.message();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
