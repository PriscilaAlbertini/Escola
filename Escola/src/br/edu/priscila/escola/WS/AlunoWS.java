package br.edu.priscila.escola.WS;

import br.edu.priscila.escola.Classe.ConnectionWS;
import br.edu.priscila.escola.Classe.PriException;
import br.edu.priscila.escola.VO.AlunoVO;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;

public class AlunoWS {

    Gson gson;

    public AlunoWS() {
        gson = new Gson();
    }

    public List<AlunoVO> consultarTodos() throws PriException {

        List<AlunoVO> vConsulta = new Gson().fromJson(ConnectionWS.get("consultartodosalunos"),
                new TypeToken<List<AlunoVO>>() {
        }.getType());

        return vConsulta;
    }

    public String salvar(AlunoVO aluno) throws PriException {
        return ConnectionWS.get("salvaraluno", gson.toJson(aluno), "PUT");
    }

}
