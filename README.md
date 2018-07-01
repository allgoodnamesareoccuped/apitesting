# Api testing case study

run 'mvn test' to run the tests


These tests explore different ways of verifying json format from a REST-api

Tests

restAssuredTests - explore different ways of testing api with use of http://rest-assured.io/
Note: this is using hamcrest-matchers
1. Given-when-then using Gson
2. using response-path
3. using json-path

jaywayRestAssuredTests - explore different ways of testing api with the use of jayway
1. given-when-then
2. Using POJO and assertJ


jacksonTest - explore how to use Jackson and POJO's
1. use objectMapper to map to POJO's 

Note: Jackson is definitely the fastest way to run the tests.


After investigating different options I think that for readability and maintenance I would recommend using POJO's 
and object mapping. Create tailored POJO's for you test, always use POJO's to create payload or to check the response 
payload. This makes your tests readable and typesafe. Write test that are clear and concise.
Use libraries that will help with these task.

POJO's have been created using JsonToPojo class in the util folder


