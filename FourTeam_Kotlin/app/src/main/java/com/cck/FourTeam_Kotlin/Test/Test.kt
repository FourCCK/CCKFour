package com.cck.FourTeam_Kotlin.Test

/**
 * Created by C-PC on 2017/12/26.
 */
/*fun sum(a:Int,b:Int):Int{
    return a+b
}

fun main(args:Array<String>){
    println("sum of 3 and 5 is")
    print(sum(3,5))
}*/

fun vars(vararg v:Int){
    for (vt in v){
        print(vt)
    }
}

fun main(args: Array<String>){
    vars(1, 2, 3, 4, 5)
}