package org.fhi360.lamis.model;
// Generated Feb 16, 2013 8:46:48 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Labtestcategory generated by hbm2java
 */
public class Labtestcategory  implements java.io.Serializable {


     private long labtestcategoryId;
     private String category;
     private Set<Labtest> labtests = new HashSet<Labtest>(0);

    public Labtestcategory() {
    }

	
    public Labtestcategory(long labtestcategoryId, String category) {
        this.labtestcategoryId = labtestcategoryId;
        this.category = category;
    }
    public Labtestcategory(long labtestcategoryId, String category, Set<Labtest> labtests) {
       this.labtestcategoryId = labtestcategoryId;
       this.category = category;
       this.labtests = labtests;
    }
   
    public long getLabtestcategoryId() {
        return this.labtestcategoryId;
    }
    
    public void setLabtestcategoryId(long labtestcategoryId) {
        this.labtestcategoryId = labtestcategoryId;
    }
    public String getCategory() {
        return this.category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
    public Set<Labtest> getLabtests() {
        return this.labtests;
    }
    
    public void setLabtests(Set<Labtest> labtests) {
        this.labtests = labtests;
    }




}

