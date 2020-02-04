package com.njxzc.model;

import java.io.Serializable;

/**
 * patriarch
 * @author 
 */
public class Patriarch implements Serializable {
    private Integer pid;

    private String pname;

    private String pphoto;

    private String ppwd;

    private Integer ptel;

    private String paddress;

    private Integer sid;

    private static final long serialVersionUID = 1L;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPphoto() {
        return pphoto;
    }

    public void setPphoto(String pphoto) {
        this.pphoto = pphoto;
    }

    public String getPpwd() {
        return ppwd;
    }

    public void setPpwd(String ppwd) {
        this.ppwd = ppwd;
    }

    public Integer getPtel() {
        return ptel;
    }

    public void setPtel(Integer ptel) {
        this.ptel = ptel;
    }

    public String getPaddress() {
        return paddress;
    }

    public void setPaddress(String paddress) {
        this.paddress = paddress;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
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
        Patriarch other = (Patriarch) that;
        return (this.getPid() == null ? other.getPid() == null : this.getPid().equals(other.getPid()))
            && (this.getPname() == null ? other.getPname() == null : this.getPname().equals(other.getPname()))
            && (this.getPphoto() == null ? other.getPphoto() == null : this.getPphoto().equals(other.getPphoto()))
            && (this.getPpwd() == null ? other.getPpwd() == null : this.getPpwd().equals(other.getPpwd()))
            && (this.getPtel() == null ? other.getPtel() == null : this.getPtel().equals(other.getPtel()))
            && (this.getPaddress() == null ? other.getPaddress() == null : this.getPaddress().equals(other.getPaddress()))
            && (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPid() == null) ? 0 : getPid().hashCode());
        result = prime * result + ((getPname() == null) ? 0 : getPname().hashCode());
        result = prime * result + ((getPphoto() == null) ? 0 : getPphoto().hashCode());
        result = prime * result + ((getPpwd() == null) ? 0 : getPpwd().hashCode());
        result = prime * result + ((getPtel() == null) ? 0 : getPtel().hashCode());
        result = prime * result + ((getPaddress() == null) ? 0 : getPaddress().hashCode());
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pid=").append(pid);
        sb.append(", pname=").append(pname);
        sb.append(", pphoto=").append(pphoto);
        sb.append(", ppwd=").append(ppwd);
        sb.append(", ptel=").append(ptel);
        sb.append(", paddress=").append(paddress);
        sb.append(", sid=").append(sid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}