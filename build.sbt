name := "spark-app""

version := "0.0.1-dev"

scalaVersion := "2.10.5"

resolvers += "Cloudera Repository" at "https://repository.cloudera.com/artifactory/cloudera-repos/"

resolvers += Resolver.sonatypeRepo("public")

val SparkVersion = "1.4.1"

libraryDependencies ++= Seq(
    "org.apache.spark"   %% "spark-core"    % SparkVersion % "provided",
    "org.apache.spark"   %% "spark-mllib"   % SparkVersion % "provided",
    "com.github.scopt"   %% "scopt"         % "3.2.0",
)

packAutoSettings

net.virtualvoid.sbt.graph.Plugin.graphSettings
