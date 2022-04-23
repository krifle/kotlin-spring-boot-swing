# Swing Practice
- 스윙이 왜 죽어가는지 모르겠지만 써 보니까 나름 훌륭합니다.
- 특히 IntelliJ 에서 제공하는 Swing UI Designer 툴을 사용하면 웹 컴포넌트 그리는 것보다 더 편하게 작성할 수 있을것 같습니다.
- Spring Boot + Kotlin + Swing 으로 샘플 프로젝트 생성 테스트를 진행하였습니다.
- 추후.. Graalvm 적용하면 native 로 된 데스크탑 에플리케이션 작성도 가능할듯 합니다.

# Project Settings
- IntelliJ -> Project Structure -> JDK1.8
- IntelliJ -> Preferences.. -> Editor -> GUI Designer
    * Generated GUI into: Java source code
- pom.xml 에 다음 dependency 추가 필요
    ```xml
    <dependency>
        <groupId>com.intellij</groupId>
        <artifactId>forms_rt</artifactId>
        <version>7.0.3</version>
    </dependency>
    ```


## Build
```shell
mvn install
```

## Run
```shell
java -jar swing-practice-0.0.1-SNAPSHOT.jar
```

## Result
### Mac
![스크린샷 2022-04-23 오후 4 27 22](https://user-images.githubusercontent.com/3281770/164887038-7058a262-e700-4a99-813a-28e2ac7687a7.png)

### Windows
![스크린샷 2022-04-23 오후 5 22 21](https://user-images.githubusercontent.com/3281770/164887053-5dfe601e-e25e-4670-879a-21b0532034cb.png)

# Swing Designer
- https://www.youtube.com/watch?v=5vSyylPPEko
- ![스크린샷 2022-04-23 오후 5 31 30](https://user-images.githubusercontent.com/3281770/164886990-421ff1c3-0be2-4783-a24a-454919c6a60e.png)

# Reference project
- https://github.com/mightychip/spring-boot-swing
