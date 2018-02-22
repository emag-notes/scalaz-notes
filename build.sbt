organization := "example"
name := "scalaz-notes"
version := "1.0.0-SNAPSHOT"

scalaVersion := "2.12.4"

scalacOptions ++= Seq(
  "-feature",
  "-deprecation",
  "-unchecked",
  "-encoding",
  "UTF-8",
  "-language:_",
  "-Ywarn-adapted-args" // Warn if an argument list is modified to match the receiver
  ,
  "-Ywarn-dead-code" // Warn when dead code is identified.
  ,
  "-Ywarn-inaccessible" // Warn about inaccessible types in method signatures.
  ,
  "-Ywarn-infer-any" // Warn when a type argument is inferred to be `Any`.
  ,
  "-Ywarn-nullary-override" // Warn when non-nullary `def f()' overrides nullary `def f'
  ,
  "-Ywarn-nullary-unit" // Warn when nullary methods return Unit.
  ,
  "-Ywarn-numeric-widen" // Warn when numerics are widened.
  ,
  "-Ywarn-unused" // Warn when local and private vals, vars, defs, and types are are unused.
  ,
  "-Ywarn-unused-import" // Warn when imports are unused.
)

libraryDependencies ++= Seq(
  "org.scalaz"    %% "scalaz-core" % "7.2.19",
  "org.scalatest" %% "scalatest"   % "3.0.5" % Test
)
