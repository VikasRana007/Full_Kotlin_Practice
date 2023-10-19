========================= COMPANION AND REGULAR OBJECTS ==============================
1. can we invoke a method in the kotlin without creating the object of the class like we just did in java with the use of static Key word ?
Ans =>   Yes, it can possible with the help of companion object. we can invoke any function and variables.

Note: The default name of a companion object is Companion, only one companion object allowed per class. But in case of normal object 
      it can be created without any class separately as we have created Constants.kt object.

1. Companion object is instantiated for the first time when class is loading , means it is instantiated even we have not use the companion object.it is equivalent of static Keyword.
2. But in case of normal object it is lazily instantiated when we access it for the first time, use to provide the singleton behaviour, must be named by us.
3. WE CAN CALL THE FUNCTION AND VARIABLE OF INDEPENDENT NORMAL OBJECT without use its name, but inside the class name is must for invoking it.

======================= INIT BLOCK =======================
1. first we need to discuss about constructor in the kotlin 
2. so we are not able to execute any code in the primary constructor in kotlin and in can execute some code in the secondary constructor.
 Two things we can use during initialization of the class is 1. the secondary constructor 2. the init Block.

Question : When does the init block get called in Kotlin?
Answer   : The init block gets called immediately after the primary constructor but before the secondary constructor.

Note : The init block
 1. The init block gets executed immediately after the primary constructor.
 2. The init block gets executed before the secondary constructor, as described in the InitMentor class.
 3.  Primary constructor parameters can be used in the initializer blocks.
 4. A class can have more than one init block, in this case, the initializer blocks are executed in the same order as they appear 
    in the class body considering the properties if there are any in between.
 5. It does not take any parameters.

Question : When to use the init block in Kotlin?
Answer : When we have to perform a task during the initialization of an object and we do not have a necessity for a secondary constructor. 
Use the primary constructor with the init block.   i.e we use the init block in the ViewModel class to get called the repository function.


========================= Advantage of const ==========================
1. No overhead to access the variable or constant at runtime, so Application perform better.

====================== Inline function ========================
one function code copied inside the function who called it 
Question : when to make the function inline and when not:  Explanation Below

1. When the function code is very small, it's a good idea to make the function inline.
2. When the function code is large and called from so many places, it's a bad idea to make the function inline, as the large code will be repeated again and again.
