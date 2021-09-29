# kafka-messager

Example project to send messages to kafka.

### Running

You can configure all the environment using docker through your terminal:

    $ docker-compose up -d

Now you cam simply run the following command to run your API and your message consumer/producer:

    $ ./gradlew bootRun

### Testing

You can test your API through the `/send POST` endpoint.

Running through curl:

    curl -X POST \
        http://localhost:8080/send \
        -H 'content-type: application/json' \
        -d '{
            "message": "test"
        }'

### Monitoring

The docker-compose in this project are running grafana.
You can access the panel using this [link](http://localhost:3000/login).

Access login for grafana:

`user: admin`

`password: kafka`

### Viewing topics

    $ docker exec -ti kafka101 kafka-topics --list --zookeeper zookeeper1:2181