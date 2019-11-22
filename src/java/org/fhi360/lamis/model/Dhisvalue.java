package org.fhi360.lamis.model;
// Generated Feb 5, 2019 4:59:21 PM by Hibernate Tools 4.3.1

import java.util.Date;

/**
 * Dhisvalue generated by hbm2java
 */

public class Dhisvalue  implements java.io.Serializable {

    private long dhisvalueId;
    private long dataElementId;
    private long categoryId;
    private long stateId;
    private long lgaId;
    private long facilityId;
    private String dataElementIdDhis;
    private String categoryIdDhis;
    private String facilityIdDhis;
    private String period;
    private Integer value;

    public Dhisvalue() {
    }

    public Dhisvalue(long dhisvalueId, long dataElementId, long categoryId, long stateId, long lgaId, long facilityId, String dataElementIdDhis, String categoryIdDhis, String facilityIdDhis, String period, Integer value) {
        this.dhisvalueId = dhisvalueId;
        this.dataElementId = dataElementId;
        this.categoryId = categoryId;
        this.stateId = stateId;
        this.lgaId = lgaId;
        this.facilityId = facilityId;
        this.dataElementIdDhis = dataElementIdDhis;
        this.categoryIdDhis = categoryIdDhis;
        this.facilityIdDhis = facilityIdDhis;
        this.period = period;
        this.value = value;
    }

    public long getDhisvalueId() {
        return dhisvalueId;
    }

    public void setDhisvalueId(long dhisvalueId) {
        this.dhisvalueId = dhisvalueId;
    }

    public long getDataElementId() {
        return dataElementId;
    }

    public void setDataElementId(long dataElementId) {
        this.dataElementId = dataElementId;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public long getStateId() {
        return stateId;
    }

    public void setStateId(long stateId) {
        this.stateId = stateId;
    }

    public long getLgaId() {
        return lgaId;
    }

    public void setLgaId(long lgaId) {
        this.lgaId = lgaId;
    }

    public long getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(long facilityId) {
        this.facilityId = facilityId;
    }

    public String getDataElementIdDhis() {
        return dataElementIdDhis;
    }

    public void setDataElementIdDhis(String dataElementIdDhis) {
        this.dataElementIdDhis = dataElementIdDhis;
    }

    public String getCategoryIdDhis() {
        return categoryIdDhis;
    }

    public void setCategoryIdDhis(String categoryIdDhis) {
        this.categoryIdDhis = categoryIdDhis;
    }

    public String getFacilityIdDhis() {
        return facilityIdDhis;
    }

    public void setFacilityIdDhis(String facilityIdDhis) {
        this.facilityIdDhis = facilityIdDhis;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    
}

