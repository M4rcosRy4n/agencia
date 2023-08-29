package br.com.senai.Enuns;

public enum Genero {
    M("Masculino"), F( "Fememinino"), O("Outros");
    
    public String tipo;
    Genero(String tipo){
        this.tipo = tipo;
    }

}
