package Desafios;

import java.util.Scanner;

public class desafio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[]
                A,
                B,
                C;

        int
                flag=0,
                i,
                da,
                db;

        double
                sum = 0;

        while(flag == 0) {

            System.out.print("Informe o tamanho do vetor A: ");
            da = input.nextInt();
            System.out.print("Informe o tamanho do vetor B: ");
            db = input.nextInt();

            A = new double[da];
            B = new double[db];

            C = new double[da];

            //Fill the Array "A"
            for (i = 0; i < da; i++) {
                System.out.printf("Informe o %d° valor do vetor A: ", i+1);
                A[i] = input.nextDouble();
            }

            //Fill the Array "B"
            for (i = 0; i < db; i++) {
                System.out.printf("Informe o %d° valor do vetor B: ", i+1);
                B[i] = input.nextDouble();
            }

            //Sum of the elements in Array "B"
            for (i = 0; i < db; i++) {
                sum += B[i];
            }

            //Fill the Array "C"
            for (i = 0; i < da; i++) {
                C[i] = A[i] * sum;
            }

            //Output
            System.out.print("\nVetor A = [ ");
            for( int k= 0; k< da; k++ ) { System.out.printf("%.1f ", A[k]); }
            System.out.println("]");

            System.out.print("\nVetor B = [ ");
            for( int k= 0; k< db; k++ ) { System.out.printf("%.1f ", B[k]); }
            System.out.println("]");

            System.out.print("\nVetor C = [ ");
            for( int k= 0; k< da; k++ ) { System.out.printf("%.1f ", C[k]); }
            System.out.println("]");

            System.out.print("\nDeseja fazer outra consulta ?\n(0 - Sim || 1 - Não) ");
            flag = input.nextInt();
            while(flag != 0 && flag != 1){
                System.out.printf("\nInforme um opção válida.\n(0 - Sim || 1 - Não)");
                flag = input.nextInt();
            }
        }
    }
}
