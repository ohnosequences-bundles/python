resolvers ++= Seq(
  "Era7 maven releases" at "http://releases.era7.com.s3.amazonaws.com"
, "Era7 maven snapshots" at "http://snapshots.era7.com.s3.amazonaws.com" 
)

addSbtPlugin( "ohnosequences" % "sbt-statika" % "0.10.0-SNAPSHOT" )
