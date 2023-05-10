public class Main {
    public static void main(String[] args) {
        int a, b, c, d, e,f,g,h;
        a = 98459;
        e = a;
        d = 0;
        h = -1;
            do {
            b = a % 10;
            c = a / 10;
            a = c;
            if (b >= d) d = b;
            } while (a != 0);
            System.out.println(d);
            do {
                f = e % 10;
                g = e / 10;
                e = g;
                h = h+1;
                if (f == d)
                    System.out.println(h);
            } while (e !=0);

    }
}
