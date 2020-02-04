package com.njxzc.model;

import java.io.Serializable;

/**
 * classhour
 * @author 
 */
public class Classhour implements Serializable {
    private Integer classhourid;

    private String major;

    private Integer complete;

    private Integer incompelte;

    private Integer sumhour;

    private static final long serialVersionUID = 1L;

    public Integer getClasshourid() {
        return classhourid;
    }

    public void setClasshourid(Integer classhourid) {
        this.classhourid = classhourid;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Integer getComplete() {
        return complete;
    }

    public void setComplete(Integer complete) {
        this.complete = complete;
    }

    public Integer getIncompelte() {
        return incompelte;
    }

    public void setIncompelte(Integer incompelte) {
        this.incompelte = incompelte;
    }

    public Integer getSumhour() {
        return sumhour;
    }

    public void setSumhour(Integer sumhour) {
        this.sumhour = sumhour;
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
        Classhour other = (Classhour) that;
        return (this.getClasshourid() == null ? other.getClasshourid() == null : this.getClasshourid().equals(other.getClasshourid()))
            && (this.getMajor() == null ? other.getMajor() == null : this.getMajor().equals(other.getMajor()))
            && (this.getComplete() == null ? other.getComplete() == null : this.getComplete().equals(other.getComplete()))
            && (this.getIncompelte() == null ? other.getIncompelte() == null : this.getIncompelte().equals(other.getIncompelte()))
            && (this.getSumhour() == null ? other.getSumhour() == null : this.getSumhour().equals(other.getSumhour()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getClasshourid() == null) ? 0 : getClasshourid().hashCode());
        result = prime * result + ((getMajor() == null) ? 0 : getMajor().hashCode());
        result = prime * result + ((getComplete() == null) ? 0 : getComplete().hashCode());
        result = prime * result + ((getIncompelte() == null) ? 0 : getIncompelte().hashCode());
        result = prime * result + ((getSumhour() == null) ? 0 : getSumhour().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", classhourid=").append(classhourid);
        sb.append(", major=").append(major);
        sb.append(", complete=").append(complete);
        sb.append(", incompelte=").append(incompelte);
        sb.append(", sumhour=").append(sumhour);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}