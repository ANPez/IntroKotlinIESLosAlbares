package es.anpez.LosAlbares
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

class UsuarioViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val nombreUsuarioTextView: TextView = itemView.findViewById(R.id.nombre_usuario)
  }