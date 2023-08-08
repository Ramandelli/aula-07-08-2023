package br.edu.umfg.tecnologia;

public class Aluno {
    private int registroAcademico;
    private String nome;
    private double notaPrimeiraProva;
    private double notaSegundaProva;
    private double notaTrabalho;

    private static final double PESO_PROVA = 0.35;
    private static final double PESO_TRABALHO = 0.30;

    // Construtor
    public Aluno(int registroAcademico, String nome, double notaProva1,
                 double notaProva2, double notaTrabalho) {
        this.registroAcademico = registroAcademico;
        this.nome = nome;
        this.notaPrimeiraProva = notaProva1;
        this.notaSegundaProva = notaProva2;
        this.notaTrabalho = notaTrabalho;
    }

    public  double media(){
        return ((notaPrimeiraProva + notaSegundaProva) * PESO_PROVA)
                + ( notaTrabalho * PESO_TRABALHO);
    }

    public  String situacao(){
      return  media() >= 7.0 ? "APROVADO" : "EXAME";
        }


    @Override
    public String toString(){
        return "R.A: " + registroAcademico + " | Nome: "+ nome;
    }

}
