<hr>

## TRACKED CHANGES
\\

<br>

### C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.**

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

### D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
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

### E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.  spring-boot-h2-db102

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

### F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
* The “Buy Now” button must be next to the buttons that update and delete products.
* The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
* Display a message that indicates the success or failure of a purchase.

<br>

File Name: mainscreen.html
<br>Line: 124
<br>Edit: Added a “Buy Now” button next to the buttons that update / delete products
<br>Code:
```
<a th:href="@{buyProduct(productId=${tempProduct.id})}" class="btn btn-primary btn-sm mb-3">Buy Now</a>
```

<br>

File Name: BuyProductController.java
<br>Line: 1- 44
<br>Edit: Created file BuyProductController.java and added a controller for the "Buy Now" button and added imports
<br>Code:
```
package com.example.demo.controllers;

import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
public class BuyProductController {
    @Autowired private ProductRepository productRepository;

    @GetMapping("/buyProduct")
    public String buyProduct(@RequestParam("productID") Long theld, Model theModel) {
        Optional<Product> productToBuy = productRepository.findById(theld);

        if (productToBuy.isPresent()) {
            Product product = productToBuy.get();

            if (product.getInv() > 0) {
                product.setInv(product.getInv() - 1);
                productRepository.save(product);

                return "/confirmbuysuccess";
            } else {
                return "/confirmbuyfail";
            }
        } else {
            return "/confirmbuyfail";
        }
    }
}

```

<br>

File Name: confirmbuysuccess.html
<br>Line: 1 -28
<br>Edit: Created file confirmbuysuccess.html and included a message that indicates the success of a purchase
<br>Code:
```
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>

    <style>
        .link-to-mainscreen {
            display: flex;
            justify-content: center;
            align-items: center;
        }
    </style>
</head>
<body>

<div class="success-container">
    <h2>Your purchase was successful!</h2>
    <h3>Thank you for shopping at Viscardi's Auto Shop!</h3>

    <div class="link-to-mainscreen">
        <a href="http://localhost:8080/">Link
            to Main Screen</a>
    </div>
</div>

</body>
</html>
```

<br>

File Name: BuyProductController.java
<br>Line: 38 - 41
<br>Edit: changed confirmbuyfail to confirmbuyerror
<br>Code:
```
…
                return "/confirmbuyerror";
            }
        } else {
            return "/confirmbuyerror";
 …

```

<br>

File Name: BuyProductController.java
<br>Line: 38 - 41
<br>Edit: changed confirmbuyerror to confirmbuyfailure
<br>Code:
```
…
                return "/confirmbuyerror";
            }
        } else {
            return "/confirmbuyerror";
 …

```

<br>

File Name: confirmbuysuccess.html
<br>Line: 5
<br>Edit: Changed title to "Confirm Successful Purchase"
<br>Code:
```
<title>Confirm Successful Purchase</title>
```

<br>

File Name: confirmbuyfailure.html
<br>Line: 1 - 29
<br>Edit: Created file confirmbuyfailure.html and included a message that indicates the failure of a purchase
<br>Code:
```
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Confirm Failure of Purchase</title>

    <style>
        .link-to-mainscreen {
            display: flex;
            justify-content: center;
            align-items: center;
        }
    </style>
</head>
<body>

<div class="success-container">
    <h2>Your purchase could not be completed.</h2>
    <h3>We apologize for this inconvenience. Please contact us at (999) 999-9999 
        or viscardiautoshop@gmail.com to get help with your purchase.</h3>

    <div class="link-to-mainscreen">
        <a href="http://localhost:8080/">Link
            to Main Screen</a>
    </div>
</div>

</body>
</html>

```

<br>

File Name: mainscreen.html, BuyProductController.java
<br>Line: 124, 26 - 27
<br>Edit: Fixed spelling errors and capitalization

<br>

<hr>

<br>

### G.  Modify the parts to track maximum and minimum inventory by doing the following:
* Add additional fields to the part entity for maximum and minimum inventory.
* Modify the sample inventory to include the maximum and minimum fields.
* Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
* Rename the file the persistent storage is saved to.
* Modify the code to enforce that the inventory is between or at the minimum and maximum value.

<br>

File Name: Part.java
<br>Line: 33 - 37
<br>Edit: Added min and max inventory fields
<br>Code:
```
@Min(value = 0, message = "Min Inventory value must be positive")
    int minInv;
    @Min(value = 0, message = "Min Inventory must be positive")
    @Max(value = 100, message = "Max Inventory value must be below 100")
    int maxInv;
```

<br>

File Name: Part.java
<br>Line: 51 - 52, 60 - 61
<br>Edit: Added min and max inventory values to both constructors
<br>Code:
```
this.minInv = 0;
this.maxInv = 100;
…
this.minInv = minInv; 
this.maxInv = maxInv;
```

<br>

File Name: Part.java
<br>Line: 98 - 104
<br>Edit: Added Min and Max getter and setter methods
<br>Code:
```
   public int getMinInv() { return minInv; }
    public void setMinInv(int minInv) { this.minInv = minInv; }

    public int getMaxInv() { return maxInv; }
    public void setMaxInv(int maxInv) { this.maxInv = maxInv; }
```

<br>

File Name: InhousePart.java
<br>Line: 18 - 19
<br>Edit:  Added initialization for inhouse part
<br>Code:
```
public InhousePart() {
        this.minInv = 0;
        this.maxInv = 100;
    }
```

<br>

File Name: OutsourcedPart.java
<br>Line: 18 - 19
<br>Edit:  Added initialization for outsourced part
<br>Code:
```
public OutsourcedPart() {
        this.minInv = 0;
        this.maxInv = 100;
    }
```

<br>

File Name: mainscreen.html
<br>Line: 77 - 78, 87 - 88
<br>Edit: Added minimum inventory and maximum inventory sections to the table
<br>Code:
```
<th>Minimum Inventory</th>
<th>Maximum Inventory</th>
…
<td th:text="${tempPart.minInv}">1</td>
<td th:text="${tempPart.maxInv}">1</td>
```

<br>


File Name: BootStrapData.java
<br>Line: 56 - 57, 66 - 67, 80 - 81, 91 - 92, 103 - 104
<br>Edit: Added min and max inventory values to each sample inventory part
<br>Code:
```
battery.setMinInv(1);
battery.setMaxInv(100);
…
brake.setMinInv(1);
brake.setMaxInv(100);
…
engine.setMinInv(1);
engine.setMaxInv(100);
…
transmission.setMinInv(1);
transmission.setMaxInv(100);
…
alternator.setMinInv(1);
alternator.setMaxInv(100);
```

<br>

File Name: InhousePartForm.html
<br>Line: 24 - 28
<br>Edit: Added min and max inventory fields to the inhouse part form
<br>Code:
```
<p><input type="text" th:field="*{minInv}" placeholder="Minimum Inventory" class="form-control mb-4 col-4"></p>
        <p th:if="${#fields.hasErrors('minInv')}" th:errors="*{minInv}">Inventory Error</p>

    <p><input type="text" th:field="*{maxInv}" placeholder="Maximum Inventory" class="form-control mb-4 col-4"></p>
        <p th:if="${#fields.hasErrors('maxInv')}" th:errors="*{maxInv}">Inventory Error</p>


```

<br>

File Name: OutsourcedPartForm.html
<br>Line: 25 - 29
<br>Edit: Added min and max inventory fields to the outsourced part form
<br>Code:
```
<p><input type="text" th:field="*{minInv}" placeholder="Minimum Inventory" class="form-control mb-4 col-4"></p>
        <p th:if="${#fields.hasErrors('minInv')}" th:errors="*{minInv}">Inventory Error</p>

    <p><input type="text" th:field="*{maxInv}" placeholder="Maximum Inventory" class="form-control mb-4 col-4"></p>
        <p th:if="${#fields.hasErrors('maxInv')}" th:errors="*{maxInv}">Inventory Error</p>

```

<br>

File Name: application.properties
<br>Line: 6
<br>Edit: Renamed the file the persistent storage is saved to
<br>Code:
```
spring.datasource.url=jdbc:h2:file:~/vittone_15
```


<br>

<hr>

<br>

#### H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
* Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
* Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
* Display error messages when adding and updating parts if the inventory is greater than the maximum.

File Name: ValidInventoryMinimum.java
<br>Line: 1 - 20
<br>Edit: Created ValidInventoryMinimum.java file and created error message for when the parts fall below the set min inventory
<br>Code:
```
package com.example.demo.validators;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Constraint(validatedBy = {InventoryMinimumValidator.class})
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidInventoryMinimum {
    String message () default "The part count falls below the set minimum inventory";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
```

<br>

File Name: InventoryMinimumValidator.java
<br>Line: 1 - 27
<br>Edit: Created InventoryMinimumValidator.java file and created a class for custom validation for the inventory minimum when adding and updating parts
<br>Code:
```
package com.example.demo.validators;

import com.example.demo.domain.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;



public class InventoryMinimumValidator implements ConstraintValidator<ValidInventoryMinimum, Part> {
    @Autowired
    private ApplicationContext applicationContext;
    public static ApplicationContext myContext;

    @Override
    public void initialize(ValidInventoryMinimum constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {
        return part.getInv() > part.getMinInv();
    }
}
```

<br>

File Name: ValidInventoryMaximum.java
<br>Line: 1 - 20
<br>Edit: Created ValidInventoryMaximum.java file and created error message for when the parts count exceeds max inventory
<br>Code:
```
package com.example.demo.validators;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;



@Constraint(validatedBy = {InventoryMaximumValidator.class})
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidInventoryMaximum {
    String message () default "The part count exceeds the maximum inventory";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
```

<br>

File Name: InventoryMaximumValidator.java
<br>Line: 1 - 27
<br>Edit: Created InventoryMaximumValidator.java file and created a class for custom validation for the inventory maximum when adding and updating parts
<br>Code:
```
package com.example.demo.validators;

import com.example.demo.domain.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;



public class InventoryMaximumValidator implements ConstraintValidator<ValidInventoryMaximum, Part> {
    @Autowired
    private ApplicationContext applicationContext;
    public static ApplicationContext myContext;

    @Override
    public void initialize(ValidInventoryMaximum constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {
        return part.getInv() <= part.getMaxInv();
    }
}
```

<br>

File Name: Part.java
<br>Line: 4 - 5, 22 - 23
<br>Edit: Imported min max validator files and applied custom validation
<br>Code:
```
import com.example.demo.validators.ValidInventoryMaximum;
import com.example.demo.validators.ValidInventoryMinimum;
…
@ValidInventoryMinimum
@ValidInventoryMaximum
```

<br>

File Name: EnufPartsValidator.java
<br>Line: 36 - 41
<br>Edit: Added error message for inventory when adding and updating products lowers the part inventory below the set min
<br>Code:
```
if (p.getInv()<(product.getInv()-myProduct.getInv())) {
                    constraintValidatorContext.disableDefaultConstraintViolation();
                    constraintValidatorContext.buildConstraintViolationWithTemplate("Error with inventory value for part: "
                    + p.getName()).addConstraintViolation();
                    return false;
}	
```

<br>

File Name: InhousePartForm.html, OutsourcedPartForm.html
<br>Line: 33 - 37, 33 - 37
<br>Edit: Added a list to show all errors when adding an updating parts to the inhouse and outsourced forms
<br>Code:
```
<div th:if="${#fields.hasErrors()}">
        <ul>
            <li th:each="err : ${#fields.allErrors()}" th:text="${err}" class="error"/>
        </ul>
    </div>

```

<br>

File Name: productForm.html
<br>Line: 40 - 41, 50 - 51, 64 - 65, 74 - 75
<br>Edit: Added min and max inventory fields to Available Parts Table and Associated Parts Table
<br>Code:
```
<th>Minimum Inventory</th>
<th>Maximum Inventory</th>
…
<td th:text="${tempPart.minInv}">1</td>
<td th:text="${tempPart.maxInv}">1</td>
```

<br>

File Name:  InventoryMinimumValidator.java
<br>Line: 25 - 32
<br>Edit: Changed the validator
<br>Code:
```
if(context==null) return true;
        if(context!=null)myContext=context;
        if (part.getMinInv() < part.getInv()) {
            return true;
        }
        else {
            return false;
        }
```

<br>

File Name: InventoryMaximumValidator.java
<br>Line: 25 - 32
<br>Edit: Changed the validator
<br>Code:
```
if(context==null) return true;
        if(context!=null)myContext=context;
        if (part.getInv() <= part.getMaxInv()){
            return true;
        }
        else {
            return false;
        }
```

<br>

File Name: EnufPartsValidator.java
<br>Line: 33 - 35
<br>Edit: Reformatted the if statement
<br>Code:
```
if (p.getInv()<(product.getInv()-myProduct.getInv())) {
                    return false;
                }
```

<br>

<hr>

<br>
