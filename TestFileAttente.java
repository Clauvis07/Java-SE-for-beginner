public class TestFileAttente
{
 public static void main(String args[])
	{
    FileAttente file1 = new FileAttente("                          FROMAGE");
    FileAttente file2 = new FileAttente("BOUCHERIE");
    file2.donneTiket();
    file2.donneTiket();
    file2.donneTiket();
    //System.out.print(   "                           " );
    file1.donneTiket();
   // System.out.print(   "                           " );
    file1.donneTiket();
    
    file2.donneTiket();
    
    file2.clientSuivant();
    file2.clientSuivant();
   // System.out.print(   "                           " );
    file1.clientSuivant();
   // System.out.print(   "                           " );
    file1.clientSuivant();
   // System.out.print(   "                           " );
    file1.clientSuivant();
   // System.out.print(   "                           " );
    file1.donneTiket();
    //System.out.print(   "                           " );
    file1.clientSuivant();

   }
}