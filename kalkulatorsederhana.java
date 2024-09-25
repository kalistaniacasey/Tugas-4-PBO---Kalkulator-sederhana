import java.util.Scanner;

public class SimpleCalculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan angka pertama: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Pilih operasi (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        System.out.print("Masukkan angka kedua: ");
        double num2 = scanner.nextDouble();
        
        double result = 0;
        
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                    return;
                }
                break;
            default:
                System.out.println("Operator tidak valid.");
                return;
        }

        if (result == (int) result) {
            System.out.println("Hasil: " + (int) result);  
        } else {
            System.out.println("Hasil: " + result); 
        }
        
        scanner.close();
    }
}
