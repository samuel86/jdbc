package PerformanceTesting;

public class Note {
    /** TOOLS:
     * LoadRunner: Paid Source
     *JMeter Open Source
     *  -Is based on Java
     *  - Cross platform support
     *  -Scripting isn't essential
     *  -
     *  * JMeter Installation
     *     -download :http://jmeter.appache.org
     *     -extract the zip file
     *     -select bin
     *     -click on Apache.JMeter.Jar
     *     - the tool will open
     *
     *     *JMeter Tool Overview
     *      -port: 8888
     *  3.*Record and Play Back
     *      -Test: Go and perform actions responses
     *      -To test we need requests and Response
     *      -Gif, Banners
     *      1.JMeter
     *      2.Firefox Browser
     *   Next:
     *    -Open Firefox Browser
     *     -click on open menu
     *     -click on network settings
     *     -select Manual proxy configuration
     *       --you can use the LocalHost:127.0.0.1
     *       --then provide the port number EX: 8888
     *       Now a proxy is set for the browser
     *        Go to browser an you will see this message:
     *          The proxy server is refusing connections
     *
     *         Firefox is configured to use a proxy server that is refusing connections.
     *
     *     Check the proxy settings to make sure that they are correct.
     *     Contact your network administrator to make sure the proxy server is working.
     *
     *     NOTE: Use browser to come to normal
     *       Go to Network Settings again
     *       then select:
     *           Use System proxy
     *  5.Handling https websites with Jmeter certificate importing into browsers
     *     NEED TO INSTALL ONE CONFIGURATION:
     *     http --> fine
     *     https --> That https website needs certificate- JMeter
     *       -Go to browser
     *       -Search certificate
     *       -select Authorities
     *       -then import
     *       -check box and click OK
     *
     *   4.How to Record in JMeter using Firefox with Proxy.
     *        Click run on JMeter and ignore the pop up message
     *        Go to browser
     *        --https://blazedemo.com/
     *   NOTE: JMeter Is All About
     *         -Request
     *         -Response
     *    Then we get the recording
     *
     *    If We want to play
     *    copy all these request and response  and paste it on Test Plan
     *
     *    When you finish run the test in the browser then go to browser settings and change it to NORMAL
     *       -- USE SYSTEM PROXY SETTINGS
     *    When you want to record
     *       -- Manual proxy configuration
     *
     *    BLAZE METER Plug-in
     *    --Website: https://chrome.google.com/webstore/detail/blazemeter-the-continuous/mbopgmdnpcbohhpnfglgohlbhfongabi/related?hl=en
     *
     *    BlazeMeter initially record : jmx files
     *    -No setting up Test Script Recorder or HTTP Script Recorder
     *    -No set up proxy as in JMeter
     *    ****
     * BLAZEMETER RESULT:
     EDITORTaurus .JSON .JMX   DEMO

     object		{3}

     GET https://blazedemo.com/ [73850]		{8}
     label	:	https://blazedemo.com/
     url	:	https://blazedemo.com/
     method	:	GET
     request_type	:	top_level
     request_subtype	:
     timestamp	:	1596499362164
     transaction_key	:	0
     headers		[3]
     0		{2}
     1		{2}
     2		{2}
     POST https://blazedemo.com/reserve.php [73879]		{9}
     label	:	https://blazedemo.com/reserve.php
     url	:	https://blazedemo.com/reserve.php
     method	:	POST
     body		{2}
     request_type	:	top_level
     request_subtype	:
     timestamp	:	1596499372190
     transaction_key	:	0
     headers		[5]
     0		{2}
     1		{2}
     2		{2}
     3		{2}
     4		{2}
     POST https://blazedemo.com/purchase.php [73905]		{9}
     label	:	https://blazedemo.com/purchase.php
     url	:	https://blazedemo.com/purchase.php
     method	:	POST
     body		{5}
     request_type	:	top_level
     request_subtype	:
     timestamp	:	1596499375290
     transaction_key	:	0
     headers		[5]

     *  7. Important info on Version
     *      Powered by BlazeMeter ® v 4.9.5
     *
     *      To put 1000 load on the User flow
     *
     *      How do you want to learn?
     *        -Books about these tools
     *
     *
     */
}
