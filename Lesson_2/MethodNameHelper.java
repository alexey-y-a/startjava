public class MethodNameHelper {
    
    public static String currentMethodName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}