package task

class Theater(
    private val openTime: String, //영화관 오픈 시간
    private val closeTime: String //영화관 마감 시간
) {
    val movies: Set<Movie> = setOf() // 영화관에서 상영하는 영화 리스트

    /**
     * 영화 상영 시작 메소드
     *
     * @param content : 상영하고자 하는 영화 content
     */
    fun show() {
        getCurrentMovie().play()
    }

    /**
     * 영화 추가 메소드
     *
     * 영화 추가 후, 상영 시간표 재생성
     */
    fun addMovie(movie: Movie) = {
        movies + movie
        makeSchedule()
    }

    /**
     * 상영 시간표를 만드는 메소드
     */
    private fun makeSchedule() {
        //상영 시간표 만드는 특정 알고리즘
    }

    /**
     * 현재 상영해야하는 영화 가져오기
     */
    private fun getCurrentMovie(): Movie {
        // 타임 테이블에서 현재 상영해야하는 영화 가져오기
        // 실제 알고리즘은 미구현
        return Movie("반지의 제왕", 2_000)
    }
}