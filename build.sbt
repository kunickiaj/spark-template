name := "spark-app"

version := "0.0.1-dev"

scalaVersion := "2.10.6"

resolvers += "Cloudera Repository" at "https://repository.cloudera.com/artifactory/cloudera-repos/"

resolvers += Resolver.sonatypeRepo("public")

val SparkVersion = "1.6.0-cdh5.12.1"
val StreamSetsVersion = "2.7.0.0"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % SparkVersion % "provided",
  "org.apache.spark" %% "spark-mllib" % SparkVersion % "provided",
  "com.github.scopt" %% "scopt" % "3.7.0",
  "com.streamsets" % "streamsets-datacollector-spark-api" % StreamSetsVersion % "provided"
)
