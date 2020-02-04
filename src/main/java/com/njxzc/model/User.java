package com.njxzc.model;

import java.io.Serializable;

/**
 * user
 * @author 
 */
public class User implements Serializable {
    private Integer uid;

    private String uname;

    private String uphoto;

    private String upwd;

    private Integer utel;

    private static final long serialVersionUID = 1L;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUphoto() {
        return uphoto;
    }

    public void setUphoto(String uphoto) {
        this.uphoto = uphoto;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public Integer getUtel() {
        return utel;
    }

    public void setUtel(Integer utel) {
        this.utel = utel;
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
        User other = (User) that;
        return (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getUname() == null ? other.getUname() == null : this.getUname().equals(other.getUname()))
            && (this.getUphoto() == null ? other.getUphoto() == null : this.getUphoto().equals(other.getUphoto()))
            && (this.getUpwd() == null ? other.getUpwd() == null : this.getUpwd().equals(other.getUpwd()))
            && (this.getUtel() == null ? other.getUtel() == null : this.getUtel().equals(other.getUtel()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getUname() == null) ? 0 : getUname().hashCode());
        result = prime * result + ((getUphoto() == null) ? 0 : getUphoto().hashCode());
        result = prime * result + ((getUpwd() == null) ? 0 : getUpwd().hashCode());
        result = prime * result + ((getUtel() == null) ? 0 : getUtel().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uid=").append(uid);
        sb.append(", uname=").append(uname);
        sb.append(", uphoto=").append(uphoto);
        sb.append(", upwd=").append(upwd);
        sb.append(", utel=").append(utel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}