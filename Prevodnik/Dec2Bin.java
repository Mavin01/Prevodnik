import java.io.*;

class Dec2Bin
{
    public static void main(final String args[]) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Zadejte číslo : ");
        int n = Integer.parseInt(br.readLine());

        int r;
        String s = ""; // Proměnná na ukládání výsledků

        final char dig[] = { '0', '1' }; // Pole ukládájící 1 a 0 (jako písmena)
 
        while(n>0)
            {
                r=n%2; //Hledá zbytky po dělení tím že dělí číslo v (10) dvěma
                s=dig[r]+s; // Přidání zbytku po dělení a zárověň je obrací
                n=n/2;
            }
        System.out.println("Výsledek je : "+s);
    }
}