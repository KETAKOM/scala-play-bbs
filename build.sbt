name := """scala-play-study"""
organization := "study"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.4"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "study.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "study.binders._"

libraryDependencies += jdbc
libraryDependencies += evolutions
libraryDependencies += "com.typesafe.play" %% "anorm" % "2.5.3"
libraryDependencies += "com.h2database" % "h2" % "1.4.196"







