 - 프로젝트 가져와서 실행이 안된다?
1. build.gradle을 들어가서 프로젝트 빌드 하기
2. DB 소스 생성(DB명 METROFLOW_DB)
3. TESTCONNECT에서 실패가 뜬다면 4번부터 따라하기
4. DB 관련 이슈가 뜬다면 아래 DB 생성하는거 따라하기(48번줄)
5. 끝

------------------------------------------------------------------------------------------------------------------------------
  - 기본 프로젝트 구조
  
![image](https://github.com/user-attachments/assets/8a6ea5d3-c63c-4502-8d1c-ca1850dbdc30)



![image](https://github.com/user-attachments/assets/9c4faf90-a7be-4650-ac80-5eef8d8783e2)

-------------------------------------------------------------------------------------------------------------------------------

![image](https://github.com/user-attachments/assets/8578a642-22ce-4797-b363-ad623fbe167c)
- java
  - config : 환경 설정 파일을 모아두는 폴더(이름은 ~~~Config로 할 것 / 첫 글자는 대문자)
  - controller : 코드의 흐름을 맡아주는 Controller클래스를 모아두는 폴더(이름은 ~~~Controller로 할 것 / 첫 글자는 대문자)
  - model : MVC 패턴의 Model을 맡는 폴더로 안에 dao / dto / service 폴더가 있음
    - dao : DAO를 맡는 폴더로 DB에 접근하는 메소드를 모아두는 클래스를 만들 땐 이 폴더에 만들 것(이름은 ~~~DAO로 할 것 / 첫 글자는 대문자)
    - dto : DTO를 맡는 폴더로 객체의 정보를 전달하는 클래스를 만들 땐 이 폴더에 만들 것(첫 글자는 대문자)
    - service : 비즈니스 로직을 맡는 폴더로 이 폴더엔 비즈니스 로직이 담긴 클래스 폴더만 만들 것(이름은 ~~~Service로 할 것 / 첫 글자는 대문자)
  - repository : 저장소 격을 맡는 폴더로 이 폴더에는 인터페이스 파일만 넣어야 하며 이 인터페이스 파일을 거쳐야지만(@Autowired) DB의 데이터에 접근할 수 있게 해야함(이름은 ~~~Repository로 할 것 / 첫 글자는 대문자)

![image](https://github.com/user-attachments/assets/3b5481e7-fd8d-4090-be98-b8fc2d329a49)

- resources : view와 정적인 컨텐츠를 담는 폴더
  - static : 정적인 컨텐츠(상황에 따라 바뀌지 않는 모듈)로 img폴더 / js폴더 이외에도 정적인 자료가 필요하면 폴더를 새로 만들어서 그 안에 넣어서 사용할 것
    - img : 이미지를 저장하는 곳 모든 이미지는 ~~~.jpg로 할 것(임시)
    - js : 자바스크립트 파일을 모아두는 곳 만약 html파일에 넣어도 될 정도로 짧은 자바 스크립트라면 html파일에서 사용해도 O
  - templates : 동적인 컨텐츠를 담는 폴더(View를 담음) / user폴더 이외에도 카테고리 별로 폴더를 만들어서 사용할 것
    - user : 유저와 관련된 View를 담는 폴더
    
![image](https://github.com/user-attachments/assets/919b61eb-78ce-4fb1-8e7c-476c0700375c)

- sql : sql문을 담는 폴더(임시)

![image](https://github.com/user-attachments/assets/799dfea4-5bf8-4ca8-b4be-6a6dbc893682)

- application.properties : 애플리케이션 설정 파일 기본 설정은 위와 같음 설정 추가 시 insert to below 아래로 넣을 것
  - username : DB 사용자 이름(default값은 root)
  - password : DB 사용자 비밀번호
  - 나머지 설정은 아래와 같이 할 것(DB 연동 오류 시)
  1. MySQL 워크벤치를 켠다
  2. MySQL의 SQL File을 연 후 아래와 같이 작성한다.
  3. ![image](https://github.com/user-attachments/assets/5a7de5c9-0beb-42be-b5a5-65e0f00b19ac)
  => create schema `METROFLOW_DB` default character set utf8mb4
	default collate utf8mb4_general_ci;
use `METROFLOW_DB`;
  4. 실행하면 연동 끝

- build.gradle : 라이브러리 관리 툴로 라이브러리가 여기에 저장된다
  - ![image](https://github.com/user-attachments/assets/9832b2a3-fa61-4243-adb0-042161c10407)
  - 새로운 의존성 추가 시 주석 밑으로 추가 할 것!



