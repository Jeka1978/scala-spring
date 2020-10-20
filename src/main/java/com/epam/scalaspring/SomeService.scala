package com.epam.scalaspring

import org.springframework.context.event.{ContextRefreshedEvent, EventListener}
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

import collection.JavaConverters._
/**
 * @author Evgeny Borisov
 */
@Service
@Transactional
class SomeService(personRepo: PersonRepo) {
  def printMe(): Unit = println("ARKADIY!!!!!!!!!!")

  @EventListener(Array(classOf[ContextRefreshedEvent]))
  def saveData(): Unit = {
    val person = Person(name = "Arkadiy", age = 25)
    personRepo.save(person)
  }

  def findAll():List[Person]={
    personRepo.findAll().asScala.toList
  }




}
