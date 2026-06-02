
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ℓunα
 */
public class CandidateFrame extends javax.swing.JFrame {

    /**
     * Creates new form CandidateFrame
     */
    public CandidateFrame() {
        initComponents();
    }

    private void loadCandidates(){
        
        javax.swing.DefaultListModel model = new javax.swing.DefaultListModel();
        
        String position = cmbPosition.getSelectedItem().toString();
        
        switch (position) {

        case "President":
            for (String c : ElectionData.presidents) {
                model.addElement("President - " + c);
            }
            break;

        case "Vice President":
            for (String c : ElectionData.vicePresidents) {
                model.addElement("Vice President - " + c);
            }
            break;

        case "Secretary":
            for (String c : ElectionData.secretaries) {
                model.addElement("Secretary - " + c);
            }
            break;

        case "Treasurer":
            for (String c : ElectionData.treasurers) {
                model.addElement("Treasurer - " + c);
            }
            break;
    }
        
        listCandidates.setModel(model);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Add = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        txtCandidate = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cmbPosition = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listCandidates = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnVote = new javax.swing.JButton();
        btnCandidate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnResult = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Add.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Edit.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        Back.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        Delete.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        txtCandidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCandidateActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel1.setText("Candidate:");

        cmbPosition.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "President", "Vice President", "Secretary", "Treasurer" }));
        cmbPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPositionActionPerformecmbPosition(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel3.setText("Positions:");

        jScrollPane2.setViewportView(listCandidates);

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel2.setText("List of Candidates:");

        jPanel2.setBackground(new java.awt.Color(0, 51, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_111111111111 last vote stamp 128.jpg"))); // NOI18N

        btnVote.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        btnVote.setText("VOTE");
        btnVote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoteActionPerformed(evt);
            }
        });

        btnCandidate.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        btnCandidate.setText("ADD CANDIDATE");
        btnCandidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCandidateActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        btnReset.setText("RESET ELECTION");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnResult.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        btnResult.setText("RESULT");
        btnResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultActionPerformed(evt);
            }
        });

        btnLogout.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        btnLogout.setText("LOG OUT");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnReset)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnCandidate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnVote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addGap(29, 29, 29)
                .addComponent(btnVote)
                .addGap(30, 30, 30)
                .addComponent(btnCandidate)
                .addGap(30, 30, 30)
                .addComponent(btnResult)
                .addGap(30, 30, 30)
                .addComponent(btnLogout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReset)
                .addGap(65, 65, 65))
        );

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 1, 36)); // NOI18N
        jLabel5.setText("ADD CANDIDATE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(152, 152, 152))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(txtCandidate, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3)
                                    .addComponent(cmbPosition, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane2)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel5)
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCandidate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Edit)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back)
                    .addComponent(cmbPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Delete)
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        int index = listCandidates.getSelectedIndex();

    if(index == -1){
        return;
    }

    String newName = txtCandidate.getText().trim();

    if(newName.isEmpty()){
        return;
    }

    String position = cmbPosition.getSelectedItem().toString();

    switch(position){

        case "President":

            String oldPresident =
                    ElectionData.presidents.get(index);

            int votes1 =
                    ElectionData.presidentVotes.get(oldPresident);

            ElectionData.presidents.set(index, newName);

            ElectionData.presidentVotes.remove(oldPresident);
            ElectionData.presidentVotes.put(newName, votes1);

            break;

        case "Vice President":

            String oldVP =
                    ElectionData.vicePresidents.get(index);

            int votes2 =
                    ElectionData.vicePresidentVotes.get(oldVP);

            ElectionData.vicePresidents.set(index, newName);

            ElectionData.vicePresidentVotes.remove(oldVP);
            ElectionData.vicePresidentVotes.put(newName, votes2);

            break;

        case "Secretary":

            String oldSec =
                    ElectionData.secretaries.get(index);

            int votes3 =
                    ElectionData.secretaryVotes.get(oldSec);

            ElectionData.secretaries.set(index, newName);

            ElectionData.secretaryVotes.remove(oldSec);
            ElectionData.secretaryVotes.put(newName, votes3);

            break;

        case "Treasurer":

            String oldTreas =
                    ElectionData.treasurers.get(index);
    }
    loadCandidates();
    }//GEN-LAST:event_EditActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        String candidate = txtCandidate.getText().trim();
        String position = cmbPosition.getSelectedItem().toString();

        if(candidate.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this,
                "Enter candidate name.");
            return;
        }

        switch(position){

            case "President":
            ElectionData.presidents.add(candidate);
            ElectionData.presidentVotes.put(candidate, 0);
            break;

            case "Vice President":
            ElectionData.vicePresidents.add(candidate);
            ElectionData.vicePresidentVotes.put(candidate, 0);
            break;

            case "Secretary":
            ElectionData.secretaries.add(candidate);
            ElectionData.secretaryVotes.put(candidate, 0);
            break;

            case "Treasurer":
            ElectionData.treasurers.add(candidate);
            ElectionData.treasurerVotes.put(candidate, 0);
            break;
        }

        loadCandidates();

        txtCandidate.setText("");
        
    }//GEN-LAST:event_AddActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        MenuFrame menu = new MenuFrame();

        menu.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        int index = listCandidates.getSelectedIndex();

    if(index == -1){
        return;
    }

    String position = cmbPosition.getSelectedItem().toString();

    switch(position){

        case "President":

            String p = ElectionData.presidents.remove(index);
            ElectionData.presidentVotes.remove(p);

            break;

        case "Vice President":

            String vp =
                    ElectionData.vicePresidents.remove(index);

            ElectionData.vicePresidentVotes.remove(vp);

            break;

        case "Secretary":

            String s =
                    ElectionData.secretaries.remove(index);

            ElectionData.secretaryVotes.remove(s);

            break;

        case "Treasurer":

            String t =
                    ElectionData.treasurers.remove(index);

            ElectionData.treasurerVotes.remove(t);

            break;
    }

    loadCandidates();
    }//GEN-LAST:event_DeleteActionPerformed

    private void cmbPositionActionPerformecmbPosition(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPositionActionPerformecmbPosition
        loadCandidates();
    }//GEN-LAST:event_cmbPositionActionPerformecmbPosition

    private void txtCandidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCandidateActionPerformed

    }//GEN-LAST:event_txtCandidateActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        loadCandidates();
    }//GEN-LAST:event_formWindowOpened

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        int choice = javax.swing.JOptionPane.showConfirmDialog(
            this,
            "Are you sure you want to log out?",
            "Confirm Log Out",
            javax.swing.JOptionPane.YES_NO_OPTION,
            javax.swing.JOptionPane.QUESTION_MESSAGE
        );

        if (choice == javax.swing.JOptionPane.YES_OPTION) {

            VoteFrame.currentVoterID = null;
            VoteFrame.currentVoterName = null;

            LoginFrame login = new LoginFrame();
            login.setVisible(true);

            this.dispose();
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultActionPerformed
        ResultsFrame results = new ResultsFrame();
        results.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnResultActionPerformed

    private void btnVoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoteActionPerformed
         VoteFrame vote = new VoteFrame();
        vote.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnVoteActionPerformed

    private void btnCandidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCandidateActionPerformed
        CandidateFrame candidate = new CandidateFrame();
        candidate.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnCandidateActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        int choice = javax.swing.JOptionPane.showConfirmDialog(
                this,
                "Are you sure you want to reset all votes?",
                "Confirm Reset",
                javax.swing.JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        if (choice == javax.swing.JOptionPane.YES_OPTION) {
            ElectionData.resetElection();
            javax.swing.JOptionPane.showMessageDialog(this, "Election successfully reset.");
        }
    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(CandidateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CandidateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CandidateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CandidateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CandidateFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Back;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Edit;
    private javax.swing.JButton btnCandidate;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnResult;
    private javax.swing.JButton btnVote;
    private javax.swing.JComboBox cmbPosition;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listCandidates;
    private javax.swing.JTextField txtCandidate;
    // End of variables declaration//GEN-END:variables
}
