package com.xracoon.teamcat.models.ci;

public class CiTaskInfo {
    private Integer id;
    private String TaskName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTaskName() {
        return TaskName;
    }

    public void setTaskName(String taskName) {
        TaskName = taskName;
    }

    public Integer getProject() {
        return Project;
    }

    public void setProject(Integer project) {
        Project = project;
    }

    public Integer getTaskType() {
        return TaskType;
    }

    public void setTaskType(Integer taskType) {
        TaskType = taskType;
    }

    public String getTaskConfig() {
        return TaskConfig;
    }

    public void setTaskConfig(String taskConfig) {
        TaskConfig = taskConfig;
    }

    public Integer getDeployService() {
        return DeployService;
    }

    public void setDeployService(Integer deployService) {
        DeployService = deployService;
    }

    public Integer getTaskHistory() {
        return TaskHistory;
    }

    public void setTaskHistory(Integer taskHistory) {
        TaskHistory = taskHistory;
    }

    public String getTags() {
        return Tags;
    }

    public void setTags(String tags) {
        Tags = tags;
    }

    public String getLastRunTime() {
        return LastRunTime;
    }

    public void setLastRunTime(String lastRunTime) {
        LastRunTime = lastRunTime;
    }

    public String getSchedule() {
        return Schedule;
    }

    public void setSchedule(String schedule) {
        Schedule = schedule;
    }

    public Integer getCreator() {
        return Creator;
    }

    public void setCreator(Integer creator) {
        Creator = creator;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Integer getBuildVersion() {
        return BuildVersion;
    }

    public void setBuildVersion(Integer buildVersion) {
        BuildVersion = buildVersion;
    }

    public Integer getHistoryCleanStrategy() {
        return HistoryCleanStrategy;
    }

    public void setHistoryCleanStrategy(Integer historyCleanStrategy) {
        HistoryCleanStrategy = historyCleanStrategy;
    }

    private Integer Project;
    private Integer TaskType;
    private String TaskConfig;
    private Integer DeployService;
    private Integer TaskHistory;
    private String Tags;
    private String LastRunTime;
    private String Schedule;
    private Integer Creator;
    private String Description;
    private Integer BuildVersion;
    private Integer HistoryCleanStrategy;
}
