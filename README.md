# drop json formatted lines

This is a test container to check, if your fluentbit/fluentd/younameit logfile scraping to elasticsearch actually works. 

It will simply construct log lines in JSON format using the net.logstash.logback logger. 

Each line contains five Number words and a "json as string" log message plus a key in the MDC that is converted to a field in the log-json.

```
{"@timestamp":"2019-03-02T10:42:49.444+00:00","@version":"1"
	,"message":"One Three Five Three Seven JSON: {\"aint\":5,\"astring\":\"Seven\",\"atimestamp\":1551523369444}"
	,"logger_name":"de.beanfactory.droplogs.StashLogger"
	,"thread_name":"scheduling-1"
	,"level":"INFO"
	,"level_value":20000
	,"SELECTED":"Two"}
```


## how to build

Checkout the repository and run 

```
./gradlew clean build bootJar docker
```

This will give you a docker container in your local registry that can be run with:

```
docker run --rm drop-logs:1.0.0
```

To attach the container to fluentbit, use:

```
docker run --rm drop-logs:1.0.0 | fluentbit -istdin -ostdout
```

