package io.github.zkgroovy

import org.gradle.api.Project
import org.gradle.api.Plugin

class GrailszkGradlePlugin implements Plugin<Project> {
    void apply(Project project) {
        configureSourceSet(project)
    }

    void configureSourceSet(Project project) {
        project.allprojects {
            sourceSets {
                main {
                    resources {
                        srcDir "grails-app/zul"
                    }
                }
            }
        }
    }
}
