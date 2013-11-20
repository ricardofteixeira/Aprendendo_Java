class TestaFuncionario {
  public static void main (String [] args) {
    
    Funcionario f1 = new Funcionario();
    f1.nome = "Carlos";
    f1.salario = 1300;

    Funcionario f2 = new Funcionario();
    f2.nome = "Paulo";
    f2.salario = 1500;

    System.out.println (f1.nome);
    System.out.println (f1.salario);

    System.out.println (f2.nome);
    System.out.println (f2.salario);
  }
}
