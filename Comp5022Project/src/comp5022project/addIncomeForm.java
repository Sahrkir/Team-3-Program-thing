package comp5022project;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author William Cuthbert
 */
public class addIncomeForm extends JFrame {

    User user;
    int coordinateX,coordinateY,mouseX,mouseY;
    
    public addIncomeForm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Firstname2 = new javax.swing.JLabel();
        Banner = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Content = new javax.swing.JPanel();
        BalancePanel = new javax.swing.JPanel();
        balance_title = new javax.swing.JLabel();
        IncomePanel = new javax.swing.JPanel();
        income_title = new javax.swing.JLabel();
        ExpensePanel = new javax.swing.JPanel();
        expense_title = new javax.swing.JLabel();
        addIncome_title = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        when = new javax.swing.JLabel();
        frequency = new javax.swing.JLabel();
        amount = new javax.swing.JLabel();
        incomeValue = new javax.swing.JTextField();
        incAdded = new javax.swing.JButton();

        Firstname2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Firstname2.setForeground(new java.awt.Color(240, 240, 240));
        Firstname2.setText("When is it due:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 800));

        Banner.setBackground(new java.awt.Color(51, 51, 255));
        Banner.setPreferredSize(new java.awt.Dimension(800, 140));
        Banner.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BannerMouseDragged(evt);
            }
        });
        Banner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BannerMousePressed(evt);
            }
        });

        Title.setFont(new java.awt.Font("Felix Titling", 1, 36)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("Expense Manager");

        javax.swing.GroupLayout BannerLayout = new javax.swing.GroupLayout(Banner);
        Banner.setLayout(BannerLayout);
        BannerLayout.setHorizontalGroup(
            BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BannerLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(Title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BannerLayout.setVerticalGroup(
            BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BannerLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(Title)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        Content.setBackground(new java.awt.Color(0, 0, 95));
        Content.setPreferredSize(new java.awt.Dimension(800, 660));

        BalancePanel.setBackground(new java.awt.Color(0, 0, 95));
        BalancePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BalancePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BalancePanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BalancePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BalancePanelMouseExited(evt);
            }
        });

        balance_title.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        balance_title.setForeground(new java.awt.Color(255, 255, 255));
        balance_title.setText("Balance");

        javax.swing.GroupLayout BalancePanelLayout = new javax.swing.GroupLayout(BalancePanel);
        BalancePanel.setLayout(BalancePanelLayout);
        BalancePanelLayout.setHorizontalGroup(
            BalancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BalancePanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(balance_title)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        BalancePanelLayout.setVerticalGroup(
            BalancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BalancePanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(balance_title)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        IncomePanel.setBackground(new java.awt.Color(0, 0, 95));
        IncomePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        IncomePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IncomePanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IncomePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IncomePanelMouseExited(evt);
            }
        });

        income_title.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        income_title.setForeground(new java.awt.Color(255, 255, 255));
        income_title.setText("Incomes");

        javax.swing.GroupLayout IncomePanelLayout = new javax.swing.GroupLayout(IncomePanel);
        IncomePanel.setLayout(IncomePanelLayout);
        IncomePanelLayout.setHorizontalGroup(
            IncomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IncomePanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(income_title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        IncomePanelLayout.setVerticalGroup(
            IncomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IncomePanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(income_title)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        ExpensePanel.setBackground(new java.awt.Color(0, 0, 95));
        ExpensePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ExpensePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExpensePanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExpensePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExpensePanelMouseExited(evt);
            }
        });

        expense_title.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        expense_title.setForeground(new java.awt.Color(255, 255, 255));
        expense_title.setText("Expenses");

        javax.swing.GroupLayout ExpensePanelLayout = new javax.swing.GroupLayout(ExpensePanel);
        ExpensePanel.setLayout(ExpensePanelLayout);
        ExpensePanelLayout.setHorizontalGroup(
            ExpensePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExpensePanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(expense_title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ExpensePanelLayout.setVerticalGroup(
            ExpensePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExpensePanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(expense_title)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        addIncome_title.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        addIncome_title.setForeground(new java.awt.Color(255, 255, 255));
        addIncome_title.setText("Adding Incomes");

        type.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        type.setForeground(new java.awt.Color(240, 240, 240));
        type.setText("Type of payment:");

        when.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        when.setForeground(new java.awt.Color(240, 240, 240));
        when.setText("When is it due:");

        frequency.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        frequency.setForeground(new java.awt.Color(240, 240, 240));
        frequency.setText("How frequent:");

        amount.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        amount.setForeground(new java.awt.Color(240, 240, 240));
        amount.setText("Amount: £");

        incomeValue.setBackground(new java.awt.Color(0, 0, 91));
        incomeValue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        incomeValue.setForeground(new java.awt.Color(240, 240, 240));

        incAdded.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        incAdded.setText("ADD");

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ExpensePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IncomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BalancePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(addIncome_title))
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(incAdded, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ContentLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(when, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ContentLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(frequency, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ContentLayout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(incomeValue, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(addIncome_title)
                .addGap(62, 62, 62)
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addComponent(BalancePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(IncomePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addComponent(type)
                        .addGap(21, 21, 21)
                        .addComponent(when)
                        .addGap(21, 21, 21)
                        .addComponent(frequency)
                        .addGap(21, 21, 21)
                        .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amount)
                            .addComponent(incomeValue, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ExpensePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(incAdded, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)))
                .addGap(244, 244, 244))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Banner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Banner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BannerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BannerMouseDragged
        coordinateX = evt.getXOnScreen();
        coordinateY = evt.getYOnScreen();
        this.setLocation(coordinateX-mouseX, coordinateY-mouseY);
    }//GEN-LAST:event_BannerMouseDragged

    private void BannerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BannerMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_BannerMousePressed

    private void ExpensePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExpensePanelMouseClicked
        Expenses e = new Expenses();
        e.setVisible(true);
        e.pack();
        e.setLocationRelativeTo(null);
        e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_ExpensePanelMouseClicked

    private void ExpensePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExpensePanelMouseEntered
        ExpensePanel.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_ExpensePanelMouseEntered

    private void ExpensePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExpensePanelMouseExited
        ExpensePanel.setBackground(new Color(0,0,95));
    }//GEN-LAST:event_ExpensePanelMouseExited

    private void IncomePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IncomePanelMouseClicked
        Incomes in = new Incomes();
        in.setVisible(true);
        in.pack();
        in.setLocationRelativeTo(null);
        in.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_IncomePanelMouseClicked

    private void IncomePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IncomePanelMouseEntered
        IncomePanel.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_IncomePanelMouseEntered

    private void IncomePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IncomePanelMouseExited
        IncomePanel.setBackground(new Color(0,0,95));
    }//GEN-LAST:event_IncomePanelMouseExited

    private void BalancePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BalancePanelMouseClicked
        Balance b = new Balance();
        b.setVisible(true);
        b.pack();
        b.setLocationRelativeTo(null);
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_BalancePanelMouseClicked

    private void BalancePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BalancePanelMouseEntered
        BalancePanel.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_BalancePanelMouseEntered

    private void BalancePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BalancePanelMouseExited
        BalancePanel.setBackground(new Color(0,0,95));
    }//GEN-LAST:event_BalancePanelMouseExited

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
            java.util.logging.Logger.getLogger(addIncomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addIncomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addIncomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addIncomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addIncomeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BalancePanel;
    private javax.swing.JPanel Banner;
    private javax.swing.JPanel Content;
    private javax.swing.JPanel ExpensePanel;
    private javax.swing.JLabel Firstname2;
    private javax.swing.JPanel IncomePanel;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel addIncome_title;
    private javax.swing.JLabel amount;
    private javax.swing.JLabel balance_title;
    private javax.swing.JLabel expense_title;
    private javax.swing.JLabel frequency;
    private javax.swing.JButton incAdded;
    private javax.swing.JTextField incomeValue;
    private javax.swing.JLabel income_title;
    private javax.swing.JLabel type;
    private javax.swing.JLabel when;
    // End of variables declaration//GEN-END:variables
}
