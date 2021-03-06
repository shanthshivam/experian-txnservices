/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.22).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.b4nkd.experian.txnservices.api;

import com.b4nkd.experian.txnservices.model.AccountOwner;
import com.b4nkd.experian.txnservices.model.ArrayOfCustomerReports;
import java.math.BigDecimal;
import com.b4nkd.experian.txnservices.model.Constraints;
import com.b4nkd.experian.txnservices.model.Consumer;
import com.b4nkd.experian.txnservices.model.ConsumerRequest;
import com.b4nkd.experian.txnservices.model.CreateConsumerResponse;
import com.b4nkd.experian.txnservices.model.ErrorResponse;
import com.b4nkd.experian.txnservices.model.GeneratePayStatementReportResponse;
import com.b4nkd.experian.txnservices.model.GenerateReportResponse;
import com.b4nkd.experian.txnservices.model.MfaChallenge;
import com.b4nkd.experian.txnservices.model.MfaChallenges;
import com.b4nkd.experian.txnservices.model.NullRequest;
import com.b4nkd.experian.txnservices.model.ReportList;
import com.b4nkd.experian.txnservices.model.SingleReport;
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
@Api(value = "decisioning", description = "the decisioning API")
public interface DecisioningApi {

    @ApiOperation(value = "Create Consumer", nickname = "createConsumer", notes = "Create a new Consumer Record using a Customer ID", response = CreateConsumerResponse.class, authorizations = {
        @Authorization(value = "OauthSecurity", scopes = { 
            @AuthorizationScope(scope = "admin", description = "admin scope"),
            @AuthorizationScope(scope = "user", description = "user scope")
            })    }, tags={ "Consumer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Consumer is Created", response = CreateConsumerResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = ErrorResponse.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ErrorResponse.class),
        @ApiResponse(code = 404, message = "Not found", response = ErrorResponse.class) })
    @RequestMapping(value = "/decisioning/v1/customers/{customerID}/consumer",
        produces = { "*/*" }, 
        consumes = { "*/*" },
        method = RequestMethod.POST)
    ResponseEntity<CreateConsumerResponse> createConsumer(@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Accept", required=true) String accept
,@ApiParam(value = "Input request format" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@ApiParam(value = "ID of Customer to fetch",required=true) @PathVariable("customerID") String customerID
,@ApiParam(value = "Consumer Information" ,required=true )  @Valid @RequestBody ConsumerRequest body
,@ApiParam(value = "Input Transactional Services subcode assigned" , defaultValue="0.0") @RequestHeader(value="subcode", required=false) BigDecimal subcode
);


    @ApiOperation(value = "(Deprecated) Generate VOI Report", nickname = "deprecatedGenerateVOIReport", notes = "Generate a Verification of Income (VOI) report for all checking, savings, and money market accounts for the given customer. <br><br>This service retrieves up to two years of transaction history for each account and uses this information to generate the VOI report. ", response = GenerateReportResponse.class, authorizations = {
        @Authorization(value = "OauthSecurity", scopes = { 
            @AuthorizationScope(scope = "admin", description = "admin scope"),
            @AuthorizationScope(scope = "user", description = "user scope")
            })    }, tags={ "Consumer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 202, message = "Request Accepted", response = GenerateReportResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = ErrorResponse.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ErrorResponse.class),
        @ApiResponse(code = 404, message = "Not found", response = ErrorResponse.class) })
    @RequestMapping(value = "/decisioning/v1/customers/{customerID}/voi",
        produces = { "*/*" }, 
        method = RequestMethod.POST)
    ResponseEntity<GenerateReportResponse> deprecatedGenerateVOIReport(@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Accept", required=true) String accept
,@ApiParam(value = "Input request format" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@ApiParam(value = "ID of the customer",required=true) @PathVariable("customerID") Integer customerID
,@ApiParam(value = "Input Transactional Services subcode assigned" , defaultValue="0.0") @RequestHeader(value="subcode", required=false) BigDecimal subcode
,@ApiParam(value = "The Report Listener URL to receive notifications (optional, must be URL-encoded)", defaultValue = "https://www.mydomain.com/txpush/listener") @Valid @RequestParam(value = "callbackUrl", required = false, defaultValue="https://www.mydomain.com/txpush/listener") String callbackUrl
,@ApiParam(value = "The 'fromDate' param is an Epoch Timestamp (in seconds)", defaultValue = "1494449017") @Valid @RequestParam(value = "fromDate", required = false, defaultValue="1494449017") String fromDate
);


    @ApiOperation(value = "Generate DCR Report", nickname = "generateDCRReport", notes = "Generate a DDA Credit Characteristics Report (DCR) for all checking and savings under the given Customer.  <br><br>This service retrieves up to two years of transaction history for the given account. It then uses this information to generate the DCR.  ", response = GenerateReportResponse.class, authorizations = {
        @Authorization(value = "OauthSecurity", scopes = { 
            @AuthorizationScope(scope = "admin", description = "admin scope"),
            @AuthorizationScope(scope = "user", description = "user scope")
            })    }, tags={ "Consumer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 202, message = "Request Accepted", response = GenerateReportResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = ErrorResponse.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ErrorResponse.class),
        @ApiResponse(code = 404, message = "Not found", response = ErrorResponse.class) })
    @RequestMapping(value = "/decisioning/v2/customers/{customerID}/dcr",
        produces = { "*/*" }, 
        consumes = { "*/*" },
        method = RequestMethod.POST)
    ResponseEntity<GenerateReportResponse> generateDCRReport(@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Accept", required=true) String accept
,@ApiParam(value = "Input request format" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@ApiParam(value = "ID of the customer",required=true) @PathVariable("customerID") Integer customerID
,@ApiParam(value = "" ,required=true )  @Valid @RequestBody NullRequest body
,@ApiParam(value = "Input Transactional Services subcode assigned" , defaultValue="0.0") @RequestHeader(value="subcode", required=false) BigDecimal subcode
,@ApiParam(value = "The Report Listener URL to receive notifications (optional, must be URL-encoded)", defaultValue = "https://www.mydomain.com/txpush/listener") @Valid @RequestParam(value = "callbackUrl", required = false, defaultValue="https://www.mydomain.com/txpush/listener") String callbackUrl
,@ApiParam(value = "The 'fromDate' param is an Epoch Timestamp (in seconds). This is an optional field.  Without this param, the report defaults to 6 months if available. ", defaultValue = "1494449017") @Valid @RequestParam(value = "fromDate", required = false, defaultValue="1494449017") String fromDate
);


    @ApiOperation(value = "Generate Pay Statement Extraction Report", nickname = "generatePayStatementExtractionReport", notes = "Generate Pay Statement Extraction Report for the given customer. This service accepts asset IDs of the stored pay statements to generate a Pay Statement Extraction Report. Finicity will extract relevant data from each of the pay statements.A report will be built with the data extracted from the pay statements.  ", response = GeneratePayStatementReportResponse.class, authorizations = {
        @Authorization(value = "OauthSecurity", scopes = { 
            @AuthorizationScope(scope = "admin", description = "admin scope"),
            @AuthorizationScope(scope = "user", description = "user scope")
            })    }, tags={ "Consumer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 202, message = "Request Accepted", response = GeneratePayStatementReportResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = ErrorResponse.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ErrorResponse.class),
        @ApiResponse(code = 404, message = "Not found", response = ErrorResponse.class) })
    @RequestMapping(value = "/decisioning/v2/customers/{customerID}/payStatement",
        produces = { "*/*" }, 
        consumes = { "*/*" },
        method = RequestMethod.POST)
    ResponseEntity<GeneratePayStatementReportResponse> generatePayStatementExtractionReport(@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Accept", required=true) String accept
,@ApiParam(value = "Input request format" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@ApiParam(value = "Input Transactional Services subcode assigned" ,required=true, defaultValue="0.0") @RequestHeader(value="subcode", required=true) BigDecimal subcode
,@ApiParam(value = "ID of the customer",required=true) @PathVariable("customerID") Integer customerID
,@ApiParam(value = "The constraints object." ,required=true )  @Valid @RequestBody Constraints body
,@ApiParam(value = "The Report Listener URL to receive notifications (optional, must be URL-encoded)", defaultValue = "https://www.mydomain.com/txpush/listener") @Valid @RequestParam(value = "callbackUrl", required = false, defaultValue="https://www.mydomain.com/txpush/listener") String callbackUrl
);


    @ApiOperation(value = "Generate VOAI report", nickname = "generateVOAIReport", notes = "Generate a Verification of Assets with GSE Income View (VOAI) report for all checking, savings, money market, and investment accounts for the given customer. This service retrieves up to 24 months of transaction history for each account and uses this information to generate the VOAI report. ", response = GenerateReportResponse.class, authorizations = {
        @Authorization(value = "OauthSecurity", scopes = { 
            @AuthorizationScope(scope = "admin", description = "admin scope"),
            @AuthorizationScope(scope = "user", description = "user scope")
            })    }, tags={ "Consumer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 202, message = "Request Accepted", response = GenerateReportResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = ErrorResponse.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ErrorResponse.class),
        @ApiResponse(code = 404, message = "Not found", response = ErrorResponse.class) })
    @RequestMapping(value = "/decisioning/v1/customers/{customerID}/voai",
        produces = { "*/*" }, 
        method = RequestMethod.POST)
    ResponseEntity<GenerateReportResponse> generateVOAIReport(@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Accept", required=true) String accept
,@ApiParam(value = "Input Transactional Services subcode assigned" ,required=true, defaultValue="0.0") @RequestHeader(value="subcode", required=true) BigDecimal subcode
,@ApiParam(value = "Input request format" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@ApiParam(value = "ID of the customer",required=true) @PathVariable("customerID") Integer customerID
,@ApiParam(value = "The Report Listener URL to receive notifications (optional, must be URL-encoded)", defaultValue = "https://www.mydomain.com/txpush/listener") @Valid @RequestParam(value = "callbackUrl", required = false, defaultValue="https://www.mydomain.com/txpush/listener") String callbackUrl
,@ApiParam(value = "The 'fromDate' param is an Epoch Timestamp (in seconds). This is an optional field.  Without this param, the report defaults to 6 months if available. ", defaultValue = "1494449017") @Valid @RequestParam(value = "fromDate", required = false, defaultValue="1494449017") String fromDate
);


    @ApiOperation(value = "Generate VOA Report", nickname = "generateVOAReport", notes = "Generate a Verification of Assets (VOA) report for all checking, savings, money market, and investment accounts for the given customer. <br><br>This service retrieves up to six months of transaction history for each account and uses this information to generate the VOA report. ", response = GenerateReportResponse.class, authorizations = {
        @Authorization(value = "OauthSecurity", scopes = { 
            @AuthorizationScope(scope = "admin", description = "admin scope"),
            @AuthorizationScope(scope = "user", description = "user scope")
            })    }, tags={ "Consumer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 202, message = "Request Accepted", response = GenerateReportResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = ErrorResponse.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ErrorResponse.class),
        @ApiResponse(code = 404, message = "Not found", response = ErrorResponse.class) })
    @RequestMapping(value = "/decisioning/v1/customers/{customerID}/voa",
        produces = { "*/*" }, 
        consumes = { "*/*" },
        method = RequestMethod.POST)
    ResponseEntity<GenerateReportResponse> generateVOAReport(@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Accept", required=true) String accept
,@ApiParam(value = "Input request format" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@ApiParam(value = "ID of the customer",required=true) @PathVariable("customerID") Integer customerID
,@ApiParam(value = "" ,required=true )  @Valid @RequestBody NullRequest body
,@ApiParam(value = "Input Transactional Services subcode assigned" , defaultValue="0.0") @RequestHeader(value="subcode", required=false) BigDecimal subcode
,@ApiParam(value = "The Report Listener URL to receive notifications (optional, must be URL-encoded)", defaultValue = "https://www.mydomain.com/txpush/listener") @Valid @RequestParam(value = "callbackUrl", required = false, defaultValue="https://www.mydomain.com/txpush/listener") String callbackUrl
,@ApiParam(value = "The 'fromDate' param is an Epoch Timestamp (in seconds). This is an optional field.  Without this param, the report defaults to 6 months if available. ", defaultValue = "1494449017") @Valid @RequestParam(value = "fromDate", required = false, defaultValue="1494449017") String fromDate
);


    @ApiOperation(value = "Generate VOI Report", nickname = "generateVOIReport", notes = "Generate a Verification of Income (VOI) report for all checking, savings, and money market accounts for the given customer. <br><br>This service retrieves up to two years of transaction history for each account and uses this information to generate the VOI report.<br><br>Currently fromDate will be ignored. ", response = GenerateReportResponse.class, authorizations = {
        @Authorization(value = "OauthSecurity", scopes = { 
            @AuthorizationScope(scope = "admin", description = "admin scope"),
            @AuthorizationScope(scope = "user", description = "user scope")
            })    }, tags={ "Consumer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 202, message = "Request Accepted", response = GenerateReportResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = ErrorResponse.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ErrorResponse.class),
        @ApiResponse(code = 404, message = "Not found", response = ErrorResponse.class) })
    @RequestMapping(value = "/decisioning/v2/customers/{customerID}/voi",
        produces = { "*/*" }, 
        consumes = { "*/*" },
        method = RequestMethod.POST)
    ResponseEntity<GenerateReportResponse> generateVOIReport(@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Accept", required=true) String accept
,@ApiParam(value = "Input request format" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@ApiParam(value = "ID of the customer",required=true) @PathVariable("customerID") Integer customerID
,@ApiParam(value = "" ,required=true )  @Valid @RequestBody NullRequest body
,@ApiParam(value = "Input Transactional Services subcode assigned" , defaultValue="0.0") @RequestHeader(value="subcode", required=false) BigDecimal subcode
,@ApiParam(value = "The Report Listener URL to receive notifications (optional, must be URL-encoded)", defaultValue = "https://www.mydomain.com/txpush/listener") @Valid @RequestParam(value = "callbackUrl", required = false, defaultValue="https://www.mydomain.com/txpush/listener") String callbackUrl
,@ApiParam(value = "The 'fromDate' param is an Epoch Timestamp (in seconds). This is an optional field.  Without this param, the report defaults to 6 months if available. ", defaultValue = "1494449017") @Valid @RequestParam(value = "fromDate", required = false, defaultValue="1494449017") String fromDate
);


    @ApiOperation(value = "Get Account Owner", nickname = "getAccountOwner", notes = "Return the account owner's name and address. This may require connecting to the institution, so MFA challenges may be required. <br><br>HTTP status of 200 means the account owner's name and address were retrieved successfully. <br><br>HTTP status of 203 means the response contains an MFA challenge in XML or JSON format ", response = AccountOwner.class, authorizations = {
        @Authorization(value = "OauthSecurity", scopes = { 
            @AuthorizationScope(scope = "admin", description = "admin scope"),
            @AuthorizationScope(scope = "user", description = "user scope")
            })    }, tags={ "Consumer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Account Owner Details", response = AccountOwner.class),
        @ApiResponse(code = 203, message = "Account Owner Details (MFA Challenge)", response = MfaChallenges.class),
        @ApiResponse(code = 400, message = "Bad Request", response = ErrorResponse.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ErrorResponse.class),
        @ApiResponse(code = 404, message = "Not found", response = ErrorResponse.class) })
    @RequestMapping(value = "/decisioning/v1/customers/{customerID}/accounts/{accountID}/owner",
        produces = { "*/*" }, 
        method = RequestMethod.GET)
    ResponseEntity<AccountOwner> getAccountOwner(@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Accept", required=true) String accept
,@ApiParam(value = "Input request format" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@ApiParam(value = "The ID of the customer who owns the account",required=true) @PathVariable("customerID") Integer customerID
,@ApiParam(value = "The Finicity ID of the account",required=true) @PathVariable("accountID") Integer accountID
,@ApiParam(value = "Input Transactional Services subcode assigned" , defaultValue="0.0") @RequestHeader(value="subcode", required=false) BigDecimal subcode
);


    @ApiOperation(value = "Get Account Owner wMFA", nickname = "getAccountOwnerWMFA", notes = "Send MFA answers for an earlier challenge while getting an account statement. <br><br>HTTP status of 200 means the account owner's name and address were retrieved successfully. <br><br>HTTP status of 203 means the response contains another MFA challenge ", response = AccountOwner.class, authorizations = {
        @Authorization(value = "OauthSecurity", scopes = { 
            @AuthorizationScope(scope = "admin", description = "admin scope"),
            @AuthorizationScope(scope = "user", description = "user scope")
            })    }, tags={ "Consumer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Account Owner Details", response = AccountOwner.class),
        @ApiResponse(code = 203, message = "Account Details (MFA Challenge)", response = MfaChallenges.class),
        @ApiResponse(code = 400, message = "Bad Request", response = ErrorResponse.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ErrorResponse.class),
        @ApiResponse(code = 404, message = "Not found", response = ErrorResponse.class) })
    @RequestMapping(value = "/decisioning/v1/customers/{customerID}/accounts/{accountID}/owner/mfa",
        produces = { "*/*" }, 
        consumes = { "*/*" },
        method = RequestMethod.POST)
    ResponseEntity<AccountOwner> getAccountOwnerWMFA(@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Accept", required=true) String accept
,@ApiParam(value = "Input request format" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@ApiParam(value = "Session identifier.Copied directly from the previous response (the value will be different for each HTTP 203 response received)" ,required=true, defaultValue="MFA_SESSION") @RequestHeader(value="MFA-Session", required=true) String mfASession
,@ApiParam(value = "The ID of the customer who owns the account",required=true) @PathVariable("customerID") Integer customerID
,@ApiParam(value = "The Finicity ID of the account",required=true) @PathVariable("accountID") Integer accountID
,@ApiParam(value = "MFA Challenges Segment" ,required=true )  @Valid @RequestBody MfaChallenge body
,@ApiParam(value = "Input Transactional Services subcode assigned" , defaultValue="0.0") @RequestHeader(value="subcode", required=false) BigDecimal subcode
);


    @ApiOperation(value = "Get Consumer", nickname = "getConsumer", notes = "Get the details of a consumer record.", response = Consumer.class, authorizations = {
        @Authorization(value = "OauthSecurity", scopes = { 
            @AuthorizationScope(scope = "admin", description = "admin scope"),
            @AuthorizationScope(scope = "user", description = "user scope")
            })    }, tags={ "Consumer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Consumer Details", response = Consumer.class),
        @ApiResponse(code = 400, message = "Bad Request", response = ErrorResponse.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ErrorResponse.class),
        @ApiResponse(code = 404, message = "Not found", response = ErrorResponse.class) })
    @RequestMapping(value = "/decisioning/v1/consumers/{consumerID}",
        produces = { "*/*" }, 
        method = RequestMethod.GET)
    ResponseEntity<Consumer> getConsumer(@ApiParam(value = "Input request format" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@ApiParam(value = "ID of the consumer (UUID with max length 32 characters)",required=true) @PathVariable("consumerID") String consumerID
,@ApiParam(value = "Output Report format" , allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Accept", required=false) String accept
,@ApiParam(value = "Input Transactional Services subcode assigned" , defaultValue="0.0") @RequestHeader(value="subcode", required=false) BigDecimal subcode
);


    @ApiOperation(value = "Get Consumer for Customer", nickname = "getConsumerForCustomer", notes = "Get the details of a consumer record. If a consumer has not been created for this customer, the service will return HTTP 404 (Not Found). ", response = Consumer.class, authorizations = {
        @Authorization(value = "OauthSecurity", scopes = { 
            @AuthorizationScope(scope = "admin", description = "admin scope"),
            @AuthorizationScope(scope = "user", description = "user scope")
            })    }, tags={ "Consumer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Consumer.class),
        @ApiResponse(code = 400, message = "Bad Request", response = ErrorResponse.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ErrorResponse.class),
        @ApiResponse(code = 404, message = "Not found", response = ErrorResponse.class) })
    @RequestMapping(value = "/decisioning/v1/customers/{customerID}/consumer",
        produces = { "*/*" }, 
        method = RequestMethod.GET)
    ResponseEntity<Consumer> getConsumerForCustomer(@ApiParam(value = "ID of Customer to fetch",required=true) @PathVariable("customerID") Integer customerID
,@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Accept", required=true) String accept
,@ApiParam(value = "Input request format" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@ApiParam(value = "Input Transactional Services subcode assigned" , defaultValue="0.0") @RequestHeader(value="subcode", required=false) BigDecimal subcode
);


    @ApiOperation(value = "Get Report by Consumer", nickname = "getReportByConsumer", notes = "Get a Report that has been generated by calling one of the Generate Report services. <br><br>The Report's status field will contain inProgress, failure, or success. If the status shows inProgress, the client app should wait 20 seconds and then call again to see if the Report is finished. ", response = SingleReport.class, authorizations = {
        @Authorization(value = "OauthSecurity", scopes = { 
            @AuthorizationScope(scope = "admin", description = "admin scope"),
            @AuthorizationScope(scope = "user", description = "user scope")
            })    }, tags={ "Consumer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = SingleReport.class),
        @ApiResponse(code = 400, message = "Bad Request", response = ErrorResponse.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ErrorResponse.class),
        @ApiResponse(code = 404, message = "Not found", response = ErrorResponse.class) })
    @RequestMapping(value = "/decisioning/v1/consumers/{consumerID}/reports/{reportID}",
        produces = { "*/*" }, 
        method = RequestMethod.GET)
    ResponseEntity<SingleReport> getReportByConsumer(@ApiParam(value = "ID of Consumer to fetch",required=true) @PathVariable("consumerID") String consumerID
,@ApiParam(value = "ID of Report to fetch",required=true) @PathVariable("reportID") Integer reportID
,@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json, application/xml, application/pdf", defaultValue="application/json") @RequestHeader(value="Accept", required=true) String accept
,@ApiParam(value = "Input request format" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@NotNull @ApiParam(value = "2-digit code from Permissible Purpose Codes, specifying the reason for retrieving this report.", required = true, defaultValue = "2k") @Valid @RequestParam(value = "purpose", required = true, defaultValue="2k") String purpose
,@ApiParam(value = "Input Transactional Services subcode assigned" , defaultValue="0.0") @RequestHeader(value="subcode", required=false) BigDecimal subcode
);


    @ApiOperation(value = "Get Report by Customer", nickname = "getReportByCustomer", notes = "Get a report that has been generated by calling one of the Generate Report services. <br><br>The report's status field will contain inProgress, failure, or success. If the status shows inProgress, the client app should wait 20 seconds and then call again to see if the report is finished. ", response = SingleReport.class, authorizations = {
        @Authorization(value = "OauthSecurity", scopes = { 
            @AuthorizationScope(scope = "admin", description = "admin scope"),
            @AuthorizationScope(scope = "user", description = "user scope")
            })    }, tags={ "Consumer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = SingleReport.class),
        @ApiResponse(code = 400, message = "Bad Request", response = ErrorResponse.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ErrorResponse.class),
        @ApiResponse(code = 404, message = "Not found", response = ErrorResponse.class) })
    @RequestMapping(value = "/decisioning/v1/customers/{customerID}/reports/{reportID}",
        produces = { "*/*" }, 
        method = RequestMethod.GET)
    ResponseEntity<SingleReport> getReportByCustomer(@ApiParam(value = "ID of Customer to fetch",required=true) @PathVariable("customerID") Integer customerID
,@ApiParam(value = "ID of Report to fetch",required=true) @PathVariable("reportID") Integer reportID
,@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json, application/xml, application/pdf", defaultValue="application/json") @RequestHeader(value="Accept", required=true) String accept
,@ApiParam(value = "Input request format" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@NotNull @ApiParam(value = "2-digit code from Permissible Purpose Codes, specifying the reason for retrieving this report.", required = true, defaultValue = "2k") @Valid @RequestParam(value = "purpose", required = true, defaultValue="2k") String purpose
,@ApiParam(value = "Input Transactional Services subcode assigned" , defaultValue="0.0") @RequestHeader(value="subcode", required=false) BigDecimal subcode
);


    @ApiOperation(value = "Get Reports for Consumer", nickname = "getReportsForConsumer", notes = "Get a list of reports that have been generated for the given consumer.", response = ReportList.class, authorizations = {
        @Authorization(value = "OauthSecurity", scopes = { 
            @AuthorizationScope(scope = "admin", description = "admin scope"),
            @AuthorizationScope(scope = "user", description = "user scope")
            })    }, tags={ "Consumer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of Reports", response = ReportList.class),
        @ApiResponse(code = 400, message = "Bad Request", response = ErrorResponse.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ErrorResponse.class),
        @ApiResponse(code = 404, message = "Not found", response = ErrorResponse.class) })
    @RequestMapping(value = "/decisioning/v1/consumers/{consumerID}/reports",
        produces = { "*/*" }, 
        method = RequestMethod.GET)
    ResponseEntity<ReportList> getReportsForConsumer(@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Accept", required=true) String accept
,@ApiParam(value = "Input request format" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@ApiParam(value = "ID of the consumer (UUID with max length 32 characters)",required=true) @PathVariable("consumerID") String consumerID
,@ApiParam(value = "Input Transactional Services subcode assigned" , defaultValue="0.0") @RequestHeader(value="subcode", required=false) BigDecimal subcode
);


    @ApiOperation(value = "Get Reports for Customer", nickname = "getReportsForCustomer", notes = "Get a list of Reports that have been generated for the given customer. <br><br>The status fields in the returned list will contain 'inProgress', 'failure', or 'success'. If a status shows 'inProgress', wait 20 seconds and then call again ", response = ArrayOfCustomerReports.class, authorizations = {
        @Authorization(value = "OauthSecurity", scopes = { 
            @AuthorizationScope(scope = "admin", description = "admin scope"),
            @AuthorizationScope(scope = "user", description = "user scope")
            })    }, tags={ "Consumer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = ArrayOfCustomerReports.class),
        @ApiResponse(code = 400, message = "Bad Request", response = ErrorResponse.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ErrorResponse.class),
        @ApiResponse(code = 404, message = "Not found", response = ErrorResponse.class) })
    @RequestMapping(value = "/decisioning/v1/customers/{customerID}/reports",
        produces = { "*/*" }, 
        method = RequestMethod.GET)
    ResponseEntity<ArrayOfCustomerReports> getReportsForCustomer(@ApiParam(value = "ID of Customer to fetch",required=true) @PathVariable("customerID") Integer customerID
,@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Accept", required=true) String accept
,@ApiParam(value = "Input request format" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@ApiParam(value = "Input Transactional Services subcode assigned" , defaultValue="0.0") @RequestHeader(value="subcode", required=false) BigDecimal subcode
);


    @ApiOperation(value = "Modify Consumer", nickname = "modifyConsumer", notes = "Modify the details for an existing consumer. All fields are required for a consumer record, but individual fields for this call are optional because fields that are not specified will be left unchanged. ", authorizations = {
        @Authorization(value = "OauthSecurity", scopes = { 
            @AuthorizationScope(scope = "admin", description = "admin scope"),
            @AuthorizationScope(scope = "user", description = "user scope")
            })    }, tags={ "Consumer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "The resource was modified successfully."),
        @ApiResponse(code = 400, message = "Bad Request", response = ErrorResponse.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ErrorResponse.class),
        @ApiResponse(code = 404, message = "Not found", response = ErrorResponse.class) })
    @RequestMapping(value = "/decisioning/v1/consumers/{consumerID}",
        produces = { "*/*" }, 
        consumes = { "*/*" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> modifyConsumer(@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Accept", required=true) String accept
,@ApiParam(value = "Input Request format" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@ApiParam(value = "ID of Consumer to fetch",required=true) @PathVariable("consumerID") String consumerID
,@ApiParam(value = "" ,required=true )  @Valid @RequestBody ConsumerRequest body
,@ApiParam(value = "Input Transactional Services subcode assigned" , defaultValue="0.0") @RequestHeader(value="subcode", required=false) BigDecimal subcode
);

}

