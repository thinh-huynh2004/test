package com.thinhhuynhdeviceinfotest // replace your-app-name with your app’s name
import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ViewManager
import java.util.ArrayList
import java.util.Collections

class MyAppPackage : ReactPackage {
  @Override
  fun createViewManagers(reactContext: ReactApplicationContext?): List<ViewManager> {
    return Collections.emptyList()
  }

  @Override
  fun createNativeModules(
    reactContext: ReactApplicationContext?
  ): List<NativeModule> {
    val modules: List<NativeModule> = ArrayList()

    modules.add(DeviceInfoModule(reactContext))

    return modules
  }
}
