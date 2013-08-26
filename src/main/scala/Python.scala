package ohnosequences.statika

import ohnosequences.statika._

case object Python extends Bundle() {

  val metadata = generated.metadata.Python

  def install[D <: DistributionAux](distribution: D): InstallResults = {
    // do someting here
    success("%s is installed" format metadata)
  }

}
