package com.njxzc.model;

import java.io.Serializable;

/**
 * transformation
 * @author 
 */
public class Transformation implements Serializable {
    private Integer transformid;

    private Integer pid;

    private Integer isclasstf;

    private Integer ismajortf;

    private String classintention;

    private String majorintention;

    private String reason;

    private static final long serialVersionUID = 1L;

    public Integer getTransformid() {
        return transformid;
    }

    public void setTransformid(Integer transformid) {
        this.transformid = transformid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getIsclasstf() {
        return isclasstf;
    }

    public void setIsclasstf(Integer isclasstf) {
        this.isclasstf = isclasstf;
    }

    public Integer getIsmajortf() {
        return ismajortf;
    }

    public void setIsmajortf(Integer ismajortf) {
        this.ismajortf = ismajortf;
    }

    public String getClassintention() {
        return classintention;
    }

    public void setClassintention(String classintention) {
        this.classintention = classintention;
    }

    public String getMajorintention() {
        return majorintention;
    }

    public void setMajorintention(String majorintention) {
        this.majorintention = majorintention;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
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
        Transformation other = (Transformation) that;
        return (this.getTransformid() == null ? other.getTransformid() == null : this.getTransformid().equals(other.getTransformid()))
            && (this.getPid() == null ? other.getPid() == null : this.getPid().equals(other.getPid()))
            && (this.getIsclasstf() == null ? other.getIsclasstf() == null : this.getIsclasstf().equals(other.getIsclasstf()))
            && (this.getIsmajortf() == null ? other.getIsmajortf() == null : this.getIsmajortf().equals(other.getIsmajortf()))
            && (this.getClassintention() == null ? other.getClassintention() == null : this.getClassintention().equals(other.getClassintention()))
            && (this.getMajorintention() == null ? other.getMajorintention() == null : this.getMajorintention().equals(other.getMajorintention()))
            && (this.getReason() == null ? other.getReason() == null : this.getReason().equals(other.getReason()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTransformid() == null) ? 0 : getTransformid().hashCode());
        result = prime * result + ((getPid() == null) ? 0 : getPid().hashCode());
        result = prime * result + ((getIsclasstf() == null) ? 0 : getIsclasstf().hashCode());
        result = prime * result + ((getIsmajortf() == null) ? 0 : getIsmajortf().hashCode());
        result = prime * result + ((getClassintention() == null) ? 0 : getClassintention().hashCode());
        result = prime * result + ((getMajorintention() == null) ? 0 : getMajorintention().hashCode());
        result = prime * result + ((getReason() == null) ? 0 : getReason().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", transformid=").append(transformid);
        sb.append(", pid=").append(pid);
        sb.append(", isclasstf=").append(isclasstf);
        sb.append(", ismajortf=").append(ismajortf);
        sb.append(", classintention=").append(classintention);
        sb.append(", majorintention=").append(majorintention);
        sb.append(", reason=").append(reason);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}