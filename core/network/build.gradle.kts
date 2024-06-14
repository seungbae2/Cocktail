plugins {
    alias(libs.plugins.cocktail.android.library)
    alias(libs.plugins.cocktail.android.hilt)
    id("kotlinx-serialization")
}

android {
    namespace = "com.sb.cocktail.core.network"
}

dependencies {

}