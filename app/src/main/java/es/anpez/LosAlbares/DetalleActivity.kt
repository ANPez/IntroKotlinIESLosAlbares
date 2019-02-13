package es.anpez.LosAlbares

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detalle.*

class DetalleActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_detalle)

    val user: User = intent.getParcelableExtra("usuario")
    nombre.text = user.nombre
    edad.text = user.edad.toString()
  }
}
