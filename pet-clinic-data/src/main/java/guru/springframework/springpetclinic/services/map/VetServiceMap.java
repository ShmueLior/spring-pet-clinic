package guru.springframework.springpetclinic.services.map;

import guru.springframework.springpetclinic.model.Vet;

public class VetServiceMap extends AbstractMapService<Vet,Long>{
    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }
}
