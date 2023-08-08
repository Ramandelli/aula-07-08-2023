package br.edu.umfg.tecnologia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int registroAcademico;
        do {
            System.out.print("Digite o registro acadêmico (apenas números): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Digite um número válido.");
                System.out.print("Digite o registro acadêmico (apenas números): ");
                scanner.next();
            }
            registroAcademico = scanner.nextInt();

        } while (registroAcademico <= 0);

        String nome;
        do {
            System.out.print("Digite o nome do aluno: ");
            nome = scanner.next();
        } while (nome.trim().isEmpty());

        double notaPrimeiraProva, notaSegundaProva, notaTrabalho;
        do {
            System.out.print("Digite a nota da prova 1 (0 a 10): ");
            notaPrimeiraProva = scanner.nextDouble();
        } while (notaPrimeiraProva < 0 || notaPrimeiraProva > 10);

        do {
            System.out.print("Digite a nota da prova 2 (0 a 10): ");
            notaSegundaProva = scanner.nextDouble();
        } while (notaSegundaProva < 0 || notaSegundaProva > 10);

        do {
            System.out.print("Digite a nota do trabalho (0 a 10): ");
            notaTrabalho = scanner.nextDouble();
        } while (notaTrabalho < 0 || notaTrabalho > 10);

        // Exemplo de uso da classe
        Aluno aluno1 = new Aluno(registroAcademico, nome, notaPrimeiraProva, notaSegundaProva, notaTrabalho);
        System.out.println("RESULTADO");
        System.out.println(aluno1);
        System.out.println("Média: " + String.format("%.2f", aluno1.media()));
        System.out.println("Situação: " + aluno1.situacao());

        scanner.close();
    }
}