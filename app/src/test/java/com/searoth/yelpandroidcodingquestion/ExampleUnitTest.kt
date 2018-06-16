package com.searoth.javatester

import com.searoth.yelpandroidcodingquestion.JT
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }


    @Test
    fun `list always has the correct colors`(){
        val mainList = ArrayList<List<String>>()
        val l1 = ArrayList<String>()
        l1.add("green")
        l1.add("green")
        l1.add("green")
        l1.add("green")
        val l2 = ArrayList<String>()
        l2.add("green")
        l2.add("green")
        l2.add("green")
        l2.add("green")
        val l3 = ArrayList<String>()
        l3.add("green")
        l3.add("green")
        l3.add("green")
        l3.add("green")

        mainList.add(l1)
        mainList.add(l2)
        mainList.add(l3)

        val res = JT.topColor(mainList)
        val exp = ArrayList<String>()
        exp.add("green")
        assertEquals(exp,res)

    }


}
