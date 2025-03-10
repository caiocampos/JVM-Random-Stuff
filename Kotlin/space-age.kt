const val EARTH = 31557600L
val YEAR = hashMapOf(
    "earth" to EARTH,
    "mercury" to EARTH * 0.2408467,
    "venus" to EARTH * 0.61519726,
    "mars" to EARTH * 1.8808158,
    "jupiter" to EARTH * 11.862615,
    "saturn" to EARTH * 29.447498,
    "uranus" to EARTH * 84.016846,
    "neptune" to EARTH * 164.79132
)

class SpaceAge(val seconds: Long) {
    private fun age(planet: String): Double {
        return (seconds / (YEAR.getValue(planet) ?: 1.0)).toDouble().let { it -> "%.2f".format(it) }
    }

    fun onEarth(): Double {
        return age("earth")
    }

    fun onMercury(): Double {
        return age("mercury")
    }

    fun onVenus(): Double {
        return age("venus")
    }

    fun onMars(): Double {
        return age("mars")
    }

    fun onJupiter(): Double {
        return age("jupiter")
    }

    fun onSaturn(): Double {
        return age("saturn")
    }

    fun onUranus(): Double {
        return age("uranus")
    }

    fun onNeptune(): Double {
        return age("neptune")
    }
}

fun main() {
    val spaceAge = SpaceAge(31557600L)
    println(spaceAge.onEarth())
}
