---
toc: true
layout: post
title: Primitives and Objects Blog
description: primitives and objects
categories: [markdown]
---

# Primitives 

## Why Java

- Java syntax easier compared to other languages
- focuses on classes, objects, and methods
- easy connection with APIs
- once compiled, it will run on any machine

## Anatomy

- main.java is run by the java compiler
- classname.java are names for the java files, public allows being called from other classes
- {} is the stuff inside the class, static means that instance of main class isn't needed, void doesn't return to another function  

## Primitive Data Types

- int: integer number
- double: decimal number up to 15 decimal places
- boolean: true or false

## Variables

- to initialize variable: (scope) dataType variableName = dataValue
- private only allowed in a class
- public any class can access
- protected allowed to all classes in package and any subclass
- variables known as constants don't change

## Basic Math

- equal sign is assignment operator, can be used to change the value of the variable 
- modulo operator is % (a % b, which is integer remainder of a divided by b)

## Compound Assignment Operators
- operators to change numbers (ie: integer += 1;)
- *=,+=,-=,/=,%=,i++,i--

# Objects

## Instances of Classes
- java is object-oriented programming, java is about manipulating objects
- objects are a reference type, when referring to it, you are referring to where it is stored
- an object is an instance of a class

## Constructors 
- to make object, call constructor, will initialize the object and make characteristics
- Class object = new Class();

## Constructor Overloading
- one class can have multiple constructors, the different constructors need to have diff numbers of parameters or different order of variables, each constructor will make objects with same types of characteristics, but are created differently
- parameters missing are given default parameters instead

## Null Objects
- object can be made null , makes it so no object exists for that

## Void Methods vs. Non-Void Methods
- void methods don't return value, change characteristics of object or prints text
- static methods belong to a class, not tied to an object

## static v non-static
- dot notation to use static, classname.method()
- non-static on a particular object, objectname.method()

## write/call methods with parameters
- parameters in the parentheses, 
- to call method, plug values in place of variables

## Non-void method
- use method as part of expression/stored as variable
- dataType variableName = methodName(parameterListOptional);

## Strings
- string literals are objects
- escape characters print a character or empty space
- combine strings with concatenation, used through + operator


