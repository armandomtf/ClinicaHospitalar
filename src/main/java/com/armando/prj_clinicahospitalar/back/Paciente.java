/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.armando.prj_clinicahospitalar.back;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Armando
 */
public class Paciente extends DadoPessoal{

    public Long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Long idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getObsGeral() {
        return obsGeral;
    }

    public void setObsGeral(String obsGeral) {
        this.obsGeral = obsGeral;
    }

    public ArrayList<ConsultaMedica> getHistoricoConsultasMedicas() {
        return historicoConsultasMedicas;
    }

    public void setHistoricoConsultasMedicas(ArrayList<ConsultaMedica> historicoConsultasMedicas) {
        this.historicoConsultasMedicas = historicoConsultasMedicas;
    }

    public Responsavel getContatoResponsavel() {
        return contatoResponsavel;
    }

    public void setContatoResponsavel(Responsavel contatoResponsavel) {
        this.contatoResponsavel = contatoResponsavel;
    }

    public Paciente(Long idPaciente, int idade, Date dataCadastro, String obsGeral, Responsavel contatoResponsavel, String nomeCompleto, Date dataNascimento, Endereco endereco, ContatoTelEmail contato, Genero genero,ArrayList<ConsultaMedica> historicoConsultasMedicas) {
        super(nomeCompleto, dataNascimento, endereco, contato, genero);
        this.idPaciente = idPaciente;
        this.idade = idade;
        this.dataCadastro = dataCadastro;
        this.obsGeral = obsGeral;
        this.contatoResponsavel = contatoResponsavel;
        this.historicoConsultasMedicas = historicoConsultasMedicas;
    }

    public Paciente(Long idPaciente, int idade, Date dataCadastro, String obsGeral, Responsavel contatoResponsavel,ArrayList<ConsultaMedica> historicoConsultasMedicas) {
        this.idPaciente = idPaciente;
        this.idade = idade;
        this.dataCadastro = dataCadastro;
        this.obsGeral = obsGeral;
        this.contatoResponsavel = contatoResponsavel;
        this.historicoConsultasMedicas = historicoConsultasMedicas;
    }
    
    
    
    private Long idPaciente;
    private int idade;
    private Date dataCadastro;
    private String obsGeral;
    private ArrayList<ConsultaMedica> historicoConsultasMedicas = new ArrayList<>();
    private Responsavel contatoResponsavel;
    
    
}
