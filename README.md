# Micro optimizations in Java
Benchmarks for series of articles "Micro optimizations in Java."

**NOTE**: You need JMH Plugin in order to launch the benchmarks from the IDE.

### Content

[Micro optimizations in Java. String.equals()](https://medium.com/javarevisited/micro-optimizations-in-java-string-equals-22be19fd8416?source=friends_link&sk=61649c9c9fccfb59c0515fcb9f7447ef) benchmarks:
- ["".equals(s) vs s.isEmpty()](https://github.com/doom369/java-micro-optimizations/blob/master/src/test/java/string/EmptyStringEquals.java)  
- [s.equals("/") vs oneCharEquals('/')](https://github.com/doom369/java-micro-optimizations/blob/master/src/test/java/string/EqualChar.java)

[Micro optimizations in Java. String.equalsIgnoreCase()](https://medium.com/@ddumanskiy/micro-optimizations-in-java-string-equalsignorecase-ea25dfb03f95?source=friends_link&sk=28001856b9085e3c927de376298323fd) benchmarks:
- [s.equalsIgnoreCase() vs s.equals(s.toLowerCase())](https://github.com/doom369/java-micro-optimizations/blob/master/src/test/java/string/EqualsIgnoreCase.java#L28)
- [s.toLowerCase().startsWith() vs s.regionMatches()](https://github.com/doom369/java-micro-optimizations/blob/master/src/test/java/string/StartsWith.java#L22)

[Micro optimizations in Java. Good, nice and slow Enum](https://medium.com/javarevisited/micro-optimizations-in-java-good-nice-and-slow-enum-261e6f77bd2e?source=friends_link&sk=2efd362f40b01c300b09f425d57a9bb0) benchmarks:
- [Enum.valueOf vs switch](https://github.com/doom369/java-micro-optimizations/blob/master/src/test/java/string/EnumValueOf.java#L22)
- [Enum.values() vs cache variable](https://github.com/doom369/java-micro-optimizations/blob/master/src/test/java/string/EnumValues.java#L22)