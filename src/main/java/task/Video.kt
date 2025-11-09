package task

interface Video {
    val title: String
    val runtime: Long // 상영 시간

    /**
     * video를 시작하는 메소드
     */
    fun play()
}