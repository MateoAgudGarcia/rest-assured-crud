/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package rest.assured.crud;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static rest.assured.crud.JsonFilled.*;

class AppTest {

    final String url = "https://6382b80a1ada9475c8f1db2e.mockapi.io";

    @Test
    void postTest() {
        baseURI = String.format("%s/User/", url);
        given().body(bodyPost()).post().then().statusCode(201).log().all().assertThat();
    }

    @Test
    void getTest() {
        baseURI = String.format("%s/User/1", url);
        when().get().then().statusCode(200).log().all().assertThat().
                body(KeysSchema.ID.label, Is.is("1")).
                body(KeysSchema.NAME.label, Is.is("Clifton Mayer")).
                body(KeysSchema.AVATAR.label, Is.is(
                        "https://cloudflare-ipfs.com/ipfs/Qmd3W5DuhgHirLHGVixi6V76LhCkZUz6pnFt5AJBiyvHye/avatar/333.jpg")).
                body(KeysSchema.CREATED_AT.label, Is.is("2022-11-26T04:07:16.507Z"));
    }

    @Test
    void patchTest() {
        baseURI = String.format("%s/User/3", url);
        given().body(bodyPatch()).patch().then().statusCode(200).log().all().assertThat();
    }

    @Test
    void putTest() {
        baseURI = String.format("%s/User/4", url);
        given().body(bodyPost()).put().then().statusCode(200).log().all().assertThat();
    }
}
