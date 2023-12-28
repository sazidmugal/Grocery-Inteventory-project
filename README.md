# Grocery-Inteventory-project

This project is a simple Grocery Inventory Project built with Spring Boot and Thymeleaf.

## Features

- Add grocery items to the inventory.
- Retrieve all items in the inventory.

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven

### Running the Application

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/grocery-inventory.git
   
   #####################################################################################

   To run a Spring Boot project in Spring Tool Suite (STS), you can follow these steps:

1. *Import the Project:*
   - Open STS.
   - Click on File -> Import.
   - In the "Import" dialog, select Existing Maven Projects.
   - Browse to the directory where you cloned or downloaded your Spring Boot project.
   - Select the project folder and click Finish.

2. *Build the Project:*
   - After importing, STS will automatically recognize the project as a Maven project.
   - Right-click on the project in the Project Explorer.
   - Choose Run As -> Maven Build....
   - In the "Goals" field, enter clean install.
   - Click Run.

3. *Run as Spring Boot App:*
   - After the build is successful, right-click on the project.
   - Choose Run As -> Spring Boot App.
  
## Usage

- Navigate to [http://localhost:8080/grocery/form](http://localhost:8080/grocery/form) to add new grocery items.
- Navigate to [http://localhost:8080/grocery/all](http://localhost:8080/grocery/all) to view all items in the inventory.
