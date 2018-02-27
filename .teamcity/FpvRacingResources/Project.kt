package FpvRacingResources

import FpvRacingResources.buildTypes.*
import FpvRacingResources.vcsRoots.*
import FpvRacingResources.vcsRoots.FpvRacingResources_HttpsGithubComAndyshinnFpvRacingResourcesRefsHeadsMaster
import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "f68a02ab-ad4f-448a-a6bd-4e47ef71cda3"
    id = "FpvRacingResources"
    parentId = "_Root"
    name = "Fpv Racing Resources"

    vcsRoot(FpvRacingResources_HttpsGithubComAndyshinnFpvRacingResourcesRefsHeadsMaster)

    buildType(FpvRacingResources_Build)

    features {
        versionedSettings {
            id = "PROJECT_EXT_3"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.PREFER_SETTINGS_FROM_VCS
            rootExtId = FpvRacingResources_HttpsGithubComAndyshinnFpvRacingResourcesRefsHeadsMaster.id
            showChanges = true
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
