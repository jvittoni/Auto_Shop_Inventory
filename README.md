<hr>

## TRACKED CHANGES
\\

#### C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.**

File Name: mainscreen.html
<br>Line: 14
<br>Edit: Changed title from “My Bicycle Shop” to “Viscardi's Auto Shop”
<br>Code: `<title>Viscardi's Auto Shop</title>`

File Name: mainscreen.html
<br>Line: 19
<br>Edit: Changed h1 from “Shop” to “Viscardi's Auto Shop”
<br>Code: `<h1>Viscardi's Auto Shop</h1>`

File Name: mainscreen.html
<br>Line: 21
<br>Edit: Changed h2 from “Parts” to “Auto Parts”
<br>Code: `<h2>Auto Parts</h2>`

File Name: mainscreen.html
<br>Line: 53
<br>Edit: Changed h2 from “Products” to “Vehicles”
<br>Code: `<h2>Vehicles</h2>`

File Name: mainscreen.html
<br>Line: 67
<br>Edit: Changed button text from “Add Product” to “Add Vehicle”
<br>Code: `<a th:href="@{/showFormAddProduct}" class="btn btn-primary btn-sm mb-3">Add Vehicle</a>`

File Name: mainscreen.html
<br>Line: 25
<br>Edit: Added a logo (image)
<br>Code: `<img src="https://i.postimg.cc/5NPmP4DT/auto-Logo-1.png" alt="auto-shop-logo">`

File Name: mainscreen.html
<br>Line: 25 - 28
<br>Edit: Added a div container (class="header-container") for the img and h1 element
<br>Code: `<div class="header-container"></div>`

File Name: mainscreen.html
<br>Line: 16 - 32
<br>Edit: Added css internal styling for header-container elements
<br>Code: `<style>
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
    </style>`

File Name: mainscreen.html
<br>Line: 17 - 36
<br>Edit: Added font-family to body and adjusted h1 styling
<br>Code: `<style>
        body {
        font-family: Arial;
        }
        .header-container h1 {
            …
            font-size: 40px;
            font-weight: 700;
        }
    </style>`

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
