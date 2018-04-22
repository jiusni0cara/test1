package com.caocao.dtk.domain; /**
  * Copyright 2018 bejson.com 
  */

import java.util.List;

/**
 * Auto-generated: 2018-01-23 18:28:50
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class DTKRootBean {

    private DTKData dtkdata;

    public DTKRootBean() {

    }

    private List<DTKResult> dtkresult;
    public void setData(DTKData dtkdata) {
         this.dtkdata = dtkdata;
     }
     public DTKData getData() {
         return dtkdata;
     }

    public void setResult(List<DTKResult> dtkresult) {
         this.dtkresult = dtkresult;
     }
     public List<DTKResult> getResult() {
         return dtkresult;
     }

}