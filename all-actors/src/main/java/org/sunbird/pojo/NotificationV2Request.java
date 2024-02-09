package org.sunbird.pojo;

import java.util.List;
import java.util.Map;

public class NotificationV2Request {

    private List<String> ids;
    private int priority;
    private String type;
    private Map<String,Object> action;
    private List<String> copyEmail;

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Map<String,Object> getAction() {
        return action;
    }

    public void setAction(Map<String,Object> action) {
        this.action = action;
    }

    public List<String> getCopyEmail() {
        return copyEmail;
    }

    public void setCopyEmail(List<String> copyEmail) {
        this.copyEmail = copyEmail;
    }
}
