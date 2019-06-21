package dagger2qualifiersample.di

import dagger.Component
import dagger.Module
import dagger.Provides
import dagger2qualifiersample.ImplA
import dagger2qualifiersample.Sample

@Component(
    modules = [AModule::class]
)
interface ComponentA {

    fun aSample(): Sample

}

@Module
object AModule {

    @JvmStatic
    @Provides
    fun provideASample(): Sample = ImplA()

}