package enoch.com.jokenpoo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_play__user.*
import android.R.string.cancel
import android.content.DialogInterface
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import androidx.appcompat.app.AlertDialog


var ponto_user = 0
var ponto_android = 0


class Play_User : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play__user)

        setUpExtras()

        impedra.setOnClickListener {
            ponto_user = 0
            tvPlacarPlay_.text = ponto_user.toString()
            //tvPlacarAndroid_.text =  ran.toString()
            setScoreAndroid()
        }

        impapel.setOnClickListener {
            ponto_user = 1
            tvPlacarPlay_.text = ponto_user.toString()
            //tvPlacarAndroid_.text =  ran.toString()
            setScoreAndroid()
        }


        imtesoura.setOnClickListener {
            ponto_user = 2
            tvPlacarPlay_.text = ponto_user.toString()
            //tvPlacarAndroid_.text =  ran.toString()
            setScoreAndroid()
        }

        btSair.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setMessage("Deseja Realmente Sair ?")
            builder.setCancelable(true)
            builder.setPositiveButton("ok", DialogInterface.OnClickListener { dialog, which ->
                finish()
                System.exit(0)
            })

    }

    }

    private fun setUpExtras() {

        var nome_jogador =  intent.getStringExtra("JOGADOR") ?: "Player 1"
        tvInputNomeJogador.text = nome_jogador
        tvPlacarPlay.text = nome_jogador
    }

    private fun setScoreAndroid () {
        val ran = (0..2).random()
        // random integer between 0 & 10
        tvPlacarAndroid_.text = ran.toString()
    }

}
