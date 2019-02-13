package es.anpez.LosAlbares

import android.app.Activity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

fun Int.toUser() = User("usuario $this", 30+this)

fun Iterable<Int>.toUsers() = map { it.toUser() }

fun RecyclerView.withUsers(activity: Activity, users: List<User>) {
  adapter = UsuariosAdapter(activity, users)
  layoutManager = LinearLayoutManager(context)
}
