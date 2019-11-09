package com.se.program.entities;

public class Department {
    private Integer DepId;  //部门ID
    private String OldName ;  //部门曾用名
    private String DepName;   //部门名
    private String DepState;  //部门状态

    public Department() {
    }
    public Department(Integer depId, String oldName, String depName, String depState) {
        DepId = depId;
        OldName = oldName;
        DepName = depName;
        DepState = depState;
    }
    public Integer getDepId() {
        return DepId;
    }

    public String getOldName() {
        return OldName;
    }

    public String getDepName() {
        return DepName;
    }

    public String getDepState() {
        return DepState;
    }

    public void setDepId(Integer depId) {
        DepId = depId;
    }

    public void setOldName(String oldName) {
        OldName = oldName;
    }

    public void setDepName(String depName) {
        DepName = depName;
    }

    public void setDepState(String depState) {
        DepState = depState;
    }

}
