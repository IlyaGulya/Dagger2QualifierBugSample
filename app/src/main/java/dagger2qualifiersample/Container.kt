package dagger2qualifiersample

import dagger2qualifiersample.di.BImpl
import javax.inject.Inject

class Container {

    @Inject
    lateinit var sampleA: Sample
    @Inject
    @BImpl
    lateinit var sampleB: Sample

}
