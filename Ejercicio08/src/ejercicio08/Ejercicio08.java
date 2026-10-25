package ejercicio08;
public class Ejercicio08 {
    public static void main(String[] args) {
        //Solucion a la problematica 
    int variable1 = 10;
    int variable2 = 9;
    int variable3 = 20; 
    int variable4 = 500; 
    int variable5 = 2;  
    int variable6 = 3;
    int variable7  = 200;
    int variable8 = 50;
    int variable9 = 51;
    double resultado1 = ((variable1 * variable2) + variable3 - (variable4 / variable5) + Math.pow(variable6,2));
    boolean condicion1 = resultado1 >= variable7;
    int resultado2 = variable8 - variable8 + variable9;
    boolean condicion2 = variable8 >= resultado2;
    boolean resultadoFin = condicion1 || condicion2;
        System.out.println("Resultado operacion1 = " + resultado1); 
        System.out.println("Resultado condicion1 = " + condicion1);
        System.out.println("Resultado operacion2 = " + resultado2);
        System.out.println("Resultado condicion2  = "+ condicion2);
        System.out.println("Resultado Final = " + resultadoFin);
        
    }
  
}
