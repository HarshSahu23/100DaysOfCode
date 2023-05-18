
public class Q12LC {
    public static String intToRoman(int num)
    {
        String roman = "";
        int[] romanInt = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanLetter = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        for (int i = 0; i <romanInt.length; i++) {
            while (num>=romanInt[i]) {
                roman+=romanLetter[i];
                num=num-romanInt[i];
            }
        }
        return roman;
    }
    public static void main(String[] args) {
        System.out.println(intToRoman(1676));

    }
}
