# colorful
A lightweight library to color System.out.

## Principle
[ANSI escape codes](http://en.wikipedia.org/wiki/ANSI_escape_code) are utilized to color the output.

**Note:** ANSI escape codes are not supported by every terminal/console.

## Usage

```java
System.out.println(AnsiColor.RED.applyTo("red"));
System.out.println(AnsiColor.GREEN.applyTo("green"));
```