/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Class.Client;
import Class.Supplier;
import DatabaseCon.Database;
import static Interfaces.ClientManagement.Client;
import static Interfaces.SupplierI.dbReffSupplier;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.FirebaseCredentials;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Vihanga
 */
public class ClientManagement extends javax.swing.JFrame {

    static long Client;
    static DatabaseReference dbReffClient;
    Database database;
    ArrayList<Client> ary = new ArrayList<>();

    /**
     * Creates new form ClientManagement
     */
    public ClientManagement() throws IOException {
        initComponents();
        initializeFirebaseDB();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    //DB Connection
    public void initializeFirebaseDB() throws FileNotFoundException, IOException {
        FileInputStream serviceAccount = new FileInputStream("E:\\packages combine krapu eka\\oms19_2\\oms19_2\\omssystem9798-firebase-adminsdk-938j3-6beddaf76c.json");

        FirebaseOptions options;
        options = new FirebaseOptions.Builder()
                .setCredential(FirebaseCredentials.fromCertificate(serviceAccount))
                .setDatabaseUrl("https://omssystem9798.firebaseio.com/")
                .build();

        FirebaseApp.initializeApp(options);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txtclientcontact = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtclientemail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtclientaddress = new javax.swing.JTextField();
        lbl3 = new javax.swing.JLabel();
        txtclientname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtclientid = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtshow = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtSVAT = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtVAT = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(100, 149, 239));
        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Client Management");
        jLabel1.setOpaque(true);

        jButton4.setText("View All");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton2.setText("Edit Supplier Details");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setText("View");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        txtclientcontact.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(100, 149, 237)));
        txtclientcontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclientcontactActionPerformed(evt);
            }
        });
        txtclientcontact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtclientcontactKeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Contact No");

        txtclientemail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(100, 149, 237)));
        txtclientemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclientemailActionPerformed(evt);
            }
        });
        txtclientemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtclientemailKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("E-mail");

        txtclientaddress.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(100, 149, 237)));

        lbl3.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        lbl3.setForeground(new java.awt.Color(102, 102, 102));
        lbl3.setText("Address");

        txtclientname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(100, 149, 237)));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("First Name");

        txtclientid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(100, 149, 237)));
        txtclientid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtclientidKeyReleased(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Client ID");

        txtshow.setColumns(20);
        txtshow.setRows(5);
        jScrollPane1.setViewportView(txtshow);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setText("Add");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("SVAT No");

        txtSVAT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(100, 149, 237)));
        txtSVAT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSVATKeyReleased(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("VAT No");

        txtVAT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(100, 149, 237)));
        txtVAT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtVATKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5))
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtclientid, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addComponent(txtclientname, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                        .addComponent(lbl3, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                        .addComponent(txtclientaddress, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtclientemail))
                    .addComponent(txtclientcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSVAT, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVAT, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 531, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtclientid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtclientname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl3)
                        .addGap(4, 4, 4)
                        .addComponent(txtclientaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addGap(1, 1, 1)
                        .addComponent(txtclientemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtclientcontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSVAT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtVAT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4)
                    .addComponent(jButton2)
                    .addComponent(jButton5))
                .addGap(139, 139, 139))
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

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //View all Clients

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Validate

        String SupID = txtclientid.getText();
        String Fname = txtclientname.getText();
        String Address = txtclientaddress.getText();
        String Email = txtclientemail.getText();
        String ContactNo = txtclientcontact.getText();

        if (SupID.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insert Supplier ID");
        } else if (Fname.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insert First Name");
        } else if (Address.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insert Address");
        } else if (Email.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insert Email");
        } else if (ContactNo.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insert Contact No");
        } else {
            JOptionPane.showMessageDialog(null, "Successflly Edit Supplier Details");
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Viewing Client Details:

        dbReffClient = FirebaseDatabase.getInstance().getReference().child("Client");
        dbReffClient.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot ds) {
                int i = 0;
                System.out.println(ds.getChildrenCount());
                for (DataSnapshot d : ds.getChildren()) {
                    ary.add(d.getValue(Client.class));
                    i++;
                    if (i == ds.getChildrenCount()) {
                        for (Client s : ary) {
                            if (s.getClientID().equals(txtclientid.getText().toString())) {
                                String details = "Client Name : " + s.getClientName() + "\n Address : " + s.getClientAddress() + "\n Email : " + s.getClientEmail() + "\n Contact No : " + s.getClientContact() + "\n Client VAT No : " + s.getClient_VATno() +"\n Client SVAT No : "+s.getClient_SVATno();
                                txtshow.setText(details);
                            }
                        }
                    }
                }
            }

            @Override
            public void onCancelled(DatabaseError de) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtclientcontactKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtclientcontactKeyReleased
//        // Validate Contact No
//
//        String PATTERN = "^[0-9]{10}$";
//        Pattern patt = Pattern.compile(PATTERN);
//        Matcher match = patt.matcher(txtclientcontact.getText());
//        if (!match.matches()) {
//            txtclientcontact.setText("Contact No is Wrong!");
//        } else {
//            txtclientcontact.setText(null);
//        }
    }//GEN-LAST:event_txtclientcontactKeyReleased

    private void txtclientemailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtclientemailKeyReleased
        // Validate Email
        // Ex-email@email.com

        String PATTERN = "^[a-zA-Z0-9]{0,30}[@][a-zA-Z0-9]{0,10}[.][a-zA-Z]{0,5}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(txtclientemail.getText());
        if (!match.matches()) {
            txtclientemail.setText("Email is Incorrect!");
        } else {
            txtclientemail.setText(null);
        }
    }//GEN-LAST:event_txtclientemailKeyReleased

    private void txtclientidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtclientidKeyReleased
        // Validate Supplier ID

        String PATTERN = "^[S]{1}[0-9]{6}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(txtclientid.getText());
        if (!match.matches()) {
            jLabel15.setText("Supplier ID is Incorrect!");
        } else {
            jLabel15.setText(null);
        }
    }//GEN-LAST:event_txtclientidKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Adding Clients
        //Validate

        String ClientID = txtclientid.getText();
        String Fname = txtclientname.getText();
        String Address = txtclientaddress.getText();
        String Email = txtclientemail.getText();
        String ContactNo = txtclientcontact.getText();
        String Svatno=txtSVAT.getText();
        String VAT=txtVAT.getText();

        if (ClientID.equals("")) {
            JOptionPane.showMessageDialog(null, "Insert Supplier ID");
        } else if (Fname.equals("")) {
            JOptionPane.showMessageDialog(null, "Insert First Name");
        } else if (Address.equals("")) {
            JOptionPane.showMessageDialog(null, "Insert Address");
        } else if (Email.equals("")) {
            JOptionPane.showMessageDialog(null, "Insert Email");
        } else if (Svatno.equals("")) {
            JOptionPane.showMessageDialog(null, "Insert SVAT No");
        } else if (VAT.equals("")) {
            JOptionPane.showMessageDialog(null, "Insert VAT No");
        }
        try {
            initializeFirebaseDB();//Establishing DB connection
        } catch (IOException ex) {
            Logger.getLogger(ClientManagement.class.getName()).log(Level.SEVERE, null, ex);//Setting connection with the class
        } finally {

            dbReffClient = FirebaseDatabase.getInstance().getReference("Client").child(txtclientid.getText());//setting storage path
            DatabaseReference postsRef = dbReffClient;

            DatabaseReference newPostRef = postsRef;

            CountDownLatch done = new CountDownLatch(1);
            //creating Supplier Object
            Client cli = new Client(txtclientid.getText(), txtclientname.getText(), txtclientaddress.getText(), Integer.parseInt(txtclientcontact.getText()), txtclientemail.getText(),txtSVAT.getText(),txtVAT.getText());
            //pushing data to the DB
            newPostRef.setValue(cli);

            txtclientname.setText(null);
            txtclientaddress.setText(null);
            txtclientemail.setText(null);
            txtclientcontact.setText(null);
            txtclientid.setText(null);
            txtSVAT.setText(null);
            txtVAT.setText(null);
            JOptionPane.showMessageDialog(this, "Client Successfully Added");

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtSVATKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSVATKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSVATKeyReleased

    private void txtVATKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVATKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVATKeyReleased

    private void txtclientemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclientemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtclientemailActionPerformed

    private void txtclientcontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclientcontactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtclientcontactActionPerformed

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
            java.util.logging.Logger.getLogger(ClientManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ClientManagement().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(ClientManagement.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl3;
    private javax.swing.JTextField txtSVAT;
    private javax.swing.JTextField txtVAT;
    private javax.swing.JTextField txtclientaddress;
    private javax.swing.JTextField txtclientcontact;
    private javax.swing.JTextField txtclientemail;
    private javax.swing.JTextField txtclientid;
    private javax.swing.JTextField txtclientname;
    private javax.swing.JTextArea txtshow;
    // End of variables declaration//GEN-END:variables
}
