package com.github.hqweb.androidtemplat.services

import com.github.hqweb.androidtemplat.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
