package akira.erick.com.cadastro

import akira.erick.com.cadastro.databinding.ActivityMainBinding
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private val activityMainBinding: ActivityMainBinding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(activityMainBinding.root)

        with (activityMainBinding) {
            ufSp.setSelection(0)

            limparBt.setOnClickListener{
                nomeCompletoEd.setText("")
                telefoneEd.setText("")
                emailEd.setText("")
                emailCb.isChecked = false
                sexoRg.clearCheck()
                cidadeEd.setText("")
                ufSp.setSelection(0)
            }

            salvarBt.setOnClickListener{
                var nome = nomeCompletoEd.text.toString()
                var telefone = telefoneEd.text.toString()
                var email = emailEd.text.toString()
                var emailCheck = emailCb.isChecked
                var sexo = (findViewById<RadioButton>(sexoRg.checkedRadioButtonId)).text.toString()
                var cidade = cidadeEd.text.toString()
                var uf = ufSp.selectedItem.toString()

                var formulario = Form(nome, telefone, email, emailCheck, sexo, cidade, uf)

                Toast.makeText(root.context, formulario.toString(),Toast.LENGTH_LONG).show()
            }
        }
    }
}