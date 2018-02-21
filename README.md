# About

The time, where people developed only monolytic systems step-by-step(via Waterfall) has gone.
In 2001 was born Agile manifesto to change the world of developing and break down the monopoly
of traditional approaches. Most of us know, that Agile splits long-term release process in sequence of short-term releases.
In this approach developers faced with new great problem: code regression.
To minimize the danger of code regression problem, developers use Unit tests.
A "unit" in this sense is the smallest atomic component of the code that makes sense to test,
typically a method of some class for example.

In this example were used popular Java unit-test framework - JUnit.
The task was to write an app, which will transform matrix by sorting it's rows in reverce order.

# Tools
  - Unit tests: [JUnit 4.0](https://junit.org/junit4/)
  - Build automation: [Maven](https://maven.apache.org/)
  - Test coverage: [Cobertura](http://cobertura.github.io/cobertura/)
  - Test coverage tracking server: [Coveralls](https://docs.coveralls.io/about-coveralls) [![Coverage Status](https://coveralls.io/repos/github/Gabarit/lab1a/badge.svg?branch=master)](https://coveralls.io/github/Gabarit/lab1a?branch=master)
  - CI Server: [TravisIO](https://travis-ci.org/) [![Build Status](https://travis-ci.org/Gleb-Dovzhenko/unit-testing-for-matrix-transforming.svg?branch=master)](https://travis-ci.org/Gleb-Dovzhenko/unit-testing-for-matrix-transforming)
