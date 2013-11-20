class TestaAluno {
  public static void main (String [] args) {
    
    Aluno a1 = new Aluno ();
    a1.nome = "Jose";
    a1.rg = "123456789";
    a1.dataNascimento = "1021995";

    Aluno a2 = new Aluno ();
    a2.nome = "Maria";
    a2.rg = "987654321";
    a2.dataNascimento = "1031994";

    System.out.println (a1.nome);
    System.out.println (a1.rg);
    System.out.println (a1.dataNascimento);

    System.out.println (a2.nome);
    System.out.println (a2.rg);
    System.out.println (a2.dataNascimento);
  }
}