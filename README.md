# 🏆 FinalProject  |  Online `Bek Cafe` System

### Group: SE-2217

### Karakuzov Bekbolat's solo work

## Project Overview:

### About project 

A web-based application **Bek Cafe management system** has been created to simplify and digitize the processes involved in managing a cafe. This system caters to two primary user categories: administrators and regular users. It offers a virtual marketplace where users can see various coffee options, make orders, and administrators request products from suppliers. The primary objective is to enhance the overall efficiency and accessibility of cafe services.

### Project Idea:

The idea behind the Online Bek Cafe System is to create a convenient and user-friendly platform for both administrators and regular users to manage cafe activities digitally.

### Purpose:

The primary purpose of this project is to transition traditional coffee cafe services into the digital realm, offering a centralized and easily accessible platform. The system automates various aspects of cafe management, including order processing, inventory management, and user communication. The ultimate goal is to provide a more convenient and modernized experience for users.

## Objectives:

1. **Intuitive Interface Design:**
   - Create a user-friendly and easily navigable interface tailored for both administrators and regular users.

2. **Efficient Order Management:**
   - Establish a resilient order management system that facilitates seamless browsing, effective cart management, and simplified order placement.

3. **Effective Inventory Control:**
   - Develop an inventory management system focused on ordering items from suppliers that system have in database, and updating the product database..

6. **Comprehensive Administrative Dashboard:**
   - Develop a dashboard that offers administrators a comprehensive overview, enabling them to monitor and manage orders, track inventory, and gain insights into user activities.

7. **Built-in Scalability:**
   - Design the system with scalability in mind, allowing it to seamlessly accommodate user growth and catalog expansion.

8. **Robust Security Measures:**
   - Implement stringent security measures to safeguard data, ensure secure transactions, and prevent unauthorized access.

9. **Optimized Performance:**
   - Optimize system performance to guarantee quick response times, even during periods of peak usage.

## UML diagram
![uml](https://github.com/zbekxzz/software-design-pattern-final/assets/129783111/7ee2e567-56ef-4af1-8bf5-a59051dc55fb)

## Design Patterns used in project

1. **Singleton Pattern:**
   - Implemented to ensure a single instance across the entire application, especially for critical components such as database connectivity and logging monitoring.
   code:
   ![singleton](https://github.com/zbekxzz/software-design-pattern-final/assets/129783111/dbf6512c-948c-490b-9128-ae88bf18be38)

2. **Strategy Pattern:**
   - Used for user authorization, allowing users to select different options based on preferences or requirements.
   code:
   ![strategy](https://github.com/zbekxzz/software-design-pattern-final/assets/129783111/672315d6-3ea2-4fc5-b464-6f6fe7d5291d)

3. **Factory Pattern:**
   - Implemented for instantiating coffee objects, providing a centralized and consistent way to produce different types of coffee.
   code:
   ![factory](https://github.com/zbekxzz/software-design-pattern-final/assets/129783111/9bcc5302-6443-400c-8ac7-aa6d75181378)

4. **Decorator Pattern:**
   - Used to dynamically add behaviors without altering the structure itself.
   code:
   ![decorator](https://github.com/zbekxzz/software-design-pattern-final/assets/129783111/8719adf0-80e9-4731-a09b-78af684ee801)

5. **Adapter Pattern:**
   - Included an adapter to allow users pays in many types of currency and calculate change.
   code:
   ![adapter](https://github.com/zbekxzz/software-design-pattern-final/assets/129783111/9a2744fa-90cc-4306-abc5-4ce922e80227)

6. **Observer Model:**
   - Implemented the Observer pattern for administration to place orders for suppliers and send this orders with email.
   code:
   ![observer](https://github.com/zbekxzz/software-design-pattern-final/assets/129783111/5bed6d07-b470-469d-ae08-cae01b89960b)

## Conclusion:

### Future Improvements:

1. **Adding more options of coffee:**
   - Adding more options of coffee to menu to get more profit.

2. **Personalized User Profiles:**
   - Implement personalized user profiles, allowing users to maintain order history, preferences, and receive recommendations.

3. **Completing features**
   - Implement the function of sending email messages to suppliers

### References:

- Freeman, E. (n.d.). Head First Design Patterns, 2nd Edition. O’Reilly Online Learning. https://www.oreilly.com/library/view/head-first-design/9781492077992/?_gl=1*1y65lth*_ga*OTY0MzMzMjEyLjE3MDA0MTQ3ODg.*_ga_092EL089CH*MTcwMDQxNDc4OC4xLjEuMTcwMDQxNDgwMS40Ny4wLjA.
- Refactoring.Guru / Рефакторинг.Гуру. (n.d.). [Рефакторинг и Паттерны проектирования](https://refactoring.guru/ru)
