package guru.springframework.springpetclinic.services;

import guru.springframework.springpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastname(String LastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
