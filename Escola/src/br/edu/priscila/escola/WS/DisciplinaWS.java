package br.edu.priscila.escola.WS;

import br.edu.priscila.escola.Classe.ConnectionWS;
import br.edu.priscila.escola.Classe.PriException;
import br.edu.priscila.escola.VO.DisciplinaVO;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;

public class DisciplinaWS {

    Gson gson;

    public DisciplinaWS() {
        gson = new Gson();
    }

    public List<DisciplinaVO> consultarTodos() throws PriException {
        List<DisciplinaVO> vConsulta = gson.fromJson(ConnectionWS.get("consultartodasdisciplinas"),
                new TypeToken<List<DisciplinaVO>>() {}.getType());

        return vConsulta;
    }
    
    public String salvar(DisciplinaVO disciplina) throws PriException {
        return ConnectionWS.get("salvardisciplina", gson.toJson(disciplina), "PUT");
    }
    
    public List<DisciplinaVO> consultarCadastradas(String id) throws PriException {
        gson = new Gson();
        List<DisciplinaVO> vConsulta = new Gson().fromJson(ConnectionWS.get("consultardisciplinacurso", id, "PUT"),
                new TypeToken<List<DisciplinaVO>>() {}.getType());

        return vConsulta;
    }

}
