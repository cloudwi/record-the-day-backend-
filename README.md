# Record-The-Day-Backend- <br><br> Record-The-Day Project

## 프로젝트 기획의도
> '하루를 기록하다'는 대학생 때 강의내용을 메모장 또는 카카오톡에 기록을 해두고 필요할 때마다 찾아서 보았습니다. 기록한 자료들이 섞여 있어서 찾는 시간이 오래걸리는 단점이 있었습니다. 그래서 이 프로젝트를 만듦으로써 오늘 할 일 , 중요도에 따른 노트를 기록할 수 있는 기능을 구현하고자 아이디어를 생각했습니다.

## 빌드 환경
    git clone https://github.com/cloudwi/record-the-day-backend-.git
- IDE 환경 (인텔리제이)
  - IDE open : record-the-day-backend-
- Local 환경
  - java 17 version 없을 때 [JAVA 17](https://www.oracle.com/java/technologies/downloads/#java17) 설치 필요
  - `cd record-the-day-backend-`
  - [macOS] : `./gradlew build`
  - [window] : `./gradlew.bat build`
  - `java -jar hello-spring-0.0.1-SNAPSHOT.jar`

<br>

## api-docs
링크로 접속하여 /api-docs 입력

[Swagger](https://thuxzloyfg.us15.qoddiapp.com/swagger-ui)
- Explore : `/api-docs` 
<img width="944" alt="스크린샷 2023-02-09 14 49 36" src="https://user-images.githubusercontent.com/86584887/217729294-02cbe360-1aaa-4239-be9c-6993bef6a395.png" />

<br>

## ERD

<img width="400" src="https://user-images.githubusercontent.com/86584887/217872481-d5127c98-e06f-43ad-a20b-d504c4c90786.png" />

<br>

## 개발 환경

<p>
    <img src="https://img.shields.io/badge/javascript-F7DF1E?style=flat-square&logo=javascript&logoColor=white"/>
    <img src="https://img.shields.io/badge/react-61DAFB?style=flat-square&logo=react&logoColor=white"/>
    <img src="https://img.shields.io/badge/React Router-CA4245?style=flat-square&logo=React Router&logoColor=white"/>
    <img src="https://img.shields.io/badge/redux-%23593d88.svg?style=for-the-badge&logo=redux&logoColor=white"/>
</p>

<p>
    <img src="https://img.shields.io/badge/Spring-6DB33F?style=flat-square&logo=Spring&logoColor=white"/>
    <img src="https://img.shields.io/badge/Spring Boot -6DB33F?style=flat-square&logo=Spring Boot&logoColor=white"/>
    <img src="https://img.shields.io/badge/SpringSecurity-6DB33F?style=flat-square&logo=SpringSecurity&logoColor=white"/>
    <img src="https://img.shields.io/badge/Data JPA-6DB33F?style=flat-square&logo=&logoColor=white"/>
    <img src="https://img.shields.io/badge/PostgreSQL -4479A1?style=flat-square&logo=PostgreSQL&logoColor=white"/>
</p>

<p>
    <img src="https://img.shields.io/badge/Heroku -4479A1?style=flat-square&logo=Heroku&logoColor=white"/>  
    <img src="https://img.shields.io/badge/Github Actions-4285F4?style=flat-square&logo=Github Actions&logoColor=white"/>
    <img src="https://img.shields.io/badge/Firebase-FFCA28?style=flat-square&logo=Firebase&logoColor=white"/>
    <img src="https://img.shields.io/badge/Github-181717?style=flat-square&logo=Github&logoColor=white"/>
</p>

<br>

## Backend 배포 주소 [https://thuxzloyfg.us15.qoddiapp.com)
## Frontend 배포 주소 [record-the-day-frontend-](https://todolist-b3d69.web.app/)

<br>

## 주요 기능

- JWT 자체 로그인 기능
- 회원가입, 로그인, 로그아웃
- Todo 조회 페이징, Todo 생성, Todo 체크, Todo 삭제
- Note 조회 페이징, Note 상세 조회, Note 생성, Note 삭제, Note 수정, Note 삭제

<br>

## 주요 개발

- 로그인 및 회원가입 ( JWT token 인증 방식 )
- Member, Todo, Note 연관관계 테이블 정의 CRUD 기능 탑재
- Todo와 Note 페이지화 시켜서 응답
- 커스텀 에러 타입 바탕으로 사용자 친화적으로 메시지 전달
- validation 사용하여 요청 객체 검증과 에러 발생시 에러 메시지 전달
- github action, Heroku, firebase 활용 배포 자동화
- swagger api-docs 확인

<br>

## 팀원

FRONT-END : [차지민 gitLink](https://github.com/d-o0o-b11)

BACK-END : [장주영 gitLink](https://github.com/cloudwi) /

<br>
