import java.util.*;

class pascalTriangle {

    public static void main(String[] args) {

        int n = 5;

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i)
                    row.add(1);
                else
                    row.add(ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
            }

            ans.add(row);
        }

        // Print as a triangle
        for (int i = 0; i < ans.size(); i++) {

            // Print leading spaces
            for (int s = 0; s < ans.size() - i - 1; s++) {
                System.out.print("  ");
            }

            // Print numbers
            for (int num : ans.get(i)) {
                System.out.print(num + "   ");
            }

            System.out.println();
        }
    }
}