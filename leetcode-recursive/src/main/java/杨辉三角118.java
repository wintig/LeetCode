import java.util.ArrayList;
import java.util.List;

public class 杨辉三角118 {

    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> list = new ArrayList<>();

        if (numRows == 0) {
            return list;
        }

        if (numRows == 1) {
            list.add(new ArrayList<>());
            list.get(0).add(1);
            return list;
        }


        list = generate(numRows - 1);

        List<Integer> row = new ArrayList<>();
        row.add(1);

        for (int i = 1; i < numRows - 1; i++) {
            row.add(list.get(numRows - 2).get(i - 1) + list.get(numRows - 2).get(i));
        }
        row.add(1);
        list.add(row);
        return list;
    }

}
