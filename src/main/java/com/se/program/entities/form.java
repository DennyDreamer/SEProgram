package com.se.program.entities;

import java.util.Date;

public class form {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column form.form_id
     *
     * @mbg.generated
     */
    private Integer formId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column form.form_time
     *
     * @mbg.generated
     */
    private Date formTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column form.form_kind
     *
     * @mbg.generated
     */
    private Integer formKind;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column form.gaizhang_img
     *
     * @mbg.generated
     */
    private String gaizhangImg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column form.teshu_img
     *
     * @mbg.generated
     */
    private String teshuImg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column form.form_text
     *
     * @mbg.generated
     */
    private String formText;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column form.form_id
     *
     * @return the value of form.form_id
     *
     * @mbg.generated
     */
    public Integer getFormId() {
        return formId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column form.form_id
     *
     * @param formId the value for form.form_id
     *
     * @mbg.generated
     */
    public void setFormId(Integer formId) {
        this.formId = formId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column form.form_time
     *
     * @return the value of form.form_time
     *
     * @mbg.generated
     */
    public Date getFormTime() {
        return formTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column form.form_time
     *
     * @param formTime the value for form.form_time
     *
     * @mbg.generated
     */
    public void setFormTime(Date formTime) {
        this.formTime = formTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column form.form_kind
     *
     * @return the value of form.form_kind
     *
     * @mbg.generated
     */
    public Integer getFormKind() {
        return formKind;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column form.form_kind
     *
     * @param formKind the value for form.form_kind
     *
     * @mbg.generated
     */
    public void setFormKind(Integer formKind) {
        this.formKind = formKind;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column form.gaizhang_img
     *
     * @return the value of form.gaizhang_img
     *
     * @mbg.generated
     */
    public String getGaizhangImg() {
        return gaizhangImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column form.gaizhang_img
     *
     * @param gaizhangImg the value for form.gaizhang_img
     *
     * @mbg.generated
     */
    public void setGaizhangImg(String gaizhangImg) {
        this.gaizhangImg = gaizhangImg == null ? null : gaizhangImg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column form.teshu_img
     *
     * @return the value of form.teshu_img
     *
     * @mbg.generated
     */
    public String getTeshuImg() {
        return teshuImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column form.teshu_img
     *
     * @param teshuImg the value for form.teshu_img
     *
     * @mbg.generated
     */
    public void setTeshuImg(String teshuImg) {
        this.teshuImg = teshuImg == null ? null : teshuImg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column form.form_text
     *
     * @return the value of form.form_text
     *
     * @mbg.generated
     */
    public String getFormText() {
        return formText;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column form.form_text
     *
     * @param formText the value for form.form_text
     *
     * @mbg.generated
     */
    public void setFormText(String formText) {
        this.formText = formText == null ? null : formText.trim();
    }
}