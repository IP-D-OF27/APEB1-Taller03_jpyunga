package ejercicio03;
public class Ejercicio03 {
    public static void main(String[] args) {
        // Solucion al problema
        int var1 = 10;
        int var2 = 16;
        int var3 = 20;
        int var4 = 1;
        int var5 = 11;
             // Math.sqrt me permite obtener la raíz cuadrada de un número
             //Math.pow me permite calcular un numero base elevado a una potencia
         double resultado = Math.pow(var1,2)+ Math.sqrt(var2) + (double) var3 / (var4 + var5);
                 System.out.println("resultado = " + resultado);
                 //ejercicio analizado y correcto

}
}