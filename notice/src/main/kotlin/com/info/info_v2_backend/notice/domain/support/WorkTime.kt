package com.info.info_v2_backend.notice.domain.support

import com.info.info_v2_backend.notice.adapter.input.rest.dto.request.support.WorkTimeRequest
import com.info.info_v2_backend.notice.adapter.input.rest.dto.request.worktime.EditWorkTimeRequest
import javax.persistence.Column
import javax.persistence.Embeddable

@Embeddable
class WorkTime(
    commuteStartTime: Int?,
    commuteEndTime: Int?,
    isFlexible: Boolean
) {

    @Column(name = "commute_start_time", nullable = true)
    var commuteStartTime: Int? = commuteStartTime
        protected set

    @Column(name = "commute_end_time", nullable = true)
    var commuteEndTime: Int? = commuteEndTime
        protected set

    @Column(name = "is_flexible", nullable = false)
    var isFlexible: Boolean = isFlexible
        protected set


    fun toWorkTimeRequest(): WorkTimeRequest {
        return WorkTimeRequest(
            this.commuteStartTime,
            this.commuteEndTime,
            this.isFlexible
        )
    }

    fun editWorkTime(r: EditWorkTimeRequest) {
        r.commuteStartTime?.let {
            this.commuteStartTime = r.commuteStartTime
        }
        r.commuteEndTime?.let {
            this.commuteEndTime = r.commuteEndTime
        }
    }
}