package com.njxzc.model;

import java.io.Serializable;

/**
 * student
 * @author 
 */
public class Student implements Serializable {
    private Integer sid;

    private String sname;

    private String sphoto;

    private String spwd;

    private Integer stel;

    private String school;

    private static final long serialVersionUID = 1L;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSphoto() {
        return sphoto;
    }

    public void setSphoto(String sphoto) {
        this.sphoto = sphoto;
    }

    public String getSpwd() {
        return spwd;
    }

    public void setSpwd(String spwd) {
        this.spwd = spwd;
    }

    public Integer getStel() {
        return stel;
    }

    public void setStel(Integer stel) {
        this.stel = stel;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
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
        Student other = (Student) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getSname() == null ? other.getSname() == null : this.getSname().equals(other.getSname()))
            && (this.getSphoto() == null ? other.getSphoto() == null : this.getSphoto().equals(other.getSphoto()))
            && (this.getSpwd() == null ? other.getSpwd() == null : this.getSpwd().equals(other.getSpwd()))
            && (this.getStel() == null ? other.getStel() == null : this.getStel().equals(other.getStel()))
            && (this.getSchool() == null ? other.getSchool() == null : this.getSchool().equals(other.getSchool()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getSname() == null) ? 0 : getSname().hashCode());
        result = prime * result + ((getSphoto() == null) ? 0 : getSphoto().hashCode());
        result = prime * result + ((getSpwd() == null) ? 0 : getSpwd().hashCode());
        result = prime * result + ((getStel() == null) ? 0 : getStel().hashCode());
        result = prime * result + ((getSchool() == null) ? 0 : getSchool().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", sname=").append(sname);
        sb.append(", sphoto=").append(sphoto);
        sb.append(", spwd=").append(spwd);
        sb.append(", stel=").append(stel);
        sb.append(", school=").append(school);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}