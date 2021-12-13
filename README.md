

PeopleFlow (www.pplflw.com) is a global HR platform enabling companies to hire & onboard their employees internationally, at the push of a button. It is our mission to create opportunities for anyone to work from anywhere. As work is becoming even more global and remote, there has never been a bigger chance to build a truly global HR-tech company.


As a part of our backend engineering team, you will be responsible for building our core platform including an  employees managment system.

The employees on this system are assigned to different states, Initially when an employeeEntity is added it will be assigned "ADDED" state automatically .


The other states (State machine) for A given Employee are:
- ADDED
- IN-CHECK
- APPROVED
- ACTIVE


Our backend stack is:
- Java 11 
- Spring Framework 
- Kafka

Your task is to build  Restful API doing the following:
- An Endpoint to support adding an employeeEntity with very basic employeeEntity details including (name, contract information, age, you can decide.) With initial state "ADDED" which incidates that the employeeEntity isn't active yet.

- Another endpoint to change the state of a given employeeEntity to "In-CHECK" or any of the states defined above in the state machine 


Please provide a solution with the  above features with the following consideration.

- Being simply executable with the least effort Ideally using Docker and docker-compose or any smailiar approach.
- For state machine could be as simple as of using ENUM or by using https://projects.spring.io/spring-statemachine/ 
- Please provide testing for your solution.
- Providing an API Contract e.g. OPENAPI spec. is a big plus



To Execute the springboot application please run the following commands:
1- docker build -f execute.Dockerfile -t springboot
2- docker run -d -p 8080:8080 -t spring-boot 

open your browser on the home page of swagger :

(http://localhost:8080/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config/)





