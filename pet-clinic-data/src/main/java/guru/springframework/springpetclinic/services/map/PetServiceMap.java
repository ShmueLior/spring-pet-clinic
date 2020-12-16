package guru.springframework.springpetclinic.services.map;

import guru.springframework.springpetclinic.model.Pet;

public class PetServiceMap extends AbstractMapService<Pet,Long>{
    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }
}
