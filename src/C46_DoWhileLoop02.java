public class C46_DoWhileLoop02 {
    public static void main(String[] args) {

        int m = 9, n = 1, x = 0;
        do {
            m--;
            n += 2;
            x += m + n;

            }  while(m > n);
        System.out.println(x);

        /*
        A. 11
        B. 13
        C. 23
        D. 36
        E. 50
        F. 10. Satirdan dolayi kod calismaz.
         */

    }
}
