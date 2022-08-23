# bw-mulesoft-connector
  The Basware APIs documented here are for Purchase-to-Pay use cases and for importing Master Data to Basware services. This document describes data schemas and available methods. Basware APIs work using REST API calls initiated by customer. Please visit the [P2P API pages](https://developer.basware.com/api/p2p) on Basware API developer site for full API documentation.

  **Data formats**

  Basware APIs use JSON data format with UTF-8 character encoding. **Descriptions of data fields are under the API methods, on tab 'Schema'.** The API has a rich set of fields, many of which are optional. Simplified example requests are available as a downloadable Postman collection on the [preconfigured API calls](https://developer.basware.com/api/p2p/templates) section on Basware API developer site.

  **Authentication**

  API clients authenticate using [OAUTH2 or Basic HTTP authentication](https://developer.basware.com/api/p2p/manual#Authentication). All communication is secured by using the HTTPS protocol (HTTP over TLS, TLS version 1.2 or later). You must make all API requests over HTTPS. API requests made without authentication are not accepted. API clients need to take into account that Basware domain certificates are renewed regularly. For details see, the [authentication and access rights](https://developer.basware.com/api/p2p/manual#Authentication) section on the Basware API developer site.

  **Record identifiers**

  All records have an external identifier (externalCode or invoiceId). This needs to be provided when posting new records, updating existing records or getting a single record by ID through Basware API.

  ExternalCode identifiers need to be unique within an interface and record codes (such as accountCode) need to be unique within a company. This applies per API account (tenant) - different API accounts can have same externalCodes and record codes. 

  **Push notifications**

  Basware API is able to send webhook based [push notifications](https://developer.basware.com/api/p2p/manual#PushNotifications) from accountingDocuments, exportedPurchaseOrders, exportedPurchaseRequisitions, exportedContracts, exportedContractSpends and requestStatus APIs. For details, see the [push notifications](https://developer.basware.com/api/p2p/manual#PushNotifications) section on Basware API developer site.

  **API Versioning**

  Every time there is a backwards-incompatible change to the API, a new major version will be released. This major version is part of the URL path. The current major version is v1.

  Unless informed by our technical support department that we are discontinuing support for a particular API version, you do not need to switch API versions. We will let you know at least 12 months in advance if an old API version is to be deprecated.

  Major change is a new version of the API that requires changes from the API consumer before the new version can be taken into use. This change would for example be a change to existing fields or adding new mandatory fields. 

  Minor change is a new version of the API that is backward compatible and does not require changes from the API consumer. Minor change would consist of for example adding a new non-mandatory field. Please make sure your API client accepts new non-mandatory fields.

  **API Client requirements**

  API clients need to accept new JSON fields as well as absence of null fields from the response JSONs.

  Consecutive API calls are needed for processing large amounts of records. The record limit varies by endpoint. It is 100 for AccountingDocuments, MatchingOrderLines and PurchaseRequisitions, 200 for vendors, 500 for most other APIs. Size of each incoming request is also limited to 6mb. Please distribute the payload over multiple requests to stay below the respective limits.

  Programs using Basware API need to handle redirects either at the application layer or the HTTP layer since certain APIs allow larger payloads by redirecting the response. 'Authorization' header must not be included in the redirected request (the second request after receiving a redirect). 'Host' header needs to be included.

