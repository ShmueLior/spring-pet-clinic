package guru.springframework.springpetclinic.services.map;

import guru.springframework.springpetclinic.model.Owner;
import guru.springframework.springpetclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner,Long>{

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }
}
