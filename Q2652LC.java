public class Q2652LC {
    public int sumOfMultiples(int n) {
        //If A = 3, B = 5, C = 7, 
        //Sum of all numbers divisible by 3,5,7
        //=> AUBUC = A+B+C - A∩B - B∩C - A∩C + A∩B∩C
        int sumOf3=sumOfFactors(3, n);
        int sumOf5=sumOfFactors(5, n);
        int sumOf7=sumOfFactors(7, n);
        int sumOf3x5=sumOfFactors(3*5, n);
        int sumOf5x7=sumOfFactors(5*7, n);
        int sumOf3x7=sumOfFactors(7*3, n);
        int sumOf3x7x5=sumOfFactors(3*5*7, n);
        return sumOf3+sumOf5+sumOf7-(sumOf3x5+sumOf5x7+sumOf3x7)+sumOf3x7x5;
    }
    public int sumOfFactors(int k, int n)
    {
        // //To get sum of all factors on k upto n, 
        // we can use this formula (sum of Arithmatic progression): 
        // sum =    0.5 * k * (n/k) * (n/k + 1) 
        return (k*(n/k)*(n/k+1))/2;
    }
    public static void main(String[] args) {
        Q2652LC obj = new Q2652LC();
        int ans = obj.sumOfMultiples(7);
        System.out.println(ans);
    }
}
