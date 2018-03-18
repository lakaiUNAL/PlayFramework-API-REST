name := """juanchodb"""
organization := "com.jcg"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.12.4"

libraryDependencies += guice
libraryDependencies += jdbc
libraryDependencies += javaWs
libraryDependencies += "mysql" % "mysql-connector-java" % "6.0.6"

libraryDependencies += "com.fasterxml.jackson.core" % "jackson-core" % "2.9.4"
libraryDependencies += "com.fasterxml.jackson.core" % "jackson-databind" % "2.9.4"


libraryDependencies += "org.awaitility" % "awaitility" % "2.0.0" % Test
libraryDependencies += "org.assertj" % "assertj-core" % "3.6.2" % Test
libraryDependencies += "org.mockito" % "mockito-core" % "2.1.0" % Test

testOptions in Test += Tests.Argument(TestFrameworks.JUnit, "-a", "-v")