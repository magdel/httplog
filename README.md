# httplog
Logger for HTTP request


[![Travis CI](https://travis-ci.org/magdel/httplog.svg?branch=master)](https://travis-ci.org/magdel/httplog)
[![Coverage Status](https://coveralls.io/repos/github/magdel/httplog/badge.svg?branch=master)](https://coveralls.io/github/magdel/httplog?branch=master)
[![Code Climate](https://codeclimate.com/github/magdel/httplog/badges/gpa.svg)](https://codeclimate.com/github/magdel/httplog)
[![Hits-of-Code](https://hitsofcode.com/github/magdel/httplog)](https://hitsofcode.com/view/github/magdel/httplog)

Listen HTTP and if request is to "/log" write headers to log 

Built with Spring-Boot.

## Configuration

Setup properties in Spring Boot via application.properties or environment:

		server.port=7777

## Starting server

**requires Java 8+ to run**.

		mvn spring-boot:run


_Pavel Raev, 2017_


