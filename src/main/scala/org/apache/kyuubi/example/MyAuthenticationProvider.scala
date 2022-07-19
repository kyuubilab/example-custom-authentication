package org.apache.kyuubi.example

import javax.security.sasl.AuthenticationException
import org.apache.kyuubi.service.authentication.PasswdAuthenticationProvider

class MyAuthenticationProvider extends PasswdAuthenticationProvider {
  override def authenticate(user: String, password: String): Unit = {
    if (!"John Snow".equalsIgnoreCase(user)) {
      throw new AuthenticationException(s"Hey $user. I'm sorry, you ain't John Snow")
    } else if (!"You know nothing".equalsIgnoreCase(password)) {
      throw new AuthenticationException("Wrong password")
    }
  }
}
