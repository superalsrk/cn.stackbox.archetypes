package ${package}.controller;

import ${package}.AbstractTestCase;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jayway.restassured.RestAssured;
import org.apache.http.HttpStatus;
import org.junit.Before;

import static com.jayway.restassured.RestAssured.given;


public abstract class AbstractRouteTestCase extends AbstractTestCase {


    //一个单元测试用到的Mock账户
    protected  String globalAccessTokenMock;


    /**
     * 初始化MVC TEST
     * 1. 设置RestAssured绑定端口
     * 2. 初始化几个登陆账号的accessToken
     */
    @Before
    public void initMVC() {

        RestAssured.port = port;

        String loginContent3 = "password=testaccount&username=testaccount&grant_type=password&scope=read&client_secret=secret&client_id=client";
        String content3 = given().header("Accept", "application/json").header("Authorization", "Basic Y2xpZW50OnNlY3JldA==")
                .header("Content-Type", "application/x-www-form-urlencoded")
                .body(loginContent3)
                .when().post("/oauth/token").then().log().all()
                .statusCode(HttpStatus.SC_OK).extract().body().asString();

        JSONObject jo3 = JSON.parseObject(content3);
        this.globalAccessTokenMock = jo3.getString("access_token");
    }
}

