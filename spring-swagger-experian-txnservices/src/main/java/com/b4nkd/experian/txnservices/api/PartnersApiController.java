package com.b4nkd.experian.txnservices.api;

import java.math.BigDecimal;
import com.b4nkd.experian.txnservices.model.ErrorResponse;
import com.b4nkd.experian.txnservices.model.ExternalResellerRequest;
import com.b4nkd.experian.txnservices.model.ExternalResellerResponse;
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
public class PartnersApiController implements PartnersApi {

    private static final Logger log = LoggerFactory.getLogger(PartnersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PartnersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ExternalResellerResponse> generateResellerBillingReporting(@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json", defaultValue="application/json") @RequestHeader(value="Accept", required=true) String accept
,@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@ApiParam(value = "Input Transactional Services subcode assigned" ,required=true, defaultValue="0.0") @RequestHeader(value="subcode", required=true) BigDecimal subcode
,@NotNull @ApiParam(value = "The earliest date to be analyzed in this report.", required = true, defaultValue = "1.4595768E+9") @Valid @RequestParam(value = "startDate", required = true, defaultValue="1.4595768E+9") BigDecimal startDate
,@NotNull @ApiParam(value = "The latest date to be analyzed in this report", required = true, defaultValue = "1.502604E+9") @Valid @RequestParam(value = "endDate", required = true, defaultValue="1.502604E+9") BigDecimal endDate
,@ApiParam(value = "ID of the report partner",required=true) @PathVariable("partnerID") Integer partnerID
,@ApiParam(value = "" ,required=true )  @Valid @RequestBody ExternalResellerRequest body
,@ApiParam(value = "The page to be viewed.", defaultValue = "1") @Valid @RequestParam(value = "page", required = false, defaultValue="1") Integer page
,@ApiParam(value = "The size of the results returned per page", defaultValue = "1") @Valid @RequestParam(value = "size", required = false, defaultValue="1") Integer size
) {
        accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ExternalResellerResponse>(objectMapper.readValue("{\r\n  \"data\" : [ {\r\n    \"lastName\" : \"Doe\",\r\n    \"totalRemainingPages\" : 0,\r\n    \"firstname\" : \"John\",\r\n    \"billedTransaction\" : \"N\",\r\n    \"consumerId\" : \"0h7h3r301md83\",\r\n    \"reseller\" : \"Experian\",\r\n    \"billDate\" : \"2019-10-16T04:56:03.970+0000\",\r\n    \"consumerSSN\" : \"6789\",\r\n    \"reportType\" : \"voa\",\r\n    \"lastFourReportid\" : \"8907\",\r\n    \"createdDate\" : \"2019-10-09T21:27:56.000+0000\",\r\n    \"resellerProvider\" : \"experian\",\r\n    \"platformProvider\" : \"PTEST\",\r\n    \"lenderName\" : \"abc\",\r\n    \"customerId\" : \"11111111\",\r\n    \"partnerId\" : \"2445582773174\",\r\n    \"loanId\" : \"gjhorjeoijl12\",\r\n    \"status\" : \"success\"\r\n  }, {\r\n    \"lastName\" : \"Doe\",\r\n    \"totalRemainingPages\" : 0,\r\n    \"firstname\" : \"John\",\r\n    \"billedTransaction\" : \"N\",\r\n    \"consumerId\" : \"0h7h3r301md83\",\r\n    \"reseller\" : \"Experian\",\r\n    \"billDate\" : \"2019-10-16T04:56:03.970+0000\",\r\n    \"consumerSSN\" : \"6789\",\r\n    \"reportType\" : \"voa\",\r\n    \"lastFourReportid\" : \"8907\",\r\n    \"createdDate\" : \"2019-10-09T21:27:56.000+0000\",\r\n    \"resellerProvider\" : \"experian\",\r\n    \"platformProvider\" : \"PTEST\",\r\n    \"lenderName\" : \"abc\",\r\n    \"customerId\" : \"11111111\",\r\n    \"partnerId\" : \"2445582773174\",\r\n    \"loanId\" : \"gjhorjeoijl12\",\r\n    \"status\" : \"success\"\r\n  } ],\r\n  \"message\" : \"External reseller billing details successfully retrieved\",\r\n  \"status\" : \"success\"\r\n}", ExternalResellerResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ExternalResellerResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ExternalResellerResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
