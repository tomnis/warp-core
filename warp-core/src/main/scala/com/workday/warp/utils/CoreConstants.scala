package com.workday.warp.utils

import com.workday.warp.math.{DistributionLike, NullDistribution}

/**
  * Some commonly used constants.
  *
  * Created by tomas.mccandless on 3/29/18.
  */
trait CoreConstants {

  @deprecated("do not use", "4.4.0")
  val UNDEFINED_TEST_ID = "com.workday.warp.Undefined.undefined"
  val DISABLE_WARP_USAGE_STRING = "DisableWarpUsage"
  val SMART_THRESHOLD_BASELINE_DATE_STRING = "SmartThresholdBaselineDate"
  val SMART_THRESHOLD_SLIDING_WINDOW_STRING = "SmartThresholdSlidingWindow"
  val SMART_THRESHOLD_TOLERANCE_STRING = "SmartThresholdTolerance"
  val SMART_SCALAR_STRING = "SmartScalarNumber"
  val SMART_THRESHOLD_STRING = "SmartThreshold"
  val USE_DOUBLE_RPCA_STRING = "UseDoubleRpca"
  val WARP_SPECIFICATION_FIELDS_STRING = "WarpSpecificationFields"
  val USE_SMART_THRESHOLD_STRING = "UseSmartThreshold"
  // default distribution with 0 delay between test invocations
  @deprecated("do not use", "4.4.0")
  val DISTRIBUTION: DistributionLike = new NullDistribution
}


// can be imported or mixed in
object CoreConstants extends CoreConstants
