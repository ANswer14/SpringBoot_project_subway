![image](https://github.com/user-attachments/assets/8578a642-22ce-4797-b363-ad623fbe167c)
- java
  - config : 환경 설정 파일을 모아두는 폴더(이름은 ~~~Config로 할 것 / 첫 글자는 대문자)
  - controller : 코드의 흐름을 맡아주는 Controller클래스를 모아두는 폴더(이름은 ~~~Controller로 할 것 / 첫 글자는 대문자)
  - model : MVC 패턴의 Model을 맡는 폴더로 안에 dao / dto / service 폴더가 있음
    - dao : DAO를 맡는 폴더로 DB에 접근하는 메소드를 모아두는 클래스를 만들 땐 이 폴더에 만들 것(이름은 ~~~DAO로 할 것 / 첫 글자는 대문자)
    - dto : DTO를 맡는 폴더로 객체의 정보를 전달하는 클래스를 만들 땐 이 폴더에 만들 것(이름은 ~~~DTO로 할 것 / 첫 글자는 대문자)
    - repository : 저장소 격을 맡는 폴더로 이 폴더에는 인터페이스 파일만 넣어야 하며 이 인터페이스 파일을 거쳐야지만(@Autowired) DB의 데이터에 접근할 수 있게 해야함(이름은 ~~~Repository로 할 것 / 첫 글자는 대문자)

![image](https://github.com/user-attachments/assets/3b5481e7-fd8d-4090-be98-b8fc2d329a49)

- resources : view와 정적인 컨텐츠를 담는 폴더
  - static : 정적인 컨텐츠(상황에 따라 바뀌지 않는 모듈)로 img폴더 / js폴더 이외에도 정적인 자료가 필요하면 폴더를 새로 만들어서 그 안에 넣어서 사용할 것
    - img : 이미지를 저장하는 곳 모든 이미지는 ~~~.jpg로 할 것(임시)
    - js : 자바스크립트 파일을 모아두는 곳 만약 html파일에 넣어도 될 정도로 짧은 자바 스크립트라면 html파일에서 사용해도 O
  - templates : 동적인 컨텐츠를 담는 폴더(View를 담음) / user폴더 이외에도 카테고리 별로 폴더를 만들어서 사용할 것
    - user : 유저와 관련된 View를 담는 폴더
    

