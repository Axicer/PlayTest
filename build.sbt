name := """PlayTest"""
organization := "fr.axicer"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.13.3"

libraryDependencies += guice
libraryDependencies += jdbc
libraryDependencies += javaJdbc
libraryDependencies += "org.mariadb.jdbc" % "mariadb-java-client" % "2.1.2"
libraryDependencies += "javax.xml.bind" % "jaxb-api" % "2.3.0-b170201.1204"
libraryDependencies += "javax.activation" % "activation" % "1.1"
libraryDependencies += "org.glassfish.jaxb" % "jaxb-runtime" % "2.3.0-b170127.1453"
