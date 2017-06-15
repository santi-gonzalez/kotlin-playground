package net.sgonzalez.kplayground.instrumentation.dagger.component

import dagger.Component
import net.sgonzalez.kplayground.android.App
import net.sgonzalez.kplayground.instrumentation.dagger.module.ApplicationModule
import net.sgonzalez.kplayground.instrumentation.dagger.module.DataSourceModule
import net.sgonzalez.kplayground.instrumentation.dagger.module.RepositoryModule
import net.sgonzalez.kplayground.instrumentation.dagger.module.RestModule
import net.sgonzalez.kplayground.instrumentation.dagger.module.UseCaseModule
import net.sgonzalez.kplayground.instrumentation.dagger.provider.RepositoryProvider
import net.sgonzalez.kplayground.instrumentation.dagger.provider.UseCaseProvider
import net.sgonzalez.kplayground.instrumentation.dagger.scope.AppScope

@AppScope
@Component(modules = arrayOf(ApplicationModule::class, DataSourceModule::class, RepositoryModule::class,
                             RestModule::class, UseCaseModule::class))
interface AppComponent : RepositoryProvider, UseCaseProvider {
  fun inject(app: App)
}