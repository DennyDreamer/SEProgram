package com.se.program.entities;

public class user {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_name
     *
     * @mbg.generated
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_sex
     *
     * @mbg.generated
     */
    private String userSex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_idcard
     *
     * @mbg.generated
     */
    private String userIdcard;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_nation
     *
     * @mbg.generated
     */
    private String userNation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_phone
     *
     * @mbg.generated
     */
    private String userPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_number
     *
     * @mbg.generated
     */
    private String userNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_password
     *
     * @mbg.generated
     */
    private String userPassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_type
     *
     * @mbg.generated
     */
    private Integer userType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_state
     *
     * @mbg.generated
     */
    private Integer userState;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.department_id
     *
     * @mbg.generated
     */
    private Integer departmentId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_id
     *
     * @return the value of user.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_id
     *
     * @param userId the value for user.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_name
     *
     * @return the value of user.user_name
     *
     * @mbg.generated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_name
     *
     * @param userName the value for user.user_name
     *
     * @mbg.generated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_sex
     *
     * @return the value of user.user_sex
     *
     * @mbg.generated
     */
    public String getUserSex() {
        return userSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_sex
     *
     * @param userSex the value for user.user_sex
     *
     * @mbg.generated
     */
    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_idcard
     *
     * @return the value of user.user_idcard
     *
     * @mbg.generated
     */
    public String getUserIdcard() {
        return userIdcard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_idcard
     *
     * @param userIdcard the value for user.user_idcard
     *
     * @mbg.generated
     */
    public void setUserIdcard(String userIdcard) {
        this.userIdcard = userIdcard == null ? null : userIdcard.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_nation
     *
     * @return the value of user.user_nation
     *
     * @mbg.generated
     */
    public String getUserNation() {
        return userNation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_nation
     *
     * @param userNation the value for user.user_nation
     *
     * @mbg.generated
     */
    public void setUserNation(String userNation) {
        this.userNation = userNation == null ? null : userNation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_phone
     *
     * @return the value of user.user_phone
     *
     * @mbg.generated
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_phone
     *
     * @param userPhone the value for user.user_phone
     *
     * @mbg.generated
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_number
     *
     * @return the value of user.user_number
     *
     * @mbg.generated
     */
    public String getUserNumber() {
        return userNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_number
     *
     * @param userNumber the value for user.user_number
     *
     * @mbg.generated
     */
    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber == null ? null : userNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_password
     *
     * @return the value of user.user_password
     *
     * @mbg.generated
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_password
     *
     * @param userPassword the value for user.user_password
     *
     * @mbg.generated
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_type
     *
     * @return the value of user.user_type
     *
     * @mbg.generated
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_type
     *
     * @param userType the value for user.user_type
     *
     * @mbg.generated
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_state
     *
     * @return the value of user.user_state
     *
     * @mbg.generated
     */
    public Integer getUserState() {
        return userState;
    }

    public user(Integer userId, String userName, String userSex, String userIdcard, String userNation, String userPhone, String userNumber, String userPassword, Integer userType, Integer userState, Integer departmentId) {
        this.userId = userId;
        this.userName = userName;
        this.userSex = userSex;
        this.userIdcard = userIdcard;
        this.userNation = userNation;
        this.userPhone = userPhone;
        this.userNumber = userNumber;
        this.userPassword = userPassword;
        this.userType = userType;
        this.userState = userState;
        this.departmentId = departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_state
     *
     * @param userState the value for user.user_state
     *
     * @mbg.generated
     */
    public void setUserState(Integer userState) {
        this.userState = userState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.department_id
     *
     * @return the value of user.department_id
     *
     * @mbg.generated
     */
    public Integer getDepartmentId() {
        return departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.department_id
     *
     * @param departmentId the value for user.department_id
     *
     * @mbg.generated
     */
    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }
}