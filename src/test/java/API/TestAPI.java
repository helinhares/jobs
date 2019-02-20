package API;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.*;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

import static com.jayway.restassured.module.jsv.JsonSchemaValidator.*;

public class TestAPI {

	private static String uriBase;

	@Test
	//Verificar se recebe o status 200
	
	public void TesteCodeStatus() {
		setUriBase("http://5b847b30db24a100142dce1b.mockapi.io/api/v1/simulador");
		getResponseStatus(200);
	}
	
	@Test
	//Verifica se recebe a response esperada
	public void TesteResponse() {
		setUriBase("http://5b847b30db24a100142dce1b.mockapi.io/api/v1/simulador");
		getResponseJson("API/schema_test1.json");
	}
	

	private void setUriBase(String url) {
		uriBase = url;
	}

	private void getResponseStatus(Integer status) {
		given().relaxedHTTPSValidation().when().get(uriBase).then().statusCode(status);
	}

	private void getResponseJson(String srcArquivo) {
		given().relaxedHTTPSValidation().when().get(uriBase).then().assertThat()
				.body(matchesJsonSchemaInClasspath(srcArquivo));
	}

}
