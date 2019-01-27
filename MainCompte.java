public class MainCompte
{ 
   public static void main (String args[])
   {
      Compte moncompte = new Compte("BE25 4589 2358 414","clauvis");
      moncompte.afficheSolde();
      moncompte.depose(500);
      moncompte.Retire(250);
      moncompte.Retire(100);
       moncompte.changerCodeSecret();

      
   }
}
