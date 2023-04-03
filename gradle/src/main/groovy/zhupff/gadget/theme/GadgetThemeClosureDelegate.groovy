package zhupff.gadget.theme

import org.gradle.api.Project
import zhupff.gadget.gradle.ClosureDelegate

class GadgetThemeClosureDelegate extends ClosureDelegate {

    private Project project
    private String version

    @Override
    String name() {
        return "Theme"
    }

    @Override
    void delegate(Project project, Closure closure) {
        this.project = project
        this.version = project.rootProject.ext.GADGET_THEME_VERSION
        delegate(closure)
    }

    def theme(way) {
        project.dependencies.add(way, "com.github.Zhupff.Gadget-Theme:theme:$version")
    }
}