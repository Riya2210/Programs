import java.lang.reflect.Method;

public class Example {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) throws Exception {

		Class c = Class.forName("A");
		Object o = c.newInstance();
		Method m = c.getDeclaredMethod("msg", null);
		m.setAccessible(true);
		m.invoke(o, "gf");
	}
}
