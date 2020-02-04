package com.njxzc.model;

import java.io.Serializable;

/**
 * advisory
 * @author 
 */
public class Advisory implements Serializable {
    private Integer aid;

    private String adname;

    private String adcontent;

    private Integer adtel;

    private static final long serialVersionUID = 1L;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAdname() {
        return adname;
    }

    public void setAdname(String adname) {
        this.adname = adname;
    }

    public String getAdcontent() {
        return adcontent;
    }

    public void setAdcontent(String adcontent) {
        this.adcontent = adcontent;
    }

    public Integer getAdtel() {
        return adtel;
    }

    public void setAdtel(Integer adtel) {
        this.adtel = adtel;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Advisory other = (Advisory) that;
        return (this.getAid() == null ? other.getAid() == null : this.getAid().equals(other.getAid()))
            && (this.getAdname() == null ? other.getAdname() == null : this.getAdname().equals(other.getAdname()))
            && (this.getAdcontent() == null ? other.getAdcontent() == null : this.getAdcontent().equals(other.getAdcontent()))
            && (this.getAdtel() == null ? other.getAdtel() == null : this.getAdtel().equals(other.getAdtel()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAid() == null) ? 0 : getAid().hashCode());
        result = prime * result + ((getAdname() == null) ? 0 : getAdname().hashCode());
        result = prime * result + ((getAdcontent() == null) ? 0 : getAdcontent().hashCode());
        result = prime * result + ((getAdtel() == null) ? 0 : getAdtel().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aid=").append(aid);
        sb.append(", adname=").append(adname);
        sb.append(", adcontent=").append(adcontent);
        sb.append(", adtel=").append(adtel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}