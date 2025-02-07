package comp5022project;
import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author William Cuthbert
 */
public class Incomes extends JFrame {
    
    String filePath = "Income Details.csv";
    String balFilePath = "balance.txt", styleFilePath = "styles.txt";
    int coordinateX, coordinateY, mouseX, mouseY, currentColorContent, currentColorBanner;;
    DefaultTableModel model;
    Scanner scan;
    
    public Incomes() throws Exception {
        initComponents();
        this.setLocationRelativeTo(null);
        showRecords();
        readStyles();
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
        Content = new javax.swing.JPanel();
        BalancePanel = new javax.swing.JPanel();
        balance_title = new javax.swing.JLabel();
        IncomePanel = new javax.swing.JPanel();
        income_title = new javax.swing.JLabel();
        ExpensePanel = new javax.swing.JPanel();
        expense_title = new javax.swing.JLabel();
        currentInc = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_of_incomes = new javax.swing.JTable();
        DelButton = new javax.swing.JButton();
        newIncButton = new javax.swing.JButton();
        SettingsPanel = new javax.swing.JPanel();
        setting_title = new javax.swing.JLabel();
        COLOUR = new javax.swing.JLabel();
        Green = new javax.swing.JButton();
        Pink = new javax.swing.JButton();
        White = new javax.swing.JButton();
        Default = new javax.swing.JButton();

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
                .addGap(67, 67, 67)
                .addComponent(Title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BannerLayout.setVerticalGroup(
            BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BannerLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(Title)
                .addContainerGap(52, Short.MAX_VALUE))
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
                .addContainerGap(57, Short.MAX_VALUE))
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
                .addContainerGap(54, Short.MAX_VALUE))
        );
        ExpensePanelLayout.setVerticalGroup(
            ExpensePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExpensePanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(expense_title)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        currentInc.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        currentInc.setForeground(new java.awt.Color(240, 240, 240));
        currentInc.setText("Current Incomes:");

        table_of_incomes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        table_of_incomes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Type of pay", "Frequency", "Date", "Amount"
            }
        ));
        table_of_incomes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        table_of_incomes.setRowHeight(25);
        table_of_incomes.setSelectionBackground(new java.awt.Color(153, 153, 153));
        table_of_incomes.setShowGrid(true);
        jScrollPane1.setViewportView(table_of_incomes);

        DelButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DelButton.setText("Delete an income");
        DelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DelButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DelButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DelButtonMouseExited(evt);
            }
        });

        newIncButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        newIncButton.setText("Add an new income");
        newIncButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newIncButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                newIncButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                newIncButtonMouseExited(evt);
            }
        });

        SettingsPanel.setBackground(new java.awt.Color(51, 51, 255));
        SettingsPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        setting_title.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        setting_title.setForeground(new java.awt.Color(255, 255, 255));
        setting_title.setText("settings: ");

        COLOUR.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        COLOUR.setForeground(new java.awt.Color(255, 255, 255));
        COLOUR.setText("Colours: ");

        Green.setBackground(new java.awt.Color(51, 204, 0));
        Green.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Green.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GreenMouseClicked(evt);
            }
        });

        Pink.setBackground(new java.awt.Color(255, 0, 204));
        Pink.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Pink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PinkMouseClicked(evt);
            }
        });

        White.setBackground(new java.awt.Color(255, 255, 255));
        White.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        White.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WhiteMouseClicked(evt);
            }
        });

        Default.setBackground(new java.awt.Color(0, 0, 255));
        Default.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Default.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DefaultMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SettingsPanelLayout = new javax.swing.GroupLayout(SettingsPanel);
        SettingsPanel.setLayout(SettingsPanelLayout);
        SettingsPanelLayout.setHorizontalGroup(
            SettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SettingsPanelLayout.createSequentialGroup()
                .addGroup(SettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SettingsPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(Default)
                        .addGap(18, 18, 18)
                        .addComponent(Pink)
                        .addGap(18, 18, 18)
                        .addComponent(Green)
                        .addGap(18, 18, 18)
                        .addComponent(White))
                    .addGroup(SettingsPanelLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(COLOUR))
                    .addGroup(SettingsPanelLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(setting_title)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        SettingsPanelLayout.setVerticalGroup(
            SettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SettingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(setting_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(COLOUR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Pink, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(White, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Green, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Default, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addComponent(currentInc, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(newIncButton)
                        .addGap(67, 67, 67)
                        .addComponent(DelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BalancePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IncomePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ExpensePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(SettingsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(currentInc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(BalancePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(IncomePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(ExpensePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newIncButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(SettingsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(Banner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        try {
            Expenses e = new Expenses();
            e.setVisible(true);
            e.pack();
            e.setLocationRelativeTo(null);
            e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(Incomes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ExpensePanelMouseClicked

    private void ExpensePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExpensePanelMouseEntered
        currentColorBanner = Banner.getBackground().getRGB();
        ExpensePanel.setBackground(new Color(currentColorBanner));
    }//GEN-LAST:event_ExpensePanelMouseEntered

    private void ExpensePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExpensePanelMouseExited
        currentColorContent = Content.getBackground().getRGB();
        ExpensePanel.setBackground(new Color(currentColorContent));
    }//GEN-LAST:event_ExpensePanelMouseExited

    private void IncomePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IncomePanelMouseClicked
        try {
            Incomes in = new Incomes();
            in.setVisible(true);
            in.pack();
            in.setLocationRelativeTo(null);
            in.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(Incomes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_IncomePanelMouseClicked

    private void IncomePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IncomePanelMouseEntered
        currentColorBanner = Banner.getBackground().getRGB();
        IncomePanel.setBackground(new Color(currentColorBanner));
    }//GEN-LAST:event_IncomePanelMouseEntered

    private void IncomePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IncomePanelMouseExited
        currentColorContent = Content.getBackground().getRGB();
        IncomePanel.setBackground(new Color(currentColorContent));
    }//GEN-LAST:event_IncomePanelMouseExited

    private void BalancePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BalancePanelMouseClicked
        try {
            Balance b = new Balance();
            b.setVisible(true);
            b.pack();
            b.setLocationRelativeTo(null);
            b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(Incomes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BalancePanelMouseClicked

    private void BalancePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BalancePanelMouseEntered
        currentColorBanner = Banner.getBackground().getRGB();
        BalancePanel.setBackground(new Color(currentColorBanner));
    }//GEN-LAST:event_BalancePanelMouseEntered

    private void BalancePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BalancePanelMouseExited
        currentColorContent = Content.getBackground().getRGB();
        BalancePanel.setBackground(new Color(currentColorContent));
    }//GEN-LAST:event_BalancePanelMouseExited

    private void DelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DelButtonMouseClicked
        try {
            int i = table_of_incomes.getSelectedRow();            
            if (i >= 0) {
                model.removeRow(i);
            }
            saveRecord();
        } catch (Exception ex) {
            Logger.getLogger(Incomes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DelButtonMouseClicked

    private void DelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DelButtonMouseEntered
        DelButton.setBackground(Color.RED);
    }//GEN-LAST:event_DelButtonMouseEntered

    private void DelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DelButtonMouseExited
        DelButton.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_DelButtonMouseExited

    private void newIncButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newIncButtonMouseClicked
        try {
            addIncomeForm aif = new addIncomeForm();
            aif.setVisible(true);
            aif.pack();
            aif.setLocationRelativeTo(null);
            aif.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(Incomes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_newIncButtonMouseClicked

    private void newIncButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newIncButtonMouseEntered
        newIncButton.setBackground(Color.RED);
    }//GEN-LAST:event_newIncButtonMouseEntered

    private void newIncButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newIncButtonMouseExited
        newIncButton.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_newIncButtonMouseExited

    private void GreenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GreenMouseClicked
        if (evt.getSource() == Green) {
            Content.setBackground(new Color(51,204,0));
            Banner.setBackground(new Color(51,153,0));
            BalancePanel.setBackground(new Color(51,204,0));
            IncomePanel.setBackground(new Color(51,204,0));
            ExpensePanel.setBackground(new Color(51,204,0));
            SettingsPanel.setBackground(new Color(51,153,0));
            Title.setForeground(new Color(240,240,240));
            currentInc.setForeground(new Color(240,240,240));
            balance_title.setForeground(new Color(240,240,240));
            income_title.setForeground(new Color(240,240,240));
            expense_title.setForeground(new Color(240,240,240));
            setting_title.setForeground(new Color(240,240,240));
            COLOUR.setForeground(new Color(240,240,240));
            JOptionPane.showMessageDialog(null, "Appearance changed");
            saveStyles(Content.getBackground().getRGB(),Banner.getBackground().getRGB(),Title.getForeground().getRGB());
        } else {
            JOptionPane.showMessageDialog(null, "Appearance change failed");
        }
    }//GEN-LAST:event_GreenMouseClicked

    private void PinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PinkMouseClicked
        if (evt.getSource() == Pink) {
            Content.setBackground(new Color(255,0,204));
            Banner.setBackground(new Color(51,0,51));
            BalancePanel.setBackground(new Color(255,0,204));
            IncomePanel.setBackground(new Color(255,0,204));
            ExpensePanel.setBackground(new Color(255,0,204));
            SettingsPanel.setBackground(new Color(51,0,51));
            Title.setForeground(new Color(240,240,240));
            currentInc.setForeground(new Color(240,240,240));
            balance_title.setForeground(new Color(240,240,240));
            income_title.setForeground(new Color(240,240,240));
            expense_title.setForeground(new Color(240,240,240));
            setting_title.setForeground(new Color(240,240,240));
            COLOUR.setForeground(new Color(240,240,240));
            JOptionPane.showMessageDialog(null, "Appearance changed");
            saveStyles(Content.getBackground().getRGB(),Banner.getBackground().getRGB(),Title.getForeground().getRGB());
        } else {
            JOptionPane.showMessageDialog(null, "Appearance change failed");
        }
    }//GEN-LAST:event_PinkMouseClicked

    private void WhiteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WhiteMouseClicked
        if (evt.getSource() == White) {
            Content.setBackground(new Color(240,240,240));
            Banner.setBackground(new Color(204,204,204));
            BalancePanel.setBackground(new Color(240,240,240));
            IncomePanel.setBackground(new Color(240,240,240));
            ExpensePanel.setBackground(new Color(240,240,240));
            SettingsPanel.setBackground(new Color(204,204,204));
            Title.setForeground(new Color(0,0,0));
            currentInc.setForeground(new Color(0,0,0));
            balance_title.setForeground(new Color(0,0,0));
            income_title.setForeground(new Color(0,0,0));
            expense_title.setForeground(new Color(0,0,0));
            setting_title.setForeground(new Color(0,0,0));
            COLOUR.setForeground(new Color(0,0,0));
            JOptionPane.showMessageDialog(null, "Appearance changed");
            saveStyles(Content.getBackground().getRGB(),Banner.getBackground().getRGB(),Title.getForeground().getRGB());
        } else {
            JOptionPane.showMessageDialog(null, "Appearance change failed");
        }
    }//GEN-LAST:event_WhiteMouseClicked

    private void DefaultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefaultMouseClicked
        if (evt.getSource() == Default) {
            Content.setBackground(new Color(0,0,95));
            Banner.setBackground(new Color(51,51,255));
            BalancePanel.setBackground(new Color(0,0,95));
            IncomePanel.setBackground(new Color(0,0,95));
            ExpensePanel.setBackground(new Color(0,0,95));
            SettingsPanel.setBackground(new Color(51,51,255));
            Title.setForeground(new Color(240,240,240));
            currentInc.setForeground(new Color(240,240,240));
            balance_title.setForeground(new Color(240,240,240));
            income_title.setForeground(new Color(240,240,240));
            expense_title.setForeground(new Color(240,240,240));
            setting_title.setForeground(new Color(240,240,240));
            COLOUR.setForeground(new Color(240,240,240));
            JOptionPane.showMessageDialog(null, "Appearance changed");
            saveStyles(Content.getBackground().getRGB(),Banner.getBackground().getRGB(),Title.getForeground().getRGB());
        } else {
            JOptionPane.showMessageDialog(null, "Appearance change failed");
        }
    }//GEN-LAST:event_DefaultMouseClicked

    public void saveRecord() {
        try {
            FileWriter fw = new FileWriter(filePath);
            BufferedWriter bw = new BufferedWriter(fw);
            
            for (int i = 0; i < table_of_incomes.getRowCount(); i++) {
                for (int j = 0; j < table_of_incomes.getColumnCount(); j++) {
                    bw.write(table_of_incomes.getValueAt(i, j).toString()+",");
                }
                bw.newLine();
            }
            
            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Incomes.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    public void showRecords() throws FileNotFoundException, IOException {
        try {
            BufferedReader br = new BufferedReader(new FileReader("Income Details.csv"));
            model = (DefaultTableModel) table_of_incomes.getModel();
            
            Object[] tableLines = br.lines().toArray();
            
            for(int i = 0; i < tableLines.length; i++) {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(",");
                model.addRow(dataRow);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"No Records");
        }
    }

    void saveStyles(int num1,int num2,int num3) {
        try {
            FileWriter fw = new FileWriter(styleFilePath);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(num1 + "\n" + num2 + "\n" + num3);
            bw.close();
            fw.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Styles not saved");
        }
    }
    
    void readStyles() {
        try {
            int a = 0, b = 0, c = 0;
            scan = new Scanner(new FileReader(styleFilePath));
            while (scan.hasNext()) {
                a = scan.nextInt();
                b = scan.nextInt();
                c = scan.nextInt();
            }
            Content.setBackground(new Color(a));
            Banner.setBackground(new Color(b));
            BalancePanel.setBackground(new Color(a));
            IncomePanel.setBackground(new Color(a));
            ExpensePanel.setBackground(new Color(a));
            SettingsPanel.setBackground(new Color(b));
            Title.setForeground(new Color(c));
            currentInc.setForeground(new Color(c));
            balance_title.setForeground(new Color(c));
            income_title.setForeground(new Color(c));
            expense_title.setForeground(new Color(c));
            setting_title.setForeground(new Color(c));
            COLOUR.setForeground(new Color(c));
            scan.close();
        } catch (Exception ex) {
            
        }
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
                try {
                    new Incomes().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Incomes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BalancePanel;
    private javax.swing.JPanel Banner;
    private javax.swing.JLabel COLOUR;
    private javax.swing.JPanel Content;
    private javax.swing.JButton Default;
    private javax.swing.JButton DelButton;
    private javax.swing.JPanel ExpensePanel;
    private javax.swing.JButton Green;
    private javax.swing.JPanel IncomePanel;
    private javax.swing.JButton Pink;
    private javax.swing.JPanel SettingsPanel;
    private javax.swing.JLabel Title;
    private javax.swing.JButton White;
    private javax.swing.JLabel balance_title;
    private javax.swing.JLabel currentInc;
    private javax.swing.JLabel expense_title;
    private javax.swing.JLabel income_title;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newIncButton;
    private javax.swing.JLabel setting_title;
    private javax.swing.JTable table_of_incomes;
    // End of variables declaration//GEN-END:variables
}
