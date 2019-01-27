public class MainEtudiant
{ 
   public static void main (String args[])
   {
      Etudiant stud = new Etudiant("clauvis",1);
        Etudiant stud1 = new Etudiant("ledoux",1);
      stud.ObtenirNote(60);
      stud.Resulatat();
      System.out.println(" ");
       stud.ObtenirNote(80);
       System.out.println(" ");
       stud.Resulatat();
       stud1.Resulatat();
       System.out.println(" ");
       stud.ObtenirNote(10);
       stud.Resulatat();
        System.out.println(" ");
       stud.ObtenirNote(60);
       stud1.Resulatat();
   /* System.out.println ("Nom : "+ stud.getNom());
   System.out.println ("niveau : " + stud.getNiveau());*/
   }  
}
