## Spring Cloud Config Server
### Description:
This module is a Spring Cloud config server used for simplifying environment management with centralized configuration. It fetches the configurations stored in remote repositories (like Github) for specific application and environments(dev,test etc) and provides them to the requested client applications.
#### Concepts covered:
* Creating a config server for local files
* Creating a config server for Github files
* Consuming configuration from a Spring boot App
* Applying access security to Configurations
* Encrypting and Decrypting Configurations
* Refreshing Configurations
#### Dependencies used:
* spring-cloud-config-server
* spring-boot-starter-actuator
* spring-boot-starter-security
#### Remote repo links for Configurations:
* https://github.com/karthikbattula/pluralsight-spring-cloudconfig-sample
* https://github.com/rseroter/pluralsight-spring-cloudconfig-wa-tolls-perf
