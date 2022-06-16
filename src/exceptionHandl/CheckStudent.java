package exceptionHandl;

public class CheckStudent {
    static void checkStudentRegister(int studentAge, int studentWeight){
        try{
            if(studentAge<12 & studentAge<40){
                throw new CheckStudentEx("This student's not eligible for registration");
            }
            else {
                System.out.println("Student entry is valid");
            }
        }catch (CheckStudentEx ce){
            System.out.println(ce.getExceptionMsg());
        }
    }
}
