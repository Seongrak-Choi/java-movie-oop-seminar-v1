package task.discount

abstract class Event {
    // 이벤트 고유 ID
    abstract val id: Int

    // 적용 순서
    abstract val applyPriority: Int

    /**
     * 할인 적용 메소드
     *
     * @param price : 정가
     * @return : 할인이 적용된 가격
     */
    abstract fun applyDiscount(price: Long): Long

    /**
     * 할인 적용 여부를 확인하는 메소드
     *
     * @return : 할인 적용 여부
     */
    abstract fun checkCondition(): Boolean

    override fun equals(other: Any?): Boolean =
        other is Event && this.id == other.id

    override fun hashCode(): Int = id.hashCode()
}