package enoch.com.jokenpoo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login__user.*

class Login_User : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login__user)

        btStartGame.setOnClickListener {
            val intent = Intent(this, Play_User::class.java)
            intent.putExtra("JOGADOR", inputPlayer1.text.toString())
            startActivity(intent)
        }
    }
}