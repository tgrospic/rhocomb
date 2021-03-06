name := "rhocomb"

version := "0.1.0-SNAPSHOT"

organization := "rchain"

// Scala compiler settings

scalaVersion := "2.12.5"

scalacOptions ++= Seq ("-deprecation", "-feature", "-unchecked")

// Interactive settings

logLevel := Level.Info

shellPrompt in ThisBuild := {
    state =>
        Project.extract(state).currentRef.project + " " + version.value +
            " " + scalaVersion.value + "> "
}

// Fork the runs and connect sbt's input and output to the forked process so
// that we are immune to version clashes with the JLine library used by sbt

fork in run := true

connectInput in run := true

outputStrategy in run := Some (StdoutOutput)

// Dependencies

libraryDependencies ++=
    Seq (
      "org.bitbucket.inkytonik.kiama" %% "kiama" % "2.2.0",
      "org.bitbucket.inkytonik.kiama" %% "kiama-extras" % "2.2.0",
      "org.bitbucket.inkytonik.kiama" %% "kiama-extras" % "2.2.0" % "test" classifier ("tests"),
      "JLex" % "JLex" % "0.0",
      "com.github.vbmacher" % "java-cup-runtime" % "11b-20160615",
      "com.github.vbmacher" % "java-cup" % "11b-20160615",
      "org.scalatest" %% "scalatest" % "3.0.5" % "test",
      "org.scalacheck" %% "scalacheck" % "1.13.5" % "test"
    )

resolvers ++= Seq (
  Resolver.sonatypeRepo ("releases"),
  Resolver.sonatypeRepo ("snapshots"),
  "WSO2" at "http://dist.wso2.org/maven2/"
)
