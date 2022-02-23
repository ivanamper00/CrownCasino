package com.dakuinternational.common.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.dakuinternational.common.R

@BindingAdapter("android:scrUri")
fun srcUri(view: ImageView, uri: String){
    Glide.with(view.context)
        .load(uri)
        .placeholder(R.drawable.ic_baseline_broken_image_24)
        .into(view)
}