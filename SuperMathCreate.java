package jimmykenmerchant.mathforkids_alpha;

import java.math.BigDecimal;
import java.util.Random;

/**
 *
 * @author KENTA ISHII, TOKYO
 * Copyright 2015 KENTA ISHII All Rights Reserved
 * 
 */
class SuperMathCreate {
    final Random ran = new Random();    
    private int qx = 0;
    private int qy = 0;
    private int qz = 0;
    private int qre = 0;
    static int ranadsub = 26; //to overide crossover classes, need to invoke static.
    static int ranmal = 26; //to overide crossover classes, need to invoke static.
    static int randivi = 20; //to overide crossover classes, need to invoke static.
    static int randiviqu = 15; //to overide crossover classes, need to invoke static.
    private BigDecimal decix;
    private BigDecimal deciy;
    private BigDecimal deciz;
    private BigDecimal decia;
    private BigDecimal decib;    
    String createx = null;
    String createy = null;
    String createz = null;
    String creater = null;
    int ope = 0;
    
    // Select creating methods
    void creat() {
        if(SuperMathTest.type == 1){
            if(SuperMathTest.testcondition.level == 1 || SuperMathTest.testcondition.level == 2){
                addcreate();
            }else{
                addcreatedeci();
            }
            ope = 1;
        }else if(SuperMathTest.type == 2){
            if(SuperMathTest.testcondition.level == 1 || SuperMathTest.testcondition.level == 2){
                subcreate();
            }else{
                subcreatedeci();
            }
            ope = 2;
        }else if(SuperMathTest.type == 3){
            if(SuperMathTest.testcondition.level == 1 || SuperMathTest.testcondition.level == 2){
                malcreate();
            }else{
                malcreatedeci();
            }
            ope = 3;
        }else if(SuperMathTest.type == 4){
            if(SuperMathTest.testcondition.level == 1){
                divicreate();
            }else if(SuperMathTest.testcondition.level == 2){
                divirecreate();
            }else if(SuperMathTest.testcondition.level == 3){
                divicreatedeci();
            }
            ope = 4;
        }
    }
    
    // Make question of addition
    private void addcreate() {
        qx = ran.nextInt(ranadsub);
        qy = ran.nextInt(ranadsub);
        qz = qx + qy;
        createx = Integer.toString(qx);
        createy = Integer.toString(qy);
        createz = Integer.toString(qz);
    }
    
    // Make question of subtraction
    private void subcreate() {
        boolean cal = true;
        do{
            qx = ran.nextInt(ranadsub);
            qy = ran.nextInt(ranadsub); 
                if(qx >= qy){
                    cal = false;
                }
            }while(cal);
            qz = qx - qy;
        createx = Integer.toString(qx);
        createy = Integer.toString(qy);
        createz = Integer.toString(qz);            
    }

    // Make question of maltiplication
    private void malcreate() {
        qx = ran.nextInt(ranmal);
        qy = ran.nextInt(ranmal);
        qz = qx * qy;
        createx = Integer.toString(qx);
        createy = Integer.toString(qy);
        createz = Integer.toString(qz);        
    }

    // Make question of division with remainder
    private void divirecreate() {
        boolean cal = true;
        do{
            qy = ran.nextInt(randivi)+1;
            qre = ran.nextInt(randivi); 
                if(qy > qre){
                    cal = false;
                }
        }while(cal);
        qz = ran.nextInt(randiviqu)+1;
        qx = qy * qz + qre;
        createx = Integer.toString(qx);
        createy = Integer.toString(qy);
        createz = Integer.toString(qz);
        creater = Integer.toString(qre);        
    }

    // Make question of division
    private void divicreate() {     
        qy = ran.nextInt(randivi)+1;
        qz = ran.nextInt(randiviqu)+1;
        qx = qy * qz;
        createx = Integer.toString(qx);
        createy = Integer.toString(qy);
        createz = Integer.toString(qz);          
    }

    // Make question of addition with decimals
    private void addcreatedeci() {
        pre();           
        decix = decia;
        deciy = decib;
        deciz = decix.add(deciy);
        
        createx = rounding5(decix);
        createy = rounding5(deciy);
        createz = rounding5(deciz);
        
    }
    
    // Make question of subtraction with decimals
    private void subcreatedeci() {
        boolean cal = true;
        do{
            pre();           
            decix = decia;
            deciy = decib;            
            if(decix.compareTo(deciy) >= 0){
                cal = false;
            }
        }while(cal);
   
        deciz = decix.subtract(deciy);
        
        createx = rounding5(decix);
        createy = rounding5(deciy);
        createz = rounding5(deciz); 
    }
    
    // Make question of maltiplication with decimals    
    private void malcreatedeci() {
        pre();           
        decix = decia;
        deciy = decib;
        
        deciz = decix.multiply(deciy);
        
        createx = rounding5(decix);
        createy = rounding5(deciy);
        createz = rounding5(deciz);                
    }

    // Make question of division with decimals
    private void divicreatedeci() {
        pre();
        deciy = decia;
        deciz = decib;        

        int ara = ran.nextInt(10)-5;// To make -5 to 4 random.
        BigDecimal bb = BigDecimal.valueOf(ara); 
        bb = bb.movePointLeft(3);// to make -0.005 to 0.004 random.
        BigDecimal bc = deciz.add(bb);// To add
        
        decix = deciy.multiply(bc);// To make x
        
        createx = rounding5(decix);
        createy = rounding5(deciy);
        createz = rounding5(deciz);    
    }
    
    // Show correctly
    private String rounding5(BigDecimal deci) {
        BigDecimal gog;
        BigDecimal dcc5 = deci.setScale(5, BigDecimal.ROUND_DOWN);
        BigDecimal dcc4 = deci.setScale(4, BigDecimal.ROUND_DOWN);
        BigDecimal dcc3 = deci.setScale(3, BigDecimal.ROUND_DOWN);
        BigDecimal dcc2 = deci.setScale(2, BigDecimal.ROUND_DOWN);
        BigDecimal dcc1 = deci.setScale(1, BigDecimal.ROUND_DOWN);
        BigDecimal dcc0 = deci.setScale(0, BigDecimal.ROUND_DOWN);

        if(dcc5.compareTo(dcc4) == 0){
            if(dcc5.compareTo(dcc3) == 0){
                if(dcc5.compareTo(dcc2) == 0){
                    if(dcc5.compareTo(dcc1) == 0){
                        if(dcc5.compareTo(dcc0) == 0){
                            gog = dcc0;
                        }else{
                            gog = dcc1;
                        }
                    }else{
                        gog = dcc2;
                    }
                }else{
                    gog = dcc3;
                }
            }else{
                gog = dcc4;          
            }
        }else{
            gog = dcc5;    
        } 
        String dero = String.valueOf(gog);       
        return dero;
    }
    
    // Create numbers with decimals
    private void pre() {
        int ram = 0;
        int divi = 0;
        if(SuperMathTest.type == 1 || SuperMathTest.type == 2){
            ram = ranadsub;
        }else if(SuperMathTest.type == 3){
            ram = ranmal;    
        }else if(SuperMathTest.type == 4){
            ram = randivi;
            divi = 1;
        }
           
        int dca = ran.nextInt(100)+divi;
        BigDecimal dca1 = BigDecimal.valueOf(dca);
        dca1 = dca1.movePointLeft(2);
        int wha = ran.nextInt(ram);
        BigDecimal wha1 = BigDecimal.valueOf(wha);
        decia = dca1.add(wha1);       
            
        int dcb = ran.nextInt(100)+divi;
        BigDecimal dcb1 = BigDecimal.valueOf(dcb);
        dcb1 = dcb1.movePointLeft(2);
        int whb = ran.nextInt(ram);
        BigDecimal whb1 = BigDecimal.valueOf(whb);
        decib = dcb1.add(whb1);
    }
}
