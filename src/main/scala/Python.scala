package ohnosequences.statika

import ohnosequences.statika._
import sys.process._

case object Python extends Bundle() {

  val metadata = generated.metadata.Python

  def install[D <: AnyDistribution](distribution: D): InstallResults =
  	"yum install python -y" ->- success(metadata+" is installed")

}
