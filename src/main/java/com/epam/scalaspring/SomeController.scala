package com.epam.scalaspring

import org.springframework.web.bind.annotation.{GetMapping, RestController}

/**
 * @author Evgeny Borisov
 */
@RestController
class SomeController(val someService: SomeService) {

  @GetMapping(value = Array("/hi"))
  def hi():String={
    someService.printMe()
    someService.findAll().head.name
  }

}
