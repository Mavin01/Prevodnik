import java.io.*;
class Dec2Oct
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Zadejte číslo(10) : ");
        int n=Integer.parseInt(br.readLine());
 
        int r;
        String s=""; //Proměnná na ukládání výsledků
 
        
        char dig[]={'0','1','2','3','4','5','6','7'};
        // Pole které ukládá čísla jako znaky v šestnáckové soustavě
        while(n>0)
        while(n>0)
            {
                r=n%8; //Hledá zbytky po dělení tím že dělí číslo v (10) osmi
                s=dig[r]+s; //Přidání zbytku po dělení a zárověň je obrací
                n=n/8;
            }
        System.out.println("Výsledk je : "+s);
    }
}