package com.learning.companianpractice

import com.learning.companianpractice.Constants.DEFAULT_VALUE

class Mentor {
    /**
     *  It cannot be defined outside a class.
     *  The object is common in all instances of the class.
     *  It is instantiated for the first time as soon as the containing class is loaded. It means that it is instantiated even if we have not used the companion object.
     */


    companion object {
        const val MAX_VALUE = 10

        fun guide() {
            println("Default Value is : $DEFAULT_VALUE")     // WE CAN CALL THE FUNCTION AND VARIABLE OF INDEPENDENT NORMAL object without use its name
        }
    }


//    We can also name our companion object, it is written as comment to get understand,
//    it is commented because more then one companion object not allowed in the same class.
//    companion object config{
//
//    }

    /**
     * While in case of normal object we can create multiple object in the same class as shown below,
     * and it is mandatory to use the object name while invoke its variable or functions as shown in the main activity
     */

    object Config {
        const val MAX_SLOTS = 10
        fun newGuide() {

        }

    }

    object ConfigInfo {
        const val MIN_SLOTS = 1
        fun newHelp() {

        }
    }
}