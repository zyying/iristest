package com.example.zyapp.android

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.zyapp.R
import java.io.FileOutputStream
import java.io.OutputStream

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    private fun bitmap() {
        val options = BitmapFactory.Options()
        options.inSampleSize = 2 // 采样率
        options.inJustDecodeBounds = true // 只取宽高，不真正拿bitmap
        options.inPreferredConfig = Bitmap.Config.ARGB_8888 // 类型
        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.ic_launcher_background, options)

        Bitmap.createScaledBitmap(bitmap,100,100,true)

        val outputStream = FileOutputStream("filename")
        bitmap.compress(Bitmap.CompressFormat.WEBP,80, outputStream)
    }
}