package com.b4nkd.experian.txnservices.api;

import java.math.BigDecimal;
import com.b4nkd.experian.txnservices.model.CreateLinkRequest;
import com.b4nkd.experian.txnservices.model.CreateiFrameURIResponse;
import com.b4nkd.experian.txnservices.model.EmailRequest;
import com.b4nkd.experian.txnservices.model.ErrorResponse;
import com.b4nkd.experian.txnservices.model.InitiateEmailResponse;
import com.b4nkd.experian.txnservices.model.Institutions;
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
public class ConnectApiController implements ConnectApi {

    private static final Logger log = LoggerFactory.getLogger(ConnectApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ConnectApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<CreateiFrameURIResponse> generateIFrameURL(@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Accept", required=true) String accept
,@ApiParam(value = "Input Request format" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@ApiParam(value = "" ,required=true )  @Valid @RequestBody CreateLinkRequest body
,@ApiParam(value = "Input Transactional Services subcode assigned" , defaultValue="0.0") @RequestHeader(value="subcode", required=false) BigDecimal subcode
) {
        accept =  request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CreateiFrameURIResponse>(objectMapper.readValue("{\r\n  \"link\" : \"https://connect.finicity.com\"\r\n}", CreateiFrameURIResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CreateiFrameURIResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CreateiFrameURIResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Institutions> getCertifiedInstitutions(@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Accept", required=true) String accept
,@ApiParam(value = "Input request format" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@ApiParam(value = "Input Transactional Services subcode assigned" , defaultValue="0.0") @RequestHeader(value="subcode", required=false) BigDecimal subcode
,@ApiParam(value = "This field is optional but if it is included it will filter out the institutions by Institution Type. Valid fields are: voa, voi, ach, agg, aha, state_agg, trans_agg. Currently it is still in progress and not working.", defaultValue = "voa") @Valid @RequestParam(value = "type", required = false, defaultValue="voa") String type
) {
        accept =  request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Institutions>(objectMapper.readValue("{\r\n  \"institutions\" : [ {\r\n    \"trans_agg\" : 1.4658129805029452,\r\n    \"voi\" : 5.637376656633329,\r\n    \"state_agg\" : 2.3021358869347655,\r\n    \"ach\" : 7.061401241503109,\r\n    \"name\" : \"Chase\",\r\n    \"voa\" : 5.962133916683182,\r\n    \"id\" : 6.027456183070403,\r\n    \"aha\" : 9.301444243932576\r\n  }, {\r\n    \"trans_agg\" : 1.4658129805029452,\r\n    \"voi\" : 5.637376656633329,\r\n    \"state_agg\" : 2.3021358869347655,\r\n    \"ach\" : 7.061401241503109,\r\n    \"name\" : \"Chase\",\r\n    \"voa\" : 5.962133916683182,\r\n    \"id\" : 6.027456183070403,\r\n    \"aha\" : 9.301444243932576\r\n  } ],\r\n  \"requestedDate\" : 0.8008281904610115\r\n}", Institutions.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Institutions>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Institutions>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InitiateEmailResponse> initiateEmailRequest(@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Accept", required=true) String accept
,@ApiParam(value = "Input request format" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@ApiParam(value = "Email Request Information" ,required=true )  @Valid @RequestBody EmailRequest body
) {
        accept =  request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InitiateEmailResponse>(objectMapper.readValue("{\r\n  \"emailConfig\" : {\r\n    \"brandColor\" : \"#000\",\r\n    \"signature\" : [ \"Cindy Mayfield\", \"Cindy Mayfield\" ],\r\n    \"subject\" : \"Verify your income\",\r\n    \"supportPhone\" : 0.8008281904610115,\r\n    \"link\" : \"https://connect.finicity.com\",\r\n    \"type\" : \"voa\",\r\n    \"firstName\" : \"Bob\",\r\n    \"institutionName\" : \"Acme Lending\",\r\n    \"institutionAddress\" : \"222 Winipeg Drive SLC UT, 84109\",\r\n    \"from\" : \"lender-john@acme-lending.com\",\r\n    \"partnerId\" : \"123456789\",\r\n    \"to\" : \"consumer-bob@gmail.com\",\r\n    \"brandLogo\" : \"https://acme-lending.com/logo.png\"\r\n  },\r\n  \"link\" : \"https://connect.finicity.com\"\r\n}", InitiateEmailResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InitiateEmailResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InitiateEmailResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
