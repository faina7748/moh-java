package chap5;

public class App {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Aminah";
        p1.age = 25;
        p1.gender ="Perempuan";
        p1.walk(p1.name);        
        System.out.println(p1.getStatusKahwin("Mila"));
    }
 
}
