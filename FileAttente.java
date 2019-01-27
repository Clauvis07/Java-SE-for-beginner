import java.util.*;
public class FileAttente
{
   private String rayon;
   private ArrayList<Integer> file;
   private   int n=1;
 
   public FileAttente(String rayon)
   {
      this.rayon = rayon;
      file = new ArrayList<Integer>();
   }
   public  void donneTiket()
   {
      if(n<=100)
      {
         System.out.println(this.rayon+" *** "+" tiket "+n+" ***");
         file.add(n);
         n++;
      }
      else
      {
         n=1;
         System.out.println(this.rayon+" ***"+" tiket "+n+" ***");
         file.add(n);
        n++;
      }
   }
   public void clientSuivant()
   {
      if (file.isEmpty())
      {
         System.out.println(rayon+"- pas de client a servir");
      }
      else
      {
       int i=0;
         System.out.println( rayon +" on sert le " +file.get(i));
         file.remove(i); 
      }
   }
 
}