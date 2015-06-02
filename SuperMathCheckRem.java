package jimmykenmerchant.mathforkids_alpha;

import java.math.BigDecimal;

/**
 *
 * @author KENTA ISHII, TOKYO
 * Copyright 2015 KENTA ISHII All Rights Reserved
 * 
 */
class SuperMathCheckRem {
    
    private String pcoanswer = null;
    private String panswer = null;
    private String pcoanswerre = null;
    private String panswerre = null; 
    private BigDecimal coan = new BigDecimal(0);
    private BigDecimal an = new BigDecimal(0);
    
    
    SuperMathCheckRem(String pcoanswer, String pcoanswerre, String panswer, String panswerre) {
       this.pcoanswer = pcoanswer;
       this.pcoanswerre = pcoanswerre;
       this.panswer = panswer;
       this.panswerre = panswerre;    
    }

    // Check the answer and return boolean in the question of division with remainders
    boolean checker() throws Exception {
        BigDecimal pcoan = new BigDecimal(pcoanswer);
        BigDecimal pcoanre = new BigDecimal(pcoanswerre);
        BigDecimal pan = new BigDecimal(panswer);
        BigDecimal panre = new BigDecimal(panswerre);
        if(pcoan.compareTo(pan) == 0 && pcoanre.compareTo(panre) ==0){
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
