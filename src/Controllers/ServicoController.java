package Controllers;

import models.Cliente;
import models.TipoServico;

import java.util.ArrayList;

public class ServicoController {
    private static ArrayList<TipoServico> tiposServicos = new ArrayList<TipoServico>();

    public static boolean cadastrar(TipoServico tipoServico){
        for(TipoServico cadaTipoServico : tiposServicos) {
            if(cadaTipoServico.getTipo().equals(tipoServico.getTipo())) {
                return false;
            }
        }
        tiposServicos.add(tipoServico);
        System.out.println(tipoServico.toString());
        return true;
    }

    public static boolean existeServicoDesseTipo(String nomeServico){
        for(TipoServico cadaTipoServico : tiposServicos) {
            if(cadaTipoServico.getTipo().equals(nomeServico)) {
                return true;
            }
        }
        return false;
    }

    public static TipoServico procurarPorServico(String nomeServico){
        for(TipoServico cadaTipoServico : tiposServicos) {
            if(cadaTipoServico.getTipo().equals(nomeServico)) {
                return cadaTipoServico;
            }
        }
        return null;
    }
}
