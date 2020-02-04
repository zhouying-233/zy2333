package com.njxzc.model;

import java.io.Serializable;

/**
 * lostteacher
 * @author 
 */
public class Lostteacher implements Serializable {
    private Integer lostteacherid;

    private Integer tid;

    private String losttcause;

    private static final long serialVersionUID = 1L;

    public Integer getLostteacherid() {
        return lostteacherid;
    }

    public void setLostteacherid(Integer lostteacherid) {
        this.lostteacherid = lostteacherid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getLosttcause() {
        return losttcause;
    }

    public void setLosttcause(String losttcause) {
        this.losttcause = losttcause;
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
        Lostteacher other = (Lostteacher) that;
        return (this.getLostteacherid() == null ? other.getLostteacherid() == null : this.getLostteacherid().equals(other.getLostteacherid()))
            && (this.getTid() == null ? other.getTid() == null : this.getTid().equals(other.getTid()))
            && (this.getLosttcause() == null ? other.getLosttcause() == null : this.getLosttcause().equals(other.getLosttcause()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLostteacherid() == null) ? 0 : getLostteacherid().hashCode());
        result = prime * result + ((getTid() == null) ? 0 : getTid().hashCode());
        result = prime * result + ((getLosttcause() == null) ? 0 : getLosttcause().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", lostteacherid=").append(lostteacherid);
        sb.append(", tid=").append(tid);
        sb.append(", losttcause=").append(losttcause);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}