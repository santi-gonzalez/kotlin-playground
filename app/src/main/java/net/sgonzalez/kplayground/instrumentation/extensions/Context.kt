@file:Suppress("unused")

package net.sgonzalez.kplayground.instrumentation.extensions

import android.content.Context
import net.sgonzalez.kplayground.instrumentation.android.App

val Context.appContext: App
  get() = applicationContext as App
