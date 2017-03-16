# httplog
Logger for HTTP request


[![Travis CI](https://travis-ci.org/magdel/httplog.svg?branch=master)](https://travis-ci.org/magdel/httplog)

Listen HTTP and if request is to "/log" write headers to log 

Built with Spring-Boot.

## Configuration

Setup properties in Spring Boot via application.properties or environment:

		server.port=7777

## Starting server

**requires Java 8+ to run**.

		mvn spring-boot:run


_Pavel Raev, 2017_


