using System;

namespace Csharp_sobrecarga
{
    class Funcionario{
          public int id;
    public String nome;
    public String email;
    public int matricula;
    public String cpf;


        public Funcionario(){
       Console.WriteLine("Instanciando funcionário!");
    }
    public Funcionario(String nome, String email, int matricula, String cpf) : this() {
        this.nome = nome;
        this.email = email;
        this.matricula = matricula;
        this.cpf = cpf;
    }

    public Funcionario(int id,String nome, String email, int matricula, String cpf) :  this(nome, email, matricula, cpf){
        this.id = id;
    }

    public void baterPonto(){
        Console.WriteLine("funcionario bateu ponto ");
    }

    public void baterPonto(int hora, int minuto){
        baterPonto();
        Console.WriteLine("às "+hora+" e "+minuto);
    }
    }


}