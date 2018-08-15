package warakorn.springframework.sfgpetclinic.services;

import warakorn.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

public interface FirstService {

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
