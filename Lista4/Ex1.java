import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args){
    Scanner tec = new Scanner(System.in);
        System.out.println("Digite o numero de alunos: ");
        int n = tec.nextInt();
        int[] alunos = new int[n];
        float media = 0f;
        for(int i = 0; i<n; i++){
            System.out.println("Digite a nota do aluno");
            alunos[i]= tec.nextInt();
            media += alunos[i];
        }
        System.out.println("A media final da turma e: " + media/n);
        for(int i = 0; i<n; i++){
            if(alunos[i]>=6) System.out.println("A nota: "+alunos[i]+" e acima da media");
        }  

    tec.close();
    }
}