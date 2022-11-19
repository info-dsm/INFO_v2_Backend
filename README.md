# INFO_v2_Backend


> **INFO 프로젝트**는 기존 **직접 담당자와 연락하여** 이루어지던 
*대덕sw마이스터고 현장 실습생 채용 의뢰를 전산화하여* 
소통 과정에서 발생하는 불필요한 연락을 제거하고, **웹 어플리케이션**으로 전환하여 **학교 산학부 담당자** 부재 시에도 **원활한 채용 프로세스 진행**이 가능하게 하여  `가용성` 및 `안정성` 확보를 기대할 수 있습니다.
>




1. 프로젝트 배경 💡
    
    > 🍃 기존 대덕sw마이스터고 현장실습생 채용 의뢰는
    > 
    > 
    > > "학교로 연락" -> "회사가 채용 의뢰서 작성" -> "각종 서류 검토 및 회사 담당자와 연락" -> "학생 연계"
    > > 
    > 
    >  위와 같은 구조로 이루어져있었습니다. 
    >  하지만 이 구조에서는 학교와 회사 인사 담당자 사이의 불필요한 연락🔥이 불가피하게 많아질 수밖에 없었으며, 🍃한 해에 채용 의뢰 희망 기업이 몇십 개 씩이나 존재하는 대덕sw마이스터고에서는🎨 나날이 증가하는 it 업계 규모와 더불어 졸업생들의 뛰어난 산업계에서의 직무 능력에서 비롯된 영향 등으로 인해 늘어나는 채용 의뢰 건수를 담당하기에 업무적으로 일부 어려움을 겪기도 하였습니다.
    > 
    >  이에, 이러한 기존 문제를 해결하고자 회사에서 학교로 이어지는 채용 의뢰 프로세스💡를 웹 어플리케이션🍃으로 전환하여 서비스의 가용성과 안정성을 높일 뿐 아니라, 기존 교내 프로젝트와의 다양한 협업을 도모하여 추후 발전할 가능성을 염두 해두고 있습니다.🔥
    > 
    
    > 많은 학생들이 학교로 채용 의뢰를 한 기업을 조회하기 위해 산학 협력부 외벽에 부착된 채용 공고를 확인하지만, 산학부의 경우 다른 부서와 다르게 1층에 단독으로 위치해있어 학생들이 다가가기 어려울 뿐만 아니라 거리상으로도 주변에 학생이 이용하는 장소가 다른 교무실에 비해 현저히 적기에 접근성 또한 떨어집니다.💡
     이에, 학생들로 하여금 채용을 의뢰한 기업들⭐️을 확인하기 쉽고, 신규 채용 공고를 확인하기 용이하도록 웹 어플리케이션으로 서비스를 제공하여 브라우저를 통해 손쉽게 이용할 수 있도록 합니다.🔮
    > 
2. 서비스 대상 🔥
    1. 대덕 sw 마이스터고 산학 협력부
        1. 교사 분들의 채용 과정에서의 복잡성을 해소하고, 학생, 회사 간의 연계성을 확대하여 업무 부담 최소화.
    2. 대덕 sw 마이스터고 재학생
        1. 취업이 눈앞에 다가온 3학년 재학생 분들이 신규 기업체를 확인하기 위하여, 또는 본인의 적성에 부합하는 회사를 찾기 위하여 매번 산학 협력부 공고를 확인하러 다른 층을 방문하는 비효율 제거.
    3. 채용 의뢰 희망 기업체
        1. 채용 의뢰를 위하여 직접 연락을 하고, 필요한 정보가 무엇인지 등 사람 대 사람으로써 이루어지는 작업을 시스템화 하여 프로그램으로 처리하도록 함으로써 사람에 의해 발생할 수 있는 문제에 대한 부담을 제거하고, 학교 업무시간에 대한 제약 없이 언제든지 채용 의뢰 관련 작업을 수행할 수 있도록 함.
![INFO 메인](https://user-images.githubusercontent.com/59428479/202425751-3967bee2-46b5-4c88-9760-bd953cf09740.png)


![INFO 채용 공고 정보](https://user-images.githubusercontent.com/59428479/202425793-a0e16f1d-e9d5-444b-97f2-1cae99baed67.png)





 INFO Project Backend 서버입니다. 기존, 모놀리식 아키텍처를 채택하여 빠르게 구성한 INFO_v1_Backend 서버를 MSA, Hexagornal, DDD로 설계하려 노력했습니다. 






# Event Storming
---
![INFO 프로젝트 Event Storming](https://user-images.githubusercontent.com/59428479/202425081-ae43e6c8-35bc-42a1-be51-0f4416fc4bad.jpg)



# MSA
---

![INFO_v2_Backened_Architecture](https://user-images.githubusercontent.com/59428479/202425324-034b440d-3499-4e41-ac2f-3bba6453547a.png)



- 서비스를 유저, 권한, 채용, 모집공고, 이메일, 회사, 파일 등으로 나누어 분리합니다.
- Auth 서비스에서 Login 로직을 구현하여 토큰을 발행하고, API Gateway에서 Token을 파싱하여 헤더에 값을 추가하여 각 서비스에서 권한을 검증하고, 현재 사용자의 정보를 참조합니다.

# Hexagonal(포트 및 어댑터 아키텍처)
---

<img width="873" alt="Hexagornal Architecture" src="https://user-images.githubusercontent.com/59428479/202425478-fe91b4d3-a83e-4668-b6fe-b7ff4ab3756b.png">



- SOLID 원칙 준수의 용이
- 계층 별 의존성 최소화
    - 비즈니스 계층이 표현 계층이나 데이터 액세스 로직에 의존하지 않도록함.
