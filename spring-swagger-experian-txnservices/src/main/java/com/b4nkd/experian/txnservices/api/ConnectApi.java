/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.22).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.b4nkd.experian.txnservices.api;

import java.math.BigDecimal;
import com.b4nkd.experian.txnservices.model.CreateLinkRequest;
import com.b4nkd.experian.txnservices.model.CreateiFrameURIResponse;
import com.b4nkd.experian.txnservices.model.EmailRequest;
import com.b4nkd.experian.txnservices.model.ErrorResponse;
import com.b4nkd.experian.txnservices.model.InitiateEmailResponse;
import com.b4nkd.experian.txnservices.model.Institutions;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")
@Api(value = "connect", description = "the connect API")
public interface ConnectApi {

    @ApiOperation(value = "Generate iFrame URL", nickname = "generateIFrameURL", notes = "Generates the Finicity Connect Link.", response = CreateiFrameURIResponse.class, authorizations = {
        @Authorization(value = "OauthSecurity", scopes = { 
            @AuthorizationScope(scope = "admin", description = "admin scope"),
            @AuthorizationScope(scope = "user", description = "user scope")
            })    }, tags={ "Consumer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "iFrame URI link is Created", response = CreateiFrameURIResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = ErrorResponse.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ErrorResponse.class),
        @ApiResponse(code = 404, message = "Not found", response = ErrorResponse.class) })
    @RequestMapping(value = "/connect/v1/generate",
        produces = { "*/*" }, 
        consumes = { "*/*" },
        method = RequestMethod.POST)
    ResponseEntity<CreateiFrameURIResponse> generateIFrameURL(@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Accept", required=true) String accept
,@ApiParam(value = "Input Request format" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@ApiParam(value = "" ,required=true )  @Valid @RequestBody CreateLinkRequest body
,@ApiParam(value = "Input Transactional Services subcode assigned" , defaultValue="0.0") @RequestHeader(value="subcode", required=false) BigDecimal subcode
);


    @ApiOperation(value = "Get Certified Institutions", nickname = "getCertifiedInstitutions", notes = "The Certified Institutions endpoint will return the product certification for each FI. When calling this endpoint, you can either specify a product, or by leaving the product out, a full list of all FI’s and their product certification will be returned. <br><br>Currently the filtering option is not available. ", response = Institutions.class, authorizations = {
        @Authorization(value = "OauthSecurity", scopes = { 
            @AuthorizationScope(scope = "admin", description = "admin scope"),
            @AuthorizationScope(scope = "user", description = "user scope")
            })    }, tags={ "Consumer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Institutions.class),
        @ApiResponse(code = 400, message = "Bad Request", response = ErrorResponse.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ErrorResponse.class),
        @ApiResponse(code = 404, message = "Not found", response = ErrorResponse.class) })
    @RequestMapping(value = "/connect/v1/certifiedInstitutions/",
        produces = { "*/*" }, 
        method = RequestMethod.GET)
    ResponseEntity<Institutions> getCertifiedInstitutions(@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Accept", required=true) String accept
,@ApiParam(value = "Input request format" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@ApiParam(value = "Input Transactional Services subcode assigned" , defaultValue="0.0") @RequestHeader(value="subcode", required=false) BigDecimal subcode
,@ApiParam(value = "This field is optional but if it is included it will filter out the institutions by Institution Type. Valid fields are: voa, voi, ach, agg, aha, state_agg, trans_agg. Currently it is still in progress and not working.", defaultValue = "voa") @Valid @RequestParam(value = "type", required = false, defaultValue="voa") String type
);


    @ApiOperation(value = "Initiate email request", nickname = "initiateEmailRequest", notes = "This endpoint allows the lender to send an email request to the borrower. This email will contain a link that will direct the borrower to Finicity Connect, which will allow the borrower to add their banking accounts so that a verification report can be generated.  ", response = InitiateEmailResponse.class, authorizations = {
        @Authorization(value = "OauthSecurity", scopes = { 
            @AuthorizationScope(scope = "admin", description = "admin scope"),
            @AuthorizationScope(scope = "user", description = "user scope")
            })    }, tags={ "Consumer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = InitiateEmailResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = ErrorResponse.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ErrorResponse.class),
        @ApiResponse(code = 404, message = "Not found", response = ErrorResponse.class) })
    @RequestMapping(value = "/connect/v1/send/email",
        produces = { "*/*" }, 
        consumes = { "*/*" },
        method = RequestMethod.POST)
    ResponseEntity<InitiateEmailResponse> initiateEmailRequest(@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Accept", required=true) String accept
,@ApiParam(value = "Input request format" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@ApiParam(value = "Email Request Information" ,required=true )  @Valid @RequestBody EmailRequest body
);

}
