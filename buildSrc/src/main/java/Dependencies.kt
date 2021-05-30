@Suppress("unused")
object Versions {

    const val android_gradle_plugin = "4.0.1"
    const val build_tools = "30.0.3"

    const val kotlin = "1.5.10"
    const val coroutines = "1.5.0"

    const val coordinator_layout = "1.1.0"
    const val constraint_layout = "2.0.4"

    const val activity = "1.2.3"
    const val annotation = "1.2.0"
    const val appcompat = "1.3.0"
    const val arch_core = "2.1.0"
    const val biometric = "1.1.0"
    const val browser = "1.3.0"
    const val cardview = "1.0.0"
    const val collection = "1.1.0"
    const val fragment = "1.3.4"
    const val lifecycle = "2.3.1"
    const val multidex = "2.0.1"
    const val navigation = "2.3.5"
    const val preference = "1.1.1"
    const val recyclerview = "1.2.0"
    const val room = "2.3.0"
    const val webkit = "1.4.0"
    const val work = "2.5.0"

    const val material_design = "1.3.0"
}

@Suppress("unused")
object ToolsDeps {
    const val android_gradle = "com.android.tools.build:gradle:${Versions.android_gradle_plugin}"
    const val kotlin_gradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
}

@Suppress("unused")
object KotlinDeps {
    const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val kotlin_stdlib_jdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    const val kotlin_reflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin}"
}

@Suppress("unused")
object CoroutinesDeps {
    const val kotlin_coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    const val kotlin_coroutines_test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"
    const val kotlin_coroutines_android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
}

@Suppress("unused")
object AndroidXDeps {
    const val androidx_annotation = "androidx.annotation:annotation:${Versions.annotation}"
    const val androidx_appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val androidx_biometric = "androidx.biometric:biometric:${Versions.biometric}"
    const val androidx_coordinator_layout = "androidx.coordinatorlayout:coordinatorlayout:${Versions.coordinator_layout}"
    const val androidx_constraint_layout = "androidx.constraintlayout:constraintlayout:${Versions.constraint_layout}"
    const val androidx_preference = "androidx.preference:preference-ktx:${Versions.preference}"
    const val androidx_navigation_fragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val androidx_navigation_ui = "androidx.navigation:navigation-ui:${Versions.navigation}"
    const val androidx_recyclerview = "androidx.recyclerview:recyclerview:${Versions.recyclerview}"
    const val safe_args = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation}"
    const val androidx_work_ktx = "androidx.work:work-runtime-ktx:${Versions.work}"
    const val androidx_work_testing = "androidx.work:work-testing:${Versions.work}"
}

@Suppress("unused")
object MaterialDesignDeps {
    const val material_design = "com.google.android.material:material:${Versions.material_design}"
}