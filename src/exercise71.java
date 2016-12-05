/**
 * output on 10, 5, 6, 3, 4, 2. alustab 10st, jagab selle
 * kahega, siis proovib kas arv jagub kahega, kui ei jagu siis
 * liidab ühe ja proovib uuesti kahega jagada, kui jagub siis
 * jagab kahega jne jne kuni 2ni, kust edasi on juba infinite loop.
 */
public class exercise71 {
    public static void main(String[] args) {
        loop(10);
    }
    public static void loop(int n) {
        int i = n;
        while (i > 1) {
            System.out.println(i);
            if (i % 2 == 0) {
                i = i / 2;
            } else {
                i = i + 1;
            }
        }
    }
}

