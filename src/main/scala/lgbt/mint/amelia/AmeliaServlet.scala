package lgbt.mint.amelia

import org.scalatra._

class AmeliaServlet extends ScalatraServlet {
  get("/") {
    views.html.hello()
  }
}
