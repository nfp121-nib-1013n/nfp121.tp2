package question2;


/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom) 
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entrée de cette application, 
      * dont le commentaire est à compléter
      *
      *  @param args ...
      */
     public static void main(String[] args){
       int fah = 0;
       float cel = 0;
       
         try{
             
             for(int i=0; i<args.length; i++){
           
            fah = Integer.parseInt(args[i]);
            cel = fahrenheitEnCelsius(Integer.parseInt(args[i]));
        System.out.println(fah + "\u00B0F -> " + cel + "\u00B0C");
        
       }}
            catch(NumberFormatException e){
                
                System.out.println("error: " + e.getMessage());
       }
    }
     
     /** 
      * la méthode à compléter. 
      *   @param f la valeur en degré Fahrenheit
      *   @return  la conversion en degré Celsius
      */
     public static float fahrenheitEnCelsius(int f){
         float cel = 5/9f * (f-32);
         float res = (int)(cel * 10)/10.0f;
		return res;
     }

}

