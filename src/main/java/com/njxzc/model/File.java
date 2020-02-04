package com.njxzc.model;

import java.io.Serializable;

/**
 * file
 * @author 
 */
public class File implements Serializable {
    private Integer fileid;

    private Integer sid;

    private Integer tid;

    private String subjectname;

    private String expression;

    private String homework;

    private String activity;

    private String evaluation;

    private static final long serialVersionUID = 1L;

    public Integer getFileid() {
        return fileid;
    }

    public void setFileid(Integer fileid) {
        this.fileid = fileid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getSubjectname() {
        return subjectname;
    }

    public void setSubjectname(String subjectname) {
        this.subjectname = subjectname;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public String getHomework() {
        return homework;
    }

    public void setHomework(String homework) {
        this.homework = homework;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
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
        File other = (File) that;
        return (this.getFileid() == null ? other.getFileid() == null : this.getFileid().equals(other.getFileid()))
            && (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getTid() == null ? other.getTid() == null : this.getTid().equals(other.getTid()))
            && (this.getSubjectname() == null ? other.getSubjectname() == null : this.getSubjectname().equals(other.getSubjectname()))
            && (this.getExpression() == null ? other.getExpression() == null : this.getExpression().equals(other.getExpression()))
            && (this.getHomework() == null ? other.getHomework() == null : this.getHomework().equals(other.getHomework()))
            && (this.getActivity() == null ? other.getActivity() == null : this.getActivity().equals(other.getActivity()))
            && (this.getEvaluation() == null ? other.getEvaluation() == null : this.getEvaluation().equals(other.getEvaluation()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFileid() == null) ? 0 : getFileid().hashCode());
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getTid() == null) ? 0 : getTid().hashCode());
        result = prime * result + ((getSubjectname() == null) ? 0 : getSubjectname().hashCode());
        result = prime * result + ((getExpression() == null) ? 0 : getExpression().hashCode());
        result = prime * result + ((getHomework() == null) ? 0 : getHomework().hashCode());
        result = prime * result + ((getActivity() == null) ? 0 : getActivity().hashCode());
        result = prime * result + ((getEvaluation() == null) ? 0 : getEvaluation().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fileid=").append(fileid);
        sb.append(", sid=").append(sid);
        sb.append(", tid=").append(tid);
        sb.append(", subjectname=").append(subjectname);
        sb.append(", expression=").append(expression);
        sb.append(", homework=").append(homework);
        sb.append(", activity=").append(activity);
        sb.append(", evaluation=").append(evaluation);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}