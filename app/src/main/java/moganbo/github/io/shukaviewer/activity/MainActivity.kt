package moganbo.github.io.shukaviewer.activity

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import moganbo.github.io.shukaviewer.R
import moganbo.github.io.shukaviewer.fragment.MainWebViewFragment
import moganbo.github.io.shukaviewer.fragment.MainWebViewFragment_
import org.androidannotations.annotations.AfterViews
import org.androidannotations.annotations.EActivity

@SuppressLint("Registered")
@EActivity(R.layout.activity_main)
open class MainActivity : BaseActivity() {

    @AfterViews
    fun afterViews() {
        replaceFragment(R.id.activity_main_container, MainWebViewFragment.newInstance(),
                MainWebViewFragment.TAG, true)
    }
}
