import java.util.Arrays;

public class beagner_prec {
    public static void main(String[] args){
        int[] numbers = new int[5]; // inislize the iteams
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[4] = 4;
        numbers[3] = 5;
        System.out.println(Arrays.toString(numbers));

        int[] number1 = { 2,3,5,1,4 }; // 5
        System.out.println(number1.length); //numbers of array // we cant add any thing thts java limitation
        //int[] number2 = {2,3,5,1,4 };
        Arrays.sort(number1); //pass numbers arrays
        System.out.println(Arrays.toString(number1)); // [1,2,3,4,5]
// multi dimenc array
        int[][] number2 = new int [2][3]; // 2rows 3 collams // we can add 3 also []
        number2[0][0] = 1;
        System.out.println(Arrays.deepToString(number2)); // creat 2 rows and 3 collams
        //  mlty array with {}
        int[][] numbers3 = { {1,2,3} , {4,5,6} };
        System.out.println(Arrays.deepToString(numbers3)); // [1,2,3][4,5,6]
        // constants



    }
}
