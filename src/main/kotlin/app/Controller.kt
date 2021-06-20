package app

import io.jooby.annotations.*

@Path("/")
class Controller {
  var counter = 0

  @GET
  fun sayHi(): String {
    counter++
    topLog.info("This was called $counter times")
    return "Called $counter times"
  }
}
