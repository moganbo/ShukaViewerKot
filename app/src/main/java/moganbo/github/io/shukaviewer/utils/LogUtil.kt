package moganbo.github.io.shukaviewer.utils

import android.util.Log
import moganbo.github.io.shukaviewer.BuildConfig

open class LogUtil {
    companion object {
        private const val TAG = "LogUtil"
        private val IS_DEBUG = BuildConfig.DEBUG

        fun v() {
            if (IS_DEBUG) {
                Log.v(TAG, getMethodInfo())
            }
        }

        fun v(message: String?) {
            if (IS_DEBUG) {
                Log.v(TAG, getMethodInfo() + null2str(message))
            }
        }

        fun d() {
            if (IS_DEBUG) {
                Log.d(TAG, getMethodInfo())
            }
        }

        fun d(message: String?) {
            if (IS_DEBUG) {
                Log.d(TAG, getMethodInfo() + null2str(message))
            }
        }

        fun i() {
            if (IS_DEBUG) {
                Log.i(TAG, getMethodInfo())
            }
        }

        fun i(message: String?) {
            if (IS_DEBUG) {
                Log.i(TAG, getMethodInfo() + null2str(message))
            }
        }


        fun w() {
            if (IS_DEBUG) {
                Log.w(TAG, getMethodInfo())
            }
        }

        fun w(message: String?) {
            if (IS_DEBUG) {
                Log.w(TAG, getMethodInfo() + null2str(message))
            }
        }

        fun e(message: String?) {
            if (IS_DEBUG) {
                Log.e(TAG, getMethodInfo() + null2str(message))
            }
        }

        fun e(message: String?, e: Throwable) {
            if (IS_DEBUG) {
                Log.e(TAG, getMethodInfo() + null2str(message), e)
                printThrowable(e)
                if (e.cause != null) {
                    printThrowable(e.cause!!)
                }
            }
        }

        fun e(e: Throwable) {
            if (IS_DEBUG) {
                printThrowable(e)
                if (e.cause != null) {
                    printThrowable(e.cause!!)
                }
            }
        }

        private fun null2str(string: String?): String {
            return string ?: "(null)"
        }

        private fun printThrowable(e: Throwable) {
            Log.e(TAG, e.javaClass.name + ": " + e.message)
            for (element in e.stackTrace) {
                Log.e(TAG, "  at " + LogUtil.getMethodInfo(element))
            }
        }

        private fun getMethodInfo(): String {
            val element = Thread.currentThread().stackTrace[4]
            return LogUtil.getMethodInfo(element)
        }

        private fun getMethodInfo(element: StackTraceElement): String {
            val fullClassName = element.className
            val simpleClassName = fullClassName.substring(fullClassName.lastIndexOf(".") + 1)
            val methodName = element.methodName
            val lineNumber = element.lineNumber

            return "[$simpleClassName#$methodName:$lineNumber]"
        }
    }

}