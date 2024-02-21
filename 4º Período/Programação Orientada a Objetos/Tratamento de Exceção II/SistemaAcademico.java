public class SistemaAcademico {
    private static ProfessorIFBA[] professores = new ProfessorIFBA[20];

    public ProfessorIFBA buscarProfessor (String cpf) {
        for (int i = 0; i < professores.length; i++) {
            if (professores[i] == null) {
                continue;
            }
            if (professores[i].getCpf().equals(cpf)) {
                return professores[i];
            }
        }
        return null;
    }
    
    public void registrarProfessor (ProfessorIFBA professor) {
        try {

            if (buscarProfessor(professor.getCpf()) != null) {
                throw new ProfessorExistenteException(professor.getCpf());
            }
            boolean temEspaco = false;
            for (int i = 0; i < professores.length; i++) {
                if (professores[i] == null) {
                    professores[i] = professor;
                    temEspaco = true;
                    break;
                }
            }
            if (!temEspaco) {
                throw new MatrizSemEspacoException("Não há espaço para mais professores");
            }
        } catch (MatrizSemEspacoException e) {
            System.out.println(e.getMessage());
        } catch (ProfessorExistenteException e) {
            System.out.println(e.getMessage());
        }
    }

    public void removerProfessor (String cpf) {
        try {
            if (buscarProfessor(cpf) == null) {
                throw new ProfessorInexistenteException(cpf);
            }
            for (int i = 0; i < professores.length; i++) {
                if (professores[i].getCpf().equals(cpf)) {
                    professores[i] = null;
                    break;
                }
            }
        } catch (ProfessorInexistenteException e) {
            System.out.println(e.getMessage());
        }
    }

    public String pesquisarProfessorIFBA (String cpf) {
        try {
            if (buscarProfessor(cpf) == null) {
                throw new ProfessorInexistenteException(cpf);
            }
            return buscarProfessor(cpf).getInformacoes();
        } catch (ProfessorInexistenteException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
