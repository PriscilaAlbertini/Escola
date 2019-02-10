package br.edu.priscila.escola.WS;

import br.edu.priscila.escola.Classe.ConnectionWS;
import br.edu.priscila.escola.Classe.PriException;
import br.edu.priscila.escola.VO.CursoVO;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;

public class CursoWS {

    Gson gson;

    public CursoWS() {
        gson = new Gson();
    }

    public List<CursoVO> consultarTodos() throws PriException {
        List<CursoVO> vConsulta = gson.fromJson(ConnectionWS.get("consultartodoscursos"),
                new TypeToken<List<CursoVO>>() {}.getType());

        return vConsulta;
    }
    
    public String salvar(CursoVO curso) throws PriException {
        return ConnectionWS.get("salvarcurso", gson.toJson(curso), "PUT");
    }

}
