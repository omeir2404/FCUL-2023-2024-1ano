public class testNew {
    public static void main(String[] args) 
    {
        int[][] test = new int[][] {{1,2,3,4},
                                    {5,6,7,8},
                                    {9,8,7,6},
                                    {5,4,3,2}};
        System.out.println("how many larger or equal to: " + 7 +"\n" +UtilsIP.howManyGeq(test, 7) + "numbers are >= 7");
        System.out.println("the column " + 2 + " is: ");
        UtilsIP.print(UtilsIP.column(test, 2));
    }

}
