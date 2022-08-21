package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.concurrent.ConcurrentHashMap;

public class Mentoria extends Conteudo {
    private LocalDate data;

    @Override
    public double calcularXp() {
        // TODO Auto-generated method stub
        return XP_PADRAO+20d;
    }

    public Mentoria() {
    }

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                " titulo='" + getTitulo() + "'" +
                ", descricao='" + getDescricao() + "'" +
                ", data='" + getData() + "'" +
                "}";
    }

}
