package es.anpez.LosAlbares

import android.app.Activity
import android.support.v4.app.ActivityCompat
import android.support.v4.app.ActivityOptionsCompat
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import org.jetbrains.anko.intentFor

class UsuariosAdapter constructor(val activity: Activity, val usuarios: List<User>): RecyclerView.Adapter<UsuarioViewHolder>() {
  override fun onCreateViewHolder(p0: ViewGroup, p1: Int): UsuarioViewHolder {
    val layoutInflater = LayoutInflater.from(p0.context)
    val view = layoutInflater.inflate(R.layout.main_cell, p0, false)

    val viewHolder = UsuarioViewHolder(view)
    view.setOnClickListener {
      val usuario = usuarios[viewHolder.adapterPosition]
      ActivityCompat.startActivity(
        activity,
        it.context.intentFor<DetalleActivity>("usuario" to usuario),
        ActivityOptionsCompat.makeSceneTransitionAnimation(activity, viewHolder.nombreUsuarioTextView, "nombre de usuario").toBundle()
      )
    }

    return viewHolder
  }

  override fun getItemCount(): Int {
    return usuarios.size
  }

  override fun onBindViewHolder(p0: UsuarioViewHolder, p1: Int) {
    val usuario = usuarios.get(p1)
    p0.nombreUsuarioTextView.text = usuario.nombre
  }
}