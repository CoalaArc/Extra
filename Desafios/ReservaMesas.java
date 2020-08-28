package Desafios;

import java.util.Scanner;

public class ReservaMesas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int
                i,
                numMesas,
                codMesa=1,
                qntdLugares;

        int[]
                mesas;

        boolean
                hasVacancy = true;

        System.out.print("Informe quantas mesas estarão disponíveis para serem reservadas no Show (min. 50 | max. 200): ");
        numMesas = input.nextInt();
        while (numMesas < 2 || numMesas > 5) {
            System.out.print("Informe um valor válido de mesas(min. 50 | max. 200): ");
            numMesas = input.nextInt();
        }

        mesas = new int[numMesas];
        for (int j = 0; j < mesas.length; j++) {
            mesas[j] = 6;
        }

        while (codMesa != 0 && hasVacancy) {
            System.out.printf("Informe o código da mesa que deseja reservar (1 à %d): ", numMesas);
            codMesa = input.nextInt();
            while ((codMesa < 0 || codMesa > numMesas) || mesas[codMesa-1] == 0) {
                if (codMesa < 0 || codMesa > numMesas)
                    System.out.printf("Informe um código de mesa válido(1 à %d): ", numMesas);
                else
                    System.out.print("Não há lugares suficiente na mesa pretendida.\nEscolha outra mesa: ");
                codMesa = input.nextInt();
            }

            System.out.printf("A mesa #%d tem %d lugar(es) disponível(eis).\n", codMesa, mesas[codMesa-1]);
            System.out.printf("Quantos lugares deseja reservar para a mesa #%d ? ", codMesa);
            qntdLugares = input.nextInt();
            while (qntdLugares < 1 || qntdLugares > mesas[codMesa-1]) {
                System.out.printf("A mesa #%d tem %d lugar(es) disponível(eis). Escolha outro valor: ", codMesa, mesas[codMesa-1]);
                qntdLugares = input.nextInt();
            }

            mesas[codMesa-1] -= qntdLugares;
            System.out.println("Reserva realizada com sucesso.\n");

            for (i = 0; i < numMesas && mesas[i] == 0; i++);
            if (i >= numMesas) {
                hasVacancy = false;
            }
        }
    }
}
