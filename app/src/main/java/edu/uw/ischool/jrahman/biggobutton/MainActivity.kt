package edu.uw.ischool.jrahman.biggobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnPush: Button = findViewById(R.id.pushButton)
        btnPush.setOnClickListener {
            count++
            if (count == 1) {
                btnPush.text = getString(R.string.pushed_once)
            } else {
                btnPush.text = getString(R.string.pushed_multiple, count)
            }
            Toast.makeText(this, R.string.KIP, Toast.LENGTH_SHORT).show()
        }
    }
}