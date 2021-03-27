/**************************************************************************************************
 * Copyright (C) 2021 Cube Payment Services Pte Ltd ("CubePay"). All Rights Reserved.             *
 *                                                                                                *
 * NOTICE: All information contained herein is, and remains the property of CubePay. The          *
 * intellectual and technical concepts contained herein are proprietary to CubePay and may be     *
 * covered by Patents, patents in process, and are protected by trade secret or copyright law.    *
 * Dissemination of this information or reproduction of this material is strictly forbidden       *
 * unless prior written permission is obtained from CubePay.                                      *
 *                                                                                                *
 * Unless required by applicable law or agreed to in writing, software distributed under the      *
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY            *
 * KIND, either express or implied.                                                               *
 *                                                                                                *
 * "CubePay", "Radiumone" and the respective brand marks are registered trademarks of CubePay.    *
 **************************************************************************************************/

package com.ck.test.cloudinterview_chengkai.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

abstract class BaseRecyclerViewAdapter<T : Any, VB : ViewDataBinding>
    : RecyclerView.Adapter<BaseRecyclerViewAdapter.Companion.BaseViewHolder<VB>>() {

    var items = mutableListOf<T>()

    fun addItems(items: List<T>) {
        this.items = items as MutableList<T>
        notifyDataSetChanged()
    }

    var listener: ((view: View, item: T, position: Int) -> Unit)? = null

    abstract fun getLayout(): Int

    override fun getItemCount() = items.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = BaseViewHolder<VB>(
        DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            getLayout(),
            parent,
            false
        )
    )

    companion object {
        class BaseViewHolder<VB : ViewDataBinding>(val binding: VB) :
            RecyclerView.ViewHolder(binding.root)
    }
}