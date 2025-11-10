package task

import task.discount.Event

class Theater(
    private val openTime: String, //영화관 오픈 시간
    private val closeTime: String, //영화관 마감 시간
) {
    private var moviePrice: Long = 0 // 영화 가격
    private var videos: Set<Video> = setOf() // 영화관에서 상영하는 영화 리스트
    private val eventApplier = EventApplier() // event 관리 applier

    /**
     * 영화 추가
     *
     * 영화 추가 후, 상영 시간표 재생성
     */
    fun addMovie(video: Video) {
        this.videos += video
        makeSchedule()
    }

    /**
     * 최종 가격 확인
     *
     * @return
     */
    fun checkPrice(): Long {
        return eventApplier.applyDiscount(moviePrice)
    }

    /**
     * events 등록
     *
     * @param events
     */
    fun addEvent(events: List<Event>) {
        eventApplier.addEvent(events)
    }

    /**
     * 영화 표 가격 변경
     *
     * @param price
     */
    fun setMoviePrice(price: Long) {
        moviePrice = price
    }

    /**
     * 상영 시간표를 만드는 메소드
     */
    private fun makeSchedule() {
        //상영 시간표 만드는 특정 알고리즘
    }

}