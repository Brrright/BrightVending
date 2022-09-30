/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.brightvending;

import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class admin_sales_report extends javax.swing.JFrame {

    /**
     * Creates new form admin_sales_report
     */
    public admin_sales_report() {
        initComponents();
        totalSalesText.setText("");
        receiptTable.setRowHeight(receiptTable.getRowHeight() + 20);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        totalSalesText = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        yearTextField = new javax.swing.JTextField();
        dropDownMonth = new javax.swing.JComboBox<>();
        generateReportBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        receiptTable = new javax.swing.JTable();
        dayTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(Toolkit.getDefaultToolkit().getImage("src\\main\\java\\com\\mycompany\\brightvending\\image\\icon-vending-machine-64.png"));
        setPreferredSize(new java.awt.Dimension(1024, 786));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Forte", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 78, 156));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Bright Vending Machine");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("RM: ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Total Sales");

        totalSalesText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        totalSalesText.setForeground(new java.awt.Color(51, 255, 51));
        totalSalesText.setText("jLabel4");

        backBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Year");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Month");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Day");

        dropDownMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "01", "02", "03", "04","05", "06", "07", "08", "09", "10", "11", "12" }));
        dropDownMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropDownMonthActionPerformed(evt);
            }
        });

        generateReportBtn.setBackground(new java.awt.Color(204, 255, 204));
        generateReportBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        generateReportBtn.setForeground(new java.awt.Color(0, 0, 204));
        generateReportBtn.setText("Generate Report");
        generateReportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateReportBtnActionPerformed(evt);
            }
        });

        receiptTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ReceiptID", "Date Time", "Total Price", "Money Inserted", "Chance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(receiptTable);

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setText("View receipt");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(yearTextField))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalSalesText, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dropDownMonth, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dayTextField))
                    .addComponent(generateReportBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(yearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dropDownMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(93, 93, 93)
                        .addComponent(generateReportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalSalesText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(46, Short.MAX_VALUE))))
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

    private void dropDownMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropDownMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dropDownMonthActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void generateReportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateReportBtnActionPerformed
         totalSalesText.setText("");
        DefaultTableModel model = (DefaultTableModel)receiptTable.getModel();
        model.setRowCount(0);
        String yearEntered = yearTextField.getText();
        String monthSelected = (String) dropDownMonth.getSelectedItem();
        String dayEntered = dayTextField.getText();
        
        // INVALID INPUT -> reject
            //empty input || month entered only || month and day entered only || day entered only || year & day entered only
            if (("".equals(yearEntered) && "None".equals(monthSelected) && "".equals(dayEntered)) || ("".equals(yearEntered) && !"None".equals(monthSelected) && "".equals(dayEntered)) || ("".equals(yearEntered) && !"None".equals(monthSelected) && !"".equals(dayEntered)) || ("".equals(yearEntered) && "None".equals(monthSelected) && !"".equals(dayEntered)) ||  (!"".equals(yearEntered) && "None".equals(monthSelected) &&!"".equals(dayEntered)) ){
                JOptionPane.showMessageDialog(null, "In order to product annual report, please fill in the year text field only.\n\nIn order to produce monthly report, please fill in the year text field. \n\nIn order to produce daily report, please input all details.", "Incomplete input!",JOptionPane.WARNING_MESSAGE);
                return;
            }

        
        Object[] fetchReceiptRecord = CRUDFileHandling.FetchRecord("src/main/java/com/mycompany/brightvending/files/receipt.txt");
        if (fetchReceiptRecord[0] == "ERROR") {
            JOptionPane.showMessageDialog(null,(String) fetchReceiptRecord[1],(String)fetchReceiptRecord[0],JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        
        // VALID INPUT -> validate and format date
        String formatedDate = "";
        int index = 0;
        // annual report
        if (!"".equals(yearEntered) && "None".equals(monthSelected)&& "".equals(dayEntered) ) {
            
            if (4 !=yearEntered.length()) {
                JOptionPane.showMessageDialog(null,"Invalid year","ALERT",JOptionPane.WARNING_MESSAGE);
                return;
            }
            index = 4;
            jLabel2.setText("Total Sales (Annual)");
//            System.out.println("annual");
//            System.out.println(yearEntered + monthSelected+dayEntered);
            formatedDate = yearEntered;
        }
        // monthly report
        else if (!"".equals(yearEntered) && !"None".equals(monthSelected) && "".equals(dayEntered)) {
            if (4 !=yearEntered.length()) {
                JOptionPane.showMessageDialog(null,"Invalid year","ALERT",JOptionPane.WARNING_MESSAGE);
                return;
            }
            jLabel2.setText("Total Sales (Monthly)");
//            System.out.println("monthly");
//            System.out.println(yearEntered + monthSelected+dayEntered);
            index = 7;
            formatedDate = yearEntered + "/" +monthSelected;
        }
        // daily report
        else if (!"".equals(yearEntered) && !"None".equals(monthSelected) && !"".equals(dayEntered)) {
            System.out.println("daily");
            System.out.println(yearEntered + monthSelected+dayEntered);
            if (4 !=yearEntered.length()) {
                JOptionPane.showMessageDialog(null,"Invalid year","ALERT",JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (dayEntered.length() > 2) {
                 JOptionPane.showMessageDialog(null,"Invalid day","ALERT",JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (dayEntered.length() == 1) {
                dayEntered = "0" + dayEntered;
            }
            index = 10;
            jLabel2.setText("Total Sales (Daily)");
            formatedDate = yearEntered + "/" + monthSelected + "/" + dayEntered;
        }
        boolean isFound = false;
        
        
        //match record
        for (int x = 0; x < fetchReceiptRecord.length; x++) {
            if (x == 0) {
                continue;
            }
            String stringifiedRecord = (String)fetchReceiptRecord[x];
            String[] record =stringifiedRecord .split(";");
            //extract date
            String[] datetime = record[1].split("\\s+");
            String dateForCompare;
            dateForCompare = datetime[0].substring(0,index);
//            System.out.println(dateForCompare);
            if (formatedDate.equals(dateForCompare)) {
//                System.out.println(formatedDate);
                isFound = true;
                model.addRow(record);
            }
        }
//        System.out.println(isFound);
            if (isFound!=true) {
                  JOptionPane.showMessageDialog(null, "No date is matched.");
                  return;
            }
            updateSales();
    }//GEN-LAST:event_generateReportBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int x = receiptTable.getSelectedRow();
        if (x >= 0) {
            DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
            String receiptID = (String) model.getValueAt(x, 0);
            String path = "src/main/java/com/mycompany/brightvending/files/receipt.txt";
            Object[] fetchOneReceipt = CRUDFileHandling.FetchOneRecord(path, receiptID);
            for (Object record : fetchOneReceipt) {
                if (record == "ERROR") {
                    JOptionPane.showMessageDialog(null, record);
                    return;
                }
            }
            String id =fetchOneReceipt[0].toString();
            int idInt = Integer.parseInt(id);
            String receiptDetail = (String)fetchOneReceipt[5];
            String[][] DetailArray = DeepToArray.stringToDeep(receiptDetail);
            receipt getReceipt = new receipt(idInt, (String)fetchOneReceipt[1], DetailArray, (String)fetchOneReceipt[2], (String)fetchOneReceipt[3], (String) fetchOneReceipt[4]);
            getReceipt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            getReceipt.pack();
            getReceipt.setResizable(false);
            getReceipt.setLocationRelativeTo(null);
            getReceipt.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a record from the table first.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

        private static final DecimalFormat dformat = new DecimalFormat("0.00");
        
        private void updateSales() {
            DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
            int numberOfRow = receiptTable.getRowCount();
            double total = 0;
            for (int i=0; i<numberOfRow; i++) {
                String totalAmount = (String) model.getValueAt(i, 2);
                double totalInt = Double.parseDouble(totalAmount);
                total += totalInt;
            }
            String formatedTotal = dformat.format(total);
            totalSalesText.setText(""+formatedTotal);
        }
    
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
            java.util.logging.Logger.getLogger(admin_sales_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_sales_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_sales_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_sales_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_sales_report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField dayTextField;
    private javax.swing.JComboBox<String> dropDownMonth;
    private javax.swing.JButton generateReportBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable receiptTable;
    private javax.swing.JLabel totalSalesText;
    private javax.swing.JTextField yearTextField;
    // End of variables declaration//GEN-END:variables
}