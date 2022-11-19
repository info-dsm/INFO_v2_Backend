package com.info.info_v2_backend.notice.application.port.output.smallClassification

import com.info.info_v2_backend.notice.domain.recruitmentBusiness.RecruitmentSmallClassification

interface SaveSmallClassificationPort {

    fun saveSmallClassification(smallClassification: RecruitmentSmallClassification): RecruitmentSmallClassification
}