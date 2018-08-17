package moganbo.github.io.shukaviewer.fragment


import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v4.app.Fragment

import moganbo.github.io.shukaviewer.R
import moganbo.github.io.shukaviewer.utils.LogUtil
import org.androidannotations.annotations.AfterViews
import org.androidannotations.annotations.EFragment


/**
 * A simple [Fragment] subclass.
 * Use the [MainWebViewFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
@SuppressLint("Registered")
@EFragment(R.layout.fragment_main_web_view)
class MainWebViewFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @return A new instance of fragment MainWebViewFragment.
         */
        @JvmStatic
        fun newInstance() =
                MainWebViewFragment().apply {
                }
    }

    @AfterViews
    fun afterViews() {
        LogUtil.v()
    }
}
