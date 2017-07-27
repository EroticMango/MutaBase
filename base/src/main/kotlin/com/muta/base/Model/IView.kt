package com.muta.base.Model

import android.content.Intent

/**
 * Created by Summer on 2017/7/27.
 * <p>
 * IView 接口
 */
interface IView {

    /**
     * 显示加载
     */
    fun showLoading()

    /**
     * 隐藏加载
     */
    fun hideLoading()

    /**
     * 显示信息
     */
    fun showMessage(message: String)

    /**
     * 跳转activity
     */
    fun launchActivity(intent: Intent)

    /**
     * 杀死自己
     */
    fun killMyself()
}
