package com.me.allkotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

class MainActivity : AppCompatActivity() {
    private val TAG = "KOTLIN FLOW"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      GlobalScope.launch {
          getFlowOf()
      }

    }

    private suspend fun getFlowOf(){
//        CoroutineScope(Dispatchers.IO).launch {
            // flowOf()

//            flowOf(4, 2, 5, 1, 7)
//                .collect {
//                    Log.i(TAG, it.toString())
//                }

            // asFlow()
//            (1..5).asFlow()
//                .collect {
//                    Log.i(TAG, it.toString())
//                }

            // flow{}
//            flow {
//                (0..10).forEach {
//                    emit(it)
//                }
//            }
//                .collect {
//                    Log.i(TAG, it.toString())
//                }

//            channelFlow{}

//            channelFlow {
//                (0..10).forEach {
//                    send(it)
//                }
//            }
//                .collect {
//                    Log.i(TAG, it.toString())
//                }


//        }

        //            flowOn operator
//        val flow = flow {
//            // Run on Background Thread (Dispatchers.Default)
//            (0..10).forEach {
//                // emit items with 500 milliseconds delay
//                delay(500)
//                emit(it)
//            }
//        }
//            .flowOn(Dispatchers.Default)
//
//
//        CoroutineScope(Dispatchers.Main).launch {
//            flow.collect {
//                // Run on Main Thread (Dispatchers.Main)
//                Log.i(TAG, it.toString())
//            }
//        }

//            flowOn() is like subscribeOn() in RxJava , flowOn is actually use to switching the context of coroutine calls



        // Reduce terminal operator
//        val result = (1..5).asFlow()
//            .reduce { a, b -> a + b }        // addition of 1 to 5
//
//        Log.i(TAG, result.toString())


        //Cold Flow example

        // Long Running Tasks in Parallel

        val flowOne = flowOf(1, 2, 3)
        val flowTwo = flowOf("A", "B", "C")

        flowOne.zip(flowTwo) { intValue, stringValue ->
            "$intValue$stringValue"
        }.collect {
            println(it)
        }

        // A real use case in Android: When we want to run two tasks in parallel and want the results of both tasks
        // in a single callback when both tasks are completed.  using Zip Operator

      //  Advantages of Zip Operator of Kotlin Flow:

      //  Run tasks in parallel.
      //  Return the results of tasks in a single callback when all the tasks are completed.//



//        When we talk about retrying a task using operators in Kotlin Flow, we talk about the following two operators:

//        retryWhen
//        retry

//       => cause: This cause is Throwable which is the base class for all errors and exceptions.
//       => attempt: This attempt is the number that represents the current attempt. It starts with zero.
//

//           In retry operator =>
//        currentDelay: This represents the delay to be used in the current retry.
//        delayFactor: We use this delayFactor to multiply it with the currentDelay to increase the delay for the next retry.


//        ========================================
//        We use many libraries in our Android Project that provides the callback way to use instead of the
    //        Flow API way. As nowadays, we all have started using Kotlin Coroutines Flow API in our projects, so it becomes our responsibility to implement things in a way that supports Flow API.

//        So, we need to learn how to convert any Callback to Flow API in Kotlin using callbackFlow



    }
}