package cn.com.noomn.po;

public class TaskMember {
    private String taskMemberId;

    private String taskId;

    private String memberId;

    public String getTaskMemberId() {
        return taskMemberId;
    }

    public void setTaskMemberId(String taskMemberId) {
        this.taskMemberId = taskMemberId == null ? null : taskMemberId.trim();
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
    }
}