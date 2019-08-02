package com.kuhaku.ikasir

import android.app.Activity
import android.util.Log
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.activity_caffe.view.*
import kotlinx.android.synthetic.main.activity_pilihan.view.*
import kotlinx.android.synthetic.main.activity_recyclerchild.view.*
import kotlinx.android.synthetic.main.recycler_vuew.view.*
import java.util.zip.Inflater



class Adapter(val list : ArrayList<ArrayList<String>>):Item<ViewHolder>(){
    override fun getLayout(): Int {
        return R.layout.activity_recyclerchild
    }

    override fun bind(viewHolder: ViewHolder, position: Int) {
        val view = viewHolder.itemView
        view.recyclerchild.layoutManager = GridLayoutManager(view.context, 3)
        view.recyclerchild.adapter = AdapterChild(list)
    }


}


class AdapterChild(val list : ArrayList<ArrayList<String>>): RecyclerView.Adapter<viewHolderChild>(){
    override fun onBindViewHolder(p0: viewHolderChild, p1: Int) {
        val view = p0.itemView
        val produkArray = list[p1]
        val produk = view.findViewById(R.id.txt_judulProduct) as TextView
        produk.text = produkArray[0]
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): viewHolderChild {
        return viewHolderChild(LayoutInflater.from(p0.context).inflate(R.layout.recycler_vuew, p0, false))
    }
}

class viewHolderChild(view: View): RecyclerView.ViewHolder(view){

}