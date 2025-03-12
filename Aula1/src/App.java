import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do professor: ");
        String nome = sc.nextLine();
        System.out.println("Digite a quantidade de anos de experiência: ");
        int anosExperiencia = sc.nextInt();
        Professor p = new Professor(nome, anosExperiencia);
        System.out.println(p.toString());
        System.out.println("Classificação: " + p.classificarProfessor());
    }
    //Alteração no repositorio remoto para utilização do comando: "Git pull"
    //Alteração no repositorio local para utilização do comando: "Git add . "
    //comentário inserido na branch main
    //Bug resolvido
}
