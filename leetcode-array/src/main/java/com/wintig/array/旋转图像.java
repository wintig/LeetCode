package com.wintig.array;

/**
 *
 *给定一个 n × n 的二维矩阵表示一个图像。

 将图像顺时针旋转 90 度。

 说明：

 你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。

 示例 1:

 给定 matrix =
 [
 [1,2,3],
 [4,5,6],
 [7,8,9]
 ],

 原地旋转输入矩阵，使其变为:
 [
 [7,4,1],
 [8,5,2],
 [9,6,3]
 ]
 示例 2:

 给定 matrix =
 [
 [ 5, 1, 9,11],
 [ 2, 4, 8,10],
 [13, 3, 6, 7],
 [15,14,12,16]
 ],

 原地旋转输入矩阵，使其变为:
 [
 [15,13, 2, 5],
 [14, 3, 4, 1],
 [12, 6, 8, 9],
 [16, 7,10,11]
 ]
 */
public class 旋转图像 {

    public static void main(String[] args) {
        int[][] matrix =
                {
                    {5, 1, 9,11},
                    { 2, 4, 8,10},
                    {13, 3, 6, 7},
                    {15,14,12,16}
                };

        int[][] matrix1 =
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };

        rotate(matrix);

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] +  " ");
            }

            System.out.println();

        }
    }

    // 当交换0,0坐标的元素的时候，把与之受影响的4个坐标点都一起交换
    public static void rotate(int[][] matrix) {

        for (int i = 0; i < matrix.length / 2; i++) {

            for (int j = i; j < matrix.length - 1 - i; j++) {

                int temp = matrix[j][i];
                //System.out.println("temp : " + temp);


                matrix[j][i] = matrix[matrix.length - 1 - i][j];
                //System.out.println(j + "," + i + "=" + (matrix.length - 1 - i) +","+ j);

                matrix[matrix.length - 1 - i][j] = matrix[matrix.length - 1 - j][matrix.length - 1 - i];
                //System.out.println( (matrix.length - 1 - i) +  "," + j + "=" +  (matrix.length - 1 - j) + "," +  (matrix.length - 1 - i));

                matrix[matrix.length - 1 - j][matrix.length - 1 - i] = matrix[i][matrix.length - 1 - j];
                //System.out.println( (matrix.length - 1 - j) +  "," + (matrix.length - 1 - i) + "=" +  (i) + "," +  (matrix.length - 1 - j));


                matrix[i][matrix.length - 1 - j] = temp;
              //  System.out.println( (i) +  "," + (matrix.length - 1 - j) + "=" +  (i) + "," +  (j));

            }

            //System.out.println("============================");

        }


    }

}
