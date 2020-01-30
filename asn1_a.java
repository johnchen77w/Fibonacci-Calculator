public class asn1_a {

    private static long fibonacci(long x) {
        if(x!=1 && x!=0) {
            return(fibonacci(x-1) + fibonacci(x-2));
        } else {
            return(x);
        }
    }

    public static void main(String[] args) {
        int i = 0;
        while (i <= 10){
            System.out.println("F(" + i*5 + ") = " + fibonacci(i*5));
            i++;
        }
    }
}