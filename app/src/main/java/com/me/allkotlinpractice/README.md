
    Flow is an asynchronous data stream(which generally comes from a task) that emits
    values to the collector and gets completed with or without an exception.

===>  Why we have need of Flow for asynchronous data streams we handling single asynchronous calls with the help of coroutine
      but what for multiple request on the same time , so then Flow comes in the scene.



4 Types of Flow in Kotlin.

1.  flowOf(): It is used to create flow from a given set of items.
2.  asFlow(): It is an extension function that helps to convert type into flows.
3.  flow{}: This is what we have used in the Hello World example of Flow.
4.  channelFlow{}: This builder creates flow with the elements using send provided by the builder itself.

The major components of Flow are as below:

*  Flow Builder     => Speaker
*  Operator         => Translator
*  Collector        => Listener   // This also called the terminal operator i.e collect, reduce






