package moganbo.github.io.shukaviewer.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction

open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    fun addfragment(viewId: Int, fragment: Fragment, tag: String, isAddToBackstack: Boolean){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
        transaction.add(viewId, fragment, tag)
        if (isAddToBackstack){
            transaction.addToBackStack(tag)
        }
        transaction.commit()
    }

    fun replaceFragment(viewId: Int, fragment: Fragment, tag: String, isAddToBackstack: Boolean){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
        transaction.replace(viewId, fragment, tag)
        if (isAddToBackstack){
            transaction.addToBackStack(tag)
        }
        transaction.commit()
    }
}
