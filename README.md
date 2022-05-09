# bw-mulesoft-connector

<empty baswareconnector folder>
<remove internal apis from swaggerfile>
mvn com.mulesoft.connectivity:rest-sdk-mojo:0.8.0-RC2:createDescriptor -DapiSpec=C:\alusta\connectors\mule\swagger_aprilv4.json
<copy Icon folder to BaswareConnector folder>
cd BaswareConnector 
mvn clean install
