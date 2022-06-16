package exceptionHandl;

public class Main {
    public static void main(String[] args) {
        try{
            int a[] = new int[7];
            a[9] = 30/0;
            System.out.println("Statement in try block");
        }

        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("we don't have such array");
        }

        catch (ArithmeticException e){
            System.out.println("You can not devide number by 0");
        }
        catch (Exception e){
            System.out.println("SOme other exception");
        }
        finally {
            System.out.println("I am the final");
        }

        System.out.println(Main.returningMethod());
    }

    public static int returningMethod(){
        try{
            return  110;
        }
        finally {
            System.out.println("This is the second final");
        }
    }
}
