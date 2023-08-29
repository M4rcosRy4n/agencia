package br.com.senai;

import java.time.LocalDate;
import java.time.Period;

import br.com.senai.Enuns.Estado;
import br.com.senai.Enuns.Genero;
import br.com.senai.models.Candidato;
import br.com.senai.models.Endereco;
import br.com.senai.models.Escolaridade;

import java.util.Arrays;

public class App 
{
    public static void main( String[] args )
    {

        Endereco endereco = new Endereco();
        endereco.cep = "64000000";
        endereco.logradouro = "Rua Porto, 3555";
        endereco.cidade = "Teresina";
        endereco.estado = Estado.PI;

        Candidato ryan = new Candidato();
        ryan.nomeCompleto = "Marcos Ryan de Sousa Pereira";
        ryan.dataNascimento = LocalDate.of(2000, 10, 16);
        ryan.email = "marcosryan@gmail.com";
        ryan.genero = Genero.M;
        ryan.naturalidade = Estado.PI.toString();
        ryan.nacionalidade = "Brasil";
        ryan.endereco = endereco;

        Escolaridade e1 = new Escolaridade();
        e1.nomeCurso = "Sistema para Internet";
        e1.nomeInstituicao = "Senai";
        e1.dataInicio = LocalDate.of(2022, 10, 01);
        e1.datafim = LocalDate.of(2023, 06, 10);

        
        Escolaridade e2 = new Escolaridade();
        e2.nomeCurso = "Engenharia Civil";
        e2.nomeInstituicao = "IFPI - Inst. Federal do Piaui";
        e2.dataInicio = LocalDate.of(2022, 02, 01);
        e2.datafim = LocalDate.of(2023,06, 10);

        ryan.escolaridades = Arrays.asList(e1,e2);

        System.out.println("Nome Completo "+ryan.nomeCompleto);
        System.out.println("Idade: "+ Period.between(ryan.dataNascimento,
        LocalDate.now()).getYears());
        System.out.println("Endereço:"+ ryan.endereco.logradouro);

        for (Escolaridade escolaridades:ryan.escolaridades) {
            System.out.println(escolaridades.nomeCurso+" - "+escolaridades.nomeInstituicao);
        }





    }
}
