package task

class Main {
    val lordOfTheRing = Movie("반지의 제왕", 1000)
    val m3Theater = Theater(openTime = "0630", closeTime = "2200")

    init {
        m3Theater.addMovie(lordOfTheRing)
    }
}