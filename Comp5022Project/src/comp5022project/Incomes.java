package comp5022project;
import javax.swing.*;
import java.awt.*;
import java.time.*;
/**
 *
 * @author William Cuthbert
 */
public class Incomes extends JFrame {
    
    User user;
    int coordinateX,coordinateY,mouseX,mouseY;
    
    public Incomes() {
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

        Banner = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Incomes_title = new javax.swing.JLabel();
        Content = new javax.swing.JPanel();
        trackPanel = new javax.swing.JPanel();
        expense_title1 = new javax.swing.JLabel();
        ExpensePanel = new javax.swing.JPanel();
        expense_title = new javax.swing.JLabel();
        IncomePanel = new javax.swing.JPanel();
        income_title = new javax.swing.JLabel();
        BalancePanel = new javax.swing.JPanel();
        balance_title = new javax.swing.JLabel();
        AccountPanel = new javax.swing.JPanel();
        account_title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        currentIncDetails = new javax.swing.JTextArea();
        currentInc = new javax.swing.JLabel();
        newIncButton = new javax.swing.JButton();

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

        Incomes_title.setFont(new java.awt.Font("Felix Titling", 1, 36)); // NOI18N
        Incomes_title.setForeground(new java.awt.Color(240, 240, 240));
        Incomes_title.setText("Incomes");

        javax.swing.GroupLayout BannerLayout = new javax.swing.GroupLayout(Banner);
        Banner.setLayout(BannerLayout);
        BannerLayout.setHorizontalGroup(
            BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BannerLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(Title)
                .addGap(85, 85, 85)
                .addComponent(Incomes_title)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        BannerLayout.setVerticalGroup(
            BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BannerLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Title)
                    .addComponent(Incomes_title))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        Content.setBackground(new java.awt.Color(0, 0, 95));
        Content.setPreferredSize(new java.awt.Dimension(800, 800));

        trackPanel.setBackground(new java.awt.Color(0, 0, 95));
        trackPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        trackPanel.setPreferredSize(new java.awt.Dimension(166, 104));
        trackPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trackPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                trackPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                trackPanelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                trackPanelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                trackPanelMouseReleased(evt);
            }
        });

        expense_title1.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        expense_title1.setForeground(new java.awt.Color(255, 255, 255));
        expense_title1.setText("track");

        javax.swing.GroupLayout trackPanelLayout = new javax.swing.GroupLayout(trackPanel);
        trackPanel.setLayout(trackPanelLayout);
        trackPanelLayout.setHorizontalGroup(
            trackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trackPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(expense_title1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        trackPanelLayout.setVerticalGroup(
            trackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trackPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(expense_title1)
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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ExpensePanelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ExpensePanelMouseReleased(evt);
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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IncomePanelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                IncomePanelMouseReleased(evt);
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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BalancePanelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BalancePanelMouseReleased(evt);
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
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AccountPanelMouseReleased(evt);
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

        currentIncDetails.setEditable(false);
        currentIncDetails.setColumns(20);
        currentIncDetails.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        currentIncDetails.setRows(5);
        currentIncDetails.setText("Work McDonalds £53.55 13/02/2020 20:45\nLoan Student Finance £1000 27/01/2019 08:31");
        jScrollPane1.setViewportView(currentIncDetails);

        currentInc.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        currentInc.setForeground(new java.awt.Color(240, 240, 240));
        currentInc.setText("Current Incomes:");

        newIncButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        newIncButton.setText("Add a new income");
        newIncButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newIncButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ExpensePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IncomePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BalancePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AccountPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(trackPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(newIncButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentLayout.createSequentialGroup()
                                .addComponent(currentInc, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AccountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(currentInc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addComponent(BalancePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(IncomePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(ExpensePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(trackPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(newIncButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(150, 150, 150))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Banner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void trackPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trackPanelMouseClicked
        trackExpensesForm tef = new trackExpensesForm();
        tef.setVisible(true);
        tef.pack();
        tef.setLocationRelativeTo(null);
        tef.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_trackPanelMouseClicked

    private void trackPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trackPanelMouseEntered
        trackPanel.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_trackPanelMouseEntered

    private void trackPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trackPanelMouseExited
        trackPanel.setBackground(new Color(0,0,91));
    }//GEN-LAST:event_trackPanelMouseExited

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

    private void newIncButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newIncButtonMouseClicked
        
        
        
        
    }//GEN-LAST:event_newIncButtonMouseClicked

    private void BalancePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BalancePanelMousePressed
        BalancePanel.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_BalancePanelMousePressed

    private void IncomePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IncomePanelMousePressed
        IncomePanel.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_IncomePanelMousePressed

    private void ExpensePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExpensePanelMousePressed
        ExpensePanel.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_ExpensePanelMousePressed

    private void AccountPanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountPanelMouseReleased
        AccountPanel.setBackground(new Color(0,0,91));
    }//GEN-LAST:event_AccountPanelMouseReleased

    private void BalancePanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BalancePanelMouseReleased
        BalancePanel.setBackground(new Color(0,0,91));
    }//GEN-LAST:event_BalancePanelMouseReleased

    private void IncomePanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IncomePanelMouseReleased
        IncomePanel.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_IncomePanelMouseReleased

    private void ExpensePanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExpensePanelMouseReleased
        ExpensePanel.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_ExpensePanelMouseReleased

    private void trackPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trackPanelMousePressed
        trackPanel.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_trackPanelMousePressed

    private void trackPanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trackPanelMouseReleased
        trackPanel.setBackground(new Color(0,0,91));
    }//GEN-LAST:event_trackPanelMouseReleased

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
            java.util.logging.Logger.getLogger(Incomes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Incomes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Incomes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Incomes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Incomes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AccountPanel;
    private javax.swing.JPanel BalancePanel;
    private javax.swing.JPanel Banner;
    private javax.swing.JPanel Content;
    private javax.swing.JPanel ExpensePanel;
    private javax.swing.JPanel IncomePanel;
    private javax.swing.JLabel Incomes_title;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel account_title;
    private javax.swing.JLabel balance_title;
    private javax.swing.JLabel currentInc;
    private javax.swing.JTextArea currentIncDetails;
    private javax.swing.JLabel expense_title;
    private javax.swing.JLabel expense_title1;
    private javax.swing.JLabel income_title;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newIncButton;
    private javax.swing.JPanel trackPanel;
    // End of variables declaration//GEN-END:variables
}
