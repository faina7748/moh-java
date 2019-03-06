package chap5;
// class ada 2 iaitu property dan method
public class Person {
    // set property
    String name;
    int age;
    String gender;
    // encapsulation
    private String statusKahwin;
    // public Interface
    public String getStatusKahwin(String jenisOrang){
       if(jenisOrang.equals("kanak2")){
           return "Muda";
       }else if(jenisOrang.equals("Mila")){
           return "Janda";
       }else{
           return "Bujang";
        }
       //return this.statusKahwin;
    }
    //method
    void walk(String name){
        System.out.println(name + " walk so fast");
    }
    
    void talk(){
        
    }
    
    void sing(){
        
    }
            
}
