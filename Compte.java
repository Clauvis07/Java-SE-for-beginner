public class Compte
{
   //attributs
   private  String  noCompte;
   private String   titulaire;
   private float    solde;
   private int      codeSecret;

    //constructeur
   public Compte(String noCompte,String titulaire)
   {
      this.noCompte = noCompte;
      this.titulaire = titulaire;
      setCodeSecret();
   
   }
   
   //fonction de validation
   public int  testcode()
   {
      int nCodeSecret;
   
      System.out.print("saisir votre code secret : ");
      nCodeSecret = Clavier.lireInt();
      while(nCodeSecret <1000 ||nCodeSecret > 9999)
      {
         System.out.println("erreur!!!!!!");
         System.out.println("le code doit avoir 4 chiffres maximun");
         System.out.print("saisir code secret : ");
         nCodeSecret = Clavier.lireInt();
         
      }
      return nCodeSecret;
   }
   //setter
   public void setCodeSecret()
   {
      int code1;
      int code2;
   
      
      code1=testcode();
      code2=testcode();
           
      while(code1!=code2)
      {
         code1=testcode();
         code2=testcode();
      }
      this.codeSecret = code1;
                 
               
   }
   
   public float getSolde()
   {
      return solde;
   }
  // changer code secret
   public void changerCodeSecret()
   {
    
      int valsaisie;
      int cpt=0;
           
      System.out.print("saisir votre  Ancien code secret : ");
      valsaisie = Clavier.lireInt();
   
      while(cpt < 2 && codeSecret != valsaisie)
      {
         System.out.println("votre ancien code est incorrect....");
         System.out.print("veuillez resaisir votre code : ");
         valsaisie = Clavier.lireInt();
         cpt++;
      }
      
      if(cpt>=2 && codeSecret!=valsaisie)
      {  
         System.out.print("votre compte a ete bloque temporairement... ");
      }
      else
      {
         setCodeSecret();  
         System.out.println("votre mot de passe a bien ete change...");       
      }
   }
   public void afficheSolde()
   {
      System.out.println("nom : "+titulaire);
      System.out.println("numeo de compte : "+ noCompte);
      System.out.println("solde : "+solde + "euros");
   }
   public  void depose(float valeur)
   {
      /*float valeur;
      System.out.print("Montant a deposer : ");
      valeur = Clavier.lireFloat();*/
      solde+= valeur;
      System.out.println("votre nouveau solde est de : " + solde);  
   }
   
   public void Retire(float montant)
   {
   /*float montant;
      System.out.print("Montant a Retirer : ");
      montant = Clavier.lireFloat();*/
      if(montant>solde)
      {
         System.out.print("Solde insuffisnat... ");
      
      }
      else
      {
         solde-= montant;
         System.out.println("votre nouveau solde est de : " + solde);
      }
   }
}