package com.example.foodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.example.foodapp.model.Meal
import com.example.foodapp.model.MealList
import com.example.foodapp.retrofit.RetrofitInstance
import com.google.android.material.bottomnavigation.BottomNavigationView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttomNavigation = findViewById<BottomNavigationView>(R.id.btn_nav)
        val navigationController = Navigation.findNavController(this, R.id.host_fragment)

        NavigationUI.setupWithNavController(buttomNavigation,navigationController)


    }
}