package org.example;

import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numeroConta = sc.nextInt();

        System.out.print("Digite o número da agência: ");
        int numeroAgencia = sc.nextInt();

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = sc.next();

        System.out.print("Digite o saldo: ");
        BigDecimal saldo = sc.nextBigDecimal();

        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                        + numeroAgencia +", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível " +
                "para saque.");

        sc.close();
    }
}