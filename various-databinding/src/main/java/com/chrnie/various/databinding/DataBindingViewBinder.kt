package com.chrnie.various.databinding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.chrnie.various.ViewBinder

class DataBindingViewBinder<in T>(private val layoutId: Int, private val variableId: Int)
    : ViewBinder<T, DataBindingViewBinder.DataBindingViewHolder>() {


    override fun onCreateViewHolder(inflater: LayoutInflater, parent: ViewGroup): DataBindingViewHolder {
        val binding = DataBindingUtil.inflate<ViewDataBinding>(inflater, layoutId, parent, false)
        return DataBindingViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DataBindingViewHolder, data: T, payloads: List<Any>) {
        holder.binding.setVariable(variableId, data)
    }


    class DataBindingViewHolder(internal val binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root)
}