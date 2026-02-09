# DemoQA Selenium Automation Project

## 📖 Overview
This project automates the **Text Box form** on the DemoQA website using **Selenium WebDriver with Java**.  
It performs end-to-end form filling and submission while handling dynamic web elements using explicit waits.

## 🌐 Application Under Test
Website: https://demoqa.com/  
Module: Elements → Text Box

## 🛠️ Tech Stack
- Java
- Selenium WebDriver
- ChromeDriver
- Maven (optional)
- Eclipse / IntelliJ IDEA

## 📂 Project Structure
DemoQA-Automation/
│
├── src/
│ └── SauceDemo/
│ └── DemoQAMain.java
## ⚙️ Prerequisites
- Java JDK 8 or higher
- Google Chrome Browser
- ChromeDriver (compatible with Chrome version)
- IDE (Eclipse / IntelliJ)

## 🚀 Features Automated
- Launch Chrome browser
- Navigate to DemoQA website
- Click on **Elements**
- Open **Text Box** form
- Enter:
  - Full Name
  - Email
  - Current Address
  - Permanent Address
- Submit the form
- Close the browser

## ▶️ How to Run the Script
1. Clone or download the project
2. Open it in your IDE
3. Ensure ChromeDriver is set in your system PATH
4. Run `DemoQAMain.java` as **Java Application**

## 🧪 Sample Test Data
- Name: Tudarshan Tishan Tglave  
- Email: test@gmail.com  
- Address: MP post test document  

## ✅ Key Concepts Used
- XPath & ID locators
- Explicit Wait (`WebDriverWait`)
- JavaScript Executor
- Form automation
- Browser handling

## 📌 Future Enhancements
- Add TestNG framework
- Implement Page Object Model (POM)
- Add reporting (Extent Reports / Allure)
- Cross-browser testing
- Data-driven testing

## 👤 Author
**Sudarshan  Aglave**

## 📜 License
This project is for learning and practice purposes.
