package com.epam.scalaspring

import javax.persistence.{Entity, GeneratedValue, Id}

/**
 * @author Evgeny Borisov
 */
@Entity
case class Person(var name:String,var age:Int) {
  def this() {
    this(null, 0)
  }
  @Id @GeneratedValue var id:Int=0

}
