package com.jhuoose.foodaholic.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Event {

    private int id;
    private String eventName;
    private String description;
    private String location;
    private String startTime; //to Date
    private String endTime;
    private int organizerId;
    private String theme;
    private List<Integer> participantIdList;
    private List<Integer> activityIdList;

    public Event() {
    }

    public Event(int id, String eventName, String description, String location, String startTime, String endTime, int organizerId, String theme, List<Integer> participantIdList, List<Integer> activityIdList) {
        this.id = id;
        this.eventName = eventName;
        this.description = description;
        this.location = location;
        this.startTime = startTime;
        this.endTime = endTime;
        this.organizerId = organizerId;
        this.theme = theme;
        this.participantIdList = participantIdList;
        this.activityIdList = activityIdList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getOrganizerId() {
        return organizerId;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public void setOrganizerId(int organizerId) {
        this.organizerId = organizerId;
    }

    public List<Integer> getParticipantIdList() {
        return participantIdList;
    }

    public void setParticipantIdList(List<Integer> participantIdList) {
        this.participantIdList = participantIdList;
    }

    public List<Integer> getActivityIdList() {
        return activityIdList;
    }

    public void setActivityIdList(List<Integer> activityIdList) {
        this.activityIdList = activityIdList;
    }
}