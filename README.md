# happiness-daily-kotlin-api
- 경주님의 꿈과 희망을 이루어주기 위한 행복일기
- 프로젝트하면서 활발하게 공유할 것 있으면 서로 공유하기!
- Kotlin & Spring Boot & Spring Data JPA & QueryDSL

# 패키지 구조
- 멀티모듈 방식을 차용
- 참고 문서 
  - [https://techblog.woowahan.com/2637/]
  - [https://zkdlu.tistory.com/4]

```
WIP
- app (:APP 서비스 로직)
 - v1
  - domain (comment, content .. ETC)
   - adapter (외내부 영역 연계 Port)
    - in (외부 요청에 의한 비즈니스 호출)
    - out (비즈니스 로직을 통한 외부 호출)
   - application
    - dto
    - port
     - in (외부에 요청 UseCase)
     - out (비즈니스 로직에서 외부로 요청)
     - command (UseCase를 실행시키는 command)
    - service
- common (:공통 도메인 로직)
- modules (:외부 모듈)
- http-request (:http file)
```

# Code & Commit Convention
- 코틀린스럽게 작성 하는것을 지향한다.
- PR템플릿을 적절히 활용하여 작성하자.
- 최소한의 기능당 테스트코드 1개를 작성하여 PR을 날린다.
- `KotlinCodeStyle.xml` 코드 스타일 가이드를 따른다.

# Describe - Context - It
- Describe - Context - It 기반 Test Code를 작성한다.
[https://johngrib.github.io/wiki/junit5-nested/]

# PR 방식
- 가능한 모든 작업은 PR을 통하여 작업한다.
- `코드 리뷰`를 진행한 후에 Merge 하기! (Github PR 코드리뷰)
- `코드 리뷰`는 부드러운 말투 or 이모지와 함께 작성하기! (중요!)

# 프로젝트 진행 순서
0. ~기능요건을 정확히 명세한다.~ (2021-11-14)
1. ~Entity 설계(DB 설계)~
2. 아키텍쳐 설계
3. API 역할 분배
4. API 개발

# Member

- 최정균
- 김민태
