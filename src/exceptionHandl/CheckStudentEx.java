package exceptionHandl;

public class CheckStudentEx extends Exception{
    String  message;

    public CheckStudentEx(String message){
        this.message = message;
    }

    public String getExceptionMsg(){
        return "MyCHeckStudentException: "+this.message;
    }
}
