package com.vic3e.bheka

import android.content.Intent
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import com.github.javiersantos.piracychecker.PiracyChecker
import com.vic3e.bheka.BuildConfig.*
import dev.jahir.frames.ui.activities.AboutActivity
import dev.jahir.frames.ui.activities.FramesActivity
import dev.jahir.frames.ui.activities.SettingsActivity

class MainActivity : FramesActivity() {

    /**
     * These things here have the default values. You can delete the ones you don't want to change
     * and/or modify the ones you want to.
     */
    override val billingEnabled = true

    override fun amazonInstallsEnabled(): Boolean = false
    override fun checkLPF(): Boolean = true
    override fun checkStores(): Boolean = true


    /**
     * This is your app's license key. Get yours on Google Play Dev Console.
     * Default one isn't valid and could cause issues in your app.
     */
    override fun getLicKey(): String? = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAw6ex/I2yV48JfSSHO7s42UNLqS1Z7wpgEGWclY5w1H/jDt7YqFbNuqHzupi7Am5t66E5ydKrhJWyMzUfBYIKA1DqCiaMLvcT+O+SC+zIltCGA01DrkniM4CYlBQnKZ1/Xpuo8pHXXmZRtPy+C1p9X9cq1AkjhgNbAjLG1rWjRYX64Kfs6LaOlJc1GBaHQLGJKrul2vJIKVj/SAlSy6QJOu2i/rBUj6xxFch+h6DDvFw1W3r22DKhugX4nhzqvwl5mhTXtWvYATgdfPwWojJIkrupO92aD92MWRNLIdN8TL6cvSIXlib9qoUZxKpomP+XjCgm9cs1MH/TDQrRLGO6iwIDAQAB"

    /**
     * This is the license checker code. Feel free to create your own implementation or
     * leave it as it is.
     * Anyways, keep the 'destroyChecker()' as the very first line of this code block
     * Return null to disable license check
     */
    override fun getLicenseChecker(): PiracyChecker? {
        destroyChecker() // Important
        return if (DEBUG) null else super.getLicenseChecker()
    }

    override fun defaultTheme(): Int = R.style.MyApp_Default
    override fun amoledTheme(): Int = R.style.MyApp_Default_Amoled

    /*override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_one, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.help -> startActivity(Intent(this, AboutActivity::class.java))
        }
        return super.onOptionsItemSelected(item)
    }*/

}