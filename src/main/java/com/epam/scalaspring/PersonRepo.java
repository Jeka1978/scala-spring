package com.epam.scalaspring;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Evgeny Borisov
 */
public interface PersonRepo extends JpaRepository<Person,Integer> {
}
