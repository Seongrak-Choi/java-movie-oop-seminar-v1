package task.discount

import java.time.Clock
import java.time.LocalDate
import java.time.LocalTime
import java.time.ZoneId

object EventConditions {

    /**
     * 현재 시간이 beforeTime 이전과 afterTime 이후인 경우를
     * 확인하는 람다 함수
     *
     * @param beforeTime : 이전 적용 시간
     * @param afterTime : 이후 적용 시간
     * @return : 현재 시간이 beforeTime 이전과 afterTime 이후인 경우 true
     */
    fun timeCondition(beforeTime: Int, afterTime: Int): () -> Boolean = {
        val early = LocalTime.of(beforeTime, 0)
        val late = LocalTime.of(afterTime, 0)
        val now = LocalTime.now()

        now.isBefore(early) || !now.isBefore(late)
    }

    /**
     * 현재 날짜가 allowedDays 에 포함되는 경우를 확인하는 람다 함수
     *
     * @param allowedDays : 허용되는 날짜
     * @param zoneId : 시간대
     * @return : 현재 날짜가 allowedDays 에 포함되는 경우 true
     */
    fun movieDayCondition(allowedDays: Set<Int>, zoneId: String): () -> Boolean = {
        val clock = Clock.system(ZoneId.of(zoneId))
        allowedDays.contains(LocalDate.now(clock).dayOfMonth)
    }
}