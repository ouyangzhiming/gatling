import sbt._
import java.nio.file.Paths

object Resolvers {

	private val sonatypeRoot = "https://oss.sonatype.org/"

	val sonatypeSnapshots = "Sonatype Snapshots" at sonatypeRoot + "content/repositories/snapshots/"
	val sonatypeStaging   = "Sonatype Staging"   at sonatypeRoot + "service/local/staging/deploy/maven2/"
	val localMaven        = "Local Maven Repository" at Paths.get(Path.userHome.absolutePath + "/.m2/repository").toUri.toString
}
