lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.horothesun",
      scalaVersion := "2.13.7"
    )),
    name := "scala-cats-dojo"
  )

val catsVersion = "2.3.0"

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-core" % catsVersion,
  "org.typelevel" %% "cats-effect" % catsVersion,
  "org.scalatest" %% "scalatest" % "3.2.9" % Test,
  "org.scalacheck" %% "scalacheck" % "1.15.4" % Test
)
