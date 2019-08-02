package com.kuhaku.ikasir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.activity_caffe.*

class caffe : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_caffe)

        recycler.layoutManager = LinearLayoutManager(this)
        var adapter  = GroupAdapter<ViewHolder>()
        adapter.add(Adapter(Product().data()))
        adapter.add(Adapter(Product().data1()))
        recycler.adapter = adapter
    }
}
