package com.pallavi.stubs.stubs;


import com.github.tomakehurst.wiremock.WireMockServer;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;

public class StubsApplication
{

    public static void main(String[] args )
    {

        WireMockServer wireMockServer = new WireMockServer(wireMockConfig().port(9096)); //No-args constructor will start on port 8080, no HTTPS
        wireMockServer.start();

        wireMockServer.stubFor(get(urlEqualTo("/myfirst/stub"))
                .willReturn(aResponse()
                        .withHeader("Content-Type", "application/json")
                        .withBody("{\n" +
                                "  \"widget\": {\n" +
                                "    \"debug\": \"on\",\n" +
                                "    \"window\": {\n" +
                                "      \"title\": \"Sample Konfabulator Widget\",\n" +
                                "      \"name\": \"main_window\",\n" +
                                "      \"width\": 500,\n" +
                                "      \"height\": 500\n" +
                                "    },\n" +
                                "    \"image\": {\n" +
                                "      \"src\": \"Images/Sun.png\",\n" +
                                "      \"name\": \"sun1\",\n" +
                                "      \"hOffset\": 250,\n" +
                                "      \"vOffset\": 250,\n" +
                                "      \"alignment\": \"center\"\n" +
                                "    },\n" +
                                "    \"text\": {\n" +
                                "      \"data\": \"Click Here\",\n" +
                                "      \"size\": 36,\n" +
                                "      \"style\": \"bold\",\n" +
                                "      \"name\": \"text1\",\n" +
                                "      \"hOffset\": 250,\n" +
                                "      \"vOffset\": 100,\n" +
                                "      \"alignment\": \"center\",\n" +
                                "      \"onMouseUp\": \"sun1.opacity = (sun1.opacity / 100) * 90;\"\n" +
                                "    }\n" +
                                "  }\n" +
                                "}")));


    }
}

