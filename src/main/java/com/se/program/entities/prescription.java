package com.se.program.entities;

public class prescription {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column prescription.prescription_id
     *
     * @mbg.generated
     */
    private Integer prescriptionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column prescription.prescription_image
     *
     * @mbg.generated
     */
    private String prescriptionImage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column prescription.form_id
     *
     * @mbg.generated
     */
    private Integer formId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column prescription.prescription_id
     *
     * @return the value of prescription.prescription_id
     *
     * @mbg.generated
     */
    public Integer getPrescriptionId() {
        return prescriptionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column prescription.prescription_id
     *
     * @param prescriptionId the value for prescription.prescription_id
     *
     * @mbg.generated
     */
    public void setPrescriptionId(Integer prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column prescription.prescription_image
     *
     * @return the value of prescription.prescription_image
     *
     * @mbg.generated
     */
    public String getPrescriptionImage() {
        return prescriptionImage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column prescription.prescription_image
     *
     * @param prescriptionImage the value for prescription.prescription_image
     *
     * @mbg.generated
     */
    public void setPrescriptionImage(String prescriptionImage) {
        this.prescriptionImage = prescriptionImage == null ? null : prescriptionImage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column prescription.form_id
     *
     * @return the value of prescription.form_id
     *
     * @mbg.generated
     */
    public Integer getFormId() {
        return formId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column prescription.form_id
     *
     * @param formId the value for prescription.form_id
     *
     * @mbg.generated
     */
    public void setFormId(Integer formId) {
        this.formId = formId;
    }
}