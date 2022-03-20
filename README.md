## gradle-module-plugin
Gradle plugin for module meta-data.

## Steps to build the gradle plugin:
1. clone the git repo. 
3. set the Java version to 17 in your IDE 
5. execute gradle build

## Steps to use the plugin:
1. include gradle plugin 
```
  id = "gradle.module.plugin.module-info"
        implementationClass = "gradle.module.plugin.GradleModulePlugin"
        
 id = "gradle.module.plugin.module-tree"
        implementationClass = "gradle.module.plugin.GradleModuleTreePlugin"
```        
## Output 

### module-info output 
```------------------------------------------------------------------------
[MODULE]
name: root project 'junit82316567502977769'
artifactId: org.gradle.api.internal.artifacts.dsl.DefaultArtifactHandler_Decorated@167103cb
groupId: 
version: unspecified
Parent: null
dependencies: org.gradle.api.internal.artifacts.dsl.dependencies.DefaultDependencyHandler_Decorated@33c7945b
modules: {}
plugins: [org.gradle.api.plugins.HelpTasksPlugin@1b2cf40f, org.gradle.buildinit.plugins.BuildInitPlugin@3aa4b3c2, org.gradle.buildinit.plugins.WrapperPlugin@30d0d454, gradle.module.plugin.GradleModulePlugin@3f3aeb59]
```

### module-tree output
 
 ```> Task :module-tree
------------------------------------------------------------------------
	|-name: root project 'junit16859174016170123017':org.gradle.api.internal.artifacts.dsl.DefaultArtifactHandler_Decorated@1af35a99@unspecified
[MODULE]
kotlin.Unit
```
## License
MIT

## Chat
[Slack Channel](https://join.slack.com/t/graybytesgrad-5nm5077/shared_invite/zt-15ox4d75e-KCh_wlOtOSb_xNZ68LtAgw) Or email: somayajulaas@gmail.com

## Contributions:
1. Fork the repo and create a pull request.
2. Once approved and reviewed the PR will be merged.
3. Feedback and input as issues or enhancements are always welcome
