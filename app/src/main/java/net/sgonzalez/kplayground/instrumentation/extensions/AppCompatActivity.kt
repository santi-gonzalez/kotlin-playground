@file:Suppress("unused")

package net.sgonzalez.kplayground.instrumentation.extensions

import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View
import net.sgonzalez.kplayground.R
import net.sgonzalez.kplayground.instrumentation.dagger.component.AppComponent

fun AppCompatActivity.appComponent(): AppComponent {
  return appContext.appComponent
}

fun AppCompatActivity.showDebugInfo(text: CharSequence,
                                    duration: Int = Snackbar.LENGTH_SHORT) {
  Snackbar.make(coordinatorLayout, text, duration).show()
}

val AppCompatActivity.coordinatorLayout: View
  get() = findViewById(R.id.coordinator_layout)
