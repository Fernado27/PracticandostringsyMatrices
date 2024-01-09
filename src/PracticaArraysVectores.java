import java.util.Scanner;

public class PracticaArraysVectores {
    public static void main(String[] args) {
        //Ejercicio con 3 vectores: Temperaturas de Ciudades
       /* String ciudades[] = new String[5];
        int[] tempmax = new int[5];
        int[] tempmin = new int[5];
        int tempmintotal = 0;
        int tempmaxtotal = 0;
        for(int i=0;i<5;i++){
            Scanner user = new Scanner(System.in);
            System.out.println("Ingrese la ciudad");
            ciudades[i] = user.next();

            Scanner max = new Scanner (System.in);
            System.out.println("Ingrese la temperatura maxima de la ciudad " + ciudades[i]);
            tempmax[i] = max.nextInt();

            Scanner min = new Scanner (System.in);
            System.out.println("Ingrese la temperatura minima de la ciudad " + ciudades[i]);
            tempmin[i] = min.nextInt();

            if(tempmax[i]>tempmaxtotal) tempmaxtotal = tempmax[i];

            if(tempmin[i]<tempmintotal) tempmintotal = tempmin[i];
        }

        for(int i=0;i<5;i++){
            System.out.println("La ciudad " + ciudades[i] + " tiene una temperatura maxima de " + tempmax[i] + " grados y una temperatura minima de " + tempmin[i] + " grados");
        }

        System.out.println("La temperatura maxima de todas las ciudades es " + tempmaxtotal + " grados");
        System.out.println("La temperatura minima de todas las ciudades es " + tempmintotal + " grados");*/

        //lol
        //Para el tercer commit prueba
        //Cuarto commit

        //llevar a cabo un programa que permite cargar completamente con numeros 5 una matriz de 4x5

        int matriz[][] = new int[4][5];
        Scanner user = new Scanner(System.in);
        for (int i=0;i<4;i++){
            for (int j=0;j<5;j++){
                System.out.println("Ingrese el numero '5'");
                matriz[i][j] = user.nextInt();
                while(matriz[i][j]!=5){
                    System.out.println("No ingreso el numero '5'. Porfavor ingrese el numero 5");
                    matriz[i][j] = user.nextInt();
                }
            }
        }

        for (int i=0;i<4;i++){
            for (int j=0;j<5;j++){
                System.out.println("Fila: " + i + ". Columna: " + j + ". Valor: " + matriz[i][j]);
            }
        }


    }

}
