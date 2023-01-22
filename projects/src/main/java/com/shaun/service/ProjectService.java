package com.shaun.service;

import com.shaun.dao.ProjectDao;
import com.shaun.entity.Project;

public class ProjectService {
  private ProjectDao projectDao = new ProjectDao();
  
  public Project addProject(Project project) {
    return projectDao.insertProject(project);
  }
}