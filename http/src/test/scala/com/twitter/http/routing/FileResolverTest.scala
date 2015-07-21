package com.twitter.finatra.http.routing

import com.twitter.inject.Test

class FileResolverTest extends Test {

  "file resolver" should {
    "not allow both doc roots to be set" in {
      intercept[java.lang.AssertionError] {
        new FileResolver(
          localDocRoot = "src/main/webapp",
          docRoot = "com/twitter/foo/bar")
      }
    }
  }

}
