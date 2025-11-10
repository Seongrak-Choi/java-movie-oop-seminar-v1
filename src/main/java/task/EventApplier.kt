package task

import task.discount.Event

class EventApplier{
    // 이벤트 Set
    private var events: Set<Event> = emptySet()

    /**
     * 할인 이벤트 추가
     *
     * 이벤트 우선순위순으로 오름차순 정렬
     *
     * @param events
     */
    fun addEvent(events: List<Event>) {
        this.events += events
        sortEvent()
    }

    /**
     * 할인 적용
     *
     * @param moviePrice
     * @return
     */
    fun applyDiscount(moviePrice: Long): Long {
        var price = moviePrice

        events.forEach { event ->
            if (event.checkCondition()) price = event.applyDiscount(price)
        }

        return price
    }


    private fun sortEvent() {
        events.sortedBy { it.applyPriority }
    }
}