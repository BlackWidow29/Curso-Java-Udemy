package fundamentos;

public class ConversaoTiposPrimitivosNumerico {
    public static void main(String[] args) {
        double a = 1;
        System.out.println(a);
        float b = (float) 1.0;
        System.out.println(b);
        double a1 = 1.12345678888888;
        System.out.println(a1);
        float b1 = (float) 1.12345678888888;
        System.out.println(b1);

        int c = 4;
        byte d = (byte)c;
        System.out.println(d);

        double e = 1.99999;
        int f = (int) e;
        System.out.println(f);

    }
}
