package app;

import bo.CursoBO;
import model.Curso;

public class AppTesteDB {

	public static void main(String[] args) {
		CursoBO cursoBO = new CursoBO();
		
		Curso curso = new Curso();
		
		curso.setNome("Clojure");
		
                // A table CURSO possui AUTO_INCREMENT
                // Não é necessário atribuir um ID.
		cursoBO.incluirCurso(curso);
		
		curso = null;

		Curso cursoex = new Curso();
		
		cursoex.setNome("Clojure");
		
		cursoex.setId(1);
		
                // Excluindo de curso onde id = 1;
		cursoBO.excluirCurso(cursoex.getId()); 
                
	}
}
