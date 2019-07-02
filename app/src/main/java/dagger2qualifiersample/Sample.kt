package dagger2qualifiersample

interface Sample {

    fun say()

}

class ImplA: Sample {
    override fun say() {
        println("ImplA")
    }

}

class ImplB: Sample {
    override fun say() {
        println("ImplB")
    }

}