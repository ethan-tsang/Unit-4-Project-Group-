
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/*
 * Programmer:  Andrew Wang (with some verbal assistance from Neil)
 * Date:        24/08/2020
 * File:        PlayerGUI
 * Description: a class for the hand of the players in the blackjack game
 */

public class PlayerGUI extends javax.swing.JFrame {

    double dblBetAmount;
    Boolean blnSplitStatus = false;//whether the player has split yet
    private final int intPlayerNum;
    
    //importing the image icons for panel-buttons
    ImageIcon doubleClicked = new ImageIcon("doubleClicked.png");
    ImageIcon Double = new ImageIcon("double.png");
    ImageIcon hitClicked = new ImageIcon("hitClicked.png");
    ImageIcon hit = new ImageIcon("hit.png");
    ImageIcon splitClicked = new ImageIcon("splitClicked.png");
    ImageIcon split = new ImageIcon("split.png");
    ImageIcon standClicked = new ImageIcon("standClicked.png");
    ImageIcon stand = new ImageIcon("stand.png");
    ImageIcon background = new ImageIcon("table.jpg");
    
    //whether the stand double hit split panel-buttons are active
    boolean blnStand;
    boolean blnSplit;
    boolean blnHit;
    boolean blnDouble;
    
    Main mainMenu;
    /**
     * Creates new form PlayerGUI
     * @param playerNum
     * @param _mainMenu
     */
    public PlayerGUI(int playerNum, Main _mainMenu) {
        initComponents();
 
        mainMenu = _mainMenu;
        //set the status of all panel-buttons to inactive, and the their icons to pressed
        blnDouble = false;
        lblDouble.setIcon(doubleClicked);
        blnHit = false;
        lblHit.setIcon(hitClicked);
        blnSplit = false;
        lblSplit.setIcon(splitClicked);
        blnStand = false;
        lblStand.setIcon(standClicked);
        btnBet.setEnabled(false);
        txtBetInput.setEditable(false);
        
        intPlayerNum = playerNum;// the number assigned by the main to this player
 

        lblNetEarning.setVisible(false);
        
        //tool tips for each of the buttons
        pnlStand.setToolTipText("Holds your total and ends your turn");
        pnlSplit.setToolTipText("Can be done when you have two of the same card, the pair is split into two hands,\n each new hand is worth the original bet, meaning your total bet is doubled");
        pnlHit.setToolTipText("Get another card");
        pnlDouble.setToolTipText("Your bet is doubled, take one more card, and ends your turn");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBetInput = new javax.swing.JTextField();
        btnBet = new javax.swing.JToggleButton();
        txtPlayerMoney = new javax.swing.JTextField();
        lblPlayerMoney = new javax.swing.JLabel();
        pnlCards1 = new javax.swing.JPanel();
        pnlCards2 = new javax.swing.JPanel();
        txtHardTotal = new javax.swing.JTextField();
        txtSoftTotal = new javax.swing.JTextField();
        pnlDouble = new javax.swing.JPanel();
        lblDouble = new javax.swing.JLabel();
        pnlStand = new javax.swing.JPanel();
        lblStand = new javax.swing.JLabel();
        pnlSplit = new javax.swing.JPanel();
        lblSplit = new javax.swing.JLabel();
        pnlHit = new javax.swing.JPanel();
        lblHit = new javax.swing.JLabel();
        lblNetEarning = new javax.swing.JLabel();
        pnlTaskBar = new javax.swing.JPanel();
        lblBackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(817, 900));
        getContentPane().setLayout(null);
        getContentPane().add(txtBetInput);
        txtBetInput.setBounds(170, 30, 110, 26);

        btnBet.setText("Place Bet");
        btnBet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBetActionPerformed(evt);
            }
        });
        getContentPane().add(btnBet);
        btnBet.setBounds(20, 30, 130, 29);

        txtPlayerMoney.setEditable(false);
        getContentPane().add(txtPlayerMoney);
        txtPlayerMoney.setBounds(570, 20, 120, 70);

        lblPlayerMoney.setText("Player money");
        lblPlayerMoney.setOpaque(true);
        getContentPane().add(lblPlayerMoney);
        lblPlayerMoney.setBounds(440, 40, 100, 20);

        pnlCards1.setBackground(new java.awt.Color(255, 255, 255));
        pnlCards1.setOpaque(false);

        javax.swing.GroupLayout pnlCards1Layout = new javax.swing.GroupLayout(pnlCards1);
        pnlCards1.setLayout(pnlCards1Layout);
        pnlCards1Layout.setHorizontalGroup(
            pnlCards1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        pnlCards1Layout.setVerticalGroup(
            pnlCards1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        getContentPane().add(pnlCards1);
        pnlCards1.setBounds(0, 390, 780, 240);

        pnlCards2.setOpaque(false);

        javax.swing.GroupLayout pnlCards2Layout = new javax.swing.GroupLayout(pnlCards2);
        pnlCards2.setLayout(pnlCards2Layout);
        pnlCards2Layout.setHorizontalGroup(
            pnlCards2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        pnlCards2Layout.setVerticalGroup(
            pnlCards2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        getContentPane().add(pnlCards2);
        pnlCards2.setBounds(0, 130, 740, 240);

        txtHardTotal.setEditable(false);
        getContentPane().add(txtHardTotal);
        txtHardTotal.setBounds(590, 700, 130, 26);

        txtSoftTotal.setEditable(false);
        getContentPane().add(txtSoftTotal);
        txtSoftTotal.setBounds(70, 700, 140, 26);

        pnlDouble.setOpaque(false);
        pnlDouble.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlDoubleMouseClicked(evt);
            }
        });

        lblDouble.setIcon(doubleClicked); // NOI18N

        javax.swing.GroupLayout pnlDoubleLayout = new javax.swing.GroupLayout(pnlDouble);
        pnlDouble.setLayout(pnlDoubleLayout);
        pnlDoubleLayout.setHorizontalGroup(
            pnlDoubleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDouble)
        );
        pnlDoubleLayout.setVerticalGroup(
            pnlDoubleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDouble)
        );

        getContentPane().add(pnlDouble);
        pnlDouble.setBounds(590, 790, 220, 80);

        pnlStand.setOpaque(false);
        pnlStand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlStandMouseClicked(evt);
            }
        });

        lblStand.setIcon(stand); // NOI18N

        javax.swing.GroupLayout pnlStandLayout = new javax.swing.GroupLayout(pnlStand);
        pnlStand.setLayout(pnlStandLayout);
        pnlStandLayout.setHorizontalGroup(
            pnlStandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlStandLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblStand))
        );
        pnlStandLayout.setVerticalGroup(
            pnlStandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblStand)
        );

        getContentPane().add(pnlStand);
        pnlStand.setBounds(380, 790, 197, 80);

        pnlSplit.setOpaque(false);
        pnlSplit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlSplitMouseClicked(evt);
            }
        });

        lblSplit.setIcon(split); // NOI18N

        javax.swing.GroupLayout pnlSplitLayout = new javax.swing.GroupLayout(pnlSplit);
        pnlSplit.setLayout(pnlSplitLayout);
        pnlSplitLayout.setHorizontalGroup(
            pnlSplitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
            .addGroup(pnlSplitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlSplitLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblSplit)
                    .addGap(0, 1, Short.MAX_VALUE)))
        );
        pnlSplitLayout.setVerticalGroup(
            pnlSplitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(pnlSplitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlSplitLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblSplit)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(pnlSplit);
        pnlSplit.setBounds(20, 790, 180, 80);

        pnlHit.setOpaque(false);
        pnlHit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlHitMouseClicked(evt);
            }
        });

        lblHit.setIcon(hit); // NOI18N
        

        javax.swing.GroupLayout pnlHitLayout = new javax.swing.GroupLayout(pnlHit);
        pnlHit.setLayout(pnlHitLayout);
        pnlHitLayout.setHorizontalGroup(
            pnlHitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHit)
        );
        pnlHitLayout.setVerticalGroup(
            pnlHitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHit)
        );

        getContentPane().add(pnlHit);
        pnlHit.setBounds(210, 790, 160, 80);

        lblNetEarning.setOpaque(true);
        getContentPane().add(lblNetEarning);
        lblNetEarning.setBounds(300, 660, 170, 70);

        pnlTaskBar.setBackground(new java.awt.Color(255, 255, 255));
        pnlTaskBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));

        javax.swing.GroupLayout pnlTaskBarLayout = new javax.swing.GroupLayout(pnlTaskBar);
        pnlTaskBar.setLayout(pnlTaskBarLayout);
        pnlTaskBarLayout.setHorizontalGroup(
            pnlTaskBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        pnlTaskBarLayout.setVerticalGroup(
            pnlTaskBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        getContentPane().add(pnlTaskBar);
        pnlTaskBar.setBounds(0, 720, 820, 180);

        lblBackGround.setIcon(background); // NOI18N
        getContentPane().add(lblBackGround);
        lblBackGround.setBounds(0, 0, 820, 900);
        setVisible(true);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // enabled betting
    public void startBet(){
        btnBet.setEnabled(true);
        txtBetInput.setEditable(true);
        blnSplitStatus = false;
        
        setDisableAll();
        btnBet.setEnabled(true);
        // resetting the layout
        pnlCards1.setLayout(new FlowLayout());
        pnlCards1.removeAll();
        pnlCards2.setLayout(new FlowLayout());
        pnlCards2.removeAll();
        pnlCards1.validate();
        pnlCards1.repaint();
        pnlCards2.validate();
        pnlCards2.repaint();
        txtHardTotal.setText("");
        txtSoftTotal.setText("");
        lblNetEarning.setText("");
    }
    
    public void startPlay(){
        // calling on game deck to deal this player cards
        Player player = mainMenu.gameDeck.deal(intPlayerNum);
        blnStand = true;
        lblStand.setIcon(stand);
        blnHit = true;
        lblHit.setIcon(hit);
        blnDouble = true;
        lblDouble.setIcon(Double);
        // if the player hits a blackjack
        if(player.softTotal == 21){
            setDisableAll();
            mainMenu.setFinishedPlay(intPlayerNum);
            pnlCards1.setLayout(new FlowLayout());
            pnlCards1.removeAll();
            pnlCards2.setLayout(new FlowLayout());
            pnlCards2.removeAll();
            blnSplitStatus = false;
        }
        // resetting the layout
            pnlCards1.setLayout(new FlowLayout());
            pnlCards1.removeAll();
            
            // printing the cards in hand onto the screen
            for(int i = 0; i<player.hand.size(); i++){
                JLabel card = new JLabel("");
                card.setIcon(mainMenu.arrayCardIcons[player.hand.get(i)]);
                pnlCards1.add(card);
            }
            pnlCards1.validate();
            pnlCards1.repaint();
        
        // outputing all the player's scores
        txtHardTotal.setText("Hard total: " + player.hardTotal + " Points");
        txtSoftTotal.setText("Soft total: " + player.softTotal + " Points");
        txtPlayerMoney.setText(""+player.money);
        
        // if the player has two of the same card, it enables spliting
        if(player.hand.get(0) % 13 == player.hand.get(1) % 13){
            // btnSplit.setEnabled(true);
            blnSplit = true;
            lblSplit.setIcon(split);
        }
    }
    
    // disables all the buttons
    public void setDisableAll(){
        blnStand = false;
        lblStand.setIcon(standClicked);
        blnHit = false;
        lblHit.setIcon(hitClicked);
        blnDouble = false;
        lblDouble.setIcon(doubleClicked);
        blnSplit = false;
        lblSplit.setIcon(splitClicked);
    }
    
    // tells the player how much they won or lost
    public void getPayout(){
        Player player = mainMenu.gameDeck.payout(intPlayerNum);
        lblNetEarning.setVisible(true);
        // seeing if the player won or lost, which determines whether they win their bet amount or lose it.
        if(player.winAmount > 0){
            lblNetEarning.setText("+$" + Math.abs(player.winAmount) + " you won!");
        } else if (player.winAmount == 0) {
            lblNetEarning.setText("$0 You tied!");
        } else {
            lblNetEarning.setText("-$" + Math.abs(player.winAmount) + " You lost!");
        }
    }
    private void btnBetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBetActionPerformed
        try{
            // sends the inputed player bet amount to mainMenu.gameDeck
            dblBetAmount = Integer.parseInt(txtBetInput.getText());
            mainMenu.gameDeck.bet(intPlayerNum, dblBetAmount);
            mainMenu.setFinishedBet(intPlayerNum);
            btnBet.setEnabled(false);
            } catch (Exception e) {
            txtBetInput.setText("Error");
            }
    }//GEN-LAST:event_btnBetActionPerformed

    private void pnlDoubleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDoubleMouseClicked
        // checks if the double button is active
        if(blnDouble){
            Player player = mainMenu.gameDeck.doubleDown(intPlayerNum);// calling the doubleDown function from mainMenu.gameDeck
            
            // resetting the layout
            pnlCards1.setLayout(new FlowLayout());
            pnlCards1.removeAll();
            
            // printing the cards in hand onto the screen
            for(int i = 0; i<player.hand.size(); i++){
                JLabel card = new JLabel("");
                card.setIcon(mainMenu.arrayCardIcons[player.hand.get(i)]);
                pnlCards1.add(card);
            }
            pnlCards1.validate();
            pnlCards1.repaint();
            
            // updating totals
            txtHardTotal.setText("Hard total: " + player.hardTotal + " Points");
            txtSoftTotal.setText("Soft total: " + player.softTotal + " Points");
            
            // ends the turn and disables all the buttons
            mainMenu.setFinishedPlay(intPlayerNum);
            setDisableAll();
        }
    }//GEN-LAST:event_pnlDoubleMouseClicked

    private void pnlHitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHitMouseClicked
        // checks if the hit button is active
        if(blnHit){
            Player player = mainMenu.gameDeck.getPlayer(intPlayerNum);
            
            // checks if the player has split yet
            if(blnSplitStatus){
                if(!player.playSplitHand){//checks if the player has standed or busted the first hand
                    player = mainMenu.gameDeck.hit(intPlayerNum);
                    pnlCards1.setLayout(new FlowLayout());// src: https://stackoverflow.com/questions/14030124/how-to-dynamically-add-jlabels-to-jpanel
                    pnlCards1.removeAll();
                    for(int i = 0; i<player.hand.size(); i++){
                        JLabel card = new JLabel("");
                        card.setIcon(mainMenu.arrayCardIcons[player.splitHand.get(i)]);
                        pnlCards1.add(card);
                    }
                    pnlCards1.validate();
                    pnlCards1.repaint();
                    
                    // updating totals
                    txtHardTotal.setText("Hard total: " + player.hardTotal + " Points");
                    txtSoftTotal.setText("Soft total: " + player.softTotal + " Points");
                } else {
                    player = mainMenu.gameDeck.hit(intPlayerNum);
                    
                    //reseting the layout on the second hand
                    pnlCards2.setLayout(new FlowLayout());// src: https://stackoverflow.com/questions/14030124/how-to-dynamically-add-jlabels-to-jpanel
                    pnlCards2.removeAll();
                    for(int i = 0; i<player.hand.size(); i++){
                        JLabel card = new JLabel("");
                        card.setIcon(mainMenu.arrayCardIcons[player.hand.get(i)]);
                        pnlCards2.add(card);
                    }
                    pnlCards2.validate();
                    pnlCards2.repaint();
                }
            } else {// if the player hasn't split
                player = mainMenu.gameDeck.hit(intPlayerNum);
                // src: https://stackoverflow.com/questions/14030124/how-to-dynamically-add-jlabels-to-jpanel
                pnlCards1.removeAll();
                for(int i = 0; i<player.hand.size(); i++){
                    JLabel card = new JLabel("");
                    card.setIcon(mainMenu.arrayCardIcons[player.hand.get(i)]);
                    pnlCards1.add(card);
                }
                pnlCards1.validate();
                pnlCards1.repaint();
                if(player.hardTotal>21){
                    setDisableAll();
                    mainMenu.setFinishedPlay(intPlayerNum);
                }
                blnDouble = false;
                lblDouble.setIcon(doubleClicked);
                blnSplit = false;
                lblSplit.setIcon(splitClicked);
                
                // updating totals
                txtHardTotal.setText("Hard total: " + player.hardTotal + " Points");
                txtSoftTotal.setText("Soft total: " + player.softTotal + " Points");
            }
        }
    }//GEN-LAST:event_pnlHitMouseClicked

    private void pnlSplitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSplitMouseClicked
        // determines if the split button is active
        if(blnSplit){
            Player player = mainMenu.gameDeck.split(intPlayerNum);
            blnSplitStatus = true;
            JLabel card = new JLabel("");
            card.setIcon(mainMenu.arrayCardIcons[player.splitHand.get(0)]);
            pnlCards2.add(card);
            pnlCards2.validate();
            pnlCards2.repaint();
            
            // resets hand 1
            pnlCards1.setLayout(new FlowLayout());
            pnlCards1.removeAll();
            pnlCards1.validate();
            pnlCards1.repaint();
            
            card.setIcon(mainMenu.arrayCardIcons[player.hand.get(0)]);
            pnlCards1.add(card);
            pnlCards1.validate();
            pnlCards1.repaint();
        }
    }//GEN-LAST:event_pnlSplitMouseClicked

    private void pnlStandMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlStandMouseClicked
        // when the user clicks stand
        if(blnStand){// determines if the button is active
            Player player = mainMenu.gameDeck.getPlayer(intPlayerNum);
            if (blnSplitStatus) {
                if(!player.playSplitHand){
                    mainMenu.gameDeck.standSplitHand(intPlayerNum);
                } else {
                    mainMenu.setFinishedPlay(intPlayerNum);
                    setDisableAll();
                }
            }else{
                mainMenu.setFinishedPlay(intPlayerNum);
                setDisableAll();
            }
        }
    }//GEN-LAST:event_pnlStandMouseClicked


    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnBet;
    private javax.swing.JLabel lblBackGround;
    private javax.swing.JLabel lblDouble;
    private javax.swing.JLabel lblHit;
    private javax.swing.JLabel lblNetEarning;
    private javax.swing.JLabel lblPlayerMoney;
    private javax.swing.JLabel lblSplit;
    private javax.swing.JLabel lblStand;
    private javax.swing.JPanel pnlCards1;
    private javax.swing.JPanel pnlCards2;
    private javax.swing.JPanel pnlDouble;
    private javax.swing.JPanel pnlHit;
    private javax.swing.JPanel pnlSplit;
    private javax.swing.JPanel pnlStand;
    private javax.swing.JPanel pnlTaskBar;
    private javax.swing.JTextField txtBetInput;
    private javax.swing.JTextField txtHardTotal;
    private javax.swing.JTextField txtPlayerMoney;
    private javax.swing.JTextField txtSoftTotal;
    // End of variables declaration//GEN-END:variables
}
