
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syed Taqi
 */
public class Home_Page extends javax.swing.JFrame {

    /**
     * Creates new form Home_Page
     */
    public Home_Page() {
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

        jBtnMR = new javax.swing.JButton();
        jBtnNS = new javax.swing.JButton();
        jBtnUDS = new javax.swing.JButton();
        jBtnSF = new javax.swing.JButton();
        jBtnASL = new javax.swing.JButton();
        jBtnLS = new javax.swing.JButton();
        jBtnNE = new javax.swing.JButton();
        jBtnUDE = new javax.swing.JButton();
        jBtnEP = new javax.swing.JButton();
        jBtnLogout = new javax.swing.JButton();
        jBtnExit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBtnLE = new javax.swing.JButton();
        jBtnAEW = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBtnMR.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBtnMR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/room.png"))); // NOI18N
        jBtnMR.setText("Manage Room");
        jBtnMR.setPreferredSize(new java.awt.Dimension(227, 39));
        jBtnMR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMRActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnMR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 240, -1));

        jBtnNS.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBtnNS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new student.png"))); // NOI18N
        jBtnNS.setText("New Students");
        jBtnNS.setPreferredSize(new java.awt.Dimension(227, 39));
        jBtnNS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNSActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnNS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 240, -1));

        jBtnUDS.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBtnUDS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Update & Delete Student.png"))); // NOI18N
        jBtnUDS.setText("Update & Delete Students");
        jBtnUDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUDSActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnUDS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 240, -1));

        jBtnSF.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBtnSF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fees.png"))); // NOI18N
        jBtnSF.setText("Student Fees");
        jBtnSF.setPreferredSize(new java.awt.Dimension(227, 39));
        jBtnSF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSFActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnSF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 240, -1));

        jBtnASL.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBtnASL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/all student living.png"))); // NOI18N
        jBtnASL.setText("All Students Living");
        jBtnASL.setPreferredSize(new java.awt.Dimension(227, 39));
        jBtnASL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnASLActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnASL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 240, -1));

        jBtnLS.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBtnLS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Leaved students.png"))); // NOI18N
        jBtnLS.setText("Leaved Students");
        jBtnLS.setPreferredSize(new java.awt.Dimension(227, 39));
        jBtnLS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLSActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnLS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 240, -1));

        jBtnNE.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBtnNE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new student.png"))); // NOI18N
        jBtnNE.setText("New Employee");
        jBtnNE.setPreferredSize(new java.awt.Dimension(227, 39));
        jBtnNE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNEActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnNE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 240, -1));

        jBtnUDE.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBtnUDE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Update & Delete Student.png"))); // NOI18N
        jBtnUDE.setText("Update & Delete Employee");
        jBtnUDE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUDEActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnUDE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 240, -1));

        jBtnEP.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBtnEP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fees.png"))); // NOI18N
        jBtnEP.setText("Employee Payement");
        jBtnEP.setPreferredSize(new java.awt.Dimension(227, 39));
        jBtnEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEPActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 240, -1));

        jBtnLogout.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jBtnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        jBtnLogout.setText("Logout");
        jBtnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 10, -1, -1));

        jBtnExit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jBtnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Close.png"))); // NOI18N
        jBtnExit.setText("Exit");
        jBtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExitActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 10, 130, -1));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Forte", 1, 30)); // NOI18N
        jLabel1.setText("NAVIGATION BAR");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/50-394e.jpg"))); // NOI18N

        jBtnLE.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBtnLE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Leaved students.png"))); // NOI18N
        jBtnLE.setText("Leaved Employee");
        jBtnLE.setPreferredSize(new java.awt.Dimension(227, 39));
        jBtnLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLEActionPerformed(evt);
            }
        });

        jBtnAEW.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBtnAEW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/all student living.png"))); // NOI18N
        jBtnAEW.setText("All Employee Working");
        jBtnAEW.setPreferredSize(new java.awt.Dimension(227, 39));
        jBtnAEW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAEWActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnAEW, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnLE, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1140, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jBtnAEW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnLE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 850));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        jBtnMR.setForeground(new JButton().getForeground());
        jBtnMR.setBackground(new JButton().getBackground());
        
        jBtnNS.setForeground(new JButton().getForeground());
        jBtnNS.setBackground(new JButton().getBackground());
        
        jBtnUDS.setForeground(new JButton().getForeground());
        jBtnUDS.setBackground(new JButton().getBackground());
        
        jBtnSF.setForeground(new JButton().getForeground());
        jBtnSF.setBackground(new JButton().getBackground());
        
        jBtnASL.setForeground(new JButton().getForeground());
        jBtnASL.setBackground(new JButton().getBackground());
        
        jBtnLS.setForeground(new JButton().getForeground());
        jBtnLS.setBackground(new JButton().getBackground());
        
        jBtnNE.setForeground(new JButton().getForeground());
        jBtnNE.setBackground(new JButton().getBackground());
        
        jBtnUDE.setForeground(new JButton().getForeground());
        jBtnUDE.setBackground(new JButton().getBackground());
        
        jBtnEP.setForeground(new JButton().getForeground());
        jBtnEP.setBackground(new JButton().getBackground());
        
        jBtnAEW.setForeground(new JButton().getForeground());
        jBtnAEW.setBackground(new JButton().getBackground());
        
        jBtnLE.setForeground(new JButton().getForeground());
        jBtnLE.setBackground(new JButton().getBackground());
    }//GEN-LAST:event_formWindowGainedFocus

    private void jBtnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLogoutActionPerformed
        int exit = JOptionPane.showConfirmDialog(this,"Confirm you want to logout","Hostel Management System",JOptionPane.YES_NO_OPTION,JOptionPane.OK_OPTION); 
        if(exit == JOptionPane.YES_OPTION){
        Login_Page Info = new Login_Page();
        Info.setVisible(true);
        dispose();
        }
    }//GEN-LAST:event_jBtnLogoutActionPerformed

    private void jBtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExitActionPerformed
        int exit = JOptionPane.showConfirmDialog(this,"Confirm you want to exit","Hostel Management System",JOptionPane.YES_NO_OPTION,JOptionPane.OK_OPTION); 
        if(exit == JOptionPane.YES_OPTION){
        System.exit(0);
        }
    }//GEN-LAST:event_jBtnExitActionPerformed

    private void jBtnMRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMRActionPerformed
        jBtnMR.setForeground(Color.red);
        jBtnMR.setBackground(new Color(255,255,255));
        ManageRoom Info = new ManageRoom();
        Info.setVisible(true);
    }//GEN-LAST:event_jBtnMRActionPerformed

    private void jBtnNSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNSActionPerformed
        jBtnNS.setForeground(Color.red);
        jBtnNS.setBackground(new Color(255,255,255));
        NewStudent Info = new NewStudent();
        Info.setVisible(true);
    }//GEN-LAST:event_jBtnNSActionPerformed

    private void jBtnUDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUDSActionPerformed
        jBtnUDS.setForeground(Color.red);
        jBtnUDS.setBackground(new Color(255,255,255));
        UpdateDeleteStudent Info = new UpdateDeleteStudent();
        Info.setVisible(true);
    }//GEN-LAST:event_jBtnUDSActionPerformed

    private void jBtnSFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSFActionPerformed
        jBtnSF.setForeground(Color.red);
        jBtnSF.setBackground(new Color(255,255,255));
        StudentFees Info = new StudentFees();
        Info.setVisible(true);
    }//GEN-LAST:event_jBtnSFActionPerformed

    private void jBtnASLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnASLActionPerformed
        jBtnASL.setForeground(Color.red);
        jBtnASL.setBackground(new Color(255,255,255));
        AllStudentLiving Info = new AllStudentLiving();
        Info.setVisible(true);
    }//GEN-LAST:event_jBtnASLActionPerformed

    private void jBtnLSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLSActionPerformed
        jBtnLS.setForeground(Color.red);
        jBtnLS.setBackground(new Color(255,255,255));
        LeavedStudent Info = new LeavedStudent();
        Info.setVisible(true);
    }//GEN-LAST:event_jBtnLSActionPerformed

    private void jBtnNEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNEActionPerformed
        jBtnNE.setForeground(Color.red);
        jBtnNE.setBackground(new Color(255,255,255));
        NewEmployee Info = new NewEmployee();
        Info.setVisible(true);
    }//GEN-LAST:event_jBtnNEActionPerformed

    private void jBtnUDEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUDEActionPerformed
        jBtnUDE.setForeground(Color.red);
        jBtnUDE.setBackground(new Color(255,255,255));
        UpdateDeleteEmployee Info = new UpdateDeleteEmployee();  
        Info.setVisible(true);
    }//GEN-LAST:event_jBtnUDEActionPerformed

    private void jBtnEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEPActionPerformed
        jBtnEP.setForeground(Color.red);
        jBtnEP.setBackground(new Color(255,255,255));
        EmployeePayment Info = new EmployeePayment();
        Info.setVisible(true);
    }//GEN-LAST:event_jBtnEPActionPerformed

    private void jBtnAEWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAEWActionPerformed
        jBtnAEW.setForeground(Color.red);
        jBtnAEW.setBackground(new Color(255,255,255));
        AllEmployeeWorking Info = new AllEmployeeWorking();
        Info.setVisible(true);
    }//GEN-LAST:event_jBtnAEWActionPerformed

    private void jBtnLEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLEActionPerformed
        jBtnLE.setForeground(Color.red);
        jBtnLE.setBackground(new Color(255,255,255));
        LeavedEmployee Info = new LeavedEmployee();
        Info.setVisible(true);
    }//GEN-LAST:event_jBtnLEActionPerformed

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
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAEW;
    private javax.swing.JButton jBtnASL;
    private javax.swing.JButton jBtnEP;
    private javax.swing.JButton jBtnExit;
    private javax.swing.JButton jBtnLE;
    private javax.swing.JButton jBtnLS;
    private javax.swing.JButton jBtnLogout;
    private javax.swing.JButton jBtnMR;
    private javax.swing.JButton jBtnNE;
    private javax.swing.JButton jBtnNS;
    private javax.swing.JButton jBtnSF;
    private javax.swing.JButton jBtnUDE;
    private javax.swing.JButton jBtnUDS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}