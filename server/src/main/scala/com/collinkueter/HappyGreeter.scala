package com.collinkueter

import cats.Applicative
import cats.syntax.applicative._
import com.collinkueter.hello._

class HappyGreeter[F[_] : Applicative] extends Greeter[F] {

  def SayHello(req: HelloRequest): F[HelloResponse] =
    HelloResponse(s"Hello, ${req.name}!", happy = true).pure[F]

}
