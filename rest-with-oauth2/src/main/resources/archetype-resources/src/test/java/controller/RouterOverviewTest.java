package ${package}.controller;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpStatus;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class RouterOverviewTest extends AbstractRouteTestCase {

    @Test
    public void testOk() {
        assertEquals("123", "123");
    }


    /**
     * 单元测试: 测试一个带权限控制的REST接口
     */
    @Test
    public void testAuthRoute() {

        JSONObject params = new JSONObject();
        params.put("desc", "testBaseController");

        given().header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + globalAccessTokenMock).body(params.toJSONString())
                .when().post("/testauth").then().log().all()
                .statusCode(HttpStatus.SC_OK)
                .body("status", equalTo(200))
                .body("data.desc", equalTo("testBaseController"));
    }
}
