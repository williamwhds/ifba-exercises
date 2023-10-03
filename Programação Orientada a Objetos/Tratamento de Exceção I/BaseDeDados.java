public class BaseDeDados {
    private Aluno[] alunos;
    
    public BaseDeDados() {
        alunos = new Aluno[5];

    }

    public void cadastrarAluno (Aluno aluno) throws MatriculaExistenteException {
        // Verificando se existe um aluno com a mesma matricula
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null && alunos[i].getMatricula() == aluno.getMatricula()) {
                throw new MatriculaExistenteException("ERRO! Esse nº de matrícula já foi cadastrado:", aluno.getMatricula());
            }
        }

        // Insere o aluno no primeiro espaço vazio
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] == null) {
                alunos[i] = aluno;
                break;
            }
        }
    }
}
