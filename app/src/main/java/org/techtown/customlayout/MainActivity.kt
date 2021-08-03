package org.techtown.customlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.part1.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{
            view.output1.text = "홍길동1"
            view.output2.text = "010-0000-0000"
            view.imageView.setImageResource(R.drawable.banana)
        }
        button2.setOnClickListener{
            view.output1.text = "꾸꾸"
            view.output2.text = "119"
            view.imageView.setImageResource(R.drawable.ic_launcher_foreground)
        }
    }
}