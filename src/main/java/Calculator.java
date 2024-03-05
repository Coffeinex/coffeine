import java.util.Scanner;

public class Calculator {
    /**
     * @param args
     */
 
    private double num1;
    private double num2;
    private String operation1;


    public  void Input() {
    Scanner in = new Scanner(System.in);
    System.out.println("введите выражение: " );
    String str = in.nextLine();

    in.close();
    
    String[] parts = str.split(" ");
    operation1 = parts[1];
     try {
        num1 = Double.parseDouble(parts[0]);
        num2= Double.parseDouble(parts[2]);
    }catch (NumberFormatException e) {
        System.out.println("Нет числа");
        return;
    }
    }
   
  
        public double sum() { //отдельно на каждую операцию
           
            return num1 + num2;
        
        }

        public double min() {
           
            return num1-num2;
            
        }

        public double multiple() {
         
            return num1*num2;
        
        }

        public double del(){ 
            try{
                return num1/num2;
            }catch(Exception e){
                System.out.println ("Делитель не должен быть равен 0");
                return Double.NaN;
            }
           
        }

        public double switcher(){
            switch(operation1){
                case "+":
                    return sum();
                case "-":
                    return min();
                case "*":
                    return multiple();
                case "/":
                    return del();
                default:
                    return Double.NaN;
                
            }
        }

         public static void main(String[] args) { //на выводы результатов
            Calculator calc = new Calculator();
            calc.Input();
            double res = calc.switcher();
            System.out.println(res);

            
        
 }
    }

 
