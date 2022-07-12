package com.github.vasim1422.livetemplate7peaks.services

import com.intellij.openapi.project.Project
import com.github.vasim1422.livetemplate7peaks.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
