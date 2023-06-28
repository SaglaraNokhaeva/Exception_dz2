import java.util.Scanner;

/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и
возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
вместо этого, необходимо повторно запросить у пользователя ввод данных. */
public class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите дробное число: ");
        float num;
        try {
            num = scan.nextFloat();
            System.out.printf("Ваше число: %f \n", num);
            scan.close();
        } catch (Exception e) {
            System.out.println("Введите дробное число: ");
        }
    }
}
