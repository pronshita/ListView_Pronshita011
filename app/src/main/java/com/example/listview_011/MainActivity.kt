package com.example.listview_011

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val titleArr = arrayOf("Cake Roll"
                          ,"Muffin"
                          ,"Brownie"
                          ,"Chocolate Lava"
    ,"Custard Cake","Cheese cake","Crape cake","Tart","Honey Toast","Scones")

    val priceArr = arrayOf(110,120,130,140,150,160,170,180,190,200)
    val context = this

    public final val KEY_TITLE = "TITLE"
    public final val KEY_RESULT = "RESULT"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTitle("menufood")


        val mAdp = ArrayAdapter(context,android.R.layout.simple_list_item_1,titleArr)
        lv_result.adapter = mAdp
        
        lv_result.setOnItemClickListener { parent, view, position, id ->

            //Toast.makeText(context,
              //              "menufood ${titleArr[position]} pay ${priceArr[position]} baht",
               // Toast.LENGTH_LONG).show()
            val goPageResult = Intent(context,SecondActivity::class.java)

            goPageResult.putExtra(KEY_TITLE,titleArr[position])
            goPageResult.putExtra(KEY_RESULT,priceArr[position])

            startActivity(goPageResult)
        }
    }
}
