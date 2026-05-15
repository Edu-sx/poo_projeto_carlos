package br.ufpb.dcx.lojaroupas;

import java.util.LinkedList;

public class Main {
    public static void main (String [] args) {
        GerenciaRoupas ComEstilo = new GerenciaRoupas(new LinkedList<>());
        ComEstilo.CadastrarRoupa("Blusa", "Preto", 50, "G");
        ComEstilo.CadastrarRoupa("Blusa", "Azul", 40, "M");
        ComEstilo.CadastrarRoupa("Casaco", "Vermelho", 70, "G");
        ComEstilo.CadastrarRoupa("Casaco", "Preto", 70, "G");
        ComEstilo.CadastrarRoupa("Blusa", "Preto", 40, "M");
        LinkedList<Roupa> roupasDeCorPreta = null;
        try {
            roupasDeCorPreta = ComEstilo.roupasDeCor("Preto");
        } catch (NaoExisteRoupaCom e) {
            IO.println(e);
        }
        if (roupasDeCorPreta != null) {
            for (Roupa r : roupasDeCorPreta) {
                IO.println(r.toString());
            }
        }

    }
}
