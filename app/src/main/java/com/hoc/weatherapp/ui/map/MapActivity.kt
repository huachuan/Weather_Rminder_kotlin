package com.hoc.weatherapp.ui.map

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.WindowManager
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.hoc.weatherapp.R
import com.hoc.weatherapp.data.CityRepository
import com.hoc.weatherapp.data.models.entity.City
import org.koin.android.ext.android.inject

class MapActivity : AppCompatActivity() {
  private val cityRepository by inject<CityRepository>()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    window.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
  }

}