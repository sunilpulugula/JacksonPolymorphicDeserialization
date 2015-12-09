#Polymorphic deserialization using deserilizer :

If Interface or abstract class have multiple implementation and try to deserialize any implementation with Interface then 
you will find below error 

*Can not construct instance of com.MyInterface, problem: abstract types either need to be mapped to concrete types, 
have custom deserializer, or be instantiated with additional type information*

To overcome this error,You could write a custom deserializer for Interface or abstract class, which would have to
programmatically parse the JSON depending on the fields and parse the body as whatever concrete class you had in mind.

This project will explaing how to create deserilizer for polymorphic types. 
