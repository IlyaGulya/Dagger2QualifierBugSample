package dagger2qualifiersample.di

import dagger.Component
import dagger.Module
import dagger.Provides
import dagger2qualifiersample.Container
import dagger2qualifiersample.ImplB
import javax.inject.Qualifier

@Component(
    dependencies = [ComponentA::class],
    modules = [BModule::class]
)
interface ComponentB {

    fun inject(testSample: Container)

}

@Module
object BModule {

    @BImpl
    @JvmStatic
    @Provides
    fun provideBSample() = ImplB()

}

@Qualifier
annotation class BImpl