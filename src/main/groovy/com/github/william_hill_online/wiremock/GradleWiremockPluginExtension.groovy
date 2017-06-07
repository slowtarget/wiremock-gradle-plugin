package com.github.william_hill_online.wiremock

class GradleWiremockPluginExtension {

    def dir = "target/classes"
    def params

    protected String[] getAllParams() {
        return String.format("%s%s %s", "--root-dir=", dir, params).split(" ")
    }
}