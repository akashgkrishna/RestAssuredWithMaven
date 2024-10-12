package airlines.createAirline;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utlis.RestUtils;

import java.util.HashMap;

public class CreateAirlineTest {

    @Test
    public void createAirlineTest() {
        String baseUri = "https://api.instantwebtools.net/v1/airlines";
        String requestBody = """
                {
                    "_id":"124",
                    "name": "Sri Lankan Airways",
                    "country": "Sri Lanka",
                    "logo": "https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/sri_lanka.png",
                    "slogan": "From Sri Lanka",
                    "head_quaters": "Katunayake, Sri Lanka",
                    "website": "www.srilankaaairways.com",
                    "established": "1990"
                }""";

        Response response = RestUtils.performPost(baseUri, requestBody, new HashMap<>());

        Assert.assertEquals(response.statusCode(), 200, "Status Code Not Matching");
    }
}
