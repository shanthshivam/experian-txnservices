package com.b4nkd.experian.txnservices.api;

import java.math.BigDecimal;
import com.b4nkd.experian.txnservices.model.ErrorResponse;
import com.b4nkd.experian.txnservices.model.NullRequest;
import com.b4nkd.experian.txnservices.model.UFReport;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")
@Controller
public class ScoresApiController implements ScoresApi {

    private static final Logger log = LoggerFactory.getLogger(ScoresApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ScoresApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<UFReport> getUltraFICOReport(@ApiParam(value = "Type of format to Accept. Only Accepting JSON" ,required=true, defaultValue="application/json") @RequestHeader(value="Accept", required=true) String accept
,@ApiParam(value = "Input request format" ,required=true, defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@NotNull @ApiParam(value = "Specifies the reason for retrieving this report. For example, if you need an Extension of Credit, then your Permissible Purpose Code would be EXT.", required = true, defaultValue = "PQL") @Valid @RequestParam(value = "permissiblePurposeCode", required = true, defaultValue="PQL") String permissiblePurposeCode
,@NotNull @ApiParam(value = "The market or industry you are in. For example if you sell insurance, then your Market Code would be INSR", required = true, defaultValue = "INST") @Valid @RequestParam(value = "marketCode", required = true, defaultValue="INST") String marketCode
,@ApiParam(value = "ID of Consumer to fetch",required=true) @PathVariable("consumerID") String consumerID
,@ApiParam(value = "ID of Report to fetch",required=true) @PathVariable("reportID") Integer reportID
,@ApiParam(value = "" ,required=true )  @Valid @RequestBody NullRequest body
,@ApiParam(value = "Input Transactional Services subcode assigned" , defaultValue="0.0") @RequestHeader(value="subcode", required=false) BigDecimal subcode
) {
        accept =  request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UFReport>(objectMapper.readValue("{\r\n  \"consumerNames\" : [ \"JOHN DOE\", \"JOHN DOE\" ],\r\n  \"UltraFICO_Score_Negative_Reason_Code_2\" : \"0000\",\r\n  \"account_Disputed\" : \"0000\",\r\n  \"UltraFICO_Score_Negative_Reason_Code_3\" : \"0000\",\r\n  \"UltraFICO_Score_Negative_Reason_Code_1\" : \"0000\",\r\n  \"message_Code\" : \"0000\",\r\n  \"modelId\" : \"UF\",\r\n  \"UltraFICO_Score_Negative_Reason_Code_4\" : \"0000\",\r\n  \"chapter_13_BK_Reported\" : \"0000\",\r\n  \"accounts_Closed\" : \"0000\",\r\n  \"chapter_7_BK_Reported\" : \"0000\",\r\n  \"chapter_12_BK_Reported\" : \"0000\",\r\n  \"consumerAddresses\" : [ \"924 GAINSVILLE HIGHWAY SUITE 130 BUFORD, GA 30518\", \"924 GAINSVILLE HIGHWAY SUITE 130 BUFORD, GA 30518\" ],\r\n  \"message_Text\" : \"0000\",\r\n  \"chapter_11_BK_Reported\" : \"0000\",\r\n  \"transactionId\" : 7.386281948385884,\r\n  \"lenderResponse\" : {\r\n    \"activityCharacteristics\" : [ null, null ],\r\n    \"cashFlowCharacteristics\" : [ null, null ],\r\n    \"endDate\" : 1.4658129805029452,\r\n    \"consumerId\" : \"cf4af042ed1e67efbd4c7383403a0bb5\",\r\n    \"seasoned\" : true,\r\n    \"title\" : \"Finicity DDA Characteristics Report\",\r\n    \"type\" : \"dcr\",\r\n    \"consumerSsn\" : \"6789\",\r\n    \"institutions\" : {\r\n      \"name\" : \"FinBank Profiles - A\",\r\n      \"id\" : 5.637376656633329,\r\n      \"accounts\" : {\r\n        \"number\" : \"XX1111\",\r\n        \"reason\" : \"Business Account\",\r\n        \"firstNameConfidence\" : 7.061401241503109,\r\n        \"ownerName\" : \"Patrick & Lorraine Purchaser\",\r\n        \"addressConfidence\" : 3.616076749251911,\r\n        \"name\" : \"Checking\",\r\n        \"aggregationStatusCode\" : 2.027123023002322,\r\n        \"calcStatus\" : \"excluded\",\r\n        \"lastNameConfidence\" : 9.301444243932576,\r\n        \"id\" : 2.3021358869347655,\r\n        \"ownerAddress\" : \"7195 Belmont St. Parlin, NJ 08859\",\r\n        \"type\" : \"checking\"\r\n      }\r\n    },\r\n    \"createdDate\" : 0.8008281904610115,\r\n    \"portfolioId\" : \"abcdef12345-port\",\r\n    \"requestId\" : \"0a1b2c3d3\",\r\n    \"compositionCharacteristics\" : [ {\r\n      \"access\" : [ \"M\", \"M\" ],\r\n      \"name\" : \"avgDailyBalanceOver1Month\",\r\n      \"value\" : 4.145608029883936\r\n    }, {\r\n      \"access\" : [ \"M\", \"M\" ],\r\n      \"name\" : \"avgDailyBalanceOver1Month\",\r\n      \"value\" : 4.145608029883936\r\n    } ],\r\n    \"transactionCharacteristics\" : [ null, null ],\r\n    \"days\" : 5.962133916683182,\r\n    \"id\" : \"j48rf6h4naw6\",\r\n    \"negativeCharacteristics\" : [ null, null ],\r\n    \"startDate\" : 6.027456183070403,\r\n    \"status\" : \"success\"\r\n  },\r\n  \"voluntary_BK_Withdrawn\" : \"0000\",\r\n  \"UltraFICO_Score_Negative_FACTA\" : \"0000\",\r\n  \"statement_Text\" : \"0000\",\r\n  \"UltraFICO_Score_or_Exclusion\" : \"0000\",\r\n  \"ssn_Variation_Indicator\" : \"*6660000\"\r\n}", UFReport.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UFReport>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UFReport>(HttpStatus.NOT_IMPLEMENTED);
    }

}
