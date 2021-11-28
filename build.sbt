lazy val root = (project in file(".")).settings(
  inThisBuild(
    List(
      organization := "com.horothesun",
      scalaVersion := "2.13.7"
    )
  ),
  name := "scala-cats-dojo"
)

libraryDependencies ++= Seq(
  "org.typelevel"  %% "cats-core"   % "2.6.1",
  "org.typelevel"  %% "cats-effect" % "3.2.8",
  "org.scalatest"  %% "scalatest"   % "3.2.9"  % Test,
  "org.scalacheck" %% "scalacheck"  % "1.15.4" % Test
)
