package ru.safronov.mySpringProject.Library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.safronov.mySpringProject.Library.model.Reader;

@Repository
public interface ReaderRepository extends JpaRepository<Reader, Long> {

}
