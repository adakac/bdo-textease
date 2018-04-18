
package main;

import java.awt.Color;
import javax.swing.plaf.metal.MetalLookAndFeel;

public class main extends javax.swing.JFrame 
{

    public main() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sp = new javax.swing.JScrollPane();
        taChat = new javax.swing.JTextArea();
        mb = new javax.swing.JMenuBar();
        mCredits = new javax.swing.JMenu();
        mi2 = new javax.swing.JMenuItem();
        mi3 = new javax.swing.JMenuItem();
        mi4 = new javax.swing.JMenuItem();
        mi5 = new javax.swing.JMenuItem();
        mClear = new javax.swing.JMenu();
        mCharcount = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BDO Textease");
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(400, 200));
        getContentPane().setLayout(new java.awt.GridLayout(1, 1));

        taChat.setBackground(new java.awt.Color(230, 223, 204));
        taChat.setColumns(20);
        taChat.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        taChat.setLineWrap(true);
        taChat.setRows(8);
        taChat.setTabSize(1);
        taChat.setToolTipText("");
        taChat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                onType(evt);
            }
        });
        sp.setViewportView(taChat);

        getContentPane().add(sp);

        mCredits.setText("About");

        mi2.setText("Build: 0.4 Beta");
        mi2.setEnabled(false);
        mCredits.add(mi2);

        mi3.setEnabled(false);
        mCredits.add(mi3);

        mi4.setText("By K.A. aka \"Hawkins\"");
        mi4.setEnabled(false);
        mCredits.add(mi4);

        mi5.setText("BDO-RP Forum: Avaria Ebonwood");
        mi5.setEnabled(false);
        mCredits.add(mi5);

        mb.add(mCredits);

        mClear.setText("Textfeld leeren");
        mClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onClear(evt);
            }
        });
        mb.add(mClear);

        mCharcount.setText("0 / 316 Zeichen");
        mCharcount.setEnabled(false);
        mb.add(mCharcount);

        setJMenuBar(mb);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onType(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_onType
        if(taChat.getText().length()<317)
        {
            mCharcount.setForeground(Color.GRAY);
        }
        
        mCharcount.setText(taChat.getText().length() + " / 316 Zeichen");
        
        if(taChat.getText().length()>=317)
        {
            mCharcount.setText("Limit erreicht! (" + taChat.getText().length() + "/316)");
            mCharcount.setForeground(Color.red);
        }
    }//GEN-LAST:event_onType

    private void onClear(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onClear
        taChat.setText("");
        mCharcount.setForeground(Color.GRAY);
        mCharcount.setText("0 / 316 Zeichen");
    }//GEN-LAST:event_onClear

    public static void main(String args[]) 
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) 
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) 
        {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) 
        {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) 
        {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) 
        {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu mCharcount;
    private javax.swing.JMenu mClear;
    private javax.swing.JMenu mCredits;
    private javax.swing.JMenuBar mb;
    private javax.swing.JMenuItem mi2;
    private javax.swing.JMenuItem mi3;
    private javax.swing.JMenuItem mi4;
    private javax.swing.JMenuItem mi5;
    private javax.swing.JScrollPane sp;
    private javax.swing.JTextArea taChat;
    // End of variables declaration//GEN-END:variables

}
