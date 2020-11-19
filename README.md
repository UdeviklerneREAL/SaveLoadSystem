# SaveLoadSystem

### Why _SaveLoadSystem_?
_SaveLoadSystem_ is a system make for saving and loading variables. To a file on the user's computer.
It can be used to save in games and Applications. The format is human readable. 
The system supports longs (longs, ints, smalls, bytes), doubles (doubles, floats), booleans and strings (strings, chars).
### Getting Started.
To get started with _SaveLoadSystem_ you new to create an _SLSMain_ `SLSMain slsMain = new SLSMain("Save folder")`
(If the folder is not create, yet the system will). To encode a variable, you need to use the adaptive encoding method.
Like the example with a double `slsMain.encodeDouble(1012934.13233, "TestVarible", "Savefile.txt")`,
and to decode it again you need to use the adaptive decoding method `slsMain.decodeDouble("TestVarible", "Savefile.txt")`.
And that's it.