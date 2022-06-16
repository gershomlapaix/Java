package generics;

public class QuickSample <T,U>{
    T obj1;
    U obj2;

    QuickSample(T obj1, U obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void print(){
        System.out.println(obj1);
        System.out.println(obj2);
    }

    public static void main(String[] args) {
        QuickSample<String, Integer> sample= new QuickSample("Rwanda", 1283);
        sample.print();
    }
}
