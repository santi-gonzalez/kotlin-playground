package net.sgonzalez.kplayground.instrumentation.dagger.component

import dagger.Component
import net.sgonzalez.kplayground.instrumentation.dagger.module.ActivityModule
import net.sgonzalez.kplayground.instrumentation.dagger.scope.UiScope
import net.sgonzalez.kplayground.presentation.ui.MainActivity

@UiScope
@Component(modules = arrayOf(ActivityModule::class), dependencies = arrayOf(AppComponent::class))
interface UiComponent {
  fun inject(mainActivity: MainActivity)
}