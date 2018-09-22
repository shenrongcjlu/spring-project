package com.shenrong.pojo;

public class UserPojo {
    private String roleName;
    private String note;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "UserPojo{" +
                "roleName='" + roleName + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
