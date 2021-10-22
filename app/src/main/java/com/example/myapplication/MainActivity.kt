package com.example.myapplication

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun OC(view: View) {
        if (ed_name.length() < 1) tv_text.setText("請輸入玩家姓名")
        else {
            tv_name.setText(String.format("名字\n%s", ed_name.text.toString()))
<<<<<<< HEAD
            if (btn_scissor.isChecked) tv_mmora.text = "我方出拳\n剪刀"
            else if (btn_stone.isChecked) tv_mmora.text = "我方出拳\n石頭"
            else tv_mmora.text = "我方出拳\n布"
=======
            if (btn_scissor.isChecked) tv_mmora.text =
                "我方出拳\n剪刀" else if (btn_stone.isChecked) tv_mmora.text =
                "我方出拳\n石頭" else tv_mmora.text = "我方出拳\n布"
>>>>>>> bc2eadad22a44b19691af6a3f572b881e99615a8

            val computer = (Math.random() * 3).toInt()
            if (computer == 0) tv_cmora.text ="電腦出拳\n剪刀"
            else if (computer == 1) tv_cmora.text ="電腦出拳\n石頭"
            else tv_cmora.text = "電腦出拳\n布"

            if (btn_scissor.isChecked && computer == 2 ||
                btn_stone.isChecked && computer == 0 ||
                btn_paper.isChecked && computer == 1) {
                tv_winner.text = "勝利者\n${ed_name.text}"
                tv_text.text = "恭喜你獲勝了！！！"
            } else if (btn_scissor.isChecked && computer == 1 ||
                btn_stone.isChecked && computer == 2 ||
                btn_paper.isChecked && computer == 0) {
                tv_winner.text = "勝利者\n電腦"
                tv_text.text = "可惜，電腦獲勝了！"
            } else {
                tv_winner.text = "勝利者\n平手"
                tv_text.text = "平局，請再試一次！"
            }
        }
    }
}