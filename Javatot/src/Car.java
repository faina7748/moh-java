// nama file dan nama class mesti sama 
// class name guna camel case i.e NamaSaya
// 1 class berada dalam 1 file
public class Car {
    String color; // class-based data type
    int numOfDoors; // primitive data type
    
    void print(){
        System.out.println("Color : " + this.color);
    }
    
    void startEngine(){
        System.out.println("Vroom..Vroom..Num of Door : " + numOfDoors); //sout
    }
    
    void stopEngine(){
        
    }
}
