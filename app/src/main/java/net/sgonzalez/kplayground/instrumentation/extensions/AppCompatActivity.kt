@file:Suppress("unused")

package net.sgonzalez.kplayground.instrumentation.extensions

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import net.sgonzalez.kplayground.instrumentation.dagger.component.AppComponent

fun AppCompatActivity.appComponent(): AppComponent {
  return appContext.appComponent
}

fun AppCompatActivity.showToast(context: Context,
                                text: String,
                                duration: Int = Toast.LENGTH_SHORT) {
  Toast.makeText(context, text, duration).show()
}
