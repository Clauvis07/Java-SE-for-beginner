public class Etudiant
{
   private String nom;
   private int niveau;
   private boolean diplome;
   private float derniereNote;
   private int nbSession;

   public Etudiant (String nom,int niveau)
   {
      this.nom=nom;
      this.niveau=niveau;
      nbSession=0;
      diplome=false;
   }

     //propriété get...
   public String getNom()
   {
      return nom;
   }
   
   public int getNiveau()
   {
      return niveau;
   }


   public void ObtenirNote(float newNote)
   {
      if(newNote >=0 &&newNote<=100)
      {
         this.derniereNote = newNote;
      }
   }
   public  void Test()
   {
      if( derniereNote>=50 )
      {
         niveau = niveau+1;
         System.out.print(nom + " PASSE au niveau " + niveau);
      }
      else if(derniereNote<50 &&nbSession==1)
      {
         System.out.print(nom + "il vous reste "+nbSession+" de chances pour reussir le niveau "+ niveau);
         nbSession+=nbSession;
      }
      else 
      {
         System.out.print(nom + " Refus definitif");
      }
   }
   
   public   void Resulatat()
   {
      if(niveau==1 && diplome==false) 
      {
         Test();
      }
      else if(niveau==2 && diplome==false)
      {
         Test();
      }
      else if (niveau==3 && diplome==false)
      {
         if( derniereNote>=50 )
         {
            System.out.print(nom + " est diplome...");
            diplome=true;
         }
         else if(derniereNote<50 &&nbSession==1)
         {
            System.out.print(nom + "il vous reste "+nbSession+" de chances pour reussir le niveau "+ niveau);
            nbSession+=nbSession;
         }
         
         else 
         {
            System.out.print(nom + " Refus definitif");
         }
      } 
   }
   
}