/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.armando.prj_clinicahospitalar.front;

import com.armando.prj_clinicahospitalar.back.Endereco;
import com.armando.prj_clinicahospitalar.back.ContatoTelEmail;
import com.armando.prj_clinicahospitalar.back.Genero;
import com.armando.prj_clinicahospitalar.back.Medico;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Armando
 */
public class GerenciarMedicos extends javax.swing.JFrame {

    DefaultComboBoxModel dm = new DefaultComboBoxModel();

    void preencherComboBox() {
        dm = new DefaultComboBoxModel();
        jComboBox1.setModel(dm);
        for (int i = 0; i < HomePage.medicos.size(); i++) {
            dm.addElement(String.valueOf(HomePage.medicos.get(i).getNomeCompleto()));
            jComboBox1.setModel(dm);
        }
    }

    void clearFields() {
        txtNome.setText("");
        txtBairro.setText("");
        txtCEP.setText("");
        txtCel.setText("");
        txtCidade.setText("");
        txtEmail.setText("");
        txtEstado.setText("");
        txtNum.setText("");
        txtRua.setText("");
        txtTel.setText("");
        rdFem.setSelected(false);
        rdMasc.setSelected(false);
        dtDataNasc.setCalendar(null);
        txtCRM1.setText("");
        rdSim1.setSelected(false);
        rdNao1.setSelected(false);
        txtSetor1.setText("");
        txtCH1.setText("");
        chkCardio.setSelected(false);
        chkGineco.setSelected(false);
        chkNeuro.setSelected(false);
        chkOftalmo.setSelected(false);
        chkOnco.setSelected(false);
        chkOrto.setSelected(false);
        chkPediatria.setSelected(false);
        chkPsi.setSelected(false);
        chkUrologia.setSelected(false);
    }

    void clearFields2() {
        txtNome1.setText("");
        txtBairro1.setText("");
        txtCEP1.setText("");
        txtCel1.setText("");
        txtCidade1.setText("");
        txtEmail1.setText("");
        txtEstado1.setText("");
        txtNum1.setText("");
        txtRua1.setText("");
        txtTel1.setText("");
        rdFem1.setSelected(false);
        rdMasc1.setSelected(false);
        dtDataNasc1.setCalendar(null);
        txtCRM2.setText("");
        rdSim.setSelected(false);
        rdNao.setSelected(false);
        txtSetor.setText("");
        txtCH.setText("");
        chkCardio1.setSelected(false);
        chkGineco1.setSelected(false);
        chkNeuro1.setSelected(false);
        chkOftalmo1.setSelected(false);
        chkOnco1.setSelected(false);
        chkOrto1.setSelected(false);
        chkPediatria1.setSelected(false);
        chkPsi1.setSelected(false);
        chkUrologia1.setSelected(false);
    }

    public ArrayList<String> preencherEspecialidades(ArrayList<String> list) {
        if (chkCardio.isSelected()) {
            list.add(chkCardio.getText());
        }
        if (chkGineco.isSelected()) {
            list.add(chkGineco.getText());
        }
        if (chkNeuro.isSelected()) {
            list.add(chkNeuro.getText());
        }
        if (chkOftalmo.isSelected()) {
            list.add(chkOftalmo.getText());
        }
        if (chkOnco.isSelected()) {
            list.add(chkOnco.getText());
        }
        if (chkOrto.isSelected()) {
            list.add(chkOrto.getText());
        }
        if (chkPediatria.isSelected()) {
            list.add(chkPediatria.getText());
        }
        if (chkPsi.isSelected()) {
            list.add(chkPsi.getText());
        }
        if (chkUrologia.isSelected()) {
            list.add(chkUrologia.getText());
        }

        return list;
    }
    
    public ArrayList<String> preencherEspecialidades2(ArrayList<String> list) {
        if (chkCardio1.isSelected()) {
            list.add(chkCardio.getText());
        }
        if (chkGineco1.isSelected()) {
            list.add(chkGineco.getText());
        }
        if (chkNeuro1.isSelected()) {
            list.add(chkNeuro.getText());
        }
        if (chkOftalmo1.isSelected()) {
            list.add(chkOftalmo.getText());
        }
        if (chkOnco1.isSelected()) {
            list.add(chkOnco.getText());
        }
        if (chkOrto1.isSelected()) {
            list.add(chkOrto.getText());
        }
        if (chkPediatria1.isSelected()) {
            list.add(chkPediatria.getText());
        }
        if (chkPsi1.isSelected()) {
            list.add(chkPsi.getText());
        }
        if (chkUrologia1.isSelected()) {
            list.add(chkUrologia.getText());
        }

        return list;
    }

    public GerenciarMedicos() {
        initComponents();
        if (HomePage.medicos.size() > 0) {
            preencherComboBox();
        }
        clearFields();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        painelDados = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        painelDadoPessoal = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblDtNasc = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        dtDataNasc = new com.toedter.calendar.JDateChooser();
        lblRua = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        lblNum = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lblEstado = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        lblCEP = new javax.swing.JLabel();
        txtCEP = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        lblTel = new javax.swing.JLabel();
        txtCel = new javax.swing.JTextField();
        lblCel = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        panelGenero = new javax.swing.JPanel();
        rdMasc = new javax.swing.JRadioButton();
        rdFem = new javax.swing.JRadioButton();
        btnCadastrar = new javax.swing.JButton();
        btnLimpar1 = new javax.swing.JButton();
        painelMedico1 = new javax.swing.JPanel();
        lblCRM1 = new javax.swing.JLabel();
        txtCRM1 = new javax.swing.JTextField();
        panelCirurgiao1 = new javax.swing.JPanel();
        rdSim1 = new javax.swing.JRadioButton();
        rdNao1 = new javax.swing.JRadioButton();
        lblSetor1 = new javax.swing.JLabel();
        txtSetor1 = new javax.swing.JTextField();
        lblCH1 = new javax.swing.JLabel();
        txtCH1 = new javax.swing.JTextField();
        panelEsp1 = new javax.swing.JPanel();
        chkCardio = new javax.swing.JCheckBox();
        chkNeuro = new javax.swing.JCheckBox();
        chkPediatria = new javax.swing.JCheckBox();
        chkGineco = new javax.swing.JCheckBox();
        chkUrologia = new javax.swing.JCheckBox();
        chkOnco = new javax.swing.JCheckBox();
        chkPsi = new javax.swing.JCheckBox();
        chkOrto = new javax.swing.JCheckBox();
        chkOftalmo = new javax.swing.JCheckBox();
        btnVoltar1 = new javax.swing.JToggleButton();
        panelCRUD = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnVoltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnRemove = new javax.swing.JButton();
        painelDadoPessoal1 = new javax.swing.JPanel();
        lblNome1 = new javax.swing.JLabel();
        lblDtNasc1 = new javax.swing.JLabel();
        txtNome1 = new javax.swing.JTextField();
        dtDataNasc1 = new com.toedter.calendar.JDateChooser();
        lblRua1 = new javax.swing.JLabel();
        txtRua1 = new javax.swing.JTextField();
        lblNum1 = new javax.swing.JLabel();
        txtNum1 = new javax.swing.JTextField();
        txtBairro1 = new javax.swing.JTextField();
        lblBairro1 = new javax.swing.JLabel();
        lblCidade1 = new javax.swing.JLabel();
        txtCidade1 = new javax.swing.JTextField();
        lblEstado1 = new javax.swing.JLabel();
        txtEstado1 = new javax.swing.JTextField();
        lblCEP1 = new javax.swing.JLabel();
        txtCEP1 = new javax.swing.JTextField();
        txtTel1 = new javax.swing.JTextField();
        lblTel1 = new javax.swing.JLabel();
        txtCel1 = new javax.swing.JTextField();
        lblCel1 = new javax.swing.JLabel();
        txtEmail1 = new javax.swing.JTextField();
        lblEmail1 = new javax.swing.JLabel();
        panelGenero1 = new javax.swing.JPanel();
        rdMasc1 = new javax.swing.JRadioButton();
        rdFem1 = new javax.swing.JRadioButton();
        painelMedico = new javax.swing.JPanel();
        lblCRM = new javax.swing.JLabel();
        txtCRM2 = new javax.swing.JTextField();
        panelCirurgiao = new javax.swing.JPanel();
        rdSim = new javax.swing.JRadioButton();
        rdNao = new javax.swing.JRadioButton();
        lblSetor = new javax.swing.JLabel();
        txtSetor = new javax.swing.JTextField();
        lblCH = new javax.swing.JLabel();
        txtCH = new javax.swing.JTextField();
        panelEsp = new javax.swing.JPanel();
        chkCardio1 = new javax.swing.JCheckBox();
        chkNeuro1 = new javax.swing.JCheckBox();
        chkPediatria1 = new javax.swing.JCheckBox();
        chkGineco1 = new javax.swing.JCheckBox();
        chkUrologia1 = new javax.swing.JCheckBox();
        chkOnco1 = new javax.swing.JCheckBox();
        chkPsi1 = new javax.swing.JCheckBox();
        chkOrto1 = new javax.swing.JCheckBox();
        chkOftalmo1 = new javax.swing.JCheckBox();
        btnAlterar = new javax.swing.JButton();
        lblTitulo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciar Pacientes");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jTabbedPane1.setName(""); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(800, 600));

        painelDados.setBackground(new java.awt.Color(255, 255, 255));
        painelDados.setPreferredSize(new java.awt.Dimension(800, 300));
        painelDados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Cadastrar Médicos");
        lblTitulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        painelDados.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        painelDadoPessoal.setBackground(new java.awt.Color(255, 255, 255));
        painelDadoPessoal.setPreferredSize(new java.awt.Dimension(632, 400));

        lblNome.setBackground(new java.awt.Color(255, 255, 255));
        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNome.setText("Nome completo:");

        lblDtNasc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDtNasc.setText("Data de nascimento:");

        txtNome.setToolTipText("Insira o nome completo do paciente");

        dtDataNasc.setBackground(new java.awt.Color(255, 255, 255));

        lblRua.setBackground(new java.awt.Color(255, 255, 255));
        lblRua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRua.setText("Rua:");

        txtRua.setToolTipText("Insira o nome completo do paciente");
        txtRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRuaActionPerformed(evt);
            }
        });

        lblNum.setBackground(new java.awt.Color(255, 255, 255));
        lblNum.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNum.setText("Número:");

        txtNum.setToolTipText("Insira o nome completo do paciente");
        txtNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumActionPerformed(evt);
            }
        });

        txtBairro.setToolTipText("Insira o nome completo do paciente");
        txtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairroActionPerformed(evt);
            }
        });

        lblBairro.setBackground(new java.awt.Color(255, 255, 255));
        lblBairro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblBairro.setText("Bairro:");

        lblCidade.setBackground(new java.awt.Color(255, 255, 255));
        lblCidade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCidade.setText("Cidade:");

        txtCidade.setToolTipText("Insira o nome completo do paciente");
        txtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeActionPerformed(evt);
            }
        });

        lblEstado.setBackground(new java.awt.Color(255, 255, 255));
        lblEstado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEstado.setText("Estado:");

        txtEstado.setToolTipText("Insira o nome completo do paciente");
        txtEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadoActionPerformed(evt);
            }
        });

        lblCEP.setBackground(new java.awt.Color(255, 255, 255));
        lblCEP.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCEP.setText("CEP:");

        txtCEP.setToolTipText("Insira o nome completo do paciente");
        txtCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCEPActionPerformed(evt);
            }
        });

        txtTel.setToolTipText("Insira o nome completo do paciente");
        txtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelActionPerformed(evt);
            }
        });

        lblTel.setBackground(new java.awt.Color(255, 255, 255));
        lblTel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTel.setText("Telefone:");

        txtCel.setToolTipText("Insira o nome completo do paciente");
        txtCel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelActionPerformed(evt);
            }
        });

        lblCel.setBackground(new java.awt.Color(255, 255, 255));
        lblCel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCel.setText("Celular:");

        txtEmail.setToolTipText("Insira o nome completo do paciente");
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lblEmail.setBackground(new java.awt.Color(255, 255, 255));
        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEmail.setText("Email:");

        panelGenero.setBackground(new java.awt.Color(255, 255, 255));
        panelGenero.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gênero", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        buttonGroup1.add(rdMasc);
        rdMasc.setText("Masculino");
        rdMasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdMascActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdFem);
        rdFem.setText("Feminino");

        javax.swing.GroupLayout panelGeneroLayout = new javax.swing.GroupLayout(panelGenero);
        panelGenero.setLayout(panelGeneroLayout);
        panelGeneroLayout.setHorizontalGroup(
            panelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeneroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdMasc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdFem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelGeneroLayout.setVerticalGroup(
            panelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeneroLayout.createSequentialGroup()
                .addGroup(panelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdMasc)
                    .addComponent(rdFem))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelDadoPessoalLayout = new javax.swing.GroupLayout(painelDadoPessoal);
        painelDadoPessoal.setLayout(painelDadoPessoalLayout);
        painelDadoPessoalLayout.setHorizontalGroup(
            painelDadoPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDadoPessoalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadoPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelDadoPessoalLayout.createSequentialGroup()
                        .addGroup(painelDadoPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblTel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelDadoPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblCel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelDadoPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail)
                            .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelDadoPessoalLayout.createSequentialGroup()
                        .addGroup(painelDadoPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblCidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelDadoPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblEstado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEstado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelDadoPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCEP)
                            .addComponent(lblCEP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(painelDadoPessoalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(painelDadoPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelDadoPessoalLayout.createSequentialGroup()
                                .addGroup(painelDadoPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNome)
                                    .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(painelDadoPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(painelDadoPessoalLayout.createSequentialGroup()
                                .addGroup(painelDadoPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblRua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtRua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelDadoPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblNum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelDadoPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBairro)
                                    .addComponent(lblBairro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(16, 16, 16))
        );
        painelDadoPessoalLayout.setVerticalGroup(
            painelDadoPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadoPessoalLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(painelDadoPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(lblDtNasc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDadoPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDadoPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadoPessoalLayout.createSequentialGroup()
                        .addComponent(lblRua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelDadoPessoalLayout.createSequentialGroup()
                        .addComponent(lblNum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelDadoPessoalLayout.createSequentialGroup()
                        .addComponent(lblBairro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDadoPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadoPessoalLayout.createSequentialGroup()
                        .addComponent(lblCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelDadoPessoalLayout.createSequentialGroup()
                        .addComponent(lblEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelDadoPessoalLayout.createSequentialGroup()
                        .addComponent(lblCEP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDadoPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadoPessoalLayout.createSequentialGroup()
                        .addComponent(lblTel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelDadoPessoalLayout.createSequentialGroup()
                        .addComponent(lblCel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelDadoPessoalLayout.createSequentialGroup()
                        .addComponent(lblEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        painelDados.add(painelDadoPessoal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 400, 290));

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        painelDados.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 100, 30));

        btnLimpar1.setText("Limpar");
        btnLimpar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpar1ActionPerformed(evt);
            }
        });
        painelDados.add(btnLimpar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 90, 30));

        painelMedico1.setBackground(new java.awt.Color(255, 255, 255));

        lblCRM1.setBackground(new java.awt.Color(255, 255, 255));
        lblCRM1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCRM1.setText("CRM:");

        txtCRM1.setToolTipText("Insira o nome completo do paciente");
        txtCRM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCRM1ActionPerformed(evt);
            }
        });

        panelCirurgiao1.setBackground(new java.awt.Color(255, 255, 255));
        panelCirurgiao1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cirurgião?", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        buttonGroup2.add(rdSim1);
        rdSim1.setText("Sim");
        rdSim1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdSim1ActionPerformed(evt);
            }
        });

        buttonGroup2.add(rdNao1);
        rdNao1.setText("Não");
        rdNao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdNao1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCirurgiao1Layout = new javax.swing.GroupLayout(panelCirurgiao1);
        panelCirurgiao1.setLayout(panelCirurgiao1Layout);
        panelCirurgiao1Layout.setHorizontalGroup(
            panelCirurgiao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCirurgiao1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdSim1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdNao1)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        panelCirurgiao1Layout.setVerticalGroup(
            panelCirurgiao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCirurgiao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rdSim1)
                .addComponent(rdNao1))
        );

        lblSetor1.setBackground(new java.awt.Color(255, 255, 255));
        lblSetor1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSetor1.setText("Setor:");

        txtSetor1.setToolTipText("Insira o nome completo do paciente");
        txtSetor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSetor1ActionPerformed(evt);
            }
        });

        lblCH1.setBackground(new java.awt.Color(255, 255, 255));
        lblCH1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCH1.setText("Carga Horária:");

        txtCH1.setToolTipText("Insira o nome completo do paciente");
        txtCH1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCH1ActionPerformed(evt);
            }
        });

        panelEsp1.setBackground(new java.awt.Color(255, 255, 255));
        panelEsp1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Especialidades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        chkCardio.setText("Cardiologia");
        chkCardio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCardioActionPerformed(evt);
            }
        });

        chkNeuro.setText("Neurologia");
        chkNeuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNeuroActionPerformed(evt);
            }
        });

        chkPediatria.setText("Pediatria");

        chkGineco.setText("Ginecologia");

        chkUrologia.setText("Urologia");

        chkOnco.setText("Oncologia");

        chkPsi.setText("Psicologia");

        chkOrto.setText("Ortopedia");

        chkOftalmo.setText("Oftalmologia");
        chkOftalmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkOftalmoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEsp1Layout = new javax.swing.GroupLayout(panelEsp1);
        panelEsp1.setLayout(panelEsp1Layout);
        panelEsp1Layout.setHorizontalGroup(
            panelEsp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEsp1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEsp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkCardio)
                    .addComponent(chkNeuro)
                    .addComponent(chkPediatria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelEsp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkUrologia)
                    .addComponent(chkGineco)
                    .addComponent(chkOnco))
                .addGap(49, 49, 49)
                .addGroup(panelEsp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkPsi)
                    .addComponent(chkOrto)
                    .addComponent(chkOftalmo))
                .addGap(29, 29, 29))
        );
        panelEsp1Layout.setVerticalGroup(
            panelEsp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEsp1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEsp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEsp1Layout.createSequentialGroup()
                        .addComponent(chkUrologia)
                        .addGap(12, 12, 12)
                        .addComponent(chkGineco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkOnco))
                    .addGroup(panelEsp1Layout.createSequentialGroup()
                        .addComponent(chkCardio)
                        .addGap(12, 12, 12)
                        .addComponent(chkNeuro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkPediatria))
                    .addGroup(panelEsp1Layout.createSequentialGroup()
                        .addComponent(chkPsi)
                        .addGap(12, 12, 12)
                        .addComponent(chkOrto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkOftalmo)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelMedico1Layout = new javax.swing.GroupLayout(painelMedico1);
        painelMedico1.setLayout(painelMedico1Layout);
        painelMedico1Layout.setHorizontalGroup(
            painelMedico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMedico1Layout.createSequentialGroup()
                .addGroup(painelMedico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelMedico1Layout.createSequentialGroup()
                        .addGroup(painelMedico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblCRM1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCRM1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelCirurgiao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelMedico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(panelEsp1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(painelMedico1Layout.createSequentialGroup()
                            .addGroup(painelMedico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblSetor1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSetor1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(painelMedico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCH1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCH1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 8, Short.MAX_VALUE))
        );
        painelMedico1Layout.setVerticalGroup(
            painelMedico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMedico1Layout.createSequentialGroup()
                .addGroup(painelMedico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelMedico1Layout.createSequentialGroup()
                        .addComponent(lblCRM1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCRM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelCirurgiao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelMedico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMedico1Layout.createSequentialGroup()
                        .addComponent(lblSetor1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSetor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMedico1Layout.createSequentialGroup()
                        .addComponent(lblCH1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCH1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelEsp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        painelDados.add(painelMedico1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 360, 260));

        btnVoltar1.setText("Voltar");
        btnVoltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar1ActionPerformed(evt);
            }
        });
        painelDados.add(btnVoltar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 90, 30));

        jTabbedPane1.addTab("Cadastrar", painelDados);

        panelCRUD.setBackground(new java.awt.Color(255, 255, 255));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Selecione o médico:");

        btnRemove.setText("Remover");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        painelDadoPessoal1.setBackground(new java.awt.Color(255, 255, 255));
        painelDadoPessoal1.setPreferredSize(new java.awt.Dimension(632, 400));

        lblNome1.setBackground(new java.awt.Color(255, 255, 255));
        lblNome1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNome1.setText("Nome completo:");

        lblDtNasc1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDtNasc1.setText("Data de nascimento:");

        txtNome1.setToolTipText("Insira o nome completo do paciente");

        dtDataNasc1.setBackground(new java.awt.Color(255, 255, 255));

        lblRua1.setBackground(new java.awt.Color(255, 255, 255));
        lblRua1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRua1.setText("Rua:");

        txtRua1.setToolTipText("Insira o nome completo do paciente");
        txtRua1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRua1ActionPerformed(evt);
            }
        });

        lblNum1.setBackground(new java.awt.Color(255, 255, 255));
        lblNum1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNum1.setText("Número:");

        txtNum1.setToolTipText("Insira o nome completo do paciente");
        txtNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNum1ActionPerformed(evt);
            }
        });

        txtBairro1.setToolTipText("Insira o nome completo do paciente");
        txtBairro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairro1ActionPerformed(evt);
            }
        });

        lblBairro1.setBackground(new java.awt.Color(255, 255, 255));
        lblBairro1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblBairro1.setText("Bairro:");

        lblCidade1.setBackground(new java.awt.Color(255, 255, 255));
        lblCidade1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCidade1.setText("Cidade:");

        txtCidade1.setToolTipText("Insira o nome completo do paciente");
        txtCidade1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidade1ActionPerformed(evt);
            }
        });

        lblEstado1.setBackground(new java.awt.Color(255, 255, 255));
        lblEstado1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEstado1.setText("Estado:");

        txtEstado1.setToolTipText("Insira o nome completo do paciente");
        txtEstado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstado1ActionPerformed(evt);
            }
        });

        lblCEP1.setBackground(new java.awt.Color(255, 255, 255));
        lblCEP1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCEP1.setText("CEP:");

        txtCEP1.setToolTipText("Insira o nome completo do paciente");
        txtCEP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCEP1ActionPerformed(evt);
            }
        });

        txtTel1.setToolTipText("Insira o nome completo do paciente");
        txtTel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTel1ActionPerformed(evt);
            }
        });

        lblTel1.setBackground(new java.awt.Color(255, 255, 255));
        lblTel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTel1.setText("Telefone:");

        txtCel1.setToolTipText("Insira o nome completo do paciente");
        txtCel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCel1ActionPerformed(evt);
            }
        });

        lblCel1.setBackground(new java.awt.Color(255, 255, 255));
        lblCel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCel1.setText("Celular:");

        txtEmail1.setToolTipText("Insira o nome completo do paciente");
        txtEmail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmail1ActionPerformed(evt);
            }
        });

        lblEmail1.setBackground(new java.awt.Color(255, 255, 255));
        lblEmail1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEmail1.setText("Email:");

        panelGenero1.setBackground(new java.awt.Color(255, 255, 255));
        panelGenero1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gênero", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        buttonGroup1.add(rdMasc1);
        rdMasc1.setText("Masculino");
        rdMasc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdMasc1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdFem1);
        rdFem1.setText("Feminino");

        javax.swing.GroupLayout panelGenero1Layout = new javax.swing.GroupLayout(panelGenero1);
        panelGenero1.setLayout(panelGenero1Layout);
        panelGenero1Layout.setHorizontalGroup(
            panelGenero1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGenero1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdMasc1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdFem1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelGenero1Layout.setVerticalGroup(
            panelGenero1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGenero1Layout.createSequentialGroup()
                .addGroup(panelGenero1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdMasc1)
                    .addComponent(rdFem1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelDadoPessoal1Layout = new javax.swing.GroupLayout(painelDadoPessoal1);
        painelDadoPessoal1.setLayout(painelDadoPessoal1Layout);
        painelDadoPessoal1Layout.setHorizontalGroup(
            painelDadoPessoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDadoPessoal1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadoPessoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelGenero1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelDadoPessoal1Layout.createSequentialGroup()
                        .addGroup(painelDadoPessoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblTel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelDadoPessoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblCel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelDadoPessoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail1)
                            .addComponent(lblEmail1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelDadoPessoal1Layout.createSequentialGroup()
                        .addGroup(painelDadoPessoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblCidade1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCidade1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelDadoPessoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblEstado1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEstado1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelDadoPessoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCEP1)
                            .addComponent(lblCEP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(painelDadoPessoal1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(painelDadoPessoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelDadoPessoal1Layout.createSequentialGroup()
                                .addGroup(painelDadoPessoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNome1)
                                    .addComponent(lblNome1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(painelDadoPessoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDtNasc1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dtDataNasc1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(painelDadoPessoal1Layout.createSequentialGroup()
                                .addGroup(painelDadoPessoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblRua1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtRua1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelDadoPessoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblNum1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNum1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelDadoPessoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBairro1)
                                    .addComponent(lblBairro1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(16, 16, 16))
        );
        painelDadoPessoal1Layout.setVerticalGroup(
            painelDadoPessoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadoPessoal1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(painelDadoPessoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome1)
                    .addComponent(lblDtNasc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDadoPessoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dtDataNasc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDadoPessoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadoPessoal1Layout.createSequentialGroup()
                        .addComponent(lblRua1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRua1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelDadoPessoal1Layout.createSequentialGroup()
                        .addComponent(lblNum1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelDadoPessoal1Layout.createSequentialGroup()
                        .addComponent(lblBairro1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBairro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDadoPessoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadoPessoal1Layout.createSequentialGroup()
                        .addComponent(lblCidade1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCidade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelDadoPessoal1Layout.createSequentialGroup()
                        .addComponent(lblEstado1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEstado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelDadoPessoal1Layout.createSequentialGroup()
                        .addComponent(lblCEP1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCEP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDadoPessoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadoPessoal1Layout.createSequentialGroup()
                        .addComponent(lblTel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelDadoPessoal1Layout.createSequentialGroup()
                        .addComponent(lblCel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelDadoPessoal1Layout.createSequentialGroup()
                        .addComponent(lblEmail1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelGenero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        painelMedico.setBackground(new java.awt.Color(255, 255, 255));

        lblCRM.setBackground(new java.awt.Color(255, 255, 255));
        lblCRM.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCRM.setText("CRM:");

        txtCRM2.setToolTipText("Insira o nome completo do paciente");
        txtCRM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCRM2ActionPerformed(evt);
            }
        });

        panelCirurgiao.setBackground(new java.awt.Color(255, 255, 255));
        panelCirurgiao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cirurgião?", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        buttonGroup2.add(rdSim);
        rdSim.setText("Sim");
        rdSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdSimActionPerformed(evt);
            }
        });

        buttonGroup2.add(rdNao);
        rdNao.setText("Não");
        rdNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdNaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCirurgiaoLayout = new javax.swing.GroupLayout(panelCirurgiao);
        panelCirurgiao.setLayout(panelCirurgiaoLayout);
        panelCirurgiaoLayout.setHorizontalGroup(
            panelCirurgiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCirurgiaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdSim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdNao)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        panelCirurgiaoLayout.setVerticalGroup(
            panelCirurgiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCirurgiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rdSim)
                .addComponent(rdNao))
        );

        lblSetor.setBackground(new java.awt.Color(255, 255, 255));
        lblSetor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSetor.setText("Setor:");

        txtSetor.setToolTipText("Insira o nome completo do paciente");
        txtSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSetorActionPerformed(evt);
            }
        });

        lblCH.setBackground(new java.awt.Color(255, 255, 255));
        lblCH.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCH.setText("Carga Horária:");

        txtCH.setToolTipText("Insira o nome completo do paciente");
        txtCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCHActionPerformed(evt);
            }
        });

        panelEsp.setBackground(new java.awt.Color(255, 255, 255));
        panelEsp.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Especialidades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        chkCardio1.setText("Cardiologia");
        chkCardio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCardio1ActionPerformed(evt);
            }
        });

        chkNeuro1.setText("Neurologia");
        chkNeuro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNeuro1ActionPerformed(evt);
            }
        });

        chkPediatria1.setText("Pediatria");

        chkGineco1.setText("Ginecologia");

        chkUrologia1.setText("Urologia");

        chkOnco1.setText("Oncologia");

        chkPsi1.setText("Psicologia");

        chkOrto1.setText("Ortopedia");

        chkOftalmo1.setText("Oftalmologia");

        javax.swing.GroupLayout panelEspLayout = new javax.swing.GroupLayout(panelEsp);
        panelEsp.setLayout(panelEspLayout);
        panelEspLayout.setHorizontalGroup(
            panelEspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEspLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkCardio1)
                    .addComponent(chkNeuro1)
                    .addComponent(chkPediatria1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelEspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkUrologia1)
                    .addComponent(chkGineco1)
                    .addComponent(chkOnco1))
                .addGap(49, 49, 49)
                .addGroup(panelEspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkPsi1)
                    .addComponent(chkOrto1)
                    .addComponent(chkOftalmo1))
                .addGap(29, 29, 29))
        );
        panelEspLayout.setVerticalGroup(
            panelEspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEspLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEspLayout.createSequentialGroup()
                        .addComponent(chkUrologia1)
                        .addGap(12, 12, 12)
                        .addComponent(chkGineco1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkOnco1))
                    .addGroup(panelEspLayout.createSequentialGroup()
                        .addComponent(chkCardio1)
                        .addGap(12, 12, 12)
                        .addComponent(chkNeuro1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkPediatria1))
                    .addGroup(panelEspLayout.createSequentialGroup()
                        .addComponent(chkPsi1)
                        .addGap(12, 12, 12)
                        .addComponent(chkOrto1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkOftalmo1)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelMedicoLayout = new javax.swing.GroupLayout(painelMedico);
        painelMedico.setLayout(painelMedicoLayout);
        painelMedicoLayout.setHorizontalGroup(
            painelMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMedicoLayout.createSequentialGroup()
                .addGroup(painelMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelMedicoLayout.createSequentialGroup()
                        .addGroup(painelMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblCRM, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCRM2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelCirurgiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelMedicoLayout.createSequentialGroup()
                        .addGroup(painelMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCH, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCH, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(panelEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 35, Short.MAX_VALUE))
        );
        painelMedicoLayout.setVerticalGroup(
            painelMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMedicoLayout.createSequentialGroup()
                .addGroup(painelMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelMedicoLayout.createSequentialGroup()
                        .addComponent(lblCRM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCRM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelCirurgiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMedicoLayout.createSequentialGroup()
                        .addComponent(lblSetor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMedicoLayout.createSequentialGroup()
                        .addComponent(lblCH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(panelEsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnAlterar.setText("Salvar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        lblTitulo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo1.setText("Gerenciar Médicos");
        lblTitulo1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout panelCRUDLayout = new javax.swing.GroupLayout(panelCRUD);
        panelCRUD.setLayout(panelCRUDLayout);
        panelCRUDLayout.setHorizontalGroup(
            panelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCRUDLayout.createSequentialGroup()
                .addComponent(lblTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCRUDLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRemove)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterar)
                .addGap(299, 299, 299))
            .addGroup(panelCRUDLayout.createSequentialGroup()
                .addGroup(panelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCRUDLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(painelDadoPessoal1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCRUDLayout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addGroup(panelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCRUDLayout.setVerticalGroup(
            panelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCRUDLayout.createSequentialGroup()
                .addComponent(lblTitulo1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelDadoPessoal1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(139, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Gerenciar", panelCRUD);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleName("Gerenciar Medicos");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdMascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdMascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdMascActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtCelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelActionPerformed

    private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelActionPerformed

    private void txtCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCEPActionPerformed

    private void txtEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadoActionPerformed

    private void txtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCidadeActionPerformed

    private void txtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairroActionPerformed

    private void txtNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumActionPerformed

    private void txtRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRuaActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        ArrayList<String> especialidades = new ArrayList<String>();
        try {
            String generoStr = null;
            boolean cirurgiao = false;
            especialidades = preencherEspecialidades(especialidades);

            if (rdMasc.isSelected()) {
                generoStr = rdMasc.getText().toLowerCase();
            } else if (rdFem.isSelected()) {
                generoStr = rdFem.getText().toLowerCase();
            }
            if (rdSim1.isSelected()) {
                cirurgiao = true;
            } else if (rdNao1.isSelected()) {
                cirurgiao = false;
            }
            Genero genero = Genero.valueOf(generoStr);

            Endereco endereco = new Endereco(txtRua.getText(), Integer.parseInt(txtNum.getText()),
                    txtBairro.getText(), txtCidade.getText(), txtEstado.getText(), Integer.parseInt(txtCEP.getText()));
            ContatoTelEmail contato = new ContatoTelEmail(txtTel.getText(), txtCel.getText(), txtEmail.getText());
            Medico medico = new Medico(Integer.parseInt(txtCRM1.getText()), cirurgiao, txtSetor1.getText(), Integer.parseInt(txtCH1.getText()), txtNome.getText(), dtDataNasc.getDate(), endereco, contato, genero, especialidades);
            HomePage.medicos.add(medico);
            JOptionPane.showMessageDialog(null, txtNome.getText() + " foi cadastrado(a) com sucesso!");
            dm.addElement(medico.getNomeCompleto());
            jComboBox1.setModel(dm);
            jComboBox1.setSelectedIndex(0);
            clearFields();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage() + " favor preencher corretamente os dados!");

        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnLimpar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpar1ActionPerformed

    private void txtCRM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCRM1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCRM1ActionPerformed

    private void rdSim1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdSim1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdSim1ActionPerformed

    private void rdNao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdNao1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdNao1ActionPerformed

    private void txtSetor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSetor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSetor1ActionPerformed

    private void txtCH1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCH1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCH1ActionPerformed

    private void chkCardioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCardioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkCardioActionPerformed

    private void chkNeuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNeuroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkNeuroActionPerformed

    private void chkOftalmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkOftalmoActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_chkOftalmoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        try{
            int index = jComboBox1.getSelectedIndex();
            HomePage.medicos.get(index).setNomeCompleto(txtNome1.getText());
            HomePage.medicos.get(index).setDataNascimento(dtDataNasc1.getDate());
            HomePage.medicos.get(index).getEndereco().setRua(txtRua1.getText());
            HomePage.medicos.get(index).getEndereco().setNumero(Integer.parseInt(txtNum1.getText()));
            HomePage.medicos.get(index).getEndereco().setBairro(txtBairro1.getText());
            HomePage.medicos.get(index).getEndereco().setCidade(txtCidade1.getText());
            HomePage.medicos.get(index).getEndereco().setEstado(txtEstado1.getText());
            HomePage.medicos.get(index).getEndereco().setCep(Integer.parseInt(txtCEP1.getText()));
            HomePage.medicos.get(index).getContato().setTelefone(txtTel1.getText());
            HomePage.medicos.get(index).getContato().setCelular(txtCel1.getText());
            HomePage.medicos.get(index).getContato().setEmail(txtEmail1.getText());
            if (rdMasc1.isSelected()) {
                HomePage.medicos.get(index).setGenero(Genero.masculino);
            } else if (rdFem1.isSelected()) {
                HomePage.medicos.get(index).setGenero(Genero.feminino);
            }
            HomePage.medicos.get(index).setNumeroCRM(Integer.parseInt(txtCRM2.getText()));
            HomePage.medicos.get(index).setSetor(txtSetor.getText());
            HomePage.medicos.get(index).setChSemanal(Integer.parseInt(txtCH.getText()));
            if (rdSim.isSelected()) {
                HomePage.medicos.get(index).setCirurgiao(true);
            } else if (rdNao.isSelected()) {
                HomePage.medicos.get(index).setCirurgiao(false);
            }
            ArrayList<String> especialidades2 = new ArrayList<String>();
            especialidades2=preencherEspecialidades2(especialidades2);
            HomePage.medicos.get(index).setAreasEspecialidade(especialidades2);
            JOptionPane.showMessageDialog(null, txtNome1.getText() + " foi alterado(a) com sucesso!");
            preencherComboBox();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage() + " favor preencher corretamente os dados!");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void chkNeuro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNeuro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkNeuro1ActionPerformed

    private void chkCardio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCardio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkCardio1ActionPerformed

    private void txtCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCHActionPerformed

    private void txtSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSetorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSetorActionPerformed

    private void rdNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdNaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdNaoActionPerformed

    private void rdSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdSimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdSimActionPerformed

    private void txtCRM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCRM2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCRM2ActionPerformed

    private void rdMasc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdMasc1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdMasc1ActionPerformed

    private void txtEmail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmail1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmail1ActionPerformed

    private void txtCel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCel1ActionPerformed

    private void txtTel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTel1ActionPerformed

    private void txtCEP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCEP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCEP1ActionPerformed

    private void txtEstado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstado1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstado1ActionPerformed

    private void txtCidade1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidade1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCidade1ActionPerformed

    private void txtBairro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairro1ActionPerformed

    private void txtNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNum1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNum1ActionPerformed

    private void txtRua1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRua1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRua1ActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        try {
            int index = jComboBox1.getSelectedIndex();
            HomePage.medicos.remove(index);
            preencherComboBox();
            clearFields();
            JOptionPane.showMessageDialog(null, "O médico foi removido com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage() + " tente novamente.");
        }

    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed

        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here
        clearFields2();
        int index = jComboBox1.getSelectedIndex();
        txtNome1.setText(HomePage.medicos.get(index).getNomeCompleto());
        txtBairro1.setText(HomePage.medicos.get(index).getEndereco().getBairro());
        txtCEP1.setText(String.valueOf(HomePage.medicos.get(index).getEndereco().getCep()));
        txtCel1.setText(HomePage.medicos.get(index).getContato().getCelular());
        txtCidade1.setText(HomePage.medicos.get(index).getEndereco().getCidade());
        txtEmail1.setText(HomePage.medicos.get(index).getContato().getEmail());
        txtEstado1.setText(HomePage.medicos.get(index).getEndereco().getEstado());
        txtCRM2.setText(String.valueOf(HomePage.medicos.get(index).getNumeroCRM()));
        txtNum1.setText(String.valueOf(HomePage.medicos.get(index).getEndereco().getNumero()));
        txtRua1.setText(HomePage.medicos.get(index).getEndereco().getRua());
        txtTel1.setText(HomePage.medicos.get(index).getContato().getTelefone());
        dtDataNasc1.setDate(HomePage.medicos.get(index).getDataNascimento());
        if (HomePage.medicos.get(index).getGenero() == Genero.masculino) {
            rdMasc1.setSelected(true);
            rdFem1.setSelected(false);
        } else {
            rdFem1.setSelected(true);
            rdMasc1.setSelected(false);
        }
        if (HomePage.medicos.get(index).isCirurgiao()) {
            rdSim.setSelected(true);
            rdNao.setSelected(false);
        } else {
            rdNao.setSelected(true);
            rdSim.setSelected(false);
        }
        txtSetor.setText(HomePage.medicos.get(index).getSetor());
        txtCH.setText(String.valueOf(HomePage.medicos.get(index).getChSemanal()));
        if (HomePage.medicos.get(index).getAreasEspecialidade().contains("Cardiologia")) {
            chkCardio1.setSelected(true);
        }
        if (HomePage.medicos.get(index).getAreasEspecialidade().contains("Neurologia")) {
            chkNeuro1.setSelected(true);
        }
        if (HomePage.medicos.get(index).getAreasEspecialidade().contains("Pediatria")) {
            chkPediatria1.setSelected(true);
        }
        if (HomePage.medicos.get(index).getAreasEspecialidade().contains("Urologia")) {
            chkUrologia1.setSelected(true);
        }
        if (HomePage.medicos.get(index).getAreasEspecialidade().contains("Ginecologia")) {
            chkGineco1.setSelected(true);
        }
        if (HomePage.medicos.get(index).getAreasEspecialidade().contains("Oncologia")) {
            chkOnco1.setSelected(true);
        }
        if (HomePage.medicos.get(index).getAreasEspecialidade().contains("Psicologia")) {
            chkPsi1.setSelected(true);
        }
        if (HomePage.medicos.get(index).getAreasEspecialidade().contains("Ortopedia")) {
            chkOrto1.setSelected(true);
        }
        if (HomePage.medicos.get(index).getAreasEspecialidade().contains("Oftalmologia")) {
            chkOftalmo1.setSelected(true);
        }

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnVoltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnVoltar1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GerenciarMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciarMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciarMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciarMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciarMedicos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLimpar1;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JToggleButton btnVoltar1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox chkCardio;
    private javax.swing.JCheckBox chkCardio1;
    private javax.swing.JCheckBox chkGineco;
    private javax.swing.JCheckBox chkGineco1;
    private javax.swing.JCheckBox chkNeuro;
    private javax.swing.JCheckBox chkNeuro1;
    private javax.swing.JCheckBox chkOftalmo;
    private javax.swing.JCheckBox chkOftalmo1;
    private javax.swing.JCheckBox chkOnco;
    private javax.swing.JCheckBox chkOnco1;
    private javax.swing.JCheckBox chkOrto;
    private javax.swing.JCheckBox chkOrto1;
    private javax.swing.JCheckBox chkPediatria;
    private javax.swing.JCheckBox chkPediatria1;
    private javax.swing.JCheckBox chkPsi;
    private javax.swing.JCheckBox chkPsi1;
    private javax.swing.JCheckBox chkUrologia;
    private javax.swing.JCheckBox chkUrologia1;
    private com.toedter.calendar.JDateChooser dtDataNasc;
    private com.toedter.calendar.JDateChooser dtDataNasc1;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblBairro1;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCEP1;
    private javax.swing.JLabel lblCH;
    private javax.swing.JLabel lblCH1;
    private javax.swing.JLabel lblCRM;
    private javax.swing.JLabel lblCRM1;
    private javax.swing.JLabel lblCel;
    private javax.swing.JLabel lblCel1;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCidade1;
    private javax.swing.JLabel lblDtNasc;
    private javax.swing.JLabel lblDtNasc1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmail1;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblEstado1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblNum;
    private javax.swing.JLabel lblNum1;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblRua1;
    private javax.swing.JLabel lblSetor;
    private javax.swing.JLabel lblSetor1;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel lblTel1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JPanel painelDadoPessoal;
    private javax.swing.JPanel painelDadoPessoal1;
    private javax.swing.JPanel painelDados;
    private javax.swing.JPanel painelMedico;
    private javax.swing.JPanel painelMedico1;
    private javax.swing.JPanel panelCRUD;
    private javax.swing.JPanel panelCirurgiao;
    private javax.swing.JPanel panelCirurgiao1;
    private javax.swing.JPanel panelEsp;
    private javax.swing.JPanel panelEsp1;
    private javax.swing.JPanel panelGenero;
    private javax.swing.JPanel panelGenero1;
    private javax.swing.JRadioButton rdFem;
    private javax.swing.JRadioButton rdFem1;
    private javax.swing.JRadioButton rdMasc;
    private javax.swing.JRadioButton rdMasc1;
    private javax.swing.JRadioButton rdNao;
    private javax.swing.JRadioButton rdNao1;
    private javax.swing.JRadioButton rdSim;
    private javax.swing.JRadioButton rdSim1;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtBairro1;
    private javax.swing.JTextField txtCEP;
    private javax.swing.JTextField txtCEP1;
    private javax.swing.JTextField txtCH;
    private javax.swing.JTextField txtCH1;
    private javax.swing.JTextField txtCRM1;
    private javax.swing.JTextField txtCRM2;
    private javax.swing.JTextField txtCel;
    private javax.swing.JTextField txtCel1;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCidade1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmail1;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtEstado1;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNome1;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtNum1;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtRua1;
    private javax.swing.JTextField txtSetor;
    private javax.swing.JTextField txtSetor1;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtTel1;
    // End of variables declaration//GEN-END:variables
}
