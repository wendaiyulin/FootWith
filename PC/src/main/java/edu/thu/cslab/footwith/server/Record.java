package edu.thu.cslab.footwith.server;

import java.sql.Date;

/**
 * Created with IntelliJ IDEA.
 * User: cscg
 * Date: 13-3-16
 * Time: 下午1:44
 * To change this template use File | Settings | File Templates.
 */
public class Record {
    public Record() {
        recordID = -1;
        siteIDs = null;
        startTime = null;
        endTime = null;
        userIDs = null;
        groupNum = -1;
        journals = null;
        pictures = null;
        talkStreamID = -1;
    }
    public Record(int recordID) {
        this.recordID = recordID;
        siteIDs = null;
        startTime = null;
        endTime = null;
        userIDs = null;
        groupNum = -1;
        journals = null;
        pictures = null;
        talkStreamID = -1;
    }

    public Record(String siteIDs, Date startTime, String userIDs, int groupNum) {
         recordID = -1;
        endTime = null;
        journals = null;
        pictures = null;
        talkStreamID = -1;
        this.siteIDs = siteIDs;
        this.startTime = startTime;
        this.userIDs = userIDs;
        this.groupNum = groupNum;

    }

    public Record(int recordID, String siteIDs, Date startTime, Date endTime, String userIDs, int groupNum, String journals, String pictures, int talkStreamID) {
        this.recordID = recordID;
        this.siteIDs = siteIDs;
        this.startTime = startTime;
        this.endTime = endTime;
        this.userIDs = userIDs;
        this.groupNum = groupNum;
        this.journals = journals;
        this.pictures = pictures;
        this.talkStreamID = talkStreamID;
    }

    public int getRecordID() {
        return recordID;
    }

    public String getSiteIDs() {
        return siteIDs;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public String getUserIDs() {
        return userIDs;
    }

    public int getGroupNum() {
        return groupNum;
    }

    public String getJournals() {
        return journals;
    }

    public String getPictures() {
        return pictures;
    }

    public int getTalkStreamID() {
        return talkStreamID;
    }

    public void setSiteIDs(String siteIDs) {
        this.siteIDs = siteIDs;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setUserIDs(String userIDs) {
        this.userIDs = userIDs;
    }

    public void setGroupNum(int groupNum) {
        this.groupNum = groupNum;
    }

    public void setJournals(String journals) {
        this.journals = journals;
    }

    public void setPictures(String pictures) {
        this.pictures = pictures;
    }

    public void setTalkStreamID(int talkStreamID) {
        this.talkStreamID = talkStreamID;
    }

    private int recordID;
    private String siteIDs;
    private Date startTime;
    private Date endTime;
    private String userIDs;
    private int groupNum;
    private String journals;
    private String pictures;
    private int talkStreamID;

}