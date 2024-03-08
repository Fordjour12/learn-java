# Control Flow

## if-else

## if-elseif-else

## Switch case

The Java switch statement only works with:

- Primitive data types: byte, short, char, and int
- Enumerated types
- String Class
- Wrapper Classes: Character, Byte, Short, and Integer.

## for loop

for(dataType initialExpression; testExpression; updateExpression){
..
}

hard to use for array and collections

## for-each loop

for(dataType item : array){
...
}

easy to use of arrays and collections

## do-while loop

do{} perform an action first then verify from the while() if it should continue to perform the process until while() tell it you can't perform the action again (return false)

## while loop

while{} check first before performing and action in the first place

## break

this is called labelled break

```java

first:
while(condition ){
    ...
    while(condition){
        break first
    }
}
```

## continue

it skip the current iteration of the loop(for,do while, while)
