lazy val commonSettings = Seq(
  organization in ThisBuild := "com.github.izhangzhihao",
  scalaVersion := "2.10.7",
  javacOptions ++= Seq("-source", "1.8", "-target", "1.8"),
  scalacOptions ++= Seq("-deprecation", "-feature"),
  libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.4" % "test",
  git.useGitDescribe := true,
  crossSbtVersions := List("0.13.16", "1.1.1")
)

lazy val root = (project in file(".")).
  enablePlugins(GitVersioning).
  settings(commonSettings).
  settings(
    sbtPlugin := true,
    name := "sbt-spark-submit",
    licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html")),
    publishMavenStyle := false,
    bintrayRepository := "sbt-plugin-releases",
    bintrayOrganization := None
  ).
  settings(scriptedSettings: _*).
  settings(scriptedLaunchOpts += "-Dplugin.version=" + version.value)

