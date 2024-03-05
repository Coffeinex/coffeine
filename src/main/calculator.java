public class calculator {
    /**
     * @param args
     */
 
    private double num1;
    private double num2;
    private Char operation1;


    public static void Input() {
    Scanner in = new Scanner (system.in);
    System.out.println("введите выражение: " );
    String str = in.NextLine();

    in.close();
    
    String[] parts = str.split(" ");
    String num1, operation1, num2;
    num1 = parts[0];
    operation1 = parts[1];
    num2 = parts[2];
     try {
num1 = (double) (numstr1);
num2= (double) (numstr2);
}
catch (NumberFormatException e) {
    System.out.println("Нет первого числа");
    return;
}
    }
   
    double res=0.0;
        public double sum() { //отдельно на каждую операцию
           
            return num1 + num2;
        
        }

        public double min() {
            case "-":
            res=num1-num2;
            break;
        }

        public double multiple() {
            case"*":
            res=num1*num2;
            break;
        }

        public double del(){ 
            case"/": {
                if num2 == 0 
                System.out.println ("Делитель не должен быть равен 0");
                return;
                }
                res=num1/num2;
                break;
            }

         public static void main(String[] args) { //на выводы результатов
        switch (operation1);
        
 }
    }

 
