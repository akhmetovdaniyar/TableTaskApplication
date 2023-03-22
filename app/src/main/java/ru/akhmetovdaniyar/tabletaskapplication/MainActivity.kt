package ru.akhmetovdaniyar.tabletaskapplication

import android.content.pm.ActivityInfo
import android.graphics.Color
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import ru.akhmetovdaniyar.tabletaskapplication.databinding.LayoutTableBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: LayoutTableBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE

        binding = LayoutTableBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        iterateThroughEditTexts(binding.root)

        val button = binding.button

        fun mainAction () {

            val r1c2 = binding.r1c2.editableText.toString()
            var r1c3 = binding.r1c3.editableText.toString()
            var r1c4 = binding.r1c4.editableText.toString()
            var r1c5 = binding.r1c5.editableText.toString()
            var r1c6 = binding.r1c6.editableText.toString()
            var r1c7 = binding.r1c7.editableText.toString()
            var r1summ = calcTotal(r1c2,r1c3,r1c4,r1c5,r1c6,r1c7).toString()
            binding.r1summ.text = r1summ

            var r2c1 = binding.r1c2.editableText.toString()
            var r2c3 = binding.r2c3.editableText.toString()
            var r2c4 = binding.r2c4.editableText.toString()
            var r2c5 = binding.r2c5.editableText.toString()
            var r2c6 = binding.r2c6.editableText.toString()
            var r2c7 = binding.r2c7.editableText.toString()
            var r2summ = calcTotal(r2c1,r2c3,r2c4,r2c5,r2c6,r2c7).toString()
            binding.r2summ.text = r2summ

            var r3c1 = binding.r3c1.editableText.toString()
            var r3c2 = binding.r3c2.editableText.toString()
            var r3c4 = binding.r3c4.editableText.toString()
            var r3c5 = binding.r3c5.editableText.toString()
            var r3c6 = binding.r3c6.editableText.toString()
            var r3c7 = binding.r3c7.editableText.toString()
            var r3summ = calcTotal(r3c1,r3c2,r3c4,r3c5,r3c6,r3c7).toString()
            binding.r3summ.text = r3summ

            var r4c1 = binding.r4c1.editableText.toString()
            var r4c2 = binding.r4c2.editableText.toString()
            var r4c3 = binding.r4c3.editableText.toString()
            var r4c5 = binding.r4c5.editableText.toString()
            var r4c6 = binding.r4c6.editableText.toString()
            var r4c7 = binding.r4c7.editableText.toString()
            var r4summ = calcTotal(r4c1,r4c2,r4c3,r4c5,r4c6,r4c7).toString()
            binding.r4summ.text = r4summ

            var r5c1 = binding.r5c1.editableText.toString()
            var r5c2 = binding.r5c2.editableText.toString()
            var r5c3 = binding.r5c3.editableText.toString()
            var r5c4 = binding.r5c4.editableText.toString()
            var r5c6 = binding.r5c6.editableText.toString()
            var r5c7 = binding.r5c7.editableText.toString()
            var r5summ = calcTotal(r5c1,r5c2,r5c3,r5c4,r5c6,r5c7).toString()
            binding.r5summ.text = r5summ

            var r6c1 = binding.r6c1.editableText.toString()
            var r6c2 = binding.r6c2.editableText.toString()
            var r6c3 = binding.r6c3.editableText.toString()
            var r6c4 = binding.r6c4.editableText.toString()
            var r6c5 = binding.r6c5.editableText.toString()
            var r6c7 = binding.r6c7.editableText.toString()
            var r6summ = calcTotal(r6c1,r6c2,r6c3,r6c4,r6c5,r6c7).toString()
            binding.r6summ.text = r6summ

            var r7c1 = binding.r7c1.editableText.toString()
            var r7c2 = binding.r7c2.editableText.toString()
            var r7c3 = binding.r7c3.editableText.toString()
            var r7c4 = binding.r7c4.editableText.toString()
            var r7c5 = binding.r7c5.editableText.toString()
            var r7c6 = binding.r7c6.editableText.toString()
            var r7summ = calcTotal(r7c1,r7c2,r7c3,r7c4,r7c5,r7c6).toString()
            binding.r7summ.text = r7summ

            binding.r1plc.text = comparePlace(r1summ.toInt(),r2summ.toInt(),r3summ.toInt(),r4summ.toInt(),r5summ.toInt(),r6summ.toInt(),r7summ.toInt()).toString()
            binding.r2plc.text = comparePlace(r2summ.toInt(),r1summ.toInt(),r3summ.toInt(),r4summ.toInt(),r5summ.toInt(),r6summ.toInt(),r7summ.toInt()).toString()
            binding.r3plc.text = comparePlace(r3summ.toInt(),r1summ.toInt(),r2summ.toInt(),r4summ.toInt(),r5summ.toInt(),r6summ.toInt(),r7summ.toInt()).toString()
            binding.r4plc.text = comparePlace(r4summ.toInt(),r1summ.toInt(),r2summ.toInt(),r3summ.toInt(),r5summ.toInt(),r6summ.toInt(),r7summ.toInt()).toString()
            binding.r5plc.text = comparePlace(r5summ.toInt(),r1summ.toInt(),r2summ.toInt(),r3summ.toInt(),r4summ.toInt(),r6summ.toInt(),r7summ.toInt()).toString()
            binding.r6plc.text = comparePlace(r6summ.toInt(),r1summ.toInt(),r2summ.toInt(),r3summ.toInt(),r4summ.toInt(),r5summ.toInt(),r7summ.toInt()).toString()
            binding.r7plc.text = comparePlace(r7summ.toInt(),r1summ.toInt(),r2summ.toInt(),r3summ.toInt(),r4summ.toInt(),r5summ.toInt(),r6summ.toInt()).toString()

        }

        button.setOnClickListener {
            mainAction()
        }
    }

    private fun iterateThroughEditTexts(view: View) {
        if (view is ViewGroup) {
            for (i in 0 until view.childCount) {
                iterateThroughEditTexts(view.getChildAt(i))
            }
        } else if (view is EditText) {
            view.addTextChangedListener(object : TextWatcher {
                override fun afterTextChanged(s: Editable?) {
                    val number = s?.toString()?.toIntOrNull()
                    if (number != null && (number < 0 || number > 5)) {
                        view.setTextColor(Color.RED)
                        Toast.makeText(this@MainActivity, "Введите число от 0 до 5", Toast.LENGTH_SHORT).show()
                    } else {
                        view.setTextColor(Color.BLACK)
                    }
                }

                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

                }
            })
        }
    }

    private fun calcTotal(a: String, b: String, c: String, d: String, e: String, f: String): Int {
        var sum = 0
        sum = try {
            a.toInt()+b.toInt()+c.toInt()+d.toInt()+e.toInt()+f.toInt()
        } catch (_:Exception) {
            0
        }
        return sum
    }

    private fun comparePlace(a: Int, b: Int, c: Int, d: Int, e: Int, f: Int, g: Int): Int {
        val list = listOf(a,b,c,d,e,f,g).sortedDescending()
        return if (a==0 && b==0 && c==0 && d==0 && e==0 && f==0 && g==0) {
            0
        } else {
            list.indexOf(a)+1
        }
    }
}
