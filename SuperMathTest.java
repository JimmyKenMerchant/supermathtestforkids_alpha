package jimmykenmerchant.mathforkids_alpha;

import java.awt.Point;
import java.util.Random;

/**
 *
 * @author KENTA ISHII, TOKYO
 * Copyright 2015 KENTA ISHII All Rights Reserved
 * 
 */
class SuperMathTest {
    static Random ran = new Random();
    static int tp = 0;// how much kids have typed to deremine to close this application
    static int co = 0;// how much kids have quizzes
    static int bad = 0;// how much kids have warong answers
    static int type = 0;// quizzes' type
    static int erco = 0;// count wrong actions to determine to close this application
    static int restar = 0;// count restarts to determine to close this application
    static boolean rand = false;
    static SuperMathCreate create = new SuperMathCreate();
    static SuperMathFrameStart teststar = new SuperMathFrameStart();
    static SuperMathFrameSelect testselect = new SuperMathFrameSelect();
    static SuperMathFrameCondition testcondition = new SuperMathFrameCondition();
    static SuperMathQuestion quest1 = new SuperMathQuestion();
    static SuperMathQuestionRem quest2 = new SuperMathQuestionRem(); 
    static SuperMathFrameResult testresul = new SuperMathFrameResult();
    static Popup popup = new Popup();
    static Point xypo;
    

    // Main to start
    public static void main(String[] args) {    
        teststar.setVisible(true);
        testselect.setVisible(false);
        testcondition.setVisible(false);
        quest1.setVisible(false);
        quest2.setVisible(false);
        testresul.setVisible(false);
        popup.setVisible(false);
    }
    
    static void toquest1() {
        // set next menu's location  
        int x = SuperMathTest.xypo.x;
        int y = SuperMathTest.xypo.y;
        quest1.setLocation(x, y);
        
        quest1.setVisible(true);
        quest1.jButton1.doClick();//Auto Click
    }
    
    static void toquest2() {
        // set next menu's location  
        int x = SuperMathTest.xypo.x;
        int y = SuperMathTest.xypo.y;
        quest2.setLocation(x, y);        
        
        quest2.setVisible(true);  
        quest2.jButton1.doClick();//Auto Click         
    }
    
    // Repeat questions
    static void repeat() {
        co++;
        if(rand){
            mixtest();
        }else{
            if(type == 1 || type == 2 || type == 3){
                toquest1();
            }else if(type == 4){
                if(testcondition.level == 1 || testcondition.level == 3){
                    toquest1();
                }else if(testcondition.level == 2){
                    toquest2();     
                }
            }
        }   
    }

    // For mix test
    static void mixtest() {
        int mix = ran.nextInt(4);
        if(mix == 0){
            type = 1;        
        }else if(mix == 1){
            type = 2;   
        }else if(mix == 2){
            type = 3; 
        }else if(mix == 3){
            type = 4;
        }
        if(type == 1 || type == 2 || type == 3){
            toquest1();
        }else if(type == 4){
            if(testcondition.level == 1 || testcondition.level == 3){
                toquest1();
            }else if(testcondition.level == 2){
                toquest2();
            }
        }
    }
    
    // Restart test
    static void restart() {
        tp = 0; // because of satic variables which can't renew
        co = 0; // because of satic variables which can't renew
        bad = 0; // because of satic variables which can't renew
        type = 0; // because of satic variables which can't renew
        rand = false;
        
        // set next menu's location    
        xypo = testresul.getLocation();
        int x = xypo.x;
        int y = xypo.y;
        teststar.setLocation(x, y);
        
        teststar.setVisible(true);
        testselect.setVisible(false);
        testcondition.setVisible(false);
        quest1.setVisible(false);
        quest2.setVisible(false);
        testresul.setVisible(false);
    }
}