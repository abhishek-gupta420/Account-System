package AccountSystem;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableModel;

/**
 *
 * @author abu
 */
public class findBill extends javax.swing.JFrame {
    public findBill() {
        initComponents();
        jButton3.setEnabled(false);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jldate = new javax.swing.JLabel();
        cnlbl = new javax.swing.JLabel();
        conlbl = new javax.swing.JLabel();
        adlbl = new javax.swing.JLabel();
        stlbl = new javax.swing.JLabel();
        ctlbl = new javax.swing.JLabel();
        pinlbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt2 = new javax.swing.JTable();
        jl3 = new javax.swing.JLabel();
        gt = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        srctxt = new javax.swing.JTextField();
        src = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Find Bills ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(424, 424, 424)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jLabel2.setText("Customer Name :-");

        jLabel3.setText("Address :-");

        jLabel4.setText("City :-");

        jLabel7.setText("Contact :-");

        jLabel8.setText("State ;-");

        jLabel9.setText("Pincode :-");

        jLabel10.setText("Date :-");

        jldate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jldate.setText("00/00/00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cnlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(conlbl, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                .addGap(88, 88, 88)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(stlbl, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(adlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel9)))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pinlbl, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(ctlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(28, 28, 28)
                .addComponent(jldate, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(cnlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jldate)
                    .addComponent(conlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pinlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jt1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Quantity", "Quantity Type", "Price", "Tax", "GST (INR)", "Discount", "Total"
            }
        ));
        jScrollPane2.setViewportView(jt1);
        if (jt1.getColumnModel().getColumnCount() > 0) {
            jt1.getColumnModel().getColumn(0).setMinWidth(150);
            jt1.getColumnModel().getColumn(0).setPreferredWidth(150);
            jt1.getColumnModel().getColumn(0).setMaxWidth(150);
            jt1.getColumnModel().getColumn(1).setMinWidth(100);
            jt1.getColumnModel().getColumn(1).setPreferredWidth(100);
            jt1.getColumnModel().getColumn(1).setMaxWidth(100);
            jt1.getColumnModel().getColumn(2).setMinWidth(90);
            jt1.getColumnModel().getColumn(2).setPreferredWidth(90);
            jt1.getColumnModel().getColumn(2).setMaxWidth(90);
            jt1.getColumnModel().getColumn(3).setMinWidth(90);
            jt1.getColumnModel().getColumn(3).setPreferredWidth(90);
            jt1.getColumnModel().getColumn(3).setMaxWidth(90);
            jt1.getColumnModel().getColumn(4).setMinWidth(70);
            jt1.getColumnModel().getColumn(4).setPreferredWidth(70);
            jt1.getColumnModel().getColumn(4).setMaxWidth(70);
            jt1.getColumnModel().getColumn(5).setMinWidth(100);
            jt1.getColumnModel().getColumn(5).setPreferredWidth(100);
            jt1.getColumnModel().getColumn(5).setMaxWidth(100);
            jt1.getColumnModel().getColumn(6).setMinWidth(100);
            jt1.getColumnModel().getColumn(6).setPreferredWidth(100);
            jt1.getColumnModel().getColumn(6).setMaxWidth(100);
            jt1.getColumnModel().getColumn(7).setMinWidth(100);
            jt1.getColumnModel().getColumn(7).setPreferredWidth(100);
            jt1.getColumnModel().getColumn(7).setMaxWidth(100);
        }

        jt2.setBackground(new java.awt.Color(0, 204, 204));
        jt2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"CGST PAYABLE :-", ""},
                {"SGST PAYABLE :-", null},
                {"TOTAL GST :-", null}
            },
            new String [] {
                "TOTAL ", "AMOUNT  (INR)"
            }
        ));
        jt2.setRowHeight(25);
        jScrollPane1.setViewportView(jt2);

        jl3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jl3.setText("0000");

        gt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gt.setText("GRAND TOTAL :-");

        jButton3.setBackground(new java.awt.Color(51, 0, 255));
        jButton3.setText("PRINT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel19.setText("Invoice No :-");

        src.setBackground(new java.awt.Color(51, 0, 255));
        src.setText("Search");
        src.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srcActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(51, 0, 255));
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(gt)
                                .addGap(65, 65, 65))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jl3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(srctxt, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(src, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(srctxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(src, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(gt)
                        .addGap(18, 18, 18)
                        .addComponent(jl3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static String[] getdata()
            {
                String[] data=new String[5];
                data[0]=cnam;
                data[1]=add;
                data[2]=con;
                data[3]=gtot;
                data[4]=inv;
                return data;
            }
public static DefaultTableModel gettab1()
{
    DefaultTableModel mod=(DefaultTableModel)tm;
    return mod;
}
public static DefaultTableModel gettab2(){
    DefaultTableModel mod=(DefaultTableModel)tm1;
    return mod;
}
private void settab2(){
    double gtotal=0;
    double total_gst=0;
    double total_dis=0;
    for(int i=0;i<jt1.getRowCount();i++)
{
 double a=Double.parseDouble((String) jt1.getValueAt(i, 7));
 double b=Double.parseDouble((String) jt1.getValueAt(i, 5));
 double c=Double.parseDouble((String) jt1.getValueAt(i, 6));
 gtotal+=a;
 total_gst+=b;
 total_dis+=c;
}
double tcgst=total_gst/2;
double tsgst=total_gst/2;


//setting the table 2 values i.e. TOTAL TABLE 
jt2.setValueAt(tcgst, 0, 1);
jt2.setValueAt(tsgst, 1, 1);
jt2.setValueAt (total_gst,2,1);
}
static TableModel tm,tm1;
static String gtot,inv;
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        cnam=cnlbl.getText();
        add=adlbl.getText();
        con=conlbl.getText();
        tm=jt1.getModel();
        tm1=jt2.getModel();
        gtot=jl3.getText();
        inv=srctxt.getText();
        Print_form pform = new Print_form();
        pform.setdata1();
        pform.setVisible(true);
        
        //pform.startprinting();
        
    }//GEN-LAST:event_jButton3ActionPerformed
static String cnam,add,con;
    private void srcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srcActionPerformed
        DefaultTableModel mod=(DefaultTableModel)jt1.getModel();
        mod.setRowCount(0);
        DefaultTableModel mod1=(DefaultTableModel)jt2.getModel();
        if(srctxt.getText().trim().length()==0)
             JOptionPane.showMessageDialog(this, "Please fill invoice number");
         else{
             try {
                 dbconn.connect();
                 ResultSet rs=dbconn.stm.executeQuery("select * from customer where customer_id='"+srctxt.getText()+"'");
                 if(rs.isBeforeFirst())
                 { 
                     while(rs.next()){
                     cnlbl.setText(rs.getString("name"));
                     conlbl.setText(rs.getString("contact"));
                     adlbl.setText(rs.getString("address"));
                     stlbl.setText(rs.getString("state"));
                     ctlbl.setText(rs.getString("city"));
                     pinlbl.setText(rs.getString("pincode"));
                     jldate.setText(rs.getString("date"));
                     jl3.setText(rs.getString("gtotal"));
                    }
                     rs=dbconn.stm.executeQuery("select * from product where customer_id='"+srctxt.getText()+"'");
                     while(rs.next()){
                         Object[] data=new Object[8];
                         data[0]=rs.getString("product");
                         data[1]=rs.getString("quantity");
                         data[2]=rs.getString("quantity_type");
                         data[3]=rs.getString("price");
                         data[4]=rs.getString("tax");
                         data[5]=rs.getString("gst");
                         data[6]=rs.getString("discount");
                         data[7]=rs.getString("total");
                         mod.addRow(data);
                         settab2();
                     }
                     jt1.setModel(mod);
                 }
                 else{
                    JOptionPane.showMessageDialog(this, "No Record Found");
                 }
                 jButton3.setEnabled(true);
                 dbconn.discoonect();
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(findBill.class.getName()).log(Level.SEVERE, null, ex);
             } catch (SQLException ex) {
                 Logger.getLogger(findBill.class.getName()).log(Level.SEVERE, null, ex);
             }
             
         }
    }//GEN-LAST:event_srcActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        new Main().setVisible(true);
    super.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(findBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(findBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(findBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(findBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new findBill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adlbl;
    private javax.swing.JLabel cnlbl;
    private javax.swing.JLabel conlbl;
    private javax.swing.JLabel ctlbl;
    private javax.swing.JLabel gt;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jl3;
    private javax.swing.JLabel jldate;
    private javax.swing.JTable jt1;
    private javax.swing.JTable jt2;
    private javax.swing.JLabel pinlbl;
    private javax.swing.JButton src;
    private javax.swing.JTextField srctxt;
    private javax.swing.JLabel stlbl;
    // End of variables declaration//GEN-END:variables
}

