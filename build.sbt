
name := """weatherenergydata"""
organization := "com.nexxo"

version := "1.0-SNAPSHOT"

scalaVersion := "2.13.1"

lazy val root = (project in file(".")).enablePlugins( PlayJava, PlayEbean)
libraryDependencies ++= Seq(guice,javaJdbc, "mysql" % "mysql-connector-java" % "8.0.17")
libraryDependencies += javaForms
