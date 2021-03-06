/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package gradle.module.plugin

import org.gradle.api.Project
import org.gradle.api.Plugin

/**
 * Module plugin that outputs module tree info for a given project.
 */
class GradleModuleTreePlugin: Plugin<Project> {
    override fun apply(project: Project) {
        // Register a task
        project.tasks.register("module-tree") { task ->
            task.doLast {
                println("------------------------------------------------------------------------");
                println("[MODULE]\n"+ moduleTree(project, 0));
            }
        }
    }

    private fun moduleTree(project: Project, level: Int) {
        val moduleBuilder = StringBuilder();
        for( i in 0..level) {
            moduleBuilder.append("\t");
        }
            moduleBuilder.append("|-");
            moduleBuilder.append("name: " + project.displayName);
            moduleBuilder.append(":" + project.artifacts);
            moduleBuilder.append("@" + project.version);
            println(moduleBuilder.toString());

            project.parent?.let { moduleTree(it, level+1) };
        }
    }
