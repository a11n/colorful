# colorful [![Build Status](https://travis-ci.org/a11n/colorful.svg?branch=master)](https://travis-ci.org/a11n/colorful) [![Coverage Status](https://coveralls.io/repos/a11n/colorful/badge.svg)](https://coveralls.io/r/a11n/colorful)
A lightweight library for colored console output in Java.

## Principle
[ANSI escape codes](http://en.wikipedia.org/wiki/ANSI_escape_code) are utilized to color the output.

**Note:** ANSI escape codes are not supported by every terminal/console.

## Usage
Here is how to color `System.out` in Java.
```java
System.out.println(AnsiColor.RED.applyTo("red"));
System.out.println(AnsiColor.GREEN.applyTo("green"));
```

See [Javadoc](http://a11n.github.io/colorful/javadoc/) for further information.
