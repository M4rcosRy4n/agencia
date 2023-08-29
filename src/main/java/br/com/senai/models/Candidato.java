package br.com.senai.models;

import java.util.List;
import java.util.ArrayList;
import br.com.senai.Enuns.Genero;
import java.time.LocalDate;

public class Candidato {
    public String nomeCompleto;
    public LocalDate dataNascimento;
    public String cpf;
    public String email;
    public Genero genero; //  obs. M | F
    public String naturalidade;
    public String nacionalidade;
    public Endereco endereco;
    public List<Escolaridade> escolaridades = new ArrayList<>();
}