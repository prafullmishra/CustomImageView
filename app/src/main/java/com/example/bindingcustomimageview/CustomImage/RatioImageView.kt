package com.example.bindingcustomimageview.CustomImage

import android.content.Context
import android.content.res.Resources
import android.util.AttributeSet
import android.widget.ImageView
import com.bumptech.glide.Glide

class RatioImageView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
): ImageView(context, attrs, defStyleAttr) {


    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        //Height need to be double of that of width
        setMeasuredDimension(MeasureSpec.getSize(widthMeasureSpec),(MeasureSpec.getSize(widthMeasureSpec)*2).toInt())
    }
}