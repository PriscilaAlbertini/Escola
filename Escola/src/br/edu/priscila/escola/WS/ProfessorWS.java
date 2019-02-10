package br.edu.priscila.escola.WS;

import br.edu.priscila.escola.Classe.ConnectionWS;
import br.edu.priscila.escola.Classe.PriException;
import br.edu.priscila.escola.VO.ProfessorVO;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;

public class ProfessorWS {

    Gson gson;

    public ProfessorWS() {
        gson = new Gson();
    }

    public List<ProfessorVO> consultarTodos() throws PriException {
        List<ProfessorVO> vConsulta = gson.fromJson(ConnectionWS.get("consultartodosprofessores"),
                new TypeToken<List<ProfessorVO>>() {}.getType());

        return vConsulta;
    }
    
    public String salvar(ProfessorVO professor) throws PriException {
        return ConnectionWS.get("salvarprofessor", gson.toJson(professor), "PUT");
    }
    
    public ProfessorVO getById(String id) throws PriException{
        return gson.fromJson(ConnectionWS.get("consultarprofessorid", id, "PUT"), ProfessorVO.class);
    }

}
