public class HelloWorld {
    public static String hello(String name) {
    	String addressee = (name == null || name.isEmpty()) ? "World" : name;
    	return String.format("Hello, %s!", addressee);
    }
}
