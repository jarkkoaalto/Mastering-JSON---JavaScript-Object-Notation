# Mastering-JSON - JavaScript-Object-Notation #

What is an Open Data Format

- Open - Specifications are Open to public.
- Data - Relates to stored or excanged.
- Format - The organization of data as stored or as excanged.

- text file
- csv or comma separed value files
- INI file oftenuser for Initilising value
- XML file

### Overview of JSON ###
- Lightweight Textual Interchange
- Human readable
- support data structures and arrays
- Supported by programming languages
- Alternative XML


## Why JSON ##

- Usege of similar separators
- Data parsing similar to code parsing
- Library ingerently available
- Whole Data an be treated as a single object
- Data value can have user defined names
- Singlular / List of Values (Arrays)
- Values can be typed
- Hirarchhy or nesting of data is feasable

- XML allows CDATA based binary / JSON supports using encoded strings.
- XML powerful vaildation schema / JSON validarion standard evolving
- Unicode support is there in both XML and JSON. Unicode character can also be part of values in XML as etities like &#x2208; or in JSON as \u2208

## Buildng blocks of JSON ##

- Unordered data: OBJECTS
1. Position independent representation
2. user defined unique data labels
3. XML also handles unordered data

- Ordered data: ARRAYS
1. Position of data important
2. Accessed by array postion
3. XML doesn't support this type


## JSON Objects ##

- Unordered data handling
- Identifier with curly braces
- Unique name value pairs separated by colon (:)
- Multiple data items separeated by comma (,)
- The value s against lebels in the objects can be
1. singula values
2. List of values of Arrays
3. Other objects

## JSON Arrays ##

- Contains data in order
- Position of data called index
- Identifiers with square brackets
- Containing data called elements
- Elements separated by comma (,)
- Singular data elements or other objects
- Nesting permitted
- Preferably as a value with object


- Primitive data types
1. String (UTF-8 char sequence)
2. Number
3. Boolean
4. Null

- Composite Data Types
1. Objects
2. Arrays


## String ##
- main features of string data
1. Enclose in double quotes
2. Always on right side of colon
3. Single of multiple characters
4. Unicode characters

- Special characters in String
1. double quote mark
2. Forward slash mark
3. Backward slash mark
4. carriage return / CR Character
5. new line / line feed / LF character
6. tab character
7. backspace character
8. formfeed character

- Unicode in string 
1. format
2. hex code can be upper or lower case
3. Unicode \ and " not supported
4. Unicode character (UTF-8 default)

## Numbers ##
- Main features of numbers as data 
1. digits not in double quotes
2. On right side of colon
3. Integer, fraction or scientific

- Integres as numbers
1. Integers can be signed
2. Size limited by implementation

- Fraction as numbers
1. Standard decimal based fractions
2. Signed fractions are allows
3. Fraction accuracy as per implementation

- Sientific notation numbers
1. Basic scientific notation supported
2. Negative base as well exponent value is supported
3. One pre-decimal leading zero is a must
4. Insignificant leading zero are disallowed
5. Lagging zeros are allowed
6. Zero value exponents are allowed
7. Fraction exponent value never allowed

## Boolean num and white spaces ##
- Boolean - primitive data type
1. written as true or false
2. yes / no, 1 /0 

- Null as a primitive data types
1. Empty data item written as null
2. lower case only
3. Takes four byte space (n u l l)
4. incorrectly sometimes null and "" or 0 are same
5. Empty object and empty arrays are also allowed

- White spaces
1. Characters as white spaces 
2. Any white spaces around structral elements 
3. White spaces within key names are not ignored
4. White spaces in string value as literals


