import java.util.Scanner;

public class Inicio{
    public static void main(String[] args) {
        System.out.println("Ola, mundo!");
        Scanner sc = new Scanner(System.in);
        Funcionario fun1 = new Funcionario();
        
        // Funcionario func = new Funcionario("Tiago", "tiago@gmail.com", 123, "1237");
        System.out.println("Informe um nome:");
        fun1.nome = sc.nextLine();

        System.out.println("Informe sua matricula:");
//func.matricula = Integer.parseInt(sc.nextLine());
        fun1.matricula = sc.nextInt();

        System.out.println("Informe sua CPF:");
        fun1.cpf = sc.next();

        sc.close();
        //func.baterPonto();
        //func.baterPonto(8, 00);
    }
}