import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {

    static ArrayList<Integer> arr(ArrayList<Integer> list, int i) {
        if (i == list.size()) {
            return list;
        }
        return arr(list, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        ArrayList<Integer> result = arr(list, 0);
        System.out.println(result);
    }
}
