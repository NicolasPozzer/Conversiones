
package conversiones;


public class Conversiones {

    public static void main(String[] args) {
        
        double num = 1.67;
        
        //=======Cambio/casteo de double a entero==========
        /*==Pasos para convertir a entero==
        1- se crea la variable entero
        2- se pone entre() el tipo de dato
        a que le voy a asignar a la variable 
        que deseo cambiarla.
        3- y se selecciona la variable*/
        int numInt = (int) num;
        
        //castear a long
        long numLong = (long) num;
        
        //prueba
        System.out.println("double: "+ num);
        System.out.println("Int: "+ numInt);
        System.out.println("Long: "+ numLong);
        
        
        
        
        //==========Convertir un String a un numero==========
        String cantidad = "15";//entero
        String precio = "400.50";//real
        
        //convertimos al entero
        int cantEntero = Integer.parseInt(cantidad);
        //convertimos al numero real/double
        double precioDouble = Double.parseDouble(precio);
        
        //prueba con los datos convertidos:
        //ahora podemos sumar los string ya que lo convertimos a int y double
        System.out.println("El valor total de la compra es: "+(cantEntero * precioDouble));
        
        
        
        
        //==========Convertir numero a String==========
        int edad = 30;
        double estatura = 1.80;
        
        //conversion a String con valueOf
        String edadString = String.valueOf(edad);
        String estaturaString = String.valueOf(estatura);
        
        System.out.println("Edad: "+ edadString+ " Estatura: "+ estaturaString);
        
    }
    
}
