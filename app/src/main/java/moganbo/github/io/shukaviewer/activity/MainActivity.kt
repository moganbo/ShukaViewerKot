package moganbo.github.io.shukaviewer.activity

import android.os.Bundle
import android.support.v4.app.FragmentActivity
import moganbo.github.io.shukaviewer.R
import org.androidannotations.annotations.AfterViews
import org.androidannotations.annotations.EFragment

@EFragment(R.layout.activity_main)
open class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    @AfterViews
    fun afterViews(){

    }
}
