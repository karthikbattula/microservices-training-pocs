## Distributed Tracing
### Description:
This Module explains the Distributed Tracing mechanism addressing the latency issues in Microservices. Tracing can be achieved by using Spring Sleuth from Spring Cloud framework.
#### Spring Sleuth:
Spring Cloud Sleuth is about the automatic instrumentation of communication channels which helps to understand our architecture and troubleshoot any production latency issues. It gives near real-time data and generates traces, to track the flow through the path of a particular call tree. It integrates with Zipkin to visualize the latency. 
#### Concepts covered:
* 	Anatomy of a Trace
* 	Adding Spring Cloud Sleuth to a Project
* 	Building and Using a Zipkin Server for Visualizing Latency
* 	Visualizing and Querying Traces in Zipkin
* 	Working with Sampling Rates
* 	Building a Custom Sampler 
* 	Manually creating spans

#### Dependencies used:
* spring-cloud-starter-sleuth
* spring-cloud-starter-zipkin

