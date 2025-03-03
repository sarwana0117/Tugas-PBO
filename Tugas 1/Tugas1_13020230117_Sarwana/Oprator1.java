public class Oprator1 {
    /**
    * @param args
    */
    public static void main(String[] args) {
        // Kamus
        boolean Bool1, Bool2, TF;
        int i, j, hsl;
        float x, y, res;

        // Algoritma
        System.out.println("Silahkan baca teksnya dan tambahkan perintah untuk menampilkan output");

        // Operasi Boolean
        Bool1 = true; 
        Bool2 = false;

        TF = Bool1 && Bool2; // Boolean AND
        System.out.println("Bool1 AND Bool2: " + TF);

        TF = Bool1 || Bool2; // Boolean OR
        System.out.println("Bool1 OR Bool2: " + TF);

        TF = !Bool1; // NOT
        System.out.println("NOT Bool1: " + TF);

        TF = Bool1 ^ Bool2; // XOR
        System.out.println("Bool1 XOR Bool2: " + TF);

        // Operasi numerik
        i = 5; 
        j = 2;

        hsl = i + j; 
        System.out.println("i + j: " + hsl);

        hsl = i - j; 
        System.out.println("i - j: " + hsl);

        hsl = i / j; 
        System.out.println("i / j: " + hsl);

        hsl = i * j; 
        System.out.println("i * j: " + hsl);

        hsl = i % j; // sisa. modulo
        System.out.println("i % j: " + hsl);

        // Operasi numerik dengan float
        x = 5; 
        y = 5;

        res = x + y; 
        System.out.println("x + y: " + res);

        res = x - y; 
        System.out.println("x - y: " + res);

        res = x / y; 
        System.out.println("x / y: " + res);

        res = x * y; 
        System.out.println("x * y: " + res);

        // Operasi relasional numerik
        TF = (i == j); 
        System.out.println("i == j: " + TF);

        TF = (i != j); 
        System.out.println("i != j: " + TF);

        TF = (i < j); 
        System.out.println("i < j: " + TF);

        TF = (i > j); 
        System.out.println("i > j: " + TF);

        TF = (i <= j); 
        System.out.println("i <= j: " + TF);

        TF = (i >= j); 
        System.out.println("i >= j: " + TF);

        // Operasi relasional numerik dengan float
        TF = (x != y);
        System.out.println("x != y: " + TF);

        TF = (x < y); 
        System.out.println("x < y: " + TF);

        TF = (x > y); 
        System.out.println("x > y: " + TF);

        TF = (x <= y); 
        System.out.println("x <= y: " + TF);

        TF = (x >= y); 
        System.out.println("x >= y: " + TF);
    }
}