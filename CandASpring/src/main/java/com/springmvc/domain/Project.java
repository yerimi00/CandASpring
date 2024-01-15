package com.springmvc.domain;

public class Project {
	private String projectName; //프로젝트 이름
	private String projectContent; // 프로젝트 상세 내용
	
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Project(String projectName, String projectContent) {
		super();
		this.projectName = projectName;
		this.projectContent = projectContent;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectContent() {
		return projectContent;
	}
	public void setProjectContent(String projectContent) {
		this.projectContent = projectContent;
	}

}
