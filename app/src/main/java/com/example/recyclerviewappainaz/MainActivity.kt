package com.example.recyclerviewappainaz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userNameList: List<String> = listOf("Max", "Marina", "Ainaz", "Leila")

        val usersRecyclerView: RecyclerView = findViewById(R.id.users_recycler_view)

        usersRecyclerView.layoutManager =

            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        usersRecyclerView.adapter = UserAdapter(userNameList)

    }
}