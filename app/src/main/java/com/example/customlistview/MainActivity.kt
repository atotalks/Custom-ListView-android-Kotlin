package com.example.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mAdapter = MainRvAdapter(this, fruitList)
        mRecyclerView.adapter = mAdapter

        val lm = LinearLayoutManager(this)
        mRecyclerView.layoutManager = lm
        mRecyclerView.setHasFixedSize(true)
        mAdapter.itemClick = object: MainRvAdapter.ItemClick {
            override fun onClick(view: View, position: Int) {
                Toast.makeText(this@MainActivity, position.toString(), Toast.LENGTH_SHORT).show()

            }
        }
    }

    var fruitList = arrayListOf<Fruit>(
        Fruit("Fruit", "apple", "1", "fruit00"),
        Fruit("Fruit", "banana", "2", "fruit01"),
        Fruit("Fruit", "banana", "3", "fruit02"),
        Fruit("Fruit", "melon", "4", "fruit03"),
        Fruit("Fruit", "watermelon", "5", "fruit04"),
        Fruit("Fruit", "grape", "6", "fruit05")
    )
}
