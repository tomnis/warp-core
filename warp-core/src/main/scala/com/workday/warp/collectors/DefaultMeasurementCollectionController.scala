package com.workday.warp.collectors

import com.workday.warp.TestId
import com.workday.warp.TestIdImplicits.testInfoIsTestId
import com.workday.warp.persistence.{CorePersistenceAware, Tag}
import org.junit.jupiter.api.TestInfo

/**
  * A simple concrete implementation of [[AbstractMeasurementCollectionController]] that uses a [[WallClockTimeCollector]]
  * and a [[HeapUsageCollector]].
  *
  * @param testId fully qualified name of the method being measured.
  * @param tags [[Seq]] of [[Tag]] that should be persisted during endMeasurementCollection.
  */
class DefaultMeasurementCollectionController(override val testId: TestId,
                                             override val tags: Seq[Tag] = Nil)
  extends AbstractMeasurementCollectionController(testId, tags) with CorePersistenceAware {


  // boilerplate for java interop
  def this(info: TestInfo) = this(testInfoIsTestId(info))
  def this(info: TestInfo, tags: Seq[Tag]) = this(testInfoIsTestId(info), tags)

  this._collectors = List(new WallClockTimeCollector(this.testId), new HeapUsageCollector(this.testId))
}
