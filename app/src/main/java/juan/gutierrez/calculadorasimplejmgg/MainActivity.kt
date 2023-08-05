package juan.gutierrez.calculadorasimplejmgg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val campo_num1: EditText = findViewById(R.id.etxt_num1)
        val campo_num2: EditText = findViewById(R.id.etxt_num2)
        val boton_sumar: Button = findViewById(R.id.btn_sumar)
        val boton_restar: Button = findViewById(R.id.btn_restar)
        val respuesta: TextView = findViewById(R.id.txtv_respuesta)

        boton_sumar.setOnClickListener{
            //Toast.makeText(this, "botón sumar", Toast.LENGTH_LONG ).show()

            var num1: Int = campo_num1.text.toString().toInt()
            var num2: Int = campo_num2.text.toString().toInt()

            var suma = num1 + num2

            respuesta.setText("$suma")

            //Toast.makeText(this, "$num1", Toast.LENGTH_SHORT).show()
        }

        boton_restar.setOnClickListener{
            var num1: Int = campo_num1.text.toString().toInt()
            var num2: Int = campo_num2.text.toString().toInt()

            var resta = num1 - num2

            respuesta.setText("$resta")
        }
    }
}