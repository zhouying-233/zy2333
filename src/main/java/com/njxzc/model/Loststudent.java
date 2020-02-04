package com.njxzc.model;

import java.io.Serializable;

/**
 * loststudent
 * @author 
 */
public class Loststudent implements Serializable {
    private Integer loststudentid;

    private Integer sid;

    private String lostcause;

    private static final long serialVersionUID = 1L;

    public Integer getLoststudentid() {
        return loststudentid;
    }

    public void setLoststudentid(Integer loststudentid) {
        this.loststudentid = loststudentid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getLostcause() {
        return lostcause;
    }

    public void setLostcause(String lostcause) {
        this.lostcause = lostcause;
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
        Loststudent other = (Loststudent) that;
        return (this.getLoststudentid() == null ? other.getLoststudentid() == null : this.getLoststudentid().equals(other.getLoststudentid()))
            && (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getLostcause() == null ? other.getLostcause() == null : this.getLostcause().equals(other.getLostcause()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLoststudentid() == null) ? 0 : getLoststudentid().hashCode());
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getLostcause() == null) ? 0 : getLostcause().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", loststudentid=").append(loststudentid);
        sb.append(", sid=").append(sid);
        sb.append(", lostcause=").append(lostcause);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}