import java.util.Scanner;

import Conta.Conta;

import java.util.Random;

public class Caixa {
    public static void main(String[] args) {
        String nome;
        double inicial;
        Scanner entrada = new Scanner(System.in);
        Random numero = new Random();
        int conta = 1 + numero.nextInt(9999);

        System.out.println("Cadastrando um novo cliente");
        System.out.println("Digite o nome do cliente: ");
        nome = entrada.nextLine();

        System.out.println("Digite o valor inicial depositado na conta: ");
        inicial = entrada.nextDouble();

        Conta minhaConta = new Conta(nome, conta, inicial);
        minhaConta.iniciar();
        entrada.close();
    }
}