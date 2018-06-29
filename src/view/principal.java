/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Controller.DAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Projeto;
import model.Tshirt;

public class principal extends javax.swing.JFrame {
    public static Projeto novoProjeto = new Projeto();
    public static Long idProjeto;
    public static String status = "iniciado";
    //public static Tshirt esforco = new Tshirt();

    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        desktopPanel = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        itemAbrir = new javax.swing.JMenuItem();
        menuNovoProjeto = new javax.swing.JMenuItem();
        itemSalvar = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenuItem();
        menuCadastrar = new javax.swing.JMenu();
        itemAtividade = new javax.swing.JMenuItem();
        itemColaborador = new javax.swing.JMenuItem();
        itemEsforco = new javax.swing.JMenuItem();
        itemEditarAtividade = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        itemInformacoes = new javax.swing.JMenu();
        itemAtividadesAtrasadas = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        desktopPanel.setMinimumSize(new java.awt.Dimension(600, 400));

        javax.swing.GroupLayout desktopPanelLayout = new javax.swing.GroupLayout(desktopPanel);
        desktopPanel.setLayout(desktopPanelLayout);
        desktopPanelLayout.setHorizontalGroup(
            desktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        desktopPanelLayout.setVerticalGroup(
            desktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        menuArquivo.setText("Arquivo");
        menuArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArquivoActionPerformed(evt);
            }
        });

        itemAbrir.setText("Abrir");
        itemAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAbrirActionPerformed(evt);
            }
        });
        menuArquivo.add(itemAbrir);

        menuNovoProjeto.setText("Novo Projeto");
        menuNovoProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNovoProjetoActionPerformed(evt);
            }
        });
        menuArquivo.add(menuNovoProjeto);

        itemSalvar.setText("Salvar");
        itemSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSalvarActionPerformed(evt);
            }
        });
        menuArquivo.add(itemSalvar);

        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        menuArquivo.add(menuSair);

        jMenuBar1.add(menuArquivo);

        menuCadastrar.setText("Cadastrar");

        itemAtividade.setText("Atividades");
        itemAtividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAtividadeActionPerformed(evt);
            }
        });
        menuCadastrar.add(itemAtividade);

        itemColaborador.setText("Colaboradores");
        itemColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemColaboradorActionPerformed(evt);
            }
        });
        menuCadastrar.add(itemColaborador);

        itemEsforco.setText("Esforço");
        itemEsforco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEsforcoActionPerformed(evt);
            }
        });
        menuCadastrar.add(itemEsforco);

        jMenuBar1.add(menuCadastrar);

        itemEditarAtividade.setText("Editar");
        itemEditarAtividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarAtividadeActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Atividades");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        itemEditarAtividade.add(jMenuItem1);

        jMenuItem5.setText("Esforço");
        itemEditarAtividade.add(jMenuItem5);

        jMenuBar1.add(itemEditarAtividade);

        itemInformacoes.setText("Informações");

        itemAtividadesAtrasadas.setText("Atividades Atrasadas");
        itemAtividadesAtrasadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAtividadesAtrasadasActionPerformed(evt);
            }
        });
        itemInformacoes.add(itemAtividadesAtrasadas);

        jMenuItem6.setText("Atividades Dentro do Prazo");
        itemInformacoes.add(jMenuItem6);

        jMenuItem7.setText("Atividades Adiantadas");
        itemInformacoes.add(jMenuItem7);

        jMenuItem4.setText("Resumo do Projeto");
        itemInformacoes.add(jMenuItem4);

        jMenuBar1.add(itemInformacoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuNovoProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNovoProjetoActionPerformed
        novoProjeto cadNovoProjeto = new novoProjeto();
        cadNovoProjeto.setMaximizable(true);
        cadNovoProjeto.setClosable(true);
        //Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        //cadNovoProjeto.setBounds(WIDTH, WIDTH, WIDTH, HEIGHT);
        desktopPanel.add(cadNovoProjeto);
        cadNovoProjeto.setVisible(true);
    }//GEN-LAST:event_menuNovoProjetoActionPerformed

    private void menuArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArquivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuArquivoActionPerformed

    private void itemEsforcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEsforcoActionPerformed
        novaEstimativa cadNovaEstimativa = new novaEstimativa();
        cadNovaEstimativa.setMaximizable(true);
        cadNovaEstimativa.setClosable(true);
        desktopPanel.add(cadNovaEstimativa);
        cadNovaEstimativa.setVisible(true);
    }//GEN-LAST:event_itemEsforcoActionPerformed

    private void itemSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalvarActionPerformed
        DAO daoProjeto = new DAO();        
        //CONVERTE DATA
        String novadata = "12/06/06";        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date data;
        try {
            data = sdf.parse(novadata);
            novoProjeto.setDataFim(data);
            novoProjeto.setDataInicio(data);
        } catch (ParseException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERRO NA DATA!!");
        }
        daoProjeto.salvar(this.novoProjeto);  
        novoProjeto= new Projeto();
                
    }//GEN-LAST:event_itemSalvarActionPerformed

    private void itemColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemColaboradorActionPerformed
        // TODO add your handling code here:
        novoColaborador cadNovoColaborador = new novoColaborador();
        cadNovoColaborador.setMaximizable(true);
        cadNovoColaborador.setClosable(true);
        desktopPanel.add(cadNovoColaborador);
        cadNovoColaborador.setVisible(true);
    }//GEN-LAST:event_itemColaboradorActionPerformed

    private void itemAtividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAtividadeActionPerformed
        // TODO add your handling code here:
        novaAtividade cadNovaAtividade  = new novaAtividade ();
        cadNovaAtividade.setMaximizable(true);
        cadNovaAtividade.setClosable(true);
        desktopPanel.add(cadNovaAtividade);
        cadNovaAtividade.setVisible(true);
    }//GEN-LAST:event_itemAtividadeActionPerformed

    private void itemAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAbrirActionPerformed
        // TODO add your handling code here:
        abrirProjeto abrir = new abrirProjeto();
        abrir.setClosable(true);
        desktopPanel.add(abrir);
        abrir.setVisible(true);
        
    }//GEN-LAST:event_itemAbrirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        if (status.equals("iniciado")){
            menuCadastrar.setEnabled(false);
        }else{
            
            menuCadastrar.setEnabled(true);
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        if (status.equals("iniciado")){
            menuCadastrar.setEnabled(false);
        }else{
            menuCadastrar.setEnabled(true);
        }
    }//GEN-LAST:event_formWindowGainedFocus

    private void itemEditarAtividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarAtividadeActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_itemEditarAtividadeActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        editarAtividade editarAtv = new editarAtividade();
        editarAtv.setClosable(true);
        desktopPanel.add(editarAtv);
        editarAtv.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void itemAtividadesAtrasadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAtividadesAtrasadasActionPerformed
        // TODO add your handling code here:
        statusAtividades atvAtrasadas = new statusAtividades();
        atvAtrasadas.setClosable(true);
        desktopPanel.add(atvAtrasadas);
        atvAtrasadas.setVisible(true);
    }//GEN-LAST:event_itemAtividadesAtrasadasActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menuSairActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                principal novatela = new principal();
                //Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                novatela.setExtendedState(JFrame.MAXIMIZED_BOTH);
                novatela.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPanel;
    private javax.swing.JMenuItem itemAbrir;
    private javax.swing.JMenuItem itemAtividade;
    private javax.swing.JMenuItem itemAtividadesAtrasadas;
    private javax.swing.JMenuItem itemColaborador;
    private javax.swing.JMenu itemEditarAtividade;
    private javax.swing.JMenuItem itemEsforco;
    private javax.swing.JMenu itemInformacoes;
    private javax.swing.JMenuItem itemSalvar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenu menuCadastrar;
    private javax.swing.JMenuItem menuNovoProjeto;
    private javax.swing.JMenuItem menuSair;
    // End of variables declaration//GEN-END:variables
}
