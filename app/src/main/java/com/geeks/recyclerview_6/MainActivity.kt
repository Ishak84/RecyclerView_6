package com.geeks.recyclerview_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var dataList: ArrayList<Dataclass>
    lateinit var imageList:Array<Int>
    lateinit var  titleList:Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageList = arrayOf(
            R.drawable.list_ic,
            R.drawable.ic_camera,
            R.drawable.ic_checkbox,
            R.drawable.ic_date,
            R.drawable.ic_edit,
            R.drawable.ic_image,
            R.drawable.texy_ic,
            R.drawable.time_ic,
            R.drawable.list_ic,
            R.drawable.rathing_ic,
            R.drawable.toggle_ic,)

        titleList = arrayOf(
            "ListView",
            "Checkbox",
            "Image View",
            "Toggle Switch",
            "Date Picker",
            "TextView",
            "EditText",
            "Camera")


        recyclerView = findViewById(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)


        dataList = arrayListOf<Dataclass>()
        getData()
    }

    private fun getData(){
        for (i in imageList.indices){
            val dataClass = Dataclass(imageList[i], titleList[i])
            dataList.add(dataClass)
        }
        recyclerView.adapter = AdapterClass(dataList)
    }
}