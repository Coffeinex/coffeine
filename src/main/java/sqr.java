import java.util.Scanner;

public class sqr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        in.close();

        String[] parts = str.split("");
        String numstr0, numstr1, numstr2;
        numstr0 = parts[0];
        numstr1 = parts[1];
        numstr2 = parts[2];
        try {
            int num0 = Integer.parseInt(numstr0);
            int num2 = Integer.parseInt(numstr2);
            
            switch (numstr1) {
                case "+": {
                    int res = num0 + num2;
                    System.out.print("Результат: " + res);
                    break;
                }
                case "-": {
                    int res = num0 - num2;
                    System.out.print("Результат: " + res);
                    break;
                }
                case "*": {
                    int res = num0 * num2;
                    System.out.print("Результат: " + res);
                    break;
                }
                case "/": {
                    int res = num0 / num2;
                    if (num2 == 0) {
                        System.out.println("Не удалось получить число из выражения");
                        return;
                            }
                    System.out.print("Результат: " + res);
                    break;
                }
                default:
                    System.out.print("Ошибка");
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("Не удалось получить число из выражения: " + str);
            return;
        }

    }

}
