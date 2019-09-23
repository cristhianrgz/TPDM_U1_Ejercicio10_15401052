package mx.edu.tpdm_u1_ejercicio10_15401052

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.core.view.marginTop
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var layu : LinearLayout ?= null
    var usuar : EditText ?= null
    var contras : EditText ?= null
    var aceptar : Button ?= null
    var usuarios = arrayOf("patsy","brisa","adrian","uriel","cristhian")
    var contraseñas = arrayOf("0305","1307","2707","1609","1608")
    var aux = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var imgLogin = ImageView(this)
        layu = findViewById(R.id.linLayu)
        layu?.addView(imgLogin)

        usuar = findViewById(R.id.usuario)
        contras = findViewById(R.id.contraseña)
        aceptar = findViewById(R.id.btnEntrar)


        imgLogin.setImageResource(R.drawable.usuario)
        btnEntrar?.setOnClickListener {
            if (usuario?.text.toString().equals(usuarios.get(0)) && contraseña?.text.toString().equals(contraseñas.get(0))) {
                Toast.makeText(this, "ACEPTADO", Toast.LENGTH_LONG).show()
                imgLogin.setImageResource(R.drawable.cristiano)


            } else if (usuario?.text.toString().equals(usuarios.get(1)) && contraseña?.text.toString().equals(contraseñas.get(1))) {
                Toast.makeText(this, "ACEPTADO", Toast.LENGTH_LONG).show()
                imgLogin.setImageResource(R.drawable.jalisco)

            } else if (usuario?.text.toString().equals(usuarios.get(2)) && contraseña?.text.toString().equals(contraseñas.get(2))) {
                Toast.makeText(this, "ACEPTADO", Toast.LENGTH_LONG).show()
                imgLogin.setImageResource(R.drawable.ferianavidad)

            } else if (usuario?.text.toString().equals(usuarios.get(3)) && contraseña?.text.toString().equals(contraseñas.get(3))) {
                Toast.makeText(this, "ACEPTADO", Toast.LENGTH_LONG).show()
                imgLogin.setImageResource(R.drawable.ironman)

            } else if (usuario?.text.toString().equals(usuarios.get(4)) && contraseña?.text.toString().equals(contraseñas.get(4))) {
                Toast.makeText(this, "ACEPTADO", Toast.LENGTH_LONG).show()
                imgLogin.setImageResource(R.drawable.cristiano)

            } else {
                var total = aux +1
                Toast.makeText(this, "RECHAZADO"+'\n'+"Intento: "+total, Toast.LENGTH_LONG).show()
                aux++


                if (aux >= 3) {
                    Toast.makeText(this, "RECHAZADO"+'\n'+"Intento: "+aux, Toast.LENGTH_LONG).show()
                    finish()
                }
            }
        }
    }
}
