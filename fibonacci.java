// Fibonacci Number
class fibonacci {
    /*
    Using For Loop
    public static void main(String[] args) {
        int p1 = 1;
        int p2 = 0;
        System.out.print(p2+"  ");
        System.out.print(p1+" ");
        for(int i =2; i<18;i++) {
            int p0 = p2+p1;
            System.out.print(p0+" ");
            p2 = p1;
            p1 = p0;
        }
    }
    */
    /*
    Using recursion
    static int count = 2;
    public static void main(String[] args) {
        int p1 = 1;
        int p2 = 0;
        System.out.print(p2+"  ");
        System.out.print(p1+" ");
        Fibonacci(p2, p1);
    }
    public static void Fibonacci(int p2, int p1) {
        if (count<18) {
            int p0 = p2 +p1;
            System.out.print(p0+" ");
            p2 = p1;
            p1 = p0;
            count+=1;
            Fibonacci(p2,p1);
        }else {
                return;
        }
    }
    */
    /*
    Nth Fibonacii Number
    public static int Fibonacci(int n) {
        if(n<=1) {
            return n;
        }
        else {
            return Fibonacci(n-2) + Fibonacci(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(Fibonacci(17));
    }
    */
}