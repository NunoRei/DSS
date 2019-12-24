package GUI;

import Negocio.ConfiguraFacil;
import Negocio.Configuracoes.*;
import java.awt.Component;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 * @author Jaime Leite, João Marques, Nuno Rei e Rafael Lourenço
 * @version 12-2018
 */
public class PacotesGUI extends javax.swing.JFrame {
    private Component controllingFrame;
    private Configuracao c;
    private String NomeP;
    private final ConfiguraFacil d;
    private final DefaultListModel model1 = new DefaultListModel();
    private final DefaultListModel model2 = new DefaultListModel();
    private final DefaultListModel model3 = new DefaultListModel();
    private final DefaultListModel model4 = new DefaultListModel();
    
    /**
     * Criação do estado da janela PacotesGUI
     * @param f
     * @param c 
     */
    public PacotesGUI(ConfiguraFacil f, Configuracao c) {
        this.d = f;
        this.c = c;
        this.NomeP = null;
        List<String> S1 = this.d.getNomeCompPacote("Pacote Sport");
        S1.forEach((a)->{this.model1.addElement(a);});
        List<String> S2 = this.d.getNomeCompPacote("Pacote Viagem");
        S2.forEach((a)->{this.model2.addElement(a);});
        List<String> S3 = this.d.getNomeCompPacote("Pacote Confort");
        S3.forEach((a)->{this.model3.addElement(a);});
        List<String> S4 = this.d.getNomeCompPacote("Pacote Business");
        S4.forEach((a)->{this.model4.addElement(a);});
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jButton5 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Papyrus", 0, 50)); // NOI18N
        jLabel2.setText("Escolha um Pacote:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 60));

        jLabel3.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 24)); // NOI18N
        jLabel3.setText("Pacote Confort:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, 220, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 24)); // NOI18N
        jLabel4.setText("Pacote Sport:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 190, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 24)); // NOI18N
        jLabel5.setText("Pacote Viagem:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 380, 200, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 24)); // NOI18N
        jLabel6.setText("Pacote Business:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 230, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sport3.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 200, 160));

        jButton1.setText("Concluir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 630, 160, 80));

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 630, 170, 80));

        jList1.setModel(model1);
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 220, 150));

        jButton3.setText("Adicionar Pacote ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 260, -1));

        jButton4.setText("Adicionar Pacote ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 590, 280, -1));

        jList2.setModel(model4);
        jScrollPane2.setViewportView(jList2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 220, 170));

        jList3.setModel(model3);
        jScrollPane3.setViewportView(jList3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 110, 220, 150));

        jButton5.setText("Adicionar Pacote");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 290, 260, -1));

        jList4.setModel(model2);
        jScrollPane4.setViewportView(jList4);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 390, 220, 160));

        jButton6.setText("Adicionar Pacote");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 580, 260, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/businessC.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Confort.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 240, 200));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Viagem - copia.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/black-and-white-desktop-wallpaper-hd-wallpaper-1000195.jpg"))); // NOI18N
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 3210, 1700));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Escolheu terminar a configuração
     * @param evt 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            this.c = this.d.addPacote(this.c,this.NomeP);
            this.d.insereConfiguracao(this.c);
            JOptionPane.showMessageDialog(this.controllingFrame,"Configuração adicionada com sucesso.\nCusto total: "
                +Double.toString(this.c.getPreco()),"CONFIGURAÇÃO ADICIONADA",JOptionPane.INFORMATION_MESSAGE);
        }
        catch (ConfCheiaException e) {
            JOptionPane.showMessageDialog(this.controllingFrame,"Fila de Configurações Cheia.","ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);
        }
        finally {
            dispose();
            Configuracao nova = this.d.criarConfiguracao();
            CriarConfGUI a = new CriarConfGUI(this.d,nova);
            a.execCriarConfGUI();
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    /**
     * Escolheu o pacote Sport
     * @param evt 
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(this.NomeP == null) {
            this.NomeP = "Pacote Sport";
            JOptionPane.showMessageDialog(this.controllingFrame,"Pacote Sport adiconado com sucesso.","INFORMAÇÃO",JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            Object[] options = {"SIM","NÃO"};
            int result = JOptionPane.showOptionDialog(null, "Já selecionou o "+this.NomeP+".\nDeseja trocar?"
                ,"PACOTE JÁ SELECIONADO",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE,null,options,null);
            if (result == JOptionPane.YES_OPTION) {
                this.NomeP = "Pacote Sport";
                JOptionPane.showMessageDialog(this.controllingFrame,"Pacote Sport adiconado com sucesso.","INFORMAÇÃO",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    
    /**
     * Escolheu voltar para a escolha dos componentes essenciais
     * @param evt 
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(this.NomeP != null)
            this.c = d.remCompOp(this.c);
        dispose();
        CriarConfGUI a = new CriarConfGUI(this.d,this.c);
        a.execCriarConfGUI();
    }//GEN-LAST:event_jButton2ActionPerformed
   
    /**
     * Escolheu o pacote Viagem
     * @param evt 
     */
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(this.NomeP == null) {
            this.NomeP = "Pacote Viagem";
            JOptionPane.showMessageDialog(this.controllingFrame,"Pacote Viagem adiconado com sucesso.","INFORMAÇÃO",JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            Object[] options = {"SIM","NÃO"};
            int result = JOptionPane.showOptionDialog(null, "Já selecionou o "+this.NomeP+".\nDeseja trocar?"
                ,"PACOTE JÁ SELECIONADO",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE,null,options,null);
            if (result == JOptionPane.YES_OPTION) {
                this.NomeP = "Pacote Viagem";
                JOptionPane.showMessageDialog(this.controllingFrame,"Pacote Viagem adiconado com sucesso.","INFORMAÇÃO",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed
 
    /**
     * Escolheu o pacote Confort
     * @param evt 
     */
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(this.NomeP == null) {
            this.NomeP = "Pacote Confort";
            JOptionPane.showMessageDialog(this.controllingFrame,"Pacote Confort adiconado com sucesso.","INFORMAÇÃO",JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            Object[] options = {"SIM","NÃO"};
            int result = JOptionPane.showOptionDialog(null, "Já selecionou o "+this.NomeP+".\nDeseja trocar?"
                ,"PACOTE JÁ SELECIONADO",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE,null,options,null);
            if (result == JOptionPane.YES_OPTION) {
                this.NomeP = "Pacote Confort";
                JOptionPane.showMessageDialog(this.controllingFrame,"Pacote Confort adiconado com sucesso.","INFORMAÇÃO",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * Escolheu o pacote Business
     * @param evt 
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(this.NomeP == null) {
            this.NomeP = "Pacote Business";
            JOptionPane.showMessageDialog(this.controllingFrame,"Pacote Business adiconado com sucesso.","INFORMAÇÃO",JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            Object[] options = {"SIM","NÃO"};
            int result = JOptionPane.showOptionDialog(null, "Já selecionou o "+this.NomeP+".\nDeseja trocar?"
                ,"PACOTE JÁ SELECIONADO",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE,null,options,null);
            if (result == JOptionPane.YES_OPTION) {
                this.NomeP = "Pacote Business";
                JOptionPane.showMessageDialog(this.controllingFrame,"Pacote Business adiconado com sucesso.","INFORMAÇÃO",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    public void execPacotesGUI() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PacotesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(()->{new PacotesGUI(this.d,this.c).setVisible(true);});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}