class TestaTurma {
  public static void main (String [] args) {
    
    Turma t1 = new Turma ();
    t1.periodo = "Manha";
    t1.serie = 1;
    t1. sigla = "A";
    t1.tipoEnsino = "Fundamental";

    Turma t2 = new Turma ();
    t2.periodo = "Noite";
    t2.serie = 3;
    t2.sigla = "B";
    t2.tipoEnsino = "Medio";

    System.out.println (t1.periodo);
    System.out.println (t1.serie);
    System.out.println (t1.sigla);
    System.out.println (t1.tipoEnsino);

    System.out.println (t2.periodo);
    System.out.println (t2.serie);
    System.out.println (t2.sigla);
    System.out.println (t2.tipoEnsino);
  }
}

    