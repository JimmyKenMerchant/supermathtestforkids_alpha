package jimmykenmerchant.mathforkids_alpha;

import java.awt.Color;

/**
 *
 * @author KENTA ISHII, TOKYO
 * Copyright 2015 KENTA ISHII All Rights Reserved
 * 
 */
class SuperMathQuestionRem extends javax.swing.JFrame {   
    String xplace = null;
    String yplace = null;
    String oper = null;
    String question = null;
    String coanswer = null;
    String pcoanswer = null;
    String pcoanswerre = null;
    String answer = null;
    String panswer = null;
    String panswerre = null;
    String judge = "Pass";
    boolean make = true;
    boolean ansd = true;
    boolean chek = true;
    Color cola = new Color(0, 0, 255);
    Color colb = new Color(0, 0, 0);
    Color colc = new Color(150, 150, 150);
    Color cold = new Color(255, 0, 0);
    Color cole = new Color(150, 0, 150);
    Color colf = new Color(255, 200, 255);    
    
    

    SuperMathQuestionRem() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SuperMathTest ForKids α");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(586, 478));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Let's Try!");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jTextField1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jButton1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 255, 0));
        jButton1.setText("Answer This Question");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(150, 150, 150));
        jButton2.setText("Answer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel3.setText("The Answer is...");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel4.setText("The Remainder is...");

        jButton3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(150, 150, 150));
        jButton3.setText("Pass");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jTextField2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(63, 63, 63))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel3, jLabel4});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton2, jButton3});

        setSize(new java.awt.Dimension(586, 478));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /* Make a quesiton
     *   of division with remainders:
     *   This is for auto button.
     */   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(make){
            SuperMathTest.create.creat();
            xplace = SuperMathTest.create.createx;
            yplace = SuperMathTest.create.createy;
            oper = "÷";
            question = xplace + " " + oper + " "+ yplace + " =";
            pcoanswer = SuperMathTest.create.createz;
            pcoanswerre = SuperMathTest.create.creater;
            coanswer = pcoanswer + " R" + pcoanswerre;
            jLabel1.setText("Let's try!");            
            jLabel2.setText(question+ " ? R?");
            jButton2.setForeground(cola);
            jButton2.setText("Answer");
            jButton3.setForeground(colb);
            jButton3.setText("Pass"); 
            int reco = 10 - SuperMathTest.co;
            jLabel5.setText("Last " + reco + " !");
            jTextField1.requestFocusInWindow(); //focous
            make = false;
        }
    }//GEN-LAST:event_jButton1ActionPerformed
        
    // Answer the quesiiton
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         if(ansd){
            if(chek){
                boolean ch = true;
                boolean err = true;
                try{
                panswer = jTextField1.getText();
                panswerre = jTextField2.getText();
                }catch (NullPointerException e){
                    jTextField1.setText(null);
                    jTextField2.setText(null);                      
                    SuperMathTest.popup.setVisible(true);
                    SuperMathTest.popup.jLabel1.setText("Error!");
                    panswer = "?";
                    panswerre = " ?";                   
                    err = false;
                    SuperMathTest.erco++;
                    if(SuperMathTest.erco > 19){
                        System.exit(0);
                    }                                                          
                }
                
                // check whether this answer is too long or not
                int a = panswer.length();
                int b = panswerre.length();
                if(a > 20 || b > 20){
                    panswer = null;
                    panswerre = null;
                }
                
                // check the answer
                SuperMathCheckRem chkre = new SuperMathCheckRem(pcoanswer, pcoanswerre, panswer, panswerre);
                try{                   
                    ch = chkre.checker();
                }catch(Exception e){
                    jTextField1.setText(null);
                    jTextField2.setText(null);                      
                    SuperMathTest.popup.setVisible(true);
                    SuperMathTest.popup.jLabel1.setText("Enter Some Number!");
                    panswer = "?";
                    panswerre = " ?";                   
                    err = false;
                    SuperMathTest.erco++;
                    if(SuperMathTest.erco > 19){
                        System.exit(0);
                    }                             
                }
                answer = panswer + " R" + panswerre;
                jLabel2.setText(question + " " + answer);
                
                // start below if no error
                if(err){
                    if(ch){
                        jLabel1.setText("That's Right!");
                        jTextField1.setText(null);
                        jTextField2.setText(null);                        
                        jButton2.setForeground(colc);
                        jButton3.setForeground(cold);
                        if(SuperMathTest.co < 9){
                            jButton3.setText("Next");
                        }else{
                            jButton3.setText("End");
                        }
                        jButton3.requestFocusInWindow();
                        judge = "Good";
                        ansd = false;
                    }else{
                        jLabel1.setText("Bad Answer!");
                        jTextField1.setText(null);
                        jTextField2.setText(null);                        
                        jButton2.setForeground(cole);
                        jButton2.setText("Why?");
                        judge = "Bad";
                        SuperMathTest.bad++;
                        chek = false;
                    }
                }
                
            // if the answer is incorrect    
            }else{
                jLabel1.setText("That's the Good Answer!");
                jButton2.setForeground(colf);
                if(SuperMathTest.co < 9){
                    jButton3.setText("Next");
                }else{
                    jButton3.setText("End");
                }
                jLabel2.setText(question + " " + coanswer);
                jButton3.requestFocusInWindow();
            }
        }                
    }//GEN-LAST:event_jButton2ActionPerformed

    //Go to next question
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        boolean err = true;        
        if(err){
            if(SuperMathTest.co < 9){
                if(ansd && chek){
                    SuperMathTest.bad++;
                }
                renew();
                this.setVisible(false);                
                SuperMathTest.repeat();
                
            }else{
                if(ansd && chek){
                    SuperMathTest.bad++;
                }
                renew();
                this.setVisible(false);                
                SuperMathTest.testresul.setVisible(true);
                SuperMathTest.testresul.jButton3.doClick();
                SuperMathTest.testresul.jButton1.requestFocusInWindow(); //focous
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    void renew() {
        xplace = null;
        yplace = null;
        oper = null;
        question = null;
        coanswer = null;
        answer = null;
        judge = "Pass";
        make = true;
        ansd = true;
        chek = true;
        jLabel2.setText(null);        
        jTextField1.setText(null);
        jTextField2.setText(null);        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
