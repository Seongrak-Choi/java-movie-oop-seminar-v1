package task

import task.discount.Event
import task.discount.EventConditions
import task.discount.MinusDiscountEvent
import task.discount.PercentDiscountEvent

class Main {
    private val lordOfTheRing = Movie("반지의 제왕", 1000)
    private val m3Theater = Theater(openTime = "0630", closeTime = "2200")

    private val timeEvent = MinusDiscountEvent(
        id = 1,
        applyPriority = 2,
        amount = 2000,
        condition = EventConditions.timeCondition(11, 20)
    )

    private val movieDayEvent = PercentDiscountEvent(
        id = 2,
        applyPriority = 1,
        percent = 10,
        condition = EventConditions.movieDayCondition(setOf(10, 20, 30), "Asia/Seoul")
    )

    private val events: List<Event> = listOf(timeEvent, movieDayEvent)

    init {
        m3Theater.addMovie(lordOfTheRing)
        m3Theater.addEvent(events)
    }

    fun run() {
        m3Theater.setMoviePrice(10_000)
        println(m3Theater.checkPrice())
    }
}