import java.util.Scanner;

public class AlunosAlturas {

    // Encontre o aluno mais alto e o mais baixo.
    public static void main(String[] args) {
        // Array de alunos
        Aluno[] alunos = new Aluno[10];
        // Leitura do número do Aluno
        int numero;
        // Leitura da altura do Aluno
        float altura;
        // Aluno mais alto
        int maisAlto=0;
        // Aluno mais alto
        int maisBaixo=0;
        // Maior altura
        float maiorAltura=0;
        // Menor altura
        float menorAltura=0;
        // Configurar Scanner para leitura dos dados dos Alunos
        Scanner scanner = new Scanner(System.in);

        // Leitura dos dados dos 10 alunos
        for(int i=0;i<10;i++) {

            // Solicita dados do Aluno atual
            System.out.println("Aluno " + (i+1) + ": ");

            System.out.println("Número: ");
            // Leitura do número do Aluno
            numero=scanner.nextInt();
            // Limpeza do buffer
            scanner.nextLine();

            System.out.println("Altura: ");
            // Leitura da altura do Aluno
            altura=scanner.nextFloat();
            // Limpeza do buffer
            scanner.nextLine();

            // Cria o novo aluno
            alunos[i] = new Aluno(numero, altura);
            // Verificar se o aluno é o mais alto ou mais baixo
            if(alunos[i].getAltura()>=maiorAltura) {
                // Aluno mais alto
                maisAlto=alunos[i].getNumero();
                maiorAltura=alunos[i].getAltura();
            } else if(maisBaixo==0 || alunos[i].getAltura()<=menorAltura) {
                // Verifica se é o primeiro mais baixo
                // Aluno mais baixo
                maisBaixo=alunos[i].getNumero();
                menorAltura=alunos[i].getAltura();
            }
        }

        // Mostrar todos os alunos
        for(int i=0;i<10;i++) {
            System.out.println("Aluno: " + alunos[i].getNumero() + " | Altura: " + alunos[i].getAltura());
        }

        // Mostrar aluno mais alto
        System.out.println("Aluno mais alto: " + maisAlto + " | Altura: " + maiorAltura);

        // Mostrar aluno mais baixo
        System.out.println("Aluno mais baixo: " + maisBaixo + " | Altura: " + menorAltura);
    }
}
