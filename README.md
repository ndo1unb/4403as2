# Singleton Pattern

## Structure

The Singleton pattern is a creational design pattern with the intent of having a single instance of a class that can be globally accessed (rather than creating a new class every single time the program needs to do something that involves said class). 

When the Singleton pattern is implemented, the class that has been made the Singleton would only be instantialised the first time it is referenced (lazy instantiation). Every reference to it after this point will be handled by the Singleton that has been created. However, it can affect modularity and complicate unit testing. Additionally, one would have to be wary of using it in a multithreaded setting as well.

## Use cases

The aforementioned behaviour is useful for implementing logging (as has been seen in class), because a logging class would be used the exact same way over and over by other classes. If implemented correctly, it can also be used to manage a shared resource.

# Observer Pattern

## Structure 

The Observer pattern is a behavioural design pattern that defines relationships between classes so that when one class updates (changes state), classes in a relationship with that one can also notified and updated accordingly. In other words, classes set up in this design pattern can be said to observe each other for updates.

## Use cases

Other objects can be notified when an object changes state, so this design pattern is often seen in notification schemes (which has also been seen in class). In this scenario, when there is an update, updates are sent to notification classes which create corresponding notifications. 