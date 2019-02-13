package es.anpez.LosAlbares

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.selector
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val users = (0..200).toUsers()

    abrir_selector.setOnClickListener {
      selector("Elige usuario", users.map { it.nombre }) { _, i ->
        startActivity<DetalleActivity>("usuario" to users[i])
      }
    }

    lista.withUsers(this, users)
    piramide.text = "La edad del usuario es " + users.map { it.edad }.average()
  }

  private fun piramide1(): String {
    var text = ""
    for (i in 0..5) {
      for (j in i..5) {
        text += " "
      }
      for (j in 0..(i * 2)) {
        if (i and 1 == 0) {
          text += "*"
        } else {
          text += "#"
        }
      }
      text += "\n"
    }
    return text
  }

  private fun piramide2(): String {
    var text = ""
    val symbols = listOf('*', '#')
    (0..5).forEach { i ->
      (i..5).forEach {
        text += " "
      }
      (0..(i * 2)).forEach { j ->
        text += symbols[i and 1]
      }
      text += "\n"
    }
    return text
  }
}
