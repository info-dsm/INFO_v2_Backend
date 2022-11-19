package com.info.info_v2_backend.company.application.port.output.company

import com.info.info_v2_backend.company.domain.Company
import org.springframework.data.domain.Page

interface LoadCompanyPort {

    fun loadCompany(companyId: String): Company?
    fun loadAllCompanyList(idx: Int, size: Int): Page<Company>
    fun loadAllCompanyListByYear(idx: Int, size: Int, year: Int): Page<Company>
}