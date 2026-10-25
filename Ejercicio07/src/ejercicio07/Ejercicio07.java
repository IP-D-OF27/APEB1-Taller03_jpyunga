package ejercicio07;
public class Ejercicio07 {
    public static void main(String[] args) {
     //Solucion a la problematica 
     int var1 = 81;
    int var2 = 9;
    int var3 = 3; 
    int var4 = 10; 
    int var5 = 1;  
    int var6 = 100;
    int var7 = 25;
    double resultado = ( Math.sqrt(var1) + var2) / var3 ;
    boolean condicion1 = resultado ==9;
    boolean condicion2 = var4 > var5; 
    int resultado2 = var6 / var7; 
    double raiz = Math.sqrt(var6);
     boolean condicion3 = resultado2 >= raiz;
     boolean resultadoFin = condicion1 || condicion2 && condicion3;
        System.out.println("Operacion1 = " + condicion1);
        System.out.println("Operacion2 = " + condicion2);
        System.out.println("Operacion3 = " + condicion3);
        System.out.println("Resultado Final = " + resultadoFin);
        
    }
 
}