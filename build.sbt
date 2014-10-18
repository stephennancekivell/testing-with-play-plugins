import play.Play.autoImport._
import PlayKeys._

libraryDependencies ++= Seq()

lazy val root = (project in file(".")).enablePlugins(play.PlayScala)

resolvers ++= Seq(
    "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",
    "Typesafe Maven Repository" at "http://repo.typesafe.com/typesafe/maven-releases/"
)

unmanagedSourceDirectories in Compile += baseDirectory.value / "src" / "main" / "scala"

unmanagedSourceDirectories in Test += baseDirectory.value / "src" / "test" / "scala"