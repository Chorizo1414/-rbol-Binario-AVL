
package ejemplos.tarea;


public class EjemplosTarea {

   public static void main(String[]args){
       
    //Concatenar +    
    String nombre = "Sierra de Horche ";
    String frase;
    frase = nombre + "es muy bella";
    System.out.println(frase);
    
    
    //Substring ()
    String pueblo = "Guatemala";
    pueblo ="Ciudad de " + pueblo;
    String cadena = pueblo.substring(0,11);
    
    System.out.println(cadena);
    
    //length ()
    System.out.println(" ");
    System.out.println(" ");
    String pueblo2 = "Guatemala";
    pueblo2 = "Ciudad de " + pueblo;
    String cadena2 = pueblo.substring(0,11);
    System.out.println("La longitud es " + cadena2.length());
    System.out.println(cadena2);
    
    
    //equals
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("La longitud es "+cadena.length());
    System.out.println(cadena);
    System.out.println(cadena.equals("Ciudad de"));
    
    
    //equalsIgnoreCase
    System.out.println(" ");
    System.out.println(" ");
    String pueblo3 = "Guatemala";
    pueblo3 = "Ciudad de"+pueblo;
    String cadena3 = pueblo.substring(0,11);
    System.out.println("La longitud es " + cadena3.length());
    System.out.println(cadena3);
    System.out.println(cadena3.equalsIgnoreCase("CIUDAD de G"));
    
    
    
    //CompareTo
    System.out.println(" ");
    System.out.println(" ");
    String entrada="cambiando";
    System.out.println(entrada.compareTo("cambiando"));
    System.out.println(entrada.compareTo("extremadamente"));
    System.out.println(entrada.compareTo("ama"));
        
    //CompareToIgnoreCase
    System.out.println(" ");
    System.out.println(" ");
    String entra="cambiando";
    System.out.println(entra.compareToIgnoreCase("cambiANDO"));
    System.out.println(entra.compareToIgnoreCase("q"));
    System.out.println(entra.compareToIgnoreCase("CAMBIANDO"));
    
    
    //boolean equals(Unacadena)
    System.out.println(" ");
    System.out.println(" ");
    String sCadena1 = "Avila";
    String sCadena2 = "Salamanca";
    String sCadena3 = "AVILA";

    if (sCadena1.equalsIgnoreCase(sCadena2))
    System.out.println(sCadena1 + " y " + sCadena2 + " son IGUALES");
    else
    System.out.println(sCadena1 + " y " + sCadena2 + " son DIFERENTES");

    if (sCadena1.equalsIgnoreCase(sCadena3))
    System.out.println(sCadena1 + " y " + sCadena3 + " son IGUALES");
    else
    System.out.println(sCadena1 + " y " + sCadena3 + " son DIFERENTES");
    
    
    //int length()
    System.out.println(" ");
    System.out.println(" ");
    String S1 = "Longitud de la cadena de JAVA";       
    String S2 = "Ingenieria";             
    int length = S1.length();       
    System.out.println("Longitud de una cadena es:" + length);       
    System.out.println("Longitud de una cadena es:" + S2.length());   
    
    
    
    //String toUpperCase()
    System.out.println(" ");
    System.out.println(" ");
    String S3= "minusculas convertidas en mayusculas";       
    System.out.println(S3.toUpperCase());
   }
  
    
}
