package org.apache.kyuubi.example

import javax.security.sasl.AuthenticationException
import org.scalatest.funsuite.AnyFunSuite

class MyAuthenticationProviderTest extends AnyFunSuite {

  test("test my authn provider") {
    val provider = new MyAuthenticationProvider()
    assertThrows[AuthenticationException](provider.authenticate("Tyrion Lannister", ""))
    assertThrows[AuthenticationException](provider.authenticate("John Snow", ""))
  }
}
