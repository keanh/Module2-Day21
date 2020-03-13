import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Nhập size của mảng");
        int size = scanner.nextInt();
        System.out.println("Nhập các chữ số");
        while (size>0){
            int input = scanner.nextInt();
            numbers.add(input);
            size--;
        }
        Client client = new Client(new CollectionUtils());
        client.printMaxValue(numbers);
    }
}
