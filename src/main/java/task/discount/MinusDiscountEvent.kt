package task.discount

/**
 * 할인금액을 차감하는 이벤트
 *
 * @property amount : 할인 금액
 */
class MinusDiscountEvent(
    override val id: Int,
    override val applyPriority: Int,
    private val amount: Long,
    private val condition: () -> Boolean
) : Event() {
    override fun applyDiscount(price: Long): Long = price - amount
    override fun checkCondition(): Boolean = condition()
}