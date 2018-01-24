package hclee.springframework.spring5webapp.repository;

import hclee.springframework.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
