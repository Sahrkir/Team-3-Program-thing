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
        addIncome_title = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        when = new javax.swing.JLabel();
        frequency = new javax.swing.JLabel();
        amount = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        AccountPanel = new javax.swing.JPanel();
        account_title = new javax.swing.JLabel();
        IncomePanel = new javax.swing.JPanel();
        income_title = new javax.swing.JLabel();
        BalancePanel = new javax.swing.JPanel();
        balance_title = new javax.swing.JLabel();
        ExpensePanel = new javax.swing.JPanel();
        expense_title = new javax.swing.JLabel();
        newPanel = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();

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
        Content.setPreferredSize(new java.awt.Dimension(800, 800));

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

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("ADD");

        AccountPanel.setBackground(new java.awt.Color(0, 0, 95));
        AccountPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        AccountPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccountPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AccountPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AccountPanelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AccountPanelMousePressed(evt);
            }
        });

        account_title.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        account_title.setForeground(new java.awt.Color(255, 255, 255));
        account_title.setText("Account");

        javax.swing.GroupLayout AccountPanelLayout = new javax.swing.GroupLayout(AccountPanel);
        AccountPanel.setLayout(AccountPanelLayout);
        AccountPanelLayout.setHorizontalGroup(
            AccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccountPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(account_title)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        AccountPanelLayout.setVerticalGroup(
            AccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccountPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(account_title)
                .addContainerGap(36, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BalancePanelLayout.setVerticalGroup(
            BalancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BalancePanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(balance_title)
                .addContainerGap(39, Short.MAX_VALUE))
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

        newPanel.setBackground(new java.awt.Color(0, 0, 95));
        newPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        newPanel.setPreferredSize(new java.awt.Dimension(166, 104));
        newPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                newPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                newPanelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout newPanelLayout = new javax.swing.GroupLayout(newPanel);
        newPanel.setLayout(newPanelLayout);
        newPanelLayout.setHorizontalGroup(
            newPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        newPanelLayout.setVerticalGroup(
            newPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextField1.setBackground(new java.awt.Color(0, 0, 91));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(240, 240, 240));

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(newPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(ExpensePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BalancePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AccountPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IncomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(addIncome_title))
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
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContentLayout.createSequentialGroup()
                                .addComponent(AccountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(BalancePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(IncomePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ContentLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(addIncome_title)
                                .addGap(48, 48, 48)
                                .addComponent(type)
                                .addGap(21, 21, 21)
                                .addComponent(when)
                                .addGap(21, 21, 21)
                                .addComponent(frequency)
                                .addGap(21, 21, 21)
                                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(amount)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(ExpensePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)))
                .addComponent(newPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Banner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Banner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Content, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void newPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newPanelMouseClicked

    }//GEN-LAST:event_newPanelMouseClicked

    private void newPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newPanelMouseEntered
        newPanel.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_newPanelMouseEntered

    private void newPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newPanelMouseExited
        newPanel.setBackground(new Color(0,0,95));
    }//GEN-LAST:event_newPanelMouseExited

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

    private void AccountPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountPanelMouseClicked
        Account a = new Account();
        a.setVisible(true);
        a.pack();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_AccountPanelMouseClicked

    private void AccountPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountPanelMouseEntered
        AccountPanel.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_AccountPanelMouseEntered

    private void AccountPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountPanelMouseExited
        AccountPanel.setBackground(new Color(0,0,95));
    }//GEN-LAST:event_AccountPanelMouseExited

    private void AccountPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountPanelMousePressed
        AccountPanel.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_AccountPanelMousePressed

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
    private javax.swing.JPanel AccountPanel;
    private javax.swing.JPanel BalancePanel;
    private javax.swing.JPanel Banner;
    private javax.swing.JPanel Content;
    private javax.swing.JPanel ExpensePanel;
    private javax.swing.JLabel Firstname2;
    private javax.swing.JPanel IncomePanel;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel account_title;
    private javax.swing.JLabel addIncome_title;
    private javax.swing.JLabel amount;
    private javax.swing.JLabel balance_title;
    private javax.swing.JLabel expense_title;
    private javax.swing.JLabel frequency;
    private javax.swing.JLabel income_title;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel newPanel;
    private javax.swing.JLabel type;
    private javax.swing.JLabel when;
    // End of variables declaration//GEN-END:variables
}
