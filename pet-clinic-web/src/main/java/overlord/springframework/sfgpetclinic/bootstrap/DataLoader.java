package overlord.springframework.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import overlord.springframework.sfgpetclinic.model.Owner;
import overlord.springframework.sfgpetclinic.model.Vet;
import overlord.springframework.sfgpetclinic.services.OwnerService;
import overlord.springframework.sfgpetclinic.services.VetService;
import overlord.springframework.sfgpetclinic.services.map.OwnerServiceMap;
import overlord.springframework.sfgpetclinic.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Muiz");
        owner1.setLastName("Alimi");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("John");
        owner2.setLastName("Reese");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Harold");
        vet1.setLastName("Finch");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Joss");
        vet2.setLastName("Carter");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
