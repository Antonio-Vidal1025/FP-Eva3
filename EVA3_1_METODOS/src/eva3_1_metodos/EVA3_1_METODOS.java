/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_metodos;

/**
 *
 * @author Antonio
 */
public class EVA3_1_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int val1 = 5, val2 =10;
        //1. Si necesito guardae el valor de retono
        int resu = sumarEnteros(val1, val2);//invocar el mëtodo
    System.out.println("Suma de 5 + 10 = " + resu);
    //2. NO necesito guardar el valor, un solo uso
    System.out.println("Suma de 5 + 10 = " + sumarEnteros(val1, val2));
    
    //3. Solo necesito ejecutar el metodo, no interesa ek resultdado
    sumarEnteros(val1, val2);
    }
    //METODO PARA SUMAR DOS ENTEROS
    //llamar a sus métodos usando verbos y escritura camelCase
    //1. Modificadores de acceso: public, protected, private, deafaut
    //2. static --> PARA USAR LOS METODOS DENTRO DEL MAIN
    //3. Valor de retorno: cuaquier  tipo de datp
    //void --> si no quieren regresar un valor
    //4. nombre del/méodo: mismas reglas que identificadores
    //5. Lista de prametros: pueden ser cero o N catidad}
    //1      2     3        4               5
    public static int sumarEnteros(int num1, int num2){
        int suma = num1 + num2;
        return suma;
    }
    
}
