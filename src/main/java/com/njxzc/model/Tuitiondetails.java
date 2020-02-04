package com.njxzc.model;

import java.io.Serializable;

/**
 * tuitiondetails
 * @author 
 */
public class Tuitiondetails implements Serializable {
    private Integer tdid;

    private Integer sid;

    private Integer pid;

    private Double bookfee;

    private Double datafee;

    private Double meals;

    private String coupon;

    private Double tuition;

    private Integer paymentmethod;

    private static final long serialVersionUID = 1L;

    public Integer getTdid() {
        return tdid;
    }

    public void setTdid(Integer tdid) {
        this.tdid = tdid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Double getBookfee() {
        return bookfee;
    }

    public void setBookfee(Double bookfee) {
        this.bookfee = bookfee;
    }

    public Double getDatafee() {
        return datafee;
    }

    public void setDatafee(Double datafee) {
        this.datafee = datafee;
    }

    public Double getMeals() {
        return meals;
    }

    public void setMeals(Double meals) {
        this.meals = meals;
    }

    public String getCoupon() {
        return coupon;
    }

    public void setCoupon(String coupon) {
        this.coupon = coupon;
    }

    public Double getTuition() {
        return tuition;
    }

    public void setTuition(Double tuition) {
        this.tuition = tuition;
    }

    public Integer getPaymentmethod() {
        return paymentmethod;
    }

    public void setPaymentmethod(Integer paymentmethod) {
        this.paymentmethod = paymentmethod;
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
        Tuitiondetails other = (Tuitiondetails) that;
        return (this.getTdid() == null ? other.getTdid() == null : this.getTdid().equals(other.getTdid()))
            && (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getPid() == null ? other.getPid() == null : this.getPid().equals(other.getPid()))
            && (this.getBookfee() == null ? other.getBookfee() == null : this.getBookfee().equals(other.getBookfee()))
            && (this.getDatafee() == null ? other.getDatafee() == null : this.getDatafee().equals(other.getDatafee()))
            && (this.getMeals() == null ? other.getMeals() == null : this.getMeals().equals(other.getMeals()))
            && (this.getCoupon() == null ? other.getCoupon() == null : this.getCoupon().equals(other.getCoupon()))
            && (this.getTuition() == null ? other.getTuition() == null : this.getTuition().equals(other.getTuition()))
            && (this.getPaymentmethod() == null ? other.getPaymentmethod() == null : this.getPaymentmethod().equals(other.getPaymentmethod()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTdid() == null) ? 0 : getTdid().hashCode());
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getPid() == null) ? 0 : getPid().hashCode());
        result = prime * result + ((getBookfee() == null) ? 0 : getBookfee().hashCode());
        result = prime * result + ((getDatafee() == null) ? 0 : getDatafee().hashCode());
        result = prime * result + ((getMeals() == null) ? 0 : getMeals().hashCode());
        result = prime * result + ((getCoupon() == null) ? 0 : getCoupon().hashCode());
        result = prime * result + ((getTuition() == null) ? 0 : getTuition().hashCode());
        result = prime * result + ((getPaymentmethod() == null) ? 0 : getPaymentmethod().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tdid=").append(tdid);
        sb.append(", sid=").append(sid);
        sb.append(", pid=").append(pid);
        sb.append(", bookfee=").append(bookfee);
        sb.append(", datafee=").append(datafee);
        sb.append(", meals=").append(meals);
        sb.append(", coupon=").append(coupon);
        sb.append(", tuition=").append(tuition);
        sb.append(", paymentmethod=").append(paymentmethod);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}