import java.rmi.dgc.VMID;

public class Funcionario{
    public int id;
    public String nome;
    public String email;
    public int matricula;
    public String cpf;

    //construtor do funcionario
    public Funcionario(){
        System.out.println("Instanciando funcionário!");
    }
    public Funcionario(String nome, String email, int matricula, String cpf){
        this();
        this.nome = nome;
        this.email = email;
        this.matricula = matricula;
        this.cpf = cpf;
    }

    public Funcionario(int id,String nome, String email, int matricula, String cpf){
        this(nome, email, matricula, cpf);
        this.id = id;
    }

    public void baterPonto(){
        System.out.println("funcionario bateu ponto ");
    }

    public void baterPonto(int hora, int minuto){
        baterPonto();
        System.out.println("às "+hora+" e "+minuto);
    }

}