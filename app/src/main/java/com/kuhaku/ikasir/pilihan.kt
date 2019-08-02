package com.kuhaku.ikasir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pilihan.*

class pilihan : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pilihan)
        btn_proses.setOnClickListener {
            if(spinner.selectedItemPosition == 0){
                Intent(this, cuci_motor::class.java).also{
                    startActivity(it)
                }
            }else{
                Intent(this, caffe::class.java).also {
                    startActivity(it)
                }
            }
        }
    }
}
