import java.util.ArrayList;
import java.util.List;

public class 杨辉三角t119 {

    public static void main(String[] args) {
        System.out.println(getRow(1));
    }

    public static List<Integer> getRow(int rowIndex) {

        List<Integer> row = new ArrayList<>();

        if (rowIndex == 0) {
            row.add(1);
            return row;
        }



        row.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            for (int j = i - 1; j > 0; j--) {
                row.set(j, row.get(j - 1) + row.get(j));
            }
            row.add(1); //补齐最后一个1
        }

        return row;
    }

}
