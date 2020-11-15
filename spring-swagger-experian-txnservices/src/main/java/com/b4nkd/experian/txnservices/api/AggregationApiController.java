package com.b4nkd.experian.txnservices.api;

import com.b4nkd.experian.txnservices.model.Account;
import com.b4nkd.experian.txnservices.model.ArrayOfCustomerAccounts;
import java.math.BigDecimal;
import com.b4nkd.experian.txnservices.model.CallbackUrl;
import com.b4nkd.experian.txnservices.model.CreateCustomerResponse;
import com.b4nkd.experian.txnservices.model.Customer;
import com.b4nkd.experian.txnservices.model.CustomerAccount;
import com.b4nkd.experian.txnservices.model.CustomerRequest;
import com.b4nkd.experian.txnservices.model.Customers;
import com.b4nkd.experian.txnservices.model.ErrorResponse;
import com.b4nkd.experian.txnservices.model.Institution;
import com.b4nkd.experian.txnservices.model.MfaChallenge;
import com.b4nkd.experian.txnservices.model.MfaChallenges;
import com.b4nkd.experian.txnservices.model.ModifyPartnerRequest;
import org.springframework.core.io.Resource;
import com.b4nkd.experian.txnservices.model.StoreCustomerPayStatementRequest;
import com.b4nkd.experian.txnservices.model.StoreCustomerPayStatementResponse;
import com.b4nkd.experian.txnservices.model.SubscriptionList;
import com.b4nkd.experian.txnservices.model.Transaction;
import com.b4nkd.experian.txnservices.model.TransactionResponseForTesting;
import com.b4nkd.experian.txnservices.model.UserNameRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;

import org.apache.commons.io.IOUtils;
import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-15T11:00:50.772965300Z[Europe/London]")
@Controller
public class AggregationApiController implements AggregationApi {

    private static final Logger log = LoggerFactory.getLogger(AggregationApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AggregationApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<TransactionResponseForTesting> addTransactionForTestingAccount(@ApiParam(value = "Input request format" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Accept", required=true) String accept
,@ApiParam(value = "The Finicity ID of the customer who owns the account",required=true) @PathVariable("customerID") Integer customerID
,@ApiParam(value = "The Finicity ID of the account whose events will be sent to the TxPUSH Listener",required=true) @PathVariable("accountID") Integer accountID
,@ApiParam(value = "Transaction record" ,required=true )  @Valid @RequestBody Transaction body
,@ApiParam(value = "Input Transactional Services subcode assigned" , defaultValue="0.0") @RequestHeader(value="subcode", required=false) BigDecimal subcode
) {
        accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TransactionResponseForTesting>(objectMapper.readValue("{\r\n  \"createdDate\" : \"createdDate\",\r\n  \"id\" : \"id\"\r\n}", TransactionResponseForTesting.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TransactionResponseForTesting>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TransactionResponseForTesting>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CreateCustomerResponse> createActiveCustomer(@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Accept", required=true) String accept
,@ApiParam(value = "Input request format" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@ApiParam(value = "" ,required=true )  @Valid @RequestBody UserNameRequest body
,@ApiParam(value = "Input Transactional Services subcode assigned" , defaultValue="0.0") @RequestHeader(value="subcode", required=false) BigDecimal subcode
) {
        accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CreateCustomerResponse>(objectMapper.readValue("{\r\n  \"createdDate\" : \"123456789\",\r\n  \"id\" : \"11111111\"\r\n}", CreateCustomerResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CreateCustomerResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CreateCustomerResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteCustomer(@ApiParam(value = "ID of Customer to modify",required=true) @PathVariable("customerID") Integer customerID
,@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Accept", required=true) String accept
,@ApiParam(value = "Input request format" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@ApiParam(value = "Input Transactional Services subcode assigned" , defaultValue="0.0") @RequestHeader(value="subcode", required=false) BigDecimal subcode
) {
        accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteCustomerAccount(@ApiParam(value = "Input request format" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Accept", required=true) String accept
,@ApiParam(value = "The ID of the customer whose account are to be deleted",required=true) @PathVariable("customerID") Integer customerID
,@ApiParam(value = "The Finicity ID of the account to be deleted",required=true) @PathVariable("accountID") Integer accountID
,@ApiParam(value = "Input Transactional Services subcode assigned" , defaultValue="0.0") @RequestHeader(value="subcode", required=false) BigDecimal subcode
) {
        accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteTxPUSHSubscription(@ApiParam(value = "ID of Customer to fetch",required=true) @PathVariable("customerID") Integer customerID
,@ApiParam(value = "ID of Subscription to fetch",required=true) @PathVariable("subscriptionId") Integer subscriptionId
,@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Accept", required=true) String accept
,@ApiParam(value = "Input request format" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@ApiParam(value = "Input Transactional Services subcode assigned" , defaultValue="0.0") @RequestHeader(value="subcode", required=false) BigDecimal subcode
) {
        accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> disableTxPUSHNotifications(@ApiParam(value = "ID of Customer to fetch",required=true) @PathVariable("customerID") Integer customerID
,@ApiParam(value = "ID of Customer account to fetch",required=true) @PathVariable("accountID") Integer accountID
,@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Accept", required=true) String accept
,@ApiParam(value = "Input request format" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@ApiParam(value = "Input Transactional Services subcode assigned" , defaultValue="0.0") @RequestHeader(value="subcode", required=false) BigDecimal subcode
) {
        accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<SubscriptionList> enableTxPUSHNotifications(@ApiParam(value = "Input request format" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Accept", required=true) String accept
,@ApiParam(value = "The Finicity ID of the customer who owns the account",required=true) @PathVariable("customerID") Integer customerID
,@ApiParam(value = "The Finicity ID of the account whose events will be sent to the TxPUSH Listener",required=true) @PathVariable("accountID") Integer accountID
,@ApiParam(value = "The TxPUSH Listener URL to receive TxPUSH notifications" ,required=true )  @Valid @RequestBody CallbackUrl body
,@ApiParam(value = "Input Transactional Services subcode assigned" , defaultValue="0.0") @RequestHeader(value="subcode", required=false) BigDecimal subcode
) {
        accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SubscriptionList>(objectMapper.readValue("{\r\n  \"subscriptions\" : [ {\r\n    \"accountId\" : \"2055\",\r\n    \"callbackUrl\" : \"https://www.mydomain.com/txpush/listener\",\r\n    \"signingKey\" : \"zg4U0v1IvTzFEHIXzJMxPHnfUwWZAMVpXrUuNuL9IvZI0Qzk\",\r\n    \"id\" : \"7462\",\r\n    \"type\" : \"transaction\"\r\n  }, {\r\n    \"accountId\" : \"2055\",\r\n    \"callbackUrl\" : \"https://www.mydomain.com/txpush/listener\",\r\n    \"signingKey\" : \"zg4U0v1IvTzFEHIXzJMxPHnfUwWZAMVpXrUuNuL9IvZI0Qzk\",\r\n    \"id\" : \"7462\",\r\n    \"type\" : \"transaction\"\r\n  } ]\r\n}", SubscriptionList.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SubscriptionList>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SubscriptionList>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Resource> getBankStatements(@ApiParam(value = "ID of Customer to fetch",required=true) @PathVariable("customerID") Integer customerID
,@ApiParam(value = "ID of Customer account to fetch",required=true) @PathVariable("accountID") Integer accountID
,@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Accept", required=true) String accept
,@ApiParam(value = "Input request format" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@ApiParam(value = "Input Transactional Services subcode assigned" , defaultValue="0.0") @RequestHeader(value="subcode", required=false) BigDecimal subcode
,@ApiParam(value = "Index of statement to retrieve (default is 1, maximum is 6)", defaultValue = "1") @Valid @RequestParam(value = "index", required = false, defaultValue="1") Integer index
) {
        accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Resource>(objectMapper.readValue("\"\"", Resource.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Resource>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Resource>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Resource> getBankStatementsWMFA(@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Accept", required=true) String accept
,@ApiParam(value = "Input request format" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@ApiParam(value = "Session identifier.Copied directly from the previous response (the value will be different for each HTTP 203 response received)" ,required=true, defaultValue="MFA_SESSION") @RequestHeader(value="MFA-Session", required=true) String mfASession
,@ApiParam(value = "ID of Customer to fetch",required=true) @PathVariable("customerID") Integer customerID
,@ApiParam(value = "ID of Customer account to fetch",required=true) @PathVariable("accountID") Integer accountID
,@ApiParam(value = "MFA Challenges Segment" ,required=true )  @Valid @RequestBody MfaChallenge body
,@ApiParam(value = "Input Transactional Services subcode assigned" , defaultValue="0.0") @RequestHeader(value="subcode", required=false) BigDecimal subcode
) {
        accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Resource>(objectMapper.readValue("\"\"", Resource.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Resource>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Resource>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Customer> getCustomer(@ApiParam(value = "ID of Customer to fetch",required=true) @PathVariable("customerID") String customerID
,@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Accept", required=true) String accept
,@ApiParam(value = "Input request format" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@ApiParam(value = "Input Transactional Services subcode assigned" , defaultValue="0.0") @RequestHeader(value="subcode", required=false) BigDecimal subcode
) {
        accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                //
            	return new ResponseEntity<Customer>(objectMapper.readValue("{\r\n  \"firstName\" : \"John\",\r\n  \"lastName\" : \"John\",\r\n  \"createdDate\" : \"123456789\",\r\n  \"id\" : \"11111111\",\r\n  \"type\" : \"active\",\r\n  \"username\" : \"TestUser123\"\r\n}", Customer.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Customer>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Customer>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CustomerAccount> getCustomerAccount(@ApiParam(value = "ID of Customer to fetch",required=true) @PathVariable("customerID") String customerID
,@ApiParam(value = "ID of Customer account to fetch",required=true) @PathVariable("accountID") Integer accountID
,@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Accept", required=true) String accept
,@ApiParam(value = "Input request format" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@ApiParam(value = "Input Transactional Services subcode assigned" , defaultValue="0.0") @RequestHeader(value="subcode", required=false) BigDecimal subcode
) {
        accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CustomerAccount>(objectMapper.readValue("{\r\n  \"institutionId\" : \"111111\",\r\n  \"aggregationStatusCode\" : 6.027456183070403,\r\n  \"type\" : \"checking\",\r\n  \"number\" : \"XXXX-XXXXXX-11111\",\r\n  \"lastUpdatedDate\" : 7.061401241503109,\r\n  \"createdDate\" : 2.3021358869347655,\r\n  \"balance\" : 0.8008281904610115,\r\n  \"balanceDate\" : 1.4658129805029452,\r\n  \"lastTransactionDate\" : 9.301444243932576,\r\n  \"institutionLoginId\" : 3.616076749251911,\r\n  \"name\" : \"Checking\",\r\n  \"customerId\" : \"11111\",\r\n  \"currency\" : \"USD\",\r\n  \"id\" : \"1111\",\r\n  \"aggregationAttemptDate\" : 5.637376656633329,\r\n  \"detail\" : {\r\n    \"availableBalanceAmount\" : 2.027123023002322,\r\n    \"periodInterestRate\" : \"4.5\"\r\n  },\r\n  \"displayPosition\" : 4.145608029883936,\r\n  \"aggregationSuccessDate\" : 5.962133916683182,\r\n  \"status\" : \"active\"\r\n}", CustomerAccount.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CustomerAccount>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CustomerAccount>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Account> getCustomerAccountDetails(@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Accept", required=true) String accept
,@ApiParam(value = "Input request format" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@ApiParam(value = "The ID of the customer who owns the account",required=true) @PathVariable("customerID") Integer customerID
,@ApiParam(value = "The Finicity ID of the account",required=true) @PathVariable("accountID") Integer accountID
,@ApiParam(value = "Input Transactional Services subcode assigned" , defaultValue="0.0") @RequestHeader(value="subcode", required=false) BigDecimal subcode
) {
        accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Account>(objectMapper.readValue("{\r\n  \"routingNumber\" : \"123456789\",\r\n  \"realAccountNumber\" : \"002345678901\"\r\n}", Account.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Account>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Account>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Account> getCustomerAccountDetailsWMFA(@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Accept", required=true) String accept
,@ApiParam(value = "Input request format" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@ApiParam(value = "Session identifier.Copied directly from the previous response (the value will be different for each HTTP 203 response received)" ,required=true, defaultValue="MFA_SESSION") @RequestHeader(value="MFA-Session", required=true) String mfASession
,@ApiParam(value = "The ID of the customer who owns the account",required=true) @PathVariable("customerId") Integer customerId
,@ApiParam(value = "The Finicity ID of the account",required=true) @PathVariable("accountId") Integer accountId
,@ApiParam(value = "MFA Challenges Segment" ,required=true )  @Valid @RequestBody MfaChallenges body
,@ApiParam(value = "Input Transactional Services subcode assigned" , defaultValue="0.0") @RequestHeader(value="subcode", required=false) BigDecimal subcode
) {
        accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Account>(objectMapper.readValue("{\r\n  \"routingNumber\" : \"123456789\",\r\n  \"realAccountNumber\" : \"002345678901\"\r\n}", Account.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Account>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Account>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ArrayOfCustomerAccounts> getCustomerAccounts(@ApiParam(value = "ID of Customer to fetch",required=true) @PathVariable("customerID") String customerID
,@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Accept", required=true) String accept
,@ApiParam(value = "Input request format" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@ApiParam(value = "Input Transactional Services subcode assigned" , defaultValue="0.0") @RequestHeader(value="subcode", required=false) BigDecimal subcode
) {
        accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ArrayOfCustomerAccounts>(objectMapper.readValue("[ {\r\n  \"institutionId\" : \"111111\",\r\n  \"aggregationStatusCode\" : 6.027456183070403,\r\n  \"type\" : \"checking\",\r\n  \"number\" : \"XXXX-XXXXXX-11111\",\r\n  \"lastUpdatedDate\" : 7.061401241503109,\r\n  \"createdDate\" : 2.3021358869347655,\r\n  \"balance\" : 0.8008281904610115,\r\n  \"balanceDate\" : 1.4658129805029452,\r\n  \"lastTransactionDate\" : 9.301444243932576,\r\n  \"institutionLoginId\" : 3.616076749251911,\r\n  \"name\" : \"Checking\",\r\n  \"customerId\" : \"11111\",\r\n  \"currency\" : \"USD\",\r\n  \"id\" : \"1111\",\r\n  \"aggregationAttemptDate\" : 5.637376656633329,\r\n  \"detail\" : {\r\n    \"availableBalanceAmount\" : 2.027123023002322,\r\n    \"periodInterestRate\" : \"4.5\"\r\n  },\r\n  \"displayPosition\" : 4.145608029883936,\r\n  \"aggregationSuccessDate\" : 5.962133916683182,\r\n  \"status\" : \"active\"\r\n}, {\r\n  \"institutionId\" : \"111111\",\r\n  \"aggregationStatusCode\" : 6.027456183070403,\r\n  \"type\" : \"checking\",\r\n  \"number\" : \"XXXX-XXXXXX-11111\",\r\n  \"lastUpdatedDate\" : 7.061401241503109,\r\n  \"createdDate\" : 2.3021358869347655,\r\n  \"balance\" : 0.8008281904610115,\r\n  \"balanceDate\" : 1.4658129805029452,\r\n  \"lastTransactionDate\" : 9.301444243932576,\r\n  \"institutionLoginId\" : 3.616076749251911,\r\n  \"name\" : \"Checking\",\r\n  \"customerId\" : \"11111\",\r\n  \"currency\" : \"USD\",\r\n  \"id\" : \"1111\",\r\n  \"aggregationAttemptDate\" : 5.637376656633329,\r\n  \"detail\" : {\r\n    \"availableBalanceAmount\" : 2.027123023002322,\r\n    \"periodInterestRate\" : \"4.5\"\r\n  },\r\n  \"displayPosition\" : 4.145608029883936,\r\n  \"aggregationSuccessDate\" : 5.962133916683182,\r\n  \"status\" : \"active\"\r\n} ]", ArrayOfCustomerAccounts.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ArrayOfCustomerAccounts>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ArrayOfCustomerAccounts>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ArrayOfCustomerAccounts> getCustomerAccountsByInstitution(@ApiParam(value = "ID of Customer to fetch",required=true) @PathVariable("customerID") Integer customerID
,@ApiParam(value = "ID of institution to fetch",required=true) @PathVariable("institutionID") Integer institutionID
,@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Accept", required=true) String accept
,@ApiParam(value = "Input request format" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@ApiParam(value = "Input Transactional Services subcode assigned" , defaultValue="0.0") @RequestHeader(value="subcode", required=false) BigDecimal subcode
) {
        accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ArrayOfCustomerAccounts>(objectMapper.readValue("[ {\r\n  \"institutionId\" : \"111111\",\r\n  \"aggregationStatusCode\" : 6.027456183070403,\r\n  \"type\" : \"checking\",\r\n  \"number\" : \"XXXX-XXXXXX-11111\",\r\n  \"lastUpdatedDate\" : 7.061401241503109,\r\n  \"createdDate\" : 2.3021358869347655,\r\n  \"balance\" : 0.8008281904610115,\r\n  \"balanceDate\" : 1.4658129805029452,\r\n  \"lastTransactionDate\" : 9.301444243932576,\r\n  \"institutionLoginId\" : 3.616076749251911,\r\n  \"name\" : \"Checking\",\r\n  \"customerId\" : \"11111\",\r\n  \"currency\" : \"USD\",\r\n  \"id\" : \"1111\",\r\n  \"aggregationAttemptDate\" : 5.637376656633329,\r\n  \"detail\" : {\r\n    \"availableBalanceAmount\" : 2.027123023002322,\r\n    \"periodInterestRate\" : \"4.5\"\r\n  },\r\n  \"displayPosition\" : 4.145608029883936,\r\n  \"aggregationSuccessDate\" : 5.962133916683182,\r\n  \"status\" : \"active\"\r\n}, {\r\n  \"institutionId\" : \"111111\",\r\n  \"aggregationStatusCode\" : 6.027456183070403,\r\n  \"type\" : \"checking\",\r\n  \"number\" : \"XXXX-XXXXXX-11111\",\r\n  \"lastUpdatedDate\" : 7.061401241503109,\r\n  \"createdDate\" : 2.3021358869347655,\r\n  \"balance\" : 0.8008281904610115,\r\n  \"balanceDate\" : 1.4658129805029452,\r\n  \"lastTransactionDate\" : 9.301444243932576,\r\n  \"institutionLoginId\" : 3.616076749251911,\r\n  \"name\" : \"Checking\",\r\n  \"customerId\" : \"11111\",\r\n  \"currency\" : \"USD\",\r\n  \"id\" : \"1111\",\r\n  \"aggregationAttemptDate\" : 5.637376656633329,\r\n  \"detail\" : {\r\n    \"availableBalanceAmount\" : 2.027123023002322,\r\n    \"periodInterestRate\" : \"4.5\"\r\n  },\r\n  \"displayPosition\" : 4.145608029883936,\r\n  \"aggregationSuccessDate\" : 5.962133916683182,\r\n  \"status\" : \"active\"\r\n} ]", ArrayOfCustomerAccounts.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ArrayOfCustomerAccounts>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ArrayOfCustomerAccounts>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Customers> getCustomers(@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Accept", required=true) String accept
,@ApiParam(value = "Input request format" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@ApiParam(value = "Input Transactional Services subcode assigned" , defaultValue="0.0") @RequestHeader(value="subcode", required=false) BigDecimal subcode
,@ApiParam(value = "Text to match or leave empty to return all customers. Request URLs must be URL-encoded. In practice this means that spaces in URL query values must be replaced with ‘+’ and the @ symbol must be replaced with '%40'.", defaultValue = "New+York+City") @Valid @RequestParam(value = "search", required = false, defaultValue="New+York+City") String search
,@ApiParam(value = "Username for exact match. (Will return 0 or 1 records.)", defaultValue = "johnDoeUser") @Valid @RequestParam(value = "username", required = false, defaultValue="johnDoeUser") String username
,@ApiParam(value = "Starting index for this page of results", defaultValue = "1.0") @Valid @RequestParam(value = "start", required = false, defaultValue="1.0") BigDecimal start
,@ApiParam(value = "Maximum number of entries for this page of results", defaultValue = "25.0") @Valid @RequestParam(value = "limit", required = false, defaultValue="25.0") BigDecimal limit
,@ApiParam(value = "One of the values testing or active to return only customers of that type, or leave empty to return all customers.", defaultValue = "testing") @Valid @RequestParam(value = "type", required = false, defaultValue="testing") String type
) {
        accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
            	
				HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory(
						HttpClientBuilder.create().build());
				RestTemplate restTemplate = new RestTemplate(clientHttpRequestFactory);

				final String uri = "https://sandbox-us-api.experian.com/eits/gdp/v1/request?targeturl=https://sandbox-us-api.experian.com/consumerservices/tsvs/v1/integrations/aggregation/v1/customers";

				HttpHeaders headers = new HttpHeaders();
				headers.set("Content-Type", "application/json");
				headers.set("Accept", "application/json");
				headers.setContentType(MediaType.APPLICATION_JSON);
				headers.set("clientReferenceId", "SBMYSQL");
				headers.add("subcode", "0");
				headers.add("Authorization",
						"Bearer eyJraWQiOiJESmpTMXJQQjdJODBHWjgybmNsSlZPQkF3V3B3ZTVYblNKZUdSZHdpcEY0IiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJzdWIiOiJoZWxsb0BiNG5rZC5hcHAiLCJFbWFpbCI6ImhlbGxvQGI0bmtkLmFwcCIsIkZpcnN0TmFtZSI6ImI0bmtkIiwiaXNzIjoiRVhQRVJJQU4iLCJMYXN0TmFtZSI6InRlYW0iLCJleHAiOjE2MDU0NDQ4MjksImlhdCI6MTYwNTQ0MzAyOSwianRpIjoiYWI5N2JmOGEtZmQ2YS00OWEyLWFiMzQtMDZhNTk3NTE2YWE5In0.cBHDTtxCdp754UhvsGzGqjUQCpPto6zeWFb396YPpwZgaC1PjCIAPV6zbR7nNvXZHUxAJ_RvEpAoNGprsWCiLsuLHkFMKKgXa6LWj1VHczi_XPUj7-Bz-2tquFLiTr8IrYW_oFt5yqRQHQNkI4x4pwXr5MGULDw-yF7Ato1KyGHbCSzT51OgfLDXYpVzN-lfMbO9Kb81uabU_DJX2Xmg_UgCf9GdBdbDEzTxQaPn0IrEV1eSHd_npV8LvS2jhrwGYsuRjIDHlfk7VYlpJoZ2q81ubHyz6N4HP5O9ladu4uHF3T5kl6HJecCbTfpCYTu72pYPkWr5LDAseVbaXfDz4Q");


				String queryString = "?limit=" + limit + "&search="+ search +"&start=" + start + "&type=" + type + "&username=" + username ;
				HttpEntity<?> entity = new HttpEntity<>(headers);
				
				//ResponseEntity<String> response = restTemplate.exchange(uri+queryString, HttpMethod.GET, entity, String.class);
				//System.out.println("OUTPUT OF THE EXPERIAN RESPONSE : " + response.toString());
				ResponseEntity<Customers> response = restTemplate.exchange(uri+queryString, HttpMethod.GET,
						entity, Customers.class);
				//System.out.println(" at 2 " + response.toString());
				System.out.println("OUTPUT OF THE EXPERIAN RESPONSE : " + response.toString());
				
				return response;
                //return new ResponseEntity<Customers>(objectMapper.readValue("{\r\n  \"moreAvailable\" : true,\r\n  \"found\" : 0.8008281904610115,\r\n  \"customers\" : [ {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"John\",\r\n    \"createdDate\" : \"123456789\",\r\n    \"id\" : \"11111111\",\r\n    \"type\" : \"active\",\r\n    \"username\" : \"TestUser123\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"John\",\r\n    \"createdDate\" : \"123456789\",\r\n    \"id\" : \"11111111\",\r\n    \"type\" : \"active\",\r\n    \"username\" : \"TestUser123\"\r\n  } ],\r\n  \"displaying\" : 6.027456183070403\r\n}", Customers.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Customers>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Customers>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Institution> getInstitution(@ApiParam(value = "ID of institution to fetch",required=true) @PathVariable("institutionID") Integer institutionID
,@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Accept", required=true) String accept
,@ApiParam(value = "Input request format" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@ApiParam(value = "Input Transactional Services subcode assigned" , defaultValue="0.0") @RequestHeader(value="subcode", required=false) BigDecimal subcode
) {
        accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Institution>(objectMapper.readValue("{\r\n  \"address\" : {\r\n    \"country\" : \"USA\",\r\n    \"city\" : \"Los Angeles\",\r\n    \"postalCode\" : \"94134\",\r\n    \"addressLine1\" : \"11111 Hospital Lane\",\r\n    \"addressLine2\" : \"11111 Hospital Lane\",\r\n    \"state\" : \"CA\"\r\n  },\r\n  \"oauthEnabled\" : false,\r\n  \"urlOnlineRegistration\" : \"http://www.finbank.com/register\",\r\n  \"urlHomeApp\" : \"http://www.finbank.com\",\r\n  \"accountTypeDescription\" : \"TestFI\",\r\n  \"phone\" : \"5555555555\",\r\n  \"urlLogonApp\" : \"http://www.finbank.com/login\",\r\n  \"urlForgotPassword\" : \"http://www.finbank.com/forgotPassword\",\r\n  \"name\" : \"Finbank Profiles - A\",\r\n  \"specialText\" : \"Please enter your FinBank Profiles Banking Userid and Banking Password required for login.\",\r\n  \"currency\" : \"USD\",\r\n  \"id\" : 0.8008281904610115,\r\n  \"class\" : \"testfi\",\r\n  \"email\" : \"finbank@finicity.com\"\r\n}", Institution.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Institution>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Institution>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> modifyCustomer(@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Accept", required=true) String accept
,@ApiParam(value = "Input Request format" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@ApiParam(value = "ID of Customer to fetch",required=true) @PathVariable("customerID") String customerID
,@ApiParam(value = "" ,required=true )  @Valid @RequestBody CustomerRequest body
,@ApiParam(value = "Input Transactional Services subcode assigned" , defaultValue="0.0") @RequestHeader(value="subcode", required=false) BigDecimal subcode
) {
        accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> modifyPartnerSecret(@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Accept", required=true) String accept
,@ApiParam(value = "Input Request format" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@ApiParam(value = "" ,required=true )  @Valid @RequestBody ModifyPartnerRequest body
,@ApiParam(value = "Input Transactional Services subcode assigned" , defaultValue="0.0") @RequestHeader(value="subcode", required=false) BigDecimal subcode
) {
        accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<StoreCustomerPayStatementResponse> storeCustomerPayStatement(@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Accept", required=true) String accept
,@ApiParam(value = "Input request format" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@ApiParam(value = "Input Transactional Services subcode assigned" ,required=true, defaultValue="0.0") @RequestHeader(value="subcode", required=true) BigDecimal subcode
,@ApiParam(value = "ID of the customer",required=true) @PathVariable("customerID") Integer customerID
,@ApiParam(value = "The request with Pay statements." ,required=true )  @Valid @RequestBody StoreCustomerPayStatementRequest body
) {
        accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<StoreCustomerPayStatementResponse>(objectMapper.readValue("{\r\n  \"assetid\" : \"6b599a7e-236f-4a25-b070-425b52b9c1fe\"\r\n}", StoreCustomerPayStatementResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<StoreCustomerPayStatementResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<StoreCustomerPayStatementResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CreateCustomerResponse> testingCustomer(@ApiParam(value = "Type of format to Accept" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Accept", required=true) String accept
,@ApiParam(value = "Input request format" ,required=true, allowableValues="application/json, application/xml", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType
,@ApiParam(value = "" ,required=true )  @Valid @RequestBody UserNameRequest body
,@ApiParam(value = "Input Transactional Services subcode assigned" , defaultValue="0.0") @RequestHeader(value="subcode", required=false) BigDecimal subcode
) {
        accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CreateCustomerResponse>(objectMapper.readValue("{\r\n  \"createdDate\" : \"123456789\",\r\n  \"id\" : \"11111111\"\r\n}", CreateCustomerResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CreateCustomerResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CreateCustomerResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
