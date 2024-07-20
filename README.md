<hr>

## TRACKED CHANGES
\\

#### C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.**

<br>

File Name: mainscreen.html
<br>Line: 14
<br>Edit: Changed title from “My Bicycle Shop” to “Viscardi's Auto Shop”
<br>Code: 
```
<title>Viscardi's Auto Shop</title>
```

<br>

File Name: mainscreen.html
<br>Line: 19
<br>Edit: Changed h1 from “Shop” to “Viscardi's Auto Shop”
<br>Code: 
```
<h1>Viscardi's Auto Shop</h1>
```

<br>

File Name: mainscreen.html
<br>Line: 21
<br>Edit: Changed h2 from “Parts” to “Auto Parts”
<br>Code: 
```
<h2>Auto Parts</h2>
```

<br>

File Name: mainscreen.html
<br>Line: 53
<br>Edit: Changed h2 from “Products” to “Vehicles”
<br>Code: 
```
<h2>Vehicles</h2>
```

<br>

File Name: mainscreen.html
<br>Line: 67
<br>Edit: Changed button text from “Add Product” to “Add Vehicle”
<br>Code: 
```
<a th:href="@{/showFormAddProduct}" class="btn btn-primary btn-sm mb-3">Add Vehicle</a>
```

<br>

File Name: mainscreen.html
<br>Line: 25
<br>Edit: Added a logo (image)
<br>Code:
```
<img src="https://i.postimg.cc/5NPmP4DT/auto-Logo-1.png" alt="auto-shop-logo">
```

<br>

File Name: mainscreen.html
<br>Line: 25 - 28
<br>Edit: Added a div container (class="header-container") for the img and h1 element
<br>Code: 
```
<div class="header-container"></div>
```

<br>

File Name: mainscreen.html
<br>Line: 16 - 32
<br>Edit: Added css internal styling for header-container elements
<br>Code: 
```
    <style>
        .header-container {
            display: flex;
            justify-content: space-between;
            align-items: center;
        }
        .header-container img {
            width: 10%;
        }
        .header-container h1 {
            margin: auto;
            text-align: center;
        }
    </style>
```
<br>

File Name: mainscreen.html
<br>Line: 17 - 36
<br>Edit: Added font-family to body and adjusted h1 styling
<br>Code: 
```
    <style>
        body {
        font-family: Arial;
        }
        .header-container h1 {
            …
            font-size: 40px;
            font-weight: 700;
        }
    </style>
```
<br>
<hr>
<br>

#### D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
<br>

Edit: Created about.html file

<br>

File Name: about.html
<br>Line: 1 - 47
<br>Edit: Copied mainscreen.html's head element info and pasted to about.html
<br>Code: 
```
<!DOCTYPE html> <html lang="en" xmlns:th="http://www.thymeleaf.org">
    <head>
        <meta charset="UTF-8">
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <title>About Viscardi's Auto Shop</title>
    <style>
        body {
            font-family: Arial;
        }
        .header-container {
            display: flex;
            justify-content: space-between;
            align-items: center;
        }
        .header-container img {
            width: 10%;
        }
        .header-container h1 {
            margin: auto;
            text-align: center;
            font-size: 40px;
            font-weight: 700;
        }
    </style>
    </head>
    <body>
        <div class="container"></div>
    </body>
```
<br>

File Name: about.html
<br>Line: 43 - 48
<br>Edit: Added the same header elements from mainscreen.html
<br>Code: 
```
<div class="container"> 
    <div class="header-container">  
        <img src="https://i.postimg.cc/5NPmP4DT/auto-Logo-1.png" alt="auto-shop-logo">
        <h1>Viscardi's Auto Shop</h1>
    </div>
    <hr>
```

<br>

File Name: MainScreenControllerr.java
<br>Line: 56 - 59
<br>Edit: Added a @GetMapping controller to enable access to about.html
<br>Code: 
```
    @GetMapping("/about")
        public String about() {
        return "about";
    }
```

<br>

File Name: mainscreen.html
<br>Line: 50 - 52
<br>Edit: Added a link to about.html
<br>Code: 
```
<div class="about-container">
    <a th:href="@{/about}" class="about-btn">About Viscardi's Auto Shop</a>
</div>
```

<br>

File Name: mainscreen.html
<br>Line: 51
<br>Edit: Added classes to style the link (matches other link style)
<br>Code: 
```
<div class="about-container">
    <a th:href="@{/about}" class="btn btn-primary btn-sm mb-3">About Viscardi's Auto Shop</a>
</div>
```

<br>

File Name: mainscreen.html
<br>Line: 38 - 42
<br>Edit: Centered the about link
<br>Code: 
```
.about-container {
display: flex;
justify-content: center;
align-items: center;
}
```

<br>

File Name: about.html
<br>Line: 49 - 73
<br>Edit: Added info about the business to about page
<br>Code: 
```
<div class="about-info">
<h2>About</h2>
<br>
<div class="about-section">
<h3>Our Story</h3>
<p>
Welcome to Viscardi's Auto Shop! We are a family owned business, operating since 1971.
</p>
</div>
<div class="about-section">
<h3>Our Mission</h3>
<p>
Our mission is to bring you quality auto parts and vehicles.
</p>
</div>
<div class="about-section">
<h3>Get In Touch</h3>
<p>
viscardiautoshop@gmail.com
</p>
<p>
(999) 999-9999
</p>
</div>
</div>
```

<br>

File Name: about.html
<br>Line: 74 - 77
<br>Edit: Added navigation back to mainscreen
<br>Code: 
```
<div class="link-to-mainscreen">
<a href="http://localhost:8080/">Link
to Main Screen</a>
</div>
```

<br>

File Name: about.html
<br>Line:38 - 52
<br>Edit: Added styling to about page
<br>Code: 
```
.about-info h2 {
    font-size: 35px;
    text-align: center;
}

.about-section {
    margin-top: 5px;
    margin-bottom: 45px;
}

.link-to-mainscreen {
    display: flex;
    ustify-content: center;
    align-items: center;
}
```

<br>

<hr>

<br>

#### E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.  spring-boot-h2-db102

<br>

File Name: BootStrapData.java
<br>Line: 33 - 42
<br>Edit: Added InhousePart Repository and added Inhouse Repository to the constructor
<br>Code:
```
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
```

<br>

File Name: BootStrapData.java
<br>Line: 48 - 73
<br>Edit: Added three OutsourcedParts
<br>Code:
```
// OutsourcedPart #1
        OutsourcedPart engine = new OutsourcedPart();
        engine.setCompanyName("Global Auto Parts");
        engine.setName("Engine");
        engine.setInv(3);
        engine.setPrice(5800.0);
        engine.setId(8910);
        outsourcedPartRepository.save(engine);

        // OutsourcedPart #2
        OutsourcedPart transmission = new OutsourcedPart();
        transmission.setCompanyName("Global Auto Parts");
        transmission.setName("Transmission");
        transmission.setInv(4);
        transmission.setPrice(4500.00);
        transmission.setId(7301);
        outsourcedPartRepository.save(transmission);

        // OutsourcedPart #3
        OutsourcedPart alternator = new OutsourcedPart();
        alternator.setCompanyName("Import Auto Supply");
        alternator.setName("Alternator");
        alternator.setInv(4);
        alternator.setPrice(350.00);
        alternator.setId(7301);
        outsourcedPartRepository.save(alternator);
```

<br>

File Name: BootStrapData.java
<br>Line: 49 - 65
<br>Edit: Added two inhouseParts
<br>Code:
```
// InhousePart #1
        InhousePart battery = new InhousePart();
        battery.setPartId(71);
        battery.setName("Battery");
        battery.setInv(11);
        battery.setPrice(290.00);
        battery.setId(4471);
        inhousePartRepository.save(battery);

        // InhousePart #2
        InhousePart brake = new InhousePart();
        brake.setPartId(82);
        brake.setName("Brake");
        brake.setInv(16);
        brake.setPrice(650.00);
        brake.setId(3782);
        inhousePartRepository.save(brake);
```

<br>

File Name: BootStrapData.java
<br>Line: 49 - 97
<br>Edit: Ensured that Parts data doesn’t duplicate with count() == 0
<br>Code:
```
if(inhousePartRepository.count() == 0) {
// inhouseParts Code
}

if(outsourcedPartRepository.count() == 0) {
// outsourcedParts Code
}
```

<br>

File Name: BootStrapData.java
<br>Line: 99 - 120
<br>Edit: Added five products and used count() to ensure no repeats
<br>Code:
```
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
```
<br>

<hr>

<br>