package exceptionHandl;

public class CheckStudent {
    static void checkStudentRegister(int studentAge, int studentWeight){
        if(studentAge<12 & studentAge<40){
            throw new ArithmeticException("This student's not eligible for registration");
        }
        else {
            System.out.println("Student entry is valid");
        }
    }
}
