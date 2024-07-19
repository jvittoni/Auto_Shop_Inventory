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
