/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_areas;

import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class EVA3_9_AREAS {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
    Scanner captu = new Scanner(System.in);
    int opcion;
    do {
        imprimirMenu();     
        opcion = captu.nextInt();

        if(opcion == 1){
            calcularAreaTriangulo();

        } else if(opcion == 2){
            calcularAreaCirculo();

        } else if(opcion == 3){
            calcularAreaCuadrado();

        } else if(opcion == 4){
            System.out.println("Saliendo del sistema...");
        }

    }while(opcion != 4);
}

public static void imprimirMenu(){
    System.out.println("BIENVENIDO AL SISTEMA");
    System.out.println("1. Calcular área de un triángulo");
    System.out.println("2. Calcular área de un círculo");
    System.out.println("3. Calcular área de un cuadrado");
    System.out.println("4. Salir del sistema");
    System.out.println("Selecciona una opcion: ");
}

//1. ÁREA DEL TRIÁNGULO
public static void calcularAreaTriangulo() {
    Scanner captu = new Scanner(System.in);
    double base, altura;
    System.out.println("***** CÁLCULO DEL ÁREA DEL TRIÁNGULO *****");
    System.out.print("Captura la base: ");
    base = captu.nextDouble();
    System.out.print("Captura la altura: ");
    altura = captu.nextDouble();

    System.out.println("El área del triángulo es: " + areaTriangulo(base, altura));
}

public static double areaTriangulo(double base, double altura){
    return (base * altura) / 2;
}

//2. ÁREA DEL CÍRCULO
public static void calcularAreaCirculo() {
    Scanner captu = new Scanner(System.in);
    double radio;
    System.out.println("***** CÁLCULO DEL ÁREA DEL CÍRCULO *****");
    System.out.print("Captura el radio: ");
    radio = captu.nextDouble();

    System.out.println("El área del círculo es: " + areaCirculo(radio));
}

public static double areaCirculo(double radio){
    return Math.PI * radio * radio;
}

//3. ÁREA DEL CUADRADO
public static void calcularAreaCuadrado() {
    Scanner captu = new Scanner(System.in);
    double lado;
    System.out.println("***** CÁLCULO DEL ÁREA DEL CUADRADO *****");
    System.out.print("Captura el lado: ");
    lado = captu.nextDouble();

    System.out.println("El área del cuadrado es: " + areaCuadrado(lado));
}

public static double areaCuadrado(double lado){
    return lado * lado;
}
}