import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài dãy số");
        int size = scanner.nextInt();
        System.out.println("Nhập số nhỏ nhất trong dãy số");
        int min = scanner.nextInt();
        System.out.println("Nhập số lớn nhất trong dãy số");
        int max = scanner.nextInt();
        Client client = new Client();
        client.UseRandomListFacade(size,min,max);
    }
}
