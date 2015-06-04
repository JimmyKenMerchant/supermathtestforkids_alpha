package jimmykenmerchant.mathforkids_alpha;

/**
 *
 * @author KENTA ISHII, TOKYO
 * Copyright 2015 KENTA ISHII All Rights Reserved
 * 
 */
class SuperMathFrameSelect extends javax.swing.JFrame {
    
    SuperMathFrameSelect() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SuperMathTest ForKids α");
        setResizable(false);
        setSize(new java.awt.Dimension(586, 478));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Select Your Test Type");

        jButton1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Addtion !!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Subtraction !!");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("Maltiplication !!");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 0, 0));
        jButton4.setText("Division !!");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 255));
        jButton5.setText("Mix Tests !!");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 255, 0));
        jButton6.setText("Level Settings");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4, jButton5, jButton6});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4, jButton5, jButton6});

        setSize(new java.awt.Dimension(586, 478));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Start addition
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        SuperMathTest.type = 1; //Test Type
        
        // set next menu's location
        SuperMathTest.xypo = SuperMathTest.testselect.getLocation();
        int x = SuperMathTest.xypo.x;
        int y = SuperMathTest.xypo.y;
        SuperMathTest.quest1.setLocation(x, y);
        
        SuperMathTest.quest1.setVisible(true);
        SuperMathTest.quest1.jButton1.doClick();//Auto Click same as Start
    }//GEN-LAST:event_jButton1ActionPerformed

    // Start subtraction
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        SuperMathTest.type = 2; //Test Type
      
        // set next menu's location
        SuperMathTest.xypo = SuperMathTest.testselect.getLocation();
        int x = SuperMathTest.xypo.x;
        int y = SuperMathTest.xypo.y;
        SuperMathTest.quest1.setLocation(x, y);
        
        SuperMathTest.quest1.setVisible(true);
        SuperMathTest.quest1.jButton1.doClick();//Auto Click same as Start      
    }//GEN-LAST:event_jButton2ActionPerformed

    // Start maltiplication
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        SuperMathTest.type = 3; //Test Type
        
        // set next menu's location
        SuperMathTest.xypo = SuperMathTest.testselect.getLocation();
        int x = SuperMathTest.xypo.x;
        int y = SuperMathTest.xypo.y;
        SuperMathTest.quest1.setLocation(x, y);
        
        SuperMathTest.quest1.setVisible(true);
        SuperMathTest.quest1.jButton1.doClick();//Auto Click same as Start 
    }//GEN-LAST:event_jButton3ActionPerformed

    // Start division
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
        SuperMathTest.type = 4; //Test Type
            if(SuperMathTest.testcondition.level == 1 || SuperMathTest.testcondition.level == 3){
                
                // set next menu's location
                SuperMathTest.xypo = SuperMathTest.testselect.getLocation();
                int x = SuperMathTest.xypo.x;
                int y = SuperMathTest.xypo.y;
                SuperMathTest.quest1.setLocation(x, y);                
                
                SuperMathTest.quest1.setVisible(true);
                SuperMathTest.quest1.jButton1.doClick();//Auto Click
            }else if(SuperMathTest.testcondition.level == 2){
                
                // set next menu's location
                SuperMathTest.xypo = SuperMathTest.testselect.getLocation();
                int x = SuperMathTest.xypo.x;
                int y = SuperMathTest.xypo.y;
                SuperMathTest.quest2.setLocation(x, y);                  
                
                SuperMathTest.quest2.setVisible(true);
                SuperMathTest.quest2.jButton1.doClick();//Auto Click               
            }     
    }//GEN-LAST:event_jButton4ActionPerformed

    // Start mixtest
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(false);
        
        // get this munu's location to use the method below
        SuperMathTest.xypo = SuperMathTest.testselect.getLocation(); 
        
        SuperMathTest.rand = true;     
        SuperMathTest.mixtest();
    }//GEN-LAST:event_jButton5ActionPerformed

    // Go to level-status menu
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.setVisible(false);

        // set next menu's location    
        SuperMathTest.xypo = SuperMathTest.testselect.getLocation();
        int x = SuperMathTest.xypo.x;
        int y = SuperMathTest.xypo.y;
        SuperMathTest.testcondition.setLocation(x, y); 

        SuperMathTest.testcondition.setVisible(true);
        SuperMathTest.testcondition.jButton5.doClick();
    }//GEN-LAST:event_jButton6ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
