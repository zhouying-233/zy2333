package com.njxzc.model;

import java.io.Serializable;

/**
 * teacher
 * @author 
 */
public class Teacher implements Serializable {
    private Integer tid;

    private String tname;

    private String tphoto;

    private String tpwd;

    private Integer ttel;

    private String taddress;

    private Integer ttime;

    private String wage;

    private static final long serialVersionUID = 1L;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTphoto() {
        return tphoto;
    }

    public void setTphoto(String tphoto) {
        this.tphoto = tphoto;
    }

    public String getTpwd() {
        return tpwd;
    }

    public void setTpwd(String tpwd) {
        this.tpwd = tpwd;
    }

    public Integer getTtel() {
        return ttel;
    }

    public void setTtel(Integer ttel) {
        this.ttel = ttel;
    }

    public String getTaddress() {
        return taddress;
    }

    public void setTaddress(String taddress) {
        this.taddress = taddress;
    }

    public Integer getTtime() {
        return ttime;
    }

    public void setTtime(Integer ttime) {
        this.ttime = ttime;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
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
        Teacher other = (Teacher) that;
        return (this.getTid() == null ? other.getTid() == null : this.getTid().equals(other.getTid()))
            && (this.getTname() == null ? other.getTname() == null : this.getTname().equals(other.getTname()))
            && (this.getTphoto() == null ? other.getTphoto() == null : this.getTphoto().equals(other.getTphoto()))
            && (this.getTpwd() == null ? other.getTpwd() == null : this.getTpwd().equals(other.getTpwd()))
            && (this.getTtel() == null ? other.getTtel() == null : this.getTtel().equals(other.getTtel()))
            && (this.getTaddress() == null ? other.getTaddress() == null : this.getTaddress().equals(other.getTaddress()))
            && (this.getTtime() == null ? other.getTtime() == null : this.getTtime().equals(other.getTtime()))
            && (this.getWage() == null ? other.getWage() == null : this.getWage().equals(other.getWage()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTid() == null) ? 0 : getTid().hashCode());
        result = prime * result + ((getTname() == null) ? 0 : getTname().hashCode());
        result = prime * result + ((getTphoto() == null) ? 0 : getTphoto().hashCode());
        result = prime * result + ((getTpwd() == null) ? 0 : getTpwd().hashCode());
        result = prime * result + ((getTtel() == null) ? 0 : getTtel().hashCode());
        result = prime * result + ((getTaddress() == null) ? 0 : getTaddress().hashCode());
        result = prime * result + ((getTtime() == null) ? 0 : getTtime().hashCode());
        result = prime * result + ((getWage() == null) ? 0 : getWage().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tid=").append(tid);
        sb.append(", tname=").append(tname);
        sb.append(", tphoto=").append(tphoto);
        sb.append(", tpwd=").append(tpwd);
        sb.append(", ttel=").append(ttel);
        sb.append(", taddress=").append(taddress);
        sb.append(", ttime=").append(ttime);
        sb.append(", wage=").append(wage);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}