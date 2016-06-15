# my-kafka-example
A simple Apache Kafka Producer / Consumer example, built using Apache Maven.

Download the Apache Kafka 2.11 tgz file from the official website.

Start the "zookeeper" server using [bin/zookeeper-server-start.sh config/zookeeper.properties &] [Default Port: 2181]

Start the "kafka" server using [bin/kafka-server-start.sh config/server.properties] [Default Port: 9092]

Create a Apache Kafka topic using [bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partition 1 --topic nouman-says
]


Run the 'Producer' or 'Consumer' one after the other using the 'Run' class
