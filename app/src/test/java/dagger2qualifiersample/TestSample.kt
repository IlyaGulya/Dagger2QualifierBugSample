package dagger2qualifiersample

import dagger2qualifiersample.di.DaggerComponentA
import dagger2qualifiersample.di.DaggerComponentB
import org.junit.Test

class TestSample {

    @Test
    fun example() {
        val container = Container()
        val compA = DaggerComponentA.builder().build()
        val compB = DaggerComponentB.builder().componentA(compA).build()
        compB.inject(container)

        container.sampleA.say()
        container.sampleB.say()
    }

}