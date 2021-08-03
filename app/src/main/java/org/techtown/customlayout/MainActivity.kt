package org.techtown.customlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.part1.*
import kotlinx.android.synthetic.main.part2.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{
            output1.text = "홍길동1"
            output2.text = "010-0000-0000"
            imageView.setImageResource(R.drawable.banana)
        }

        button2.setOnClickListener{
            output1.text = "꾸꾸"
            output2.text = "119"
            imageView.setImageResource(R.drawable.person2)
        }

        textView3.text = "만만만"
        textView4.text = "듦듦듦"

        button3.setOnClickListener{
            textView3.text = "청청청"
            textView4.text = "라라라"
            imageView4.setImageResource(R.drawable.banana)
        }
        button4.setOnClickListener {
            textView3.text = "인인인"
            textView4.text = "천천천"
            imageView4.setImageResource(R.drawable.pizza)
        }
    }
}