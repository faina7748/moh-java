package chap4;
/*
"this" utk set/get a property or call/run a method 
i.e this.jumlah = 100;
*/

public class LoanCalculator extends Calculator{ 
    static int jumlah; // variable / property
    final String tajuk = "LOAN CALCULATOR"; // x boleh override value
   /* public void info(){        
    
    }
   // method ni tak boleh diwujudkan sebab info() dah final
   */
    
    // method ni akan override method cetak() dari parent
    @Override
    public void cetak(){
        System.out.println("cetak LoanCalculator");
        System.out.println(tajuk);
    }
            
    // constructor - tiada return dan nama mesti sama dengan class
    // dalam satu class boleh ada multiple constructor
    // auto run bila create new object
    // guna biasanya utk initialize variable
    // mesti public
    LoanCalculator(){
        super();  // run parent constructor
        System.out.println("I'm in constructor");
    }
    
    // constructor
    LoanCalculator(int amount){
        this.jumlah = amount;
        System.out.println("I'm in constructor 2" + jumlah);
    }
    
    // ctrl + space - show auto suggestion
    // psvm - auto generate public static void main ()
    public static void main(String[] args) {  
        LoanCalculator cal = new LoanCalculator();
        cal.cetak();
        LoanCalculator cal2 = new LoanCalculator(1);       
        LoanCalculator.jumlah = cal.calcLoanPayment(10, 2, "KK");
        System.out.println("Jumlah = " + jumlah);
    }
    
    // mesti return int, void - no return
    private int calcLoanPayment(int amount, int numberOfMonths, String state){ 
        if(state == "KL"){
            return amount * numberOfMonths;
        }else{
            return ((amount * numberOfMonths)/2);
        }
    }
    // shift + alt + f - auto arrange code
    // method overloading
    private int calcLoanPayment(int amount){
        return 0;
    }
}
