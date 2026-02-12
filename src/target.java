import java.util.ArrayList;
import java.util.Scanner;

public class target {

    static ArrayList<Integer> arr(ArrayList<Integer> res, ArrayList<Integer> list, int i, int target) {

        if (i == list.size()) {
            return res;
        }

        if (i == target) {
            res.add(list.get(i));
        }

        return arr(res, list, i + 1, target);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int target = sc.nextInt();  // enter target index

        ArrayList<Integer> result = arr(res, list, 0, target);
        System.out.println(result);
    }
}
