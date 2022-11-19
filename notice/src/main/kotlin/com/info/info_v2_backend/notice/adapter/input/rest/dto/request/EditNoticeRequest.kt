package com.info.info_v2_backend.notice.adapter.input.rest.dto.request

import com.info.info_v2_backend.notice.adapter.input.rest.dto.request.openPeriod.EditNoticeOpenPeriodRequest
import com.info.info_v2_backend.notice.adapter.input.rest.dto.request.pay.EditPayRequest
import com.info.info_v2_backend.notice.adapter.input.rest.dto.request.support.EditMealSupportRequest
import com.info.info_v2_backend.notice.adapter.input.rest.dto.request.welfare.EditWelfareRequest
import com.info.info_v2_backend.notice.adapter.input.rest.dto.request.workPlace.EditWorkPlaceRequest
import com.info.info_v2_backend.notice.adapter.input.rest.dto.request.worktime.EditWorkTimeRequest

data class EditNoticeRequest(
    val detailBusinessDescription: String?,
    val numberOfEmployee: Int?,
    val gradeCutLine: Int?,
    val workTime: EditWorkTimeRequest?,
    val pay: EditPayRequest?,
    val mealSupport: EditMealSupportRequest?,
    val welfare: EditWelfareRequest?,
    val noticeOpenPeriod: EditNoticeOpenPeriodRequest?,
    val needDocuments: String?,
    val otherFeatures: String?,
    val workPlace: EditWorkPlaceRequest?,
    val isPersonalContact: Boolean?

)
