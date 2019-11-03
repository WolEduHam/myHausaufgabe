public class Fizz2 {
    int number;
    public static int quersumme(int number) {
        if (number<10) return number;
        else return number%10 + quersumme(number/10);
    }
    public static int lastnumber(int number) {
        if (number<10) return number;
        else return number%10;
    }
    public static String hello(int number){
        if ((quersumme(number)%3==0) && ((lastnumber(number)==0) || (lastnumber(number)==5)))
            return "Fizzbuzz";
        if (quersumme(number)%3==0)
            return "Fizz";
        if (lastnumber(number)==0)
            return "buzz";
        if (lastnumber(number)==5)
            return "buzz";
        else
            return Integer.toString(number);
    }
}
