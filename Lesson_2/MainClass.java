public class MainClass {

    public static void main(String[] args) {
        MethodInvoker invoker = new MethodInvoker();

        System.out.println("\n Non-Boolean Methods \n");
        invoker.invokeNonBooleanMethods();

        System.out.println("\n Boolean Methods \n");
        invoker.invokeBooleanMethods();
    }
}