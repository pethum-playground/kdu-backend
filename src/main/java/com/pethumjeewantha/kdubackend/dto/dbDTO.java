package com.pethumjeewantha.kdubackend.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class dbDTO implements Serializable {
    private String sId;
    private String host;
    private String dc;
    private String oracleVersion;
    private String homeLocation;
    private String dbSize;
    private String backup;
    private LocalDate startDate;
    private LocalDate endDate;
    private String action;
    private String comments;
    private String backupType;
    private String flag;
    private String restore_type;
    private String comments1;
    private String comments2;
    private String commentsState;
    private LocalDate rowVersion;
    private String backupCategory;
    private String processId;

    public dbDTO() {
    }

    public dbDTO(String sId, String host, String dc, String oracleVersion, String homeLocation, String dbSize, String backup, LocalDate startDate, LocalDate endDate, String action, String comments, String backupType, String flag, String restore_type, String comments1, String comments2, String commentsState, LocalDate rowVersion, String backupCategory, String processId) {
        this.sId = sId;
        this.host = host;
        this.dc = dc;
        this.oracleVersion = oracleVersion;
        this.homeLocation = homeLocation;
        this.dbSize = dbSize;
        this.backup = backup;
        this.startDate = startDate;
        this.endDate = endDate;
        this.action = action;
        this.comments = comments;
        this.backupType = backupType;
        this.flag = flag;
        this.restore_type = restore_type;
        this.comments1 = comments1;
        this.comments2 = comments2;
        this.commentsState = commentsState;
        this.rowVersion = rowVersion;
        this.backupCategory = backupCategory;
        this.processId = processId;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public String getOracleVersion() {
        return oracleVersion;
    }

    public void setOracleVersion(String oracleVersion) {
        this.oracleVersion = oracleVersion;
    }

    public String getHomeLocation() {
        return homeLocation;
    }

    public void setHomeLocation(String homeLocation) {
        this.homeLocation = homeLocation;
    }

    public String getDbSize() {
        return dbSize;
    }

    public void setDbSize(String dbSize) {
        this.dbSize = dbSize;
    }

    public String getBackup() {
        return backup;
    }

    public void setBackup(String backup) {
        this.backup = backup;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getBackupType() {
        return backupType;
    }

    public void setBackupType(String backupType) {
        this.backupType = backupType;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getRestore_type() {
        return restore_type;
    }

    public void setRestore_type(String restore_type) {
        this.restore_type = restore_type;
    }

    public String getComments1() {
        return comments1;
    }

    public void setComments1(String comments1) {
        this.comments1 = comments1;
    }

    public String getComments2() {
        return comments2;
    }

    public void setComments2(String comments2) {
        this.comments2 = comments2;
    }

    public String getCommentsState() {
        return commentsState;
    }

    public void setCommentsState(String commentsState) {
        this.commentsState = commentsState;
    }

    public LocalDate getRowVersion() {
        return rowVersion;
    }

    public void setRowVersion(LocalDate rowVersion) {
        this.rowVersion = rowVersion;
    }

    public String getBackupCategory() {
        return backupCategory;
    }

    public void setBackupCategory(String backupCategory) {
        this.backupCategory = backupCategory;
    }

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    @Override
    public String toString() {
        return "dbDTO{" +
                "sId='" + sId + '\'' +
                ", host='" + host + '\'' +
                ", dc='" + dc + '\'' +
                ", oracleVersion='" + oracleVersion + '\'' +
                ", homeLocation='" + homeLocation + '\'' +
                ", dbSize='" + dbSize + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", action='" + action + '\'' +
                ", comments='" + comments + '\'' +
                ", backupType='" + backupType + '\'' +
                ", flag='" + flag + '\'' +
                ", restore_type='" + restore_type + '\'' +
                ", comments1='" + comments1 + '\'' +
                ", comments2='" + comments2 + '\'' +
                ", commentsState='" + commentsState + '\'' +
                ", rowVersion=" + rowVersion +
                ", backupCategory='" + backupCategory + '\'' +
                ", processId='" + processId + '\'' +
                '}';
    }
}
