# SaveLoadSystem [![Licence](https://img.shields.io/github/license/UdeviklerneREAL/SaveLoadSystem)](https://github.com/UdeviklerneREAL/SaveLoadSystem/blob/main/LICENSE)

### Why _SaveLoadSystem_?
_SaveLoadSystem_ is a system made for saving and loading variables, to a file on the user's computer.
It can be used to save games and applications. The format is human readable. 
The system supports longs (longs, ints, smalls, bytes), doubles (doubles, floats), booleans and strings (strings, chars).
### Getting Started.
To get started with _SaveLoadSystem_ you need to create a _SLSMain_ `SLSMain slsMain = new SLSMain("Save folder")`
(If the folder is not created yet, the system will). To encode a variable, you need to use the adaptive encoding method.
Like this example with a double: `slsMain.encodeDouble(1012934.13233, "TestVarible", "Savefile.txt")`. 
To decode it again you need to use the adaptive decoding method: `slsMain.decodeDouble("TestVarible", "Savefile.txt")`.
And that's it.
