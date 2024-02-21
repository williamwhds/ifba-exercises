package bo;

import model.Curso;
import dao.CursoDAO;
import java.util.List;

public class CursoBO {
    private CursoDAO cursoDAO;

    public CursoBO () {
        cursoDAO = new CursoDAO();
    }
    
    public void incluirCurso (Curso curso) {
        cursoDAO.incluir(curso);
    }
    
    public void alterarCurso (int id, Curso curso) {
        curso.setId(id);
        cursoDAO.alterar(curso);
    }
    
    public void excluirCurso (int id) {
        Curso curso = new Curso();
        curso.setId(id);
        cursoDAO.excluir(curso);
    }
    
    public List<Curso> consultarCursos () {
        return cursoDAO.consulta();
    }
}