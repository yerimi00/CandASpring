package com.springmvc.domain;

public class Project {
	private String projectName; //������Ʈ �̸�
	private String projectContent; // ������Ʈ �� ����
	
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
