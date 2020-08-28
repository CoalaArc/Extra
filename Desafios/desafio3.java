package Desafios;

import java.util.Scanner;

public class desafio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[]
                A,
                B,
                unionAB,
                intersectionAB;


        int
                flag=0,
                i,
                j,
                k,
                l,
                da,
                db;


        while(flag == 0) {

            System.out.print("\nInforme o tamanho do vetor A: ");
            da = input.nextInt();
            System.out.print("Informe o tamanho do vetor B: ");
            db = input.nextInt();

            A = new int[da];
            B = new int[db];

            unionAB = new int[da+db];
            intersectionAB = new int[da];

            //Fill the Array "A"
            for (i = 0; i < da; i++) {
                System.out.printf("A[%d]: ", i);
                A[i] = input.nextInt();
            }

            //Fill the Array "B"
            for (i = 0; i < db; i++) {
                System.out.printf("B[%d]: ", i);
                B[i] = input.nextInt();
            }

            //Create Union between A[] and B[]
            for ( i = 0; i < A.length; i++) unionAB[i] = A[i];

            for (i=0, k=0; i< B.length; i++){
                for (j=0; j< unionAB.length && B[i] != unionAB[j]; j++);

                if (j == unionAB.length) {
                    unionAB[A.length + k] = B[i];

                    k++;
                }
            }

            //Create Intersection between A[] and B[]
            for (i=0, l=0; i < A.length; i++) {
                for (j = 0; j < B.length && A[i] != B[j]; j++);

                if (j < B.length) {
                    intersectionAB[l] = A[i];

                    l++;
                }
            }

            //Output
            System.out.print("\nVetor A = [ ");
            for(i= 0; i< da; i++ ) { System.out.printf("%d ", A[i]); }
            System.out.println("]");

            System.out.print("\nVetor B = [ ");
            for(i= 0; i< db; i++ ) { System.out.printf("%d ", B[i]); }
            System.out.println("]");

            System.out.print("\nA∪B = [ ");
            for (i = 0; i < A.length+k; i++) {System.out.printf("%d ", unionAB[i]);}
            System.out.println("]");

            System.out.print("\nA∩B = [ ");
            for (i = 0; i < l; i++) {System.out.printf("%d ", intersectionAB[i]);}
            System.out.println("]");
            //restart
            System.out.print("\nDeseja fazer outra consulta ?\n(0 - Sim || 1 - Não) ");
            flag = input.nextInt();
            while(flag != 0 && flag != 1){
                System.out.print("\nInforme um opção válida.\n(0 - Sim || 1 - Não) ");
                flag = input.nextInt();
            }
        }
    }
}
