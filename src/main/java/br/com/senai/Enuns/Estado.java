package br.com.senai.Enuns;

public enum Estado {
    AC("Acre"),
    AL("Alagoas"),
    AP("Amapá"),
    AM("Amazonia"),
    BA("Bahia"),
    CE("Cerá"),
    DF("Distrito Federal"),
    ES("Espirito Santo"),
    GO("Goiás"),
    MA("Maranhão"),
    MT("Mato Grosso"),
    MS("Mato Grosso do Sul"),
    MG("Mina gerais"),
    PA("Pará"),
    PB("Paraibá"),
    PR("Paraná"),
    PE("Pernambuco"),
    PI("Piauí"),
    RJ("Rio de Janeiro"),
    RN("Rio Grande do Norte"),
    RS("Rio Grande do Sul"),
    RO("Rondônia"),
    RR("Roraima"),
    SC("Santa Cantarina"),
    SP("São Paulo"),
    SE("Sergipe"),
    TO("Tocantins");

    private String nome;

    Estado (String nome) {
      this.nome = nome;
    }

    public String getNome(){
      return nome;
    }
}
