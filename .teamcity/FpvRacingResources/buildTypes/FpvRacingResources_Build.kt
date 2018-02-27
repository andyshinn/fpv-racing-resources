package FpvRacingResources.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.exec
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

object FpvRacingResources_Build : BuildType({
    uuid = "3c58f919-58de-41cd-9145-b446dc3a348f"
    id = "FpvRacingResources_Build"
    name = "Build"

    vcs {
        root(FpvRacingResources.vcsRoots.FpvRacingResources_HttpsGithubComAndyshinnFpvRacingResourcesRefsHeadsMaster)

    }

    steps {
        exec {
            name = "build"
            path = "docker"
            arguments = "run -v %system.teamcity.build.workingDir%:/usr/share/blog publysher/hugo ls -al /usr/share/blog"
        }
    }

    triggers {
        vcs {
        }
    }
})
