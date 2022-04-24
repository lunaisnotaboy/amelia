package lgbt.mint.amelia

import org.scalatra.test.scalatest._

class AmeliaServletTests extends ScalatraFunSuite {
  addServlet(classOf[AmeliaServlet], "/*")

  test("GET / on AmeliaServlet should return status 200") {
    get("/") {
      status should equal (200)
    }
  }
}
