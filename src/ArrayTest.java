/**
 * Created by cjw on 2016-01-27.
 */

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {

        String[][] iArr = new String[3][];
        iArr[0] = new String[2];
        iArr[1] = new String[3];
        iArr[2] = new String[2];

        iArr[0][0] = "하";
        iArr[0][1] = "하하";

        iArr[1][0] = "하하하";
        iArr[1][1] = "하하하하";
        iArr[1][2] = "하하하하하";

        iArr[2][0] = "하하하하하하";
        iArr[2][1] = "하하하하하하하";

        for (int i = 0; i < iArr.length; i++) {
            for(int j=0; j < iArr[i].length; j++) {
                System.out.println(iArr[i][j]);
            }
        }

        for (int i = 0; i<iArr.length; i++) {
            System.out.println(Arrays.toString(iArr[i]));
        }

        String[][] jArr = new String[3][2];
        jArr[0][0] = "하하하하하하하하";

    }
}
