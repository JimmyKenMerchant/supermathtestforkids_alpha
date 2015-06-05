package jimmykenmerchant.mathforkids_alpha;

import java.math.BigDecimal;

/**
 *
 * @author KENTA ISHII, TOKYO
 * Copyright 2015 KENTA ISHII All Rights Reserved
 * 
 */
class SuperMathCheck {
    
    private String coanswer = null;
    private String answer = null;
    private BigDecimal coan;
    private BigDecimal an;
       
    SuperMathCheck(String coanswer, String answer) {
       this.coanswer = coanswer;
       this.answer = answer;     
    }
    
    // Check the answer and return boolean
    boolean checker() throws Exception {
        coan = new BigDecimal(coanswer);
        an = new BigDecimal(answer);
        if(coan.compareTo(an) == 0){
            return true;
        }else{
            return false;
        }
    }
}
/*
 * I think should not use "new" in methods because of RAM.
 *   but there may be a unique function of JAVA.
 */
