package com.example.mypurchasesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mypurchasesapp.arch.PurchasesViewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel: PurchasesViewModel by viewModels()
        viewModel.init(AppDatabase.getDatabase(this))
    }
}