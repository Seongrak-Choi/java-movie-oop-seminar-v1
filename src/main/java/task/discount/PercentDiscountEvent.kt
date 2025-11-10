package task.discount

/**
 * 할인율이 적용 되는 이벤트
 *
 * @property percent : 할인율
 */
class PercentDiscountEvent(
    override val id: Int,
    override val applyPriority: Int,
    private val percent: Int,
    private val condition: () -> Boolean
) : Event() {
    override fun applyDiscount(price: Long): Long = price * (100 - percent)
    override fun checkCondition(): Boolean = condition()
}