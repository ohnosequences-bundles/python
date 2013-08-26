package ohnosequences.statika

import ohnosequences.statika._
import sys.process._

case object Python extends Bundle() {

  val metadata = generated.metadata.Python

  def install[D <: DistributionAux](distribution: D): InstallResults = {
    val result = Seq("yum", "install", "python", "-y").!
    if (result == 0) success(metadata+" is installed")
    else failure("Couldn't install git")
  }

}
