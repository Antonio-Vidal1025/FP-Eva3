/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_menu;

import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class EVA3_3_MENU {

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
                calcularPotencia();
                
            } else if(opcion ==2){
                calcularSumar();
                } else if(opcion == 3){
                System.out.println("Saliendo del sistema");
            }
        }while(opcion != 3);
        }
    public static void imprimirMenu(){
        System.out.println("BIENVENIDO AL SISTEMA");
        System.out.println("1. Calcular una potencia");
        System.out.println("2. Sumar dos números");
        System.out.println("3. Salir del sistema");
        System.out.println("Selecciona una opcion: ");
}
public static void calcularPotencia() {
    Scanner captu = new Scanner(System.in);
    int base, exp;
    System.out.println("*****CÁCUL0 DE UNA POTENCIA*****");
    System.out.println("Captura la base: ");
    base = captu.nextInt();
    System.out.println("Captura el exponente: ");
    exp = captu.nextInt();
    //PENDIENTE EL CALCULO
    System.out.println(base + " elevado a " + exp + " = " + calcularPot(base, exp));
}
public static int calcularPot(int base, int expo){
    int resu = 1;
    for (int i = 1; i <= expo; i++) {
        resu = resu * base;
    }
    return resu;
}
public static void calcularSumar() {
    Scanner captu = new Scanner(System.in);
    int num1, num2;
    System.out.println("*****CÁCUL0 DE DOS NÚMEROS*****");
    System.out.println("Captura el primer número: ");
    num1 = captu.nextInt();
    System.out.println("Captura el segundo número: ");
    num2 = captu.nextInt();
    //SUMATORIA
    System.out.println(num1 + " + " + num2 + " = " + calcularSuma(num1, num2));
}
public static int calcularSuma(int num1, int num2){
    int resu = num1 + num2;
    return resu;
}
}