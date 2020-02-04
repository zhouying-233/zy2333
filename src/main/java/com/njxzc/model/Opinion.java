package com.njxzc.model;

import java.io.Serializable;
import java.util.Date;

/**
 * opinion
 * @author 
 */
public class Opinion implements Serializable {
    private Integer opinionid;

    private Integer pid;

    private String content;

    private Date odate;

    private static final long serialVersionUID = 1L;

    public Integer getOpinionid() {
        return opinionid;
    }

    public void setOpinionid(Integer opinionid) {
        this.opinionid = opinionid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getOdate() {
        return odate;
    }

    public void setOdate(Date odate) {
        this.odate = odate;
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
        Opinion other = (Opinion) that;
        return (this.getOpinionid() == null ? other.getOpinionid() == null : this.getOpinionid().equals(other.getOpinionid()))
            && (this.getPid() == null ? other.getPid() == null : this.getPid().equals(other.getPid()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getOdate() == null ? other.getOdate() == null : this.getOdate().equals(other.getOdate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOpinionid() == null) ? 0 : getOpinionid().hashCode());
        result = prime * result + ((getPid() == null) ? 0 : getPid().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getOdate() == null) ? 0 : getOdate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", opinionid=").append(opinionid);
        sb.append(", pid=").append(pid);
        sb.append(", content=").append(content);
        sb.append(", odate=").append(odate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}