package org.jetbrains.kotlinconf.storage

import com.russhwolf.settings.PlatformSettings

actual interface Settings {
    actual fun putString(key: String, value: String)
    actual fun getString(key: String, defaultValue: String): String
    actual fun remove(key: String)
}

actual open class SettingsFactory {
    actual open fun create(name: String?): Settings {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}