# CA APM Webservice example, Version 1.0

## Description
This example shows how to create a web service client for CA APM.

## APM version
Tested with version 10.0. Should work with APM 9.x as well.

## Supported third party versions
Apache Axis 1.4 (coming with Eclipse Luna SR2


## License
[Apache 2.0](https://github.com/CA-APM/ca-apm-example-webservice/blob/master/LICENSE)


# Installation Instructions
How to install the field pack.

## Prerequisites
None.

## Dependencies
Apache Axis 1.4.

## Installation
Run `mvn install`

## Configuration
Change the URL in `ca/apm/introscope/webservices/ClientTest.java` to point to your EM.


# Usage Instructions
Run `mvn test`.
The sample test class will print the current live metric data for the metric "Enterprise Manager:Overall Capacity (%)".

## Next steps
I created these classes by downloading the WSDL from (http://<em_host>:8081/introscope-web-services/services/MetricsDataService?wsdl) and generating an Axis client with Eclipse. Starting from this example you can

* get data for other metrics
* call other methods of this service or
* create web service clients from the other CA APM web services as well.

See [CA APM API Guide](https://wiki.ca.com/display/APMDEVOPS98/API+Reference+Guide) for more information.

## Warning
Please be aware the web service calls put additional load on your CA APM Enterprise Managers. So keep the number of calls and the amount of metrics collected to the minimum required for your use case. If you try to "copy" the EM data you will crash your system for sure!

## Support
This document and associated tools are made available from CA Technologies as examples and provided at no charge as a courtesy to the CA APM Community at large. This resource may require modification for use in your environment. However, please note that this resource is not supported by CA Technologies, and inclusion in this site should not be construed to be an endorsement or recommendation by CA Technologies. These utilities are not covered by the CA Technologies software license agreement and there is no explicit or implied warranty from CA Technologies. They can be used and distributed freely amongst the CA APM Community, but not sold. As such, they are unsupported software, provided as is without warranty of any kind, express or implied, including but not limited to warranties of merchantability and fitness for a particular purpose. CA Technologies does not warrant that this resource will meet your requirements or that the operation of the resource will be uninterrupted or error free or that any defects will be corrected. The use of this resource implies that you understand and agree to the terms listed herein.

Although these utilities are unsupported, please let us know if you have any problems or questions by adding a comment to the CA APM Community Site area where the resource is located, so that the Author(s) may attempt to address the issue or question.

Unless explicitly stated otherwise this field pack is only supported on the same platforms as the APM core agent. See [APM Compatibility Guide](http://www.ca.com/us/support/ca-support-online/product-content/status/compatibility-matrix/application-performance-management-compatibility-guide.aspx).


# Change log
Changes for each version of the field pack.

Version | Author | Comment
--------|--------|--------
1.0 | Guenter Grossberger | First version