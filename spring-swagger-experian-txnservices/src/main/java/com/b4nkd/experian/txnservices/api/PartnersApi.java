/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.22).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.b4nkd.experian.txnservices.api;

import java.math.BigDecimal;
import com.b4nkd.experian.txnservices.model.ErrorResponse;
import com.b4nkd.experian.txnservices.model.ExternalResellerRequest;
import com.b4nkd.experian.txnservices.model.ExternalResellerResponse;
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
@Api(value = "partners", description = "the partners API")
public interface PartnersApi {

    @ApiOperation(value = "Generate Reseller Billing & Reporting", nickname = "generateResellerBillingReporting", notes = "Partners would like the capability to see the Billing records generated for a specific date range as well as the custom fields associated with the report. This will allow partners to determine which branches have generated specific reports to better bill those branches. ", response = ExternalResellerResponse.class, authorizations = {
        @Authorization(value = "OauthSecurity", scopes = { 
            @AuthorizationScope(scope = "admin", description = "admin scope"),
            @AuthorizationScope(scope = "user", description = "user scope")
            })    }, tags={ "Consumer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ExternalResellerResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = ErrorResponse.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ErrorResponse.class),
        @ApiResponse(code = 404, message = "Not found", response = ErrorResponse.class) })
    @RequestMapping(value = "/partners/{partnerID}/billingdata",
        produces = { "*/*" }, 
        consumes = { "*/*" },
        method = RequestMethod.POST)
    ResponseEntity<ExternalResellerResponse> generateResellerBillingReporting(@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json", defaultValue="application/json") @RequestHeader(value="Accept", required=true) String accept
,@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@ApiParam(value = "Input Transactional Services subcode assigned" ,required=true, defaultValue="0.0") @RequestHeader(value="subcode", required=true) BigDecimal subcode
,@NotNull @ApiParam(value = "The earliest date to be analyzed in this report.", required = true, defaultValue = "1.4595768E+9") @Valid @RequestParam(value = "startDate", required = true, defaultValue="1.4595768E+9") BigDecimal startDate
,@NotNull @ApiParam(value = "The latest date to be analyzed in this report", required = true, defaultValue = "1.502604E+9") @Valid @RequestParam(value = "endDate", required = true, defaultValue="1.502604E+9") BigDecimal endDate
,@ApiParam(value = "ID of the report partner",required=true) @PathVariable("partnerID") Integer partnerID
,@ApiParam(value = "" ,required=true )  @Valid @RequestBody ExternalResellerRequest body
,@ApiParam(value = "The page to be viewed.", defaultValue = "1") @Valid @RequestParam(value = "page", required = false, defaultValue="1") Integer page
,@ApiParam(value = "The size of the results returned per page", defaultValue = "1") @Valid @RequestParam(value = "size", required = false, defaultValue="1") Integer size
);

}
