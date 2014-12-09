scalaVersion := "2.11.1"

name := """hazelcast"""

version := "1.0-SNAPSHOT"

libraryDependencies += "com.google.inject" % "guice" % "4.0-beta5"

libraryDependencies += "log4j" % "log4j" % "1.2.12"

libraryDependencies += "org.slf4j" % "slf4j-api" % "1.6.0"

libraryDependencies += "net.spy" % "spymemcached" % "2.10.2"

libraryDependencies += "org.osgi" % "org.osgi.core" % "4.2.0"

libraryDependencies += "org.codehaus.groovy" % "groovy-all" % "2.1.8"

libraryDependencies += "org.jruby" % "jruby-complete" % "1.7.6"

libraryDependencies += "com.atomikos" % "transactions-jdbc" % "3.9.2"

libraryDependencies += "org.apache.geronimo.specs" % "geronimo-jta_1.1_spec" % "1.1.1"

libraryDependencies += "net.sourceforge.findbugs" % "annotations" % "1.3.2"

libraryDependencies += "com.eclipsesource.minimal-json" % "minimal-json" % "0.9.1"

libraryDependencies += "javax.cache" % "cache-api" % "1.0.0"

libraryDependencies += "org.mockito" % "mockito-all" % "1.9.5"

