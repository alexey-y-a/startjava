public class MethodNameHelper {
    
    public static String current() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}