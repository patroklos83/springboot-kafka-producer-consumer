# springboot-kafka-producer-consumer
SpringBoot Kafka Messaging example

Apache Kafka is a distributed streaming platform that utilizes the publish/subscribe message pattern to interact with applications, and it’s designed to create durable messages

Step 1
------------
Install and run kafka server...
https://kafka.apache.org/quickstart
Start Zookeeper -> ./zookeeper-server-start.sh ../config/zookeeper.properties
Run a Kafka broker -> ./kafka-server-start.sh ../config/server.properties
Create a Kafka topic -> ./kafka-topics.sh --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic myTopic
 
Step 2 
----------
Create a topic

Step 3
---------
Run SpringBoot app -> go to browser link localhost:8080
