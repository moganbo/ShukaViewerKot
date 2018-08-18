package moganbo.github.io.shukaviewer.fragment


import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v4.app.Fragment
import android.webkit.WebView

import moganbo.github.io.shukaviewer.R
import moganbo.github.io.shukaviewer.utils.LogUtil
import org.androidannotations.annotations.AfterViews
import org.androidannotations.annotations.EFragment
import org.androidannotations.annotations.ViewById


/**
 * A simple [Fragment] subclass.
 * Use the [MainWebViewFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
@SuppressLint("Registered")
@EFragment(R.layout.fragment_main_web_view)
open class MainWebViewFragment : Fragment() {

    companion object {
        val TAG: String = MainWebViewFragment::class.java.simpleName
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

    @ViewById(R.id.fragment_main_web_view_web_view)
    lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    @AfterViews
    fun afterViews() {
        LogUtil.v()

        webView.loadUrl("https://shuka-land.jp/")
    }
}
