import java.io.*;
class Dec2Hex
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Zadejte číslo(10): ");
        int n=Integer.parseInt(br.readLine());
 
        int r;
        String s=""; // Proměnná pro ukládání výsledků
       
        char dig[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
            // Pole které ukládá čísla jako znaky v šestnáckové soustavě
        while(n>0)
            {
                r=n%16; // Operace zbytek po dělení 16 
                s=dig[r]+s; //Přidává zbytek do výsledku
                n=n/16;
            }
        System.out.println("Výsledek je : "+s);
    }
}