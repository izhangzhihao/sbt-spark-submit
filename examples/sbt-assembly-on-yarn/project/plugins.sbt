lazy val root = Project("plugins", file(".")).dependsOn(plugin)

lazy val plugin = file("../../").getCanonicalFile.toURI

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.13.0")
