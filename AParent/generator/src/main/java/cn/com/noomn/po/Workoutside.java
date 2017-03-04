package cn.com.noomn.po;

public class Workoutside {
    private String workoutsideId;

    private String customId;

    private String employeeId;

    private String commentId;

    private String workoutsideFeedback;

    public String getWorkoutsideId() {
        return workoutsideId;
    }

    public void setWorkoutsideId(String workoutsideId) {
        this.workoutsideId = workoutsideId == null ? null : workoutsideId.trim();
    }

    public String getCustomId() {
        return customId;
    }

    public void setCustomId(String customId) {
        this.customId = customId == null ? null : customId.trim();
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId == null ? null : employeeId.trim();
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId == null ? null : commentId.trim();
    }

    public String getWorkoutsideFeedback() {
        return workoutsideFeedback;
    }

    public void setWorkoutsideFeedback(String workoutsideFeedback) {
        this.workoutsideFeedback = workoutsideFeedback == null ? null : workoutsideFeedback.trim();
    }
}