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
    BigDecimal pcoan;
    BigDecimal pcoanre;
    BigDecimal pan;
    BigDecimal panre;
    
    SuperMathCheckRem(String pcoanswer, String pcoanswerre, String panswer, String panswerre) {
       this.pcoanswer = pcoanswer;
       this.pcoanswerre = pcoanswerre;
       this.panswer = panswer;
       this.panswerre = panswerre;    
    }

    // Check the answer and return boolean in the question of division with remainders
    boolean checker() throws Exception {
        pcoan = new BigDecimal(pcoanswer);
        pcoanre = new BigDecimal(pcoanswerre);
        pan = new BigDecimal(panswer);
        panre = new BigDecimal(panswerre);
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
