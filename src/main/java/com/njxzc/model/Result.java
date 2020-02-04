package com.njxzc.model;

import java.io.Serializable;

/**
 * result
 * @author 
 */
public class Result implements Serializable {
    private Integer resultid;

    private Integer transformid;

    private Integer ispass;

    private String noreson;

    private static final long serialVersionUID = 1L;

    public Integer getResultid() {
        return resultid;
    }

    public void setResultid(Integer resultid) {
        this.resultid = resultid;
    }

    public Integer getTransformid() {
        return transformid;
    }

    public void setTransformid(Integer transformid) {
        this.transformid = transformid;
    }

    public Integer getIspass() {
        return ispass;
    }

    public void setIspass(Integer ispass) {
        this.ispass = ispass;
    }

    public String getNoreson() {
        return noreson;
    }

    public void setNoreson(String noreson) {
        this.noreson = noreson;
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
        Result other = (Result) that;
        return (this.getResultid() == null ? other.getResultid() == null : this.getResultid().equals(other.getResultid()))
            && (this.getTransformid() == null ? other.getTransformid() == null : this.getTransformid().equals(other.getTransformid()))
            && (this.getIspass() == null ? other.getIspass() == null : this.getIspass().equals(other.getIspass()))
            && (this.getNoreson() == null ? other.getNoreson() == null : this.getNoreson().equals(other.getNoreson()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getResultid() == null) ? 0 : getResultid().hashCode());
        result = prime * result + ((getTransformid() == null) ? 0 : getTransformid().hashCode());
        result = prime * result + ((getIspass() == null) ? 0 : getIspass().hashCode());
        result = prime * result + ((getNoreson() == null) ? 0 : getNoreson().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", resultid=").append(resultid);
        sb.append(", transformid=").append(transformid);
        sb.append(", ispass=").append(ispass);
        sb.append(", noreson=").append(noreson);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}