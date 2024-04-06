/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.armando.prj_clinicahospitalar.back;

import java.util.Date;

/**
 *
 * @author Armando
 */
public class Enfermeiro extends AtendenteHospitalar{

    public Long getIdEnfermeiro() {
        return idEnfermeiro;
    }

    public void setIdEnfermeiro(Long idEnfermeiro) {
        this.idEnfermeiro = idEnfermeiro;
    }

    public boolean isTreinadoOpRX() {
        return treinadoOpRX;
    }

    public void setTreinadoOpRX(boolean treinadoOpRX) {
        this.treinadoOpRX = treinadoOpRX;
    }

    public Enfermeiro(Long idEnfermeiro, boolean treinadoOpRX, String setor, int chSemanal, String nomeCompleto, Date dataNascimento, Endereco endereco, ContatoTelEmail contato, Genero genero) {
        super(setor, chSemanal, nomeCompleto, dataNascimento, endereco, contato, genero);
        this.idEnfermeiro = idEnfermeiro;
        this.treinadoOpRX = treinadoOpRX;
    }

    public Enfermeiro(Long idEnfermeiro, boolean treinadoOpRX, String setor, int chSemanal) {
        super(setor, chSemanal);
        this.idEnfermeiro = idEnfermeiro;
        this.treinadoOpRX = treinadoOpRX;
    }
    private Long idEnfermeiro;
    private boolean treinadoOpRX;
    
}
