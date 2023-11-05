import java.util.Random;
public class ex_4 {
    public static void main(String[] args)
    {
        System.out.println(generateNumberPlate());
    }

    public static String generateNumberPlate()
    {
        StringBuilder plate = new StringBuilder();
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random rand = new Random();
        for (int i = 0; i < 6; i++) {
            if(i < 2)
                plate.append(letters.charAt(rand.nextInt(letters.length())));
            else
                plate.append(rand.nextInt(10));
        }
        return plate.toString();
    }
}