package app.bo.com.ucb.loginmvp2021

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity(), IContractLogin.View {

    lateinit var loginPresenter: IContractLogin.Presenter
    lateinit var loginBtn: Button
    lateinit var userName: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginPresenter = LoginPresenter(this)
        loginBtn = findViewById(R.id.loginBtn)
        userName = findViewById(R.id.usernameEditText)

        loginBtn.setOnClickListener {
            loginPresenter.doLogin( userName.text.toString() )
        }

    }

    override fun showError(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

    override fun hideForm() {
        loginBtn.visibility = View.GONE
    }

    override fun showForm() {
        loginBtn.visibility = View.VISIBLE
    }

    override fun navigateTo() {
        val intent = Intent(this, HomeActivity::class.java )
        startActivity(intent)
    }
}