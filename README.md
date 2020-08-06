# Micro optimizations in Java
Benchmarks for series of articles "Micro optimizations in Java."

**NOTE**: You need JMH Plugin in order to launch the benchmarks from the IDE.

### Content

[Micro optimizations in Java. String.equals()](https://medium.com/javarevisited/micro-optimizations-in-java-string-equals-22be19fd8416?source=friends_link&sk=61649c9c9fccfb59c0515fcb9f7447ef) benchmarks:
- ["".equals(s) vs s.isEmpty()](https://github.com/doom369/java-micro-optimizations/blob/master/src/test/java/string/EmptyStringEquals.java)  
- [s.equals("/") vs oneCharEquals('/')](https://github.com/doom369/java-micro-optimizations/blob/master/src/test/java/string/EqualChar.java)

Micro optimizations in Java. String.equalsIgnoreCase() benchmarks:
- [s.equalsIgnoreCase() vs s.equals(s.toLowerCase())](https://github.com/doom369/java-micro-optimizations/blob/master/src/test/java/string/EqualsIgnoreCase.java#L28)
- [s.toLowerCase().startsWith() vs s.regionMatches()](https://github.com/doom369/java-micro-optimizations/blob/master/src/test/java/string/StartsWith.java#L22)