# Java Coding Question for Android Developer position at Yelp

Given a List<List<String>> of strings, count the occurrences of each String and then output the most repeated string(s) in a List<String>, alphabetized.

For example:

#### INPUT:
{
    {green, orange, red, blue, purple, yellow},
    {green, orange, red, blue, purple, yellow},
    {green, orange, red, blue, purple, yellow},
}
#### OUTPUT:
{green, orange, red, blue, purple, yellow}

#### REASON:
Because every color is seen the same amount of times

### OR

#### INPUT:
{
    {green, orange, green, blue, purple, yellow},
    {green, orange, red, blue, purple, yellow},
    {green, orange, red, blue, green, yellow},
}
#### OUTPUT:
{green}

#### REASON:
Because green has the highest frequency of appearances



### Main. Object creation
![Question](https://i.imgur.com/8X7OfDL.png)

### Where the magic happens
![JSON](https://i.imgur.com/MZHMmFc.png)

### Build a list given a map
![JSON](https://i.imgur.com/PTdQbRV.png)

### Build a list alphabetized
![JSON](https://i.imgur.com/IvoQjkX.png)

### OUTPUT
![JSON](https://i.imgur.com/SenA8Zy.png)

### UNIT TESTS
![JSON](https://i.imgur.com/Ai7dYQi.png)


