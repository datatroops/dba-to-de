ThisBuild / scalaVersion     := "2.13.11"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "io.datatroops"
ThisBuild / organizationName := "datatroops"

lazy val root = (project in file("."))
  .settings(
    name := "dba-to-de"
  )

libraryDependencies ++= Seq("org.apache.spark" %% "spark-core" % "3.4.0",
  "org.apache.spark" %% "spark-sql" % "3.4.0")