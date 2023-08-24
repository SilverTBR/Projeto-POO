//Nome: Eduardo Pereira Baratera - RA:2269104
package com.mycompany.projeto;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eduardo
 */
public class MBuscaCart extends javax.swing.JFrame {
    
    private DadosCart dbC = new DadosCart();
    private Cartas cartas = new Cartas();
    private double valorMinT;
    private double valorMaxT;
    private int qntMin;
    private int qntMax;
    private int duracao;
    private int minIdade;

    private static MBuscaCart MBuscaCartUnico;
    private MBuscaCart() {
     initComponents();
     valorMinT = 0;
     valorMaxT = 0;
     qntMin = 0;
     qntMax = 0;
     duracao = 0;
     minIdade = 0;
    }
    
    public static MBuscaCart getMbuscaCart(){
        if(MBuscaCartUnico == null){
            MBuscaCartUnico = new MBuscaCart();
        }
        return MBuscaCartUnico;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rtMenuS = new javax.swing.JLabel();
        rtFiltros = new javax.swing.JLabel();
        rtPrecoMin = new javax.swing.JLabel();
        tfPrecoMin = new javax.swing.JTextField();
        tfPrecoMax = new javax.swing.JTextField();
        tfQntMin = new javax.swing.JTextField();
        rtQntJog = new javax.swing.JLabel();
        rtSepQnt = new javax.swing.JLabel();
        tfQntMax = new javax.swing.JTextField();
        rtSepPrec = new javax.swing.JLabel();
        tfIdade = new javax.swing.JTextField();
        rtIdade = new javax.swing.JLabel();
        tfDuracao = new javax.swing.JTextField();
        rtDuracao = new javax.swing.JLabel();
        rtCompDuracao = new javax.swing.JLabel();
        rtComplAno = new javax.swing.JLabel();
        btPesquisa = new javax.swing.JButton();
        rtResult = new javax.swing.JLabel();
        rtAviso = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbResults = new javax.swing.JTable();

        setTitle("Menu - Busca de cartas");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        rtMenuS.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        rtMenuS.setForeground(new java.awt.Color(255, 255, 255));
        rtMenuS.setText("MENU  - BUSCA DE CARTAS");

        rtFiltros.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        rtFiltros.setForeground(new java.awt.Color(255, 255, 255));
        rtFiltros.setText("FILTROS:");

        rtPrecoMin.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rtPrecoMin.setForeground(new java.awt.Color(255, 255, 255));
        rtPrecoMin.setText("Preço:");

        tfPrecoMin.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        tfPrecoMin.setForeground(new java.awt.Color(204, 204, 204));
        tfPrecoMin.setText("Min");
        tfPrecoMin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfPrecoMinFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfPrecoMinFocusLost(evt);
            }
        });

        tfPrecoMax.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        tfPrecoMax.setForeground(new java.awt.Color(204, 204, 204));
        tfPrecoMax.setText("Max");
        tfPrecoMax.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfPrecoMaxFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfPrecoMaxFocusLost(evt);
            }
        });

        tfQntMin.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        tfQntMin.setForeground(new java.awt.Color(204, 204, 204));
        tfQntMin.setText("Min");
        tfQntMin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfQntMinFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfQntMinFocusLost(evt);
            }
        });

        rtQntJog.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rtQntJog.setForeground(new java.awt.Color(255, 255, 255));
        rtQntJog.setText("Quantidade jogadores:");

        rtSepQnt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rtSepQnt.setForeground(new java.awt.Color(255, 255, 255));
        rtSepQnt.setText("-");

        tfQntMax.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        tfQntMax.setForeground(new java.awt.Color(204, 204, 204));
        tfQntMax.setText("Max");
        tfQntMax.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfQntMaxFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfQntMaxFocusLost(evt);
            }
        });
        tfQntMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfQntMaxActionPerformed(evt);
            }
        });

        rtSepPrec.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rtSepPrec.setForeground(new java.awt.Color(255, 255, 255));
        rtSepPrec.setText("-");

        tfIdade.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        tfIdade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfIdadeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfIdadeFocusLost(evt);
            }
        });
        tfIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdadeActionPerformed(evt);
            }
        });

        rtIdade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rtIdade.setForeground(new java.awt.Color(255, 255, 255));
        rtIdade.setText("Idade recomendada:");

        tfDuracao.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        tfDuracao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfDuracaoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfDuracaoFocusLost(evt);
            }
        });
        tfDuracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDuracaoActionPerformed(evt);
            }
        });

        rtDuracao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rtDuracao.setForeground(new java.awt.Color(255, 255, 255));
        rtDuracao.setText("Duração minima:");

        rtCompDuracao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rtCompDuracao.setForeground(new java.awt.Color(255, 255, 255));
        rtCompDuracao.setText("Minutos");

        rtComplAno.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rtComplAno.setForeground(new java.awt.Color(255, 255, 255));
        rtComplAno.setText("Anos");

        btPesquisa.setText("Pesquisar");
        btPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisaActionPerformed(evt);
            }
        });

        rtResult.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        rtResult.setForeground(new java.awt.Color(255, 255, 255));
        rtResult.setText("RESULTADOS:");

        rtAviso.setBackground(new java.awt.Color(255, 255, 255));
        rtAviso.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        rtAviso.setForeground(new java.awt.Color(255, 255, 255));
        rtAviso.setText("Campos vazios ou valor 0, serão considerados buscas gerais pelo filtro");

        tbResults.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        tbResults.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome:", "Descrição:", "Idioma:", "Minimo de jogadores:", "Maximo de jogadores:", "Idade recomendada:", "Duração minima:", "Preço minimo:", "Preço maximo:", "Preço medio:"
            }
        ));
        jScrollPane1.setViewportView(tbResults);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(rtAviso)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfQntMin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rtSepQnt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfQntMax, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(rtQntJog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rtIdade)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(tfIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rtComplAno))
                                .addComponent(rtDuracao)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(tfDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rtCompDuracao))
                                .addComponent(btPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfPrecoMin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rtSepPrec)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPrecoMax, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rtPrecoMin)
                            .addComponent(rtFiltros))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rtResult)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(rtMenuS)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rtMenuS, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rtResult, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rtPrecoMin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfPrecoMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPrecoMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rtSepPrec))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rtQntJog)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfQntMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rtSepQnt)
                            .addComponent(tfQntMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rtIdade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rtComplAno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rtDuracao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rtCompDuracao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btPesquisa))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(rtAviso))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfQntMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfQntMaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfQntMaxActionPerformed

    private void tfQntMinFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfQntMinFocusLost
        if(tfQntMin.getText().equals("")){
            tfQntMin.setText("Min");
            tfQntMin.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_tfQntMinFocusLost

    private void tfQntMinFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfQntMinFocusGained
        if(tfQntMin.getText().equals("Min")){
            tfQntMin.setText("");
            tfQntMin.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_tfQntMinFocusGained

    private void tfQntMaxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfQntMaxFocusGained
        if(tfQntMax.getText().equals("Max")){
            tfQntMax.setText("");
            tfQntMax.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_tfQntMaxFocusGained

    private void tfQntMaxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfQntMaxFocusLost
        if(tfQntMax.getText().equals("")){
            tfQntMax.setText("Max");
            tfQntMax.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_tfQntMaxFocusLost

    private void tfPrecoMinFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPrecoMinFocusGained
        if(tfPrecoMin.getText().equals("Min")){
            tfPrecoMin.setText("");
            tfPrecoMin.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_tfPrecoMinFocusGained

    private void tfIdadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfIdadeFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdadeFocusGained

    private void tfIdadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfIdadeFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdadeFocusLost

    private void tfIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdadeActionPerformed

    private void tfPrecoMinFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPrecoMinFocusLost
        if(tfPrecoMin.getText().equals("")){
            tfPrecoMin.setText("Min");
            tfPrecoMin.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_tfPrecoMinFocusLost

    private void tfPrecoMaxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPrecoMaxFocusGained
        if(tfPrecoMax.getText().equals("Max")){
            tfPrecoMax.setText("");
            tfPrecoMax.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_tfPrecoMaxFocusGained

    private void tfPrecoMaxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPrecoMaxFocusLost
        if(tfPrecoMax.getText().equals("")){
            tfPrecoMax.setText("Max");
            tfPrecoMax.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_tfPrecoMaxFocusLost

    private void tfDuracaoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDuracaoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDuracaoFocusGained

    private void tfDuracaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDuracaoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDuracaoFocusLost

    private void tfDuracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDuracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDuracaoActionPerformed

    private void btPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisaActionPerformed
    pesquisa();
    }//GEN-LAST:event_btPesquisaActionPerformed

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
            java.util.logging.Logger.getLogger(MBuscaCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MBuscaCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MBuscaCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MBuscaCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MBuscaCart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPesquisa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rtAviso;
    private javax.swing.JLabel rtCompDuracao;
    private javax.swing.JLabel rtComplAno;
    private javax.swing.JLabel rtDuracao;
    private javax.swing.JLabel rtFiltros;
    private javax.swing.JLabel rtIdade;
    private javax.swing.JLabel rtMenuS;
    private javax.swing.JLabel rtPrecoMin;
    private javax.swing.JLabel rtQntJog;
    private javax.swing.JLabel rtResult;
    private javax.swing.JLabel rtSepPrec;
    private javax.swing.JLabel rtSepQnt;
    private javax.swing.JTable tbResults;
    private javax.swing.JTextField tfDuracao;
    private javax.swing.JTextField tfIdade;
    private javax.swing.JTextField tfPrecoMax;
    private javax.swing.JTextField tfPrecoMin;
    private javax.swing.JTextField tfQntMax;
    private javax.swing.JTextField tfQntMin;
    // End of variables declaration//GEN-END:variables
    private void pHolderMinReturn(){
        if(tfPrecoMin.getText().equals("")){
            tfPrecoMin.setText("Min");
            tfPrecoMin.setForeground(new Color(204,204,204));
        }
    }
    
    private void pHolderMin(){
        if(tfPrecoMin.getText().equals("Min")){
            tfPrecoMin.setText("");
            tfPrecoMin.setForeground(new Color(0,0,0));
        }
    }
    
    private void pHolderMax(){
        if(tfQntMax.getText().equals("Max")){
            tfQntMax.setText("");
            tfQntMax.setForeground(new Color(0,0,0));
        }
    }
    
    private void pHolderMaxReturn(){
        if(tfQntMax.getText().equals("")){
            tfQntMax.setText("Max");
            tfQntMax.setForeground(new Color(204,204,204));
        }
    }
    
   
    private void pesquisa(){
        dbC.insere();
        String msg = "";
        if(!tfPrecoMin.getText().equals("Min")){
            try{
                this.valorMinT = Insere.verNegativoDb(Double.parseDouble(tfPrecoMin.getText()));
            }catch(NegatException ne){
                this.valorMinT = ne.correctDb(valorMinT);
            }catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null,"Valor minimo aceita somente numeros de ponto flutuante","ERRO",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            this.valorMinT = 0;
        }
        
        
        if(!tfPrecoMax.getText().equals("Max")){
            try{
                this.valorMaxT = Insere.verNegativoDb(Double.parseDouble(tfPrecoMax.getText()));
            }catch(NegatException ne){
                this.valorMaxT = ne.correctDb(valorMaxT);
            }catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null,"Valor minimo aceita somente numeros de ponto flutuante","ERRO",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            this.valorMaxT = 0;
        }
        
        
        
        if(!tfQntMin.getText().equals("Min")){  
            try{
                this.qntMin = Insere.verNegativoInt(Integer.parseInt(tfQntMin.getText()));
            }catch(NegatException ne){
                this.qntMin = ne.correctInt(qntMin);
            }catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null,"Valor minimo aceita somente numeros inteiros","ERRO",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            this.qntMin = 0;
        }
        
        
        if(!tfQntMax.getText().equals("Max")){            
            try{
                this.qntMax = Insere.verNegativoInt(Integer.parseInt(tfQntMax.getText()));
            }catch(NegatException ne){
                this.qntMax = ne.correctInt(qntMax);
            }catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null,"Valor minimo aceita somente numeros inteiros","ERRO",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            this.qntMax = 0;
        }
        if(tfDuracao.getText().equals("")){
            this.duracao = 0;
        }else{
            try{
                this.duracao = Insere.verNegativoInt(Integer.parseInt(tfDuracao.getText()));
            }catch(NegatException ne){
                this.duracao = ne.correctInt(duracao);
            }catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null,"Valor minimo aceita somente numeros inteiros","ERRO",JOptionPane.ERROR_MESSAGE);
            }
        }
        if(tfIdade.getText().equals("")){
            this.minIdade = 0;
        }else{
            try{
                this.minIdade = Insere.verNegativoInt(Integer.parseInt(tfIdade.getText()));
            }catch(NegatException ne){
                this.minIdade = ne.correctInt(minIdade);
            }catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null,"Valor minimo aceita somente numeros inteiros","ERRO",JOptionPane.ERROR_MESSAGE);
            }
        }
        DefaultTableModel tabelaMod = (DefaultTableModel) tbResults.getModel();
        tabelaMod.setRowCount(0);
        int pos = 0;
        boolean ver = false;
        for(Cartas cart: dbC.getList()){
            if((cart.getPrecoMin() <= valorMinT || valorMinT == 0) && (cart.getPrecoMax() <= valorMaxT || valorMaxT == 0) && (cart.getDt().getQntMinJogadores() == qntMin || qntMin == 0) &&(cart.getDt().getQntMaxJogadores() == qntMax || qntMax == 0) && (cart.getDt().getDuracaoMin() <= duracao || duracao == 0) && (cart.getDt().getIdadeMinima() <= minIdade || minIdade == 0 )){
                tabelaMod.insertRow(pos,new Object[]{cart.getNome(),cart.getDescricao(),cart.getDt().getLingua(),cart.getDt().getQntMinJogadores(),cart.getDt().getQntMaxJogadores(),cart.getDt().getIdadeMinima(),cart.getDt().getDuracaoMin(),cart.getPrecoMin(),cart.getPrecoMax(),cart.getPrecoMedia()});
                ver = true;              
                pos++;
            }
        }
        if(ver == false){
            while(tabelaMod.getRowCount()>0){
                tabelaMod.removeRow(0);
            }
                
        }
        dbC.getList().clear();
}


}
