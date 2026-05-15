package br.ufpb.dcx.lojaroupas;

import java.util.LinkedList;

public class GerenciaRoupas {
    private LinkedList<Roupa> roupas;

    public GerenciaRoupas(LinkedList<Roupa> roupas) {
        this.roupas = roupas;
    }

    public void CadastrarRoupa(String modelo, String cor, double preco, String tamanho){
        this.roupas.add(new Roupa(modelo, cor, preco, tamanho));
    }

    public LinkedList<Roupa> roupasDeCor (String cor) throws NaoExisteRoupaCom {
            LinkedList<Roupa> roupasDeCorEscolhida = new LinkedList<>();
            for (Roupa r: this.roupas){
                if (r.getCor().equals(cor)){
                    roupasDeCorEscolhida.add(r);
                }
            }
            if (!roupasDeCorEscolhida.isEmpty()){
                return roupasDeCorEscolhida;
            }
            else{
                throw new NaoExisteRoupaCom("Não existe roupa com a cor "+ cor);
            }
    }

    public LinkedList<Roupa> roupasDeModelo(String modelo) throws NaoExisteRoupaCom {
        LinkedList<Roupa> roupasDeModeloEscolhido = new LinkedList<>();
        for (Roupa r: this.roupas){
            if (r.getModelo().equals(modelo)){
                roupasDeModeloEscolhido.add(r);
            }
        }
        if (!roupasDeModeloEscolhido.isEmpty()){
            return roupasDeModeloEscolhido;
        }
        else{
            throw new NaoExisteRoupaCom("Não existe roupa de modelo "+ modelo);
        }
    }

    public LinkedList<Roupa> roupasDeTamanho(String tamanho) throws NaoExisteRoupaCom {
        LinkedList<Roupa> roupasDeTamanhoEscolhido = new LinkedList<>();
        for (Roupa r: this.roupas){
            if (r.getTamanho().equals(tamanho)){
                roupasDeTamanhoEscolhido.add(r);
            }
        }
        if (!roupasDeTamanhoEscolhido.isEmpty()){
            return roupasDeTamanhoEscolhido;
        }
        else{
            throw new NaoExisteRoupaCom("Não existe roupa com o tamanho "+ tamanho);
        }
    }

    public LinkedList<Roupa> getRoupas() {
        return this.roupas;
    }
}
