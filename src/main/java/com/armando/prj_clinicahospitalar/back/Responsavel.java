/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.armando.prj_clinicahospitalar.back;

/**
 *
 * @author Armando
 */
public class Responsavel extends ContatoTelEmail{

    public Long getIdResponsavel() {
        return idResponsavel;
    }

    public void setIdResponsavel(Long idResponsavel) {
        this.idResponsavel = idResponsavel;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public Responsavel(Long idResponsavel, String nomeResponsavel, String telefone, String celular, String email) {
        super(telefone, celular, email);
        this.idResponsavel = idResponsavel;
        this.nomeResponsavel = nomeResponsavel;
    }

    public Responsavel(Long idResponsavel, String nomeResponsavel) {
        this.idResponsavel = idResponsavel;
        this.nomeResponsavel = nomeResponsavel;
    }

    
    private Long idResponsavel;
    private String nomeResponsavel;
}
