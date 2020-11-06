package com.workday.telemetron.spec

import java.util.UUID

import com.workday.warp.TestIdImplicits.methodSignatureIsTestId
import com.workday.warp.TestId

/**
  * Created by tomas.mccandless on 6/16/20.
  */
trait HasRandomTestId {

  def randomTestId(): TestId = this.getClass.getCanonicalName + "." + UUID.randomUUID().toString
}
