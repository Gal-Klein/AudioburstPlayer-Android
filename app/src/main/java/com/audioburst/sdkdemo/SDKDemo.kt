package com.audioburst.sdkdemo

import android.app.Application
import com.audioburst.audioburst_player.AudioburstPlayer
import com.audioburst.audioburst_player.SdkKeys
import com.audioburst.sdk_dependencies.AudioburstApplication
import com.audioburst.sdk_dependencies.Dependencies

class SDKDemo : Application(), AudioburstApplication {

    override fun onCreate() {
        super.onCreate()
        AudioburstPlayer.init(
            context = this,
            sdkKeys = SdkKeys(
                applicationKey = "YOUR_APP_KEY",
                experienceId = "YOUR_EXPERIENCE_ID"
            )
        )
    }

    override val dependencies: Dependencies
        get() = AudioburstPlayer.dependencies()
}
