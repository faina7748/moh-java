// main() berada dalam satu class khusus yg akan guna class-class yang lain
public class App {    
    // entry point method (the best hanya ada 1 pintu masuk)
    public static void main(String[] args){
        // create object
        Car ferrari = new Car();
        ferrari.numOfDoors = 2;
        ferrari.color = "red"; // mesti "" x boleh ''
        // '' hanya utk data type char shj
        ferrari.print();   
        ferrari.startEngine();
        Car porsche = new Car();
    }
    
}
