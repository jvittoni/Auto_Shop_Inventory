package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;
    private final InhousePartRepository inhousePartRepository;

    public BootStrapData(PartRepository partRepository,
                         ProductRepository productRepository,
                         OutsourcedPartRepository outsourcedPartRepository,
                         InhousePartRepository inhousePartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
        this.inhousePartRepository=inhousePartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if(inhousePartRepository.count() == 0) {

            // InhousePart #1
            InhousePart battery = new InhousePart();
            battery.setPartId(71);
            battery.setName("Battery");
            battery.setInv(11);
            battery.setMinInv(0);
            battery.setMaxInv(100);
            battery.setPrice(290.00);
            battery.setId(4471);
            inhousePartRepository.save(battery);

            // InhousePart #2
            InhousePart brake = new InhousePart();
            brake.setPartId(82);
            brake.setName("Brake");
            brake.setInv(16);
            brake.setMinInv(0);
            brake.setMaxInv(100);
            brake.setPrice(650.00);
            brake.setId(3782);
            inhousePartRepository.save(brake);
        }

        if(outsourcedPartRepository.count() == 0) {
            // OutsourcedPart #1
            OutsourcedPart engine = new OutsourcedPart();
            engine.setCompanyName("Global Auto Parts");
            engine.setName("Engine");
            engine.setInv(3);
            engine.setMinInv(0);
            engine.setMaxInv(100);
            engine.setPrice(5800.00);
            engine.setId(8910);
            outsourcedPartRepository.save(engine);

            // OutsourcedPart #2
            OutsourcedPart transmission = new OutsourcedPart();
            transmission.setCompanyName("Global Auto Parts");
            transmission.setName("Transmission");
            transmission.setInv(4);
            transmission.setMinInv(0);
            transmission.setMaxInv(100);
            transmission.setPrice(4500.00);
            transmission.setId(7301);
            outsourcedPartRepository.save(transmission);

            // OutsourcedPart #3
            OutsourcedPart alternator = new OutsourcedPart();
            alternator.setCompanyName("Import Auto Supply");
            alternator.setName("Alternator");
            alternator.setInv(4);
            alternator.setMinInv(0);
            alternator.setMaxInv(100);
            alternator.setPrice(350.00);
            alternator.setId(7301);
            outsourcedPartRepository.save(alternator);
        }

        if(productRepository.count() == 0) {

            // Product #1
            Product truck = new Product(946221,"Truck", 67000.00, 7);
            productRepository.save(truck);

            // Product #2
            Product sedan = new Product(976112,"Sedan", 29000.00, 6);
            productRepository.save(sedan);

            // Product #3
            Product sports = new Product(936223,"Sports Car", 90000.00, 8);
            productRepository.save(sports);

            // Product #4
            Product suv = new Product(918224,"SUV", 45000.00, 7);
            productRepository.save(suv);

            // Product #5
            Product convertible = new Product(928315,"Convertible", 62000.00, 4);
            productRepository.save(convertible);
        }

        /*
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());

        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
