package com.njxzc.model;

import java.io.Serializable;
import java.util.Date;

/**
 * homevisit
 * @author 
 */
public class Homevisit implements Serializable {
    private Integer homevisitid;

    private Integer pid;

    private Integer tid;

    private Date visitdate;

    private String vcontent;

    private String feedback;

    private static final long serialVersionUID = 1L;

    public Integer getHomevisitid() {
        return homevisitid;
    }

    public void setHomevisitid(Integer homevisitid) {
        this.homevisitid = homevisitid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Date getVisitdate() {
        return visitdate;
    }

    public void setVisitdate(Date visitdate) {
        this.visitdate = visitdate;
    }

    public String getVcontent() {
        return vcontent;
    }

    public void setVcontent(String vcontent) {
        this.vcontent = vcontent;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
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
        Homevisit other = (Homevisit) that;
        return (this.getHomevisitid() == null ? other.getHomevisitid() == null : this.getHomevisitid().equals(other.getHomevisitid()))
            && (this.getPid() == null ? other.getPid() == null : this.getPid().equals(other.getPid()))
            && (this.getTid() == null ? other.getTid() == null : this.getTid().equals(other.getTid()))
            && (this.getVisitdate() == null ? other.getVisitdate() == null : this.getVisitdate().equals(other.getVisitdate()))
            && (this.getVcontent() == null ? other.getVcontent() == null : this.getVcontent().equals(other.getVcontent()))
            && (this.getFeedback() == null ? other.getFeedback() == null : this.getFeedback().equals(other.getFeedback()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHomevisitid() == null) ? 0 : getHomevisitid().hashCode());
        result = prime * result + ((getPid() == null) ? 0 : getPid().hashCode());
        result = prime * result + ((getTid() == null) ? 0 : getTid().hashCode());
        result = prime * result + ((getVisitdate() == null) ? 0 : getVisitdate().hashCode());
        result = prime * result + ((getVcontent() == null) ? 0 : getVcontent().hashCode());
        result = prime * result + ((getFeedback() == null) ? 0 : getFeedback().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", homevisitid=").append(homevisitid);
        sb.append(", pid=").append(pid);
        sb.append(", tid=").append(tid);
        sb.append(", visitdate=").append(visitdate);
        sb.append(", vcontent=").append(vcontent);
        sb.append(", feedback=").append(feedback);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}