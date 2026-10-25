package ejercicio06;
public class Ejercicio06 {
    public static void main(String[] args) {
// Resolucion del problema 
// Math.sqrt me permite obtener la raíz cuadrada de un número
    int var1 = 81;
    int var2 = 9;
    int var3 = 3; 
    int var4 = 10; 
    int var5 = 1;   
    double resultado = ( Math.sqrt(var1) + var2) / var3 ;
    boolean condicion1 = resultado ==9;
    boolean condicion2 = var4 > var5; 
    boolean resultadoFinal = condicion1 && condicion2;
      System.out.println("resultado de la operacion = " + resultado);
         System.out.println("primera condicion = " + condicion1); 
         System.out.println("sengunda condicion = " + condicion2);
         System.out.println("Resultado Final = " + resultadoFinal);       
}           
    
}
