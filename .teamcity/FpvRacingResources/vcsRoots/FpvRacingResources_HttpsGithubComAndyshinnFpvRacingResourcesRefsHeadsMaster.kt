package FpvRacingResources.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.vcs.GitVcsRoot

object FpvRacingResources_HttpsGithubComAndyshinnFpvRacingResourcesRefsHeadsMaster : GitVcsRoot({
    uuid = "647549e9-7e6c-46e4-9984-2d7ba90afaf2"
    id = "FpvRacingResources_HttpsGithubComAndyshinnFpvRacingResourcesRefsHeadsMaster"
    name = "https://github.com/andyshinn/fpv-racing-resources#refs/heads/master"
    url = "https://github.com/andyshinn/fpv-racing-resources"
    authMethod = password {
        userName = "andyshinn"
        password = "credentialsJSON:14c2a84b-7878-430a-a160-e1b4ae1cd373"
    }
})
