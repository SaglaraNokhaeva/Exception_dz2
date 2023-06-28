import java.util.Scanner;

//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
public class Ex4 {
    public static void main(String[] args) throws Exception {
        String str = null;
        boolean flag = false;

            Scanner scan = new Scanner(System.in);
            System.out.println("Введите строку: ");
            str = scan.nextLine();
            if (str.length()!=0){
                System.out.printf("Ваша строка: %s \n", str);
                flag = true;
            }
            else System.out.println("Пустые строки вводить нельзя. \n");


    }
}




 /*try {
         str = scan.nextLine();
         System.out.printf("Ваша строка: %f \n", str);
         flag = true;
         scan.close();
         } catch (Exception e) {
         }

  */
