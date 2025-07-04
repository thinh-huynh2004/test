package com.thinhhuynhdeviceinfotest // replace your-apps-package-name with your app’s package name
import android.os.Build
import com.facebook.react.bridge.Arguments
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.WritableMap

class DeviceInfoModule internal constructor(context: ReactApplicationContext?) :
  ReactContextBaseJavaModule(context) {
  @get:Override
  val name: String
    get() = "DeviceInfoModule"

  @ReactMethod
  fun getDeviceInfo(promise: Promise) {
    try {
      val model: String = Build.MODEL
      val version: String = Build.VERSION.RELEASE
      // Trả về một map chứa model và OS
      val map: WritableMap = Arguments.createMap()
      map.putString("model", model)
      map.putString("version", version)
      promise.resolve(map)
    } catch (e: Exception) {
      promise.reject("ERROR", e)
    }
  }
}
