
# Nate Frazier's Computer Science Capstone

  My journey through Southern New Hampshire University's Computer Science program has been instrumental in defining both my professional aspirations and core values. It has equipped me with the expertise needed to thrive as a Computer Science professional. This ePortfolio showcases my competency in crafting and implementing industry-grade code and software solutions. By completing this Capstone project, I will be highlighting my mastery across three critical domains: Software Design and Engineering, Algorithms and Data Structures, and Databases.

  Throughout the computer science program, my coursework and ePortfolio development helped me recognize the breadth of skills needed to build dependable software. The process strengthened my technical abilities and helped me define the kind of professional I want to become: someone who solves practical problems, communicates clearly, works responsibly with data, and continues learning as technology changes.

  Course projects also helped me develop stakeholder communication skills. Translating a broad request into requirements, asking clarifying questions, and explaining technical choices in accessible language taught me to consider the user’s needs alongside implementation details. I became more comfortable presenting my reasoning, describing tradeoffs, and adjusting a solution when feedback revealed a different priority.

  Mastering data structures and algorithms sharpened my capacity to think critically about how software processes and manages information. Through assignments focused on choosing the right structures, organizing data effectively, and evaluating computational efficiency, I developed the habit of evaluating solutions not just for correctness, but for scalability and performance as data volumes increase. This solid grounding empowers me to tackle unfamiliar coding challenges with a methodical approach, moving beyond guesswork and intuition.

  Software engineering and database courses illuminated how individual coding choices contribute to cohesive, larger systems. I gained hands-on experience decomposing complex tasks into smaller, testable pieces, identifying and fixing bugs, and integrating applications with persistent storage solutions. Database work deepened my understanding of structuring information, querying datasets efficiently, and preserving data integrity. These lessons collectively demonstrated the importance of maintainable code, well-designed interfaces, and rigorous testing practices woven throughout the development cycle.

  Security evolved into a fundamental dimension of my software quality mindset. Through coursework and practical programming, I encountered critical vulnerabilities including credential exposure, unsafe input handling, and excessive permission grants. I internalized the principle that security must be embedded in architectural decisions from day one, and that protecting data requires thoughtful consideration at every stage of an application's journey.

  Creating an ePortfolio pushed me to critically examine my accomplishments, articulate the reasoning behind my choices, and pinpoint opportunities for ongoing development. This process illuminated the interconnections between competencies acquired across various courses and equipped me with valuable experience in showcasing technical projects in a polished, professional manner. As I launch my career, I'm stepping forward with enhanced proficiency in programming, database management, analytical problem-solving, teamwork, and cybersecurity—alongside a deeper appreciation that career success hinges on combining technical expertise with genuine curiosity, effective communication skills, and the flexibility to evolve with industry demands.

  I assert that my ePortfolio showcases my proficiency in leveraging cutting-edge and evidence-based methodologies. I engineered technological solutions that generate measurable impact and fulfill sector-specific requirements, as demonstrated by my creation of advanced features enabling CSV data integration into MongoDB, incorporation of essential tools including the Python PyMongo driver, Python frameworks, the Dash visualization platform, custom Python code, and a comprehensive CRUD module for effective data manipulation within MongoDB.

  I created and assessed computing systems that address complex challenges by applying algorithmic thinking and industry-standard computer science principles, while strategically navigating the inherent trade-offs in architectural decisions through meticulous engineering of class hierarchies, method interactions, and proper management of arguments, parameters, and variable scope using JAVA. My refined projects collectively reflect my commitment to embedding security considerations throughout the development lifecycle, proactively identifying potential security threats in system design, eliminating architectural weaknesses, and safeguarding both data integrity and system resources against unauthorized access.

CODE REVIEW





SOFTWARE DESIGN AND ENGINEERING

  The final project artifact AppointmentService.java from CS 320: Software Testing, Automation, and Quality Assurance is a good choice to demonstrate software engineering and design proficiency. This artifact is a medical application is designed for gathering contact details, scheduling appointments, and offering a checklist of tasks. The objective of this class was to develop an application that streamlines the information collection process and includes module testing with JUnit tests to ensure the correctness of the entered data and prevent errors.

[Enhancement Document](M3CS499nrf.docx)

<img width="976" alt="Screenshot 2026-09-06 220131" src="https://github.com/user-attachments/assets/2ca36207-3a96-4be9-8b22-81b0a5f1a148" />

<img width="1000" alt="Screenshot 2026-10-24 185410" src="https://github.com/user-attachments/assets/d3c5c1f4-5592-4646-82d1-56eadc98898a" />



ALGORITHMS AND DATA STRUCTURES

This artifact is originally from almost two years ago for an assignment in my IT145: Foundations in Application Development. It is a Java application that is a command-line-based rescue animal management system. It sets up some sample dogs and monkeys, then gives you a menu to add animals, reserve them, check out your dogs or monkeys, and see which animals are currently working and available for adoption.

When you're adding an animal, the program asks for its info and makes sure there aren't any duplicate names in the system; if you're bringing in a monkey, it also double-checks that the species is on the approved list. Dogs get organized by their service country so it's easier to track down good candidates when someone wants to reserve one. Reservation grabs an eligible animal from the country you're looking for and marks it as taken. The app keeps everything in memory-based lists, so once you close it out, any changes you made disappear.

[Enhancement Document](M4CS499nrf.docx)

<img width="615"  alt="Screenshot 2026-09-06 230858" src="https://github.com/user-attachments/assets/08ba5efc-872f-4a9c-a05c-7e7e52d187bd" />

<img width="1000" alt="Screenshot 2026-10-25 004809" src="https://github.com/user-attachments/assets/109a2767-938f-4f22-93c0-86bc70ad2bef" />

DATABASES

This artifact is from a project that I did in CS340: Advanced Programing Concepts about a year ago. The system pulls animal records from a shelter database, runs them through Pydantic validation, and gives users the ability to narrow down their search by rescue profile, breed, and age. On the dashboard side, you'll see your filtered results laid out in a table format, along with charts that track outcome patterns and date trends. Plus, if location data is available, animals get plotted on a map.

On top of that, there's a demo logistic-regression model that learns from existing shelter records to make educated guesses about whether an animal will get adopted or end up back at the shelter—taking into account factors like age, breed, and sex. 

[Enhancement Document](M5CS499nrf.docx)

Old
<img width="800"  alt="Screenshot 2026-10-25 032612" src="https://github.com/user-attachments/assets/6ff02ee2-d963-4e7b-9e63-c0ad44ecc42a" />


New
<img width="850" alt="image" src="https://github.com/user-attachments/assets/d0b5ed1f-9f17-4bbc-bd55-f340a5520dec" />
<img width="800"  alt="Screenshot 2026-10-25 032658" src="https://github.com/user-attachments/assets/6df4b064-85da-4c27-9172-c82399b94548" />




Collectively, these artifacts showcase my capacity to develop software across various domains and different levels of sophistication. The animal shelter application emphasizes object-oriented design, handling user input, implementing validation, and organizing interconnected data structures. Its reservation and availability capabilities illustrate how thoughtful program logic can address genuine operational requirements. The appointment repository highlights a different but equally important skill set: data persistence through databases, SQL proficiency, prepared statements, connection handling, and converting stored data into usable application objects. The animal shelter dashboard bridges database functionality with an intuitive user experience, enabling people to sort through animal records, examine visual data and geographic information, and access outcome forecasts. Building this feature reinforced lessons about data validation, error management, and iterating when problems surface.

As a collection of work, these initiatives demonstrate my progression from coding application features to creating systems that communicate with external data sources. They also underscore my commitment to writing maintainable code, keeping different components cleanly separated, and ensuring dependable interactions with both users and databases. The examples below offer tangible demonstrations of the technical abilities and analytical methods I outlined in my professional self-assessment.


