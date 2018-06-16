package com.searoth.javatester

import com.searoth.yelpandroidcodingquestion.TopColor
import com.searoth.yelpandroidcodingquestion.TopColor.*
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class TopColorUnitTest {

    private val mainList = ArrayList<List<String>>()
    private val l1 = ArrayList<String>()
    private val l2 = ArrayList<String>()
    private val l3 = ArrayList<String>()
//    private var result = ""
//    private var expected = null

    @Test
    fun `list always has the correct colors`(){
        l1.add(GREEN)
        l1.add(GREEN)
        l1.add(GREEN)
        l1.add(GREEN)

        l2.add(GREEN)
        l2.add(GREEN)
        l2.add(GREEN)
        l2.add(GREEN)

        l3.add(GREEN)
        l3.add(GREEN)
        l3.add(GREEN)
        l3.add(GREEN)

        mainList.add(l1)
        mainList.add(l2)
        mainList.add(l3)

        var result = TopColor.topColor(mainList)
        val expected = ArrayList<String>()
        expected.add(GREEN)
        assertEquals(expected,result)

        /**
         * four of the same lists
         *
         */
        clearLists()
        l1.add(BLUE)
        l1.add(RED)
        l1.add(GREEN)
        l1.add(YELL)
        //
        l2.add(BLUE)
        l2.add(RED)
        l2.add(GREEN)
        l2.add(YELL)
        //
        l3.add(BLUE)
        l3.add(RED)
        l3.add(GREEN)
        l3.add(YELL)
        mainList.add(l1)
        mainList.add(l2)
        mainList.add(l3)
        result = TopColor.topColor(mainList)
        expected.clear()
        expected.add(BLUE)
        expected.add(GREEN)
        expected.add(RED)
        expected.add(YELL)
        assertEquals(expected,result)

        /**
         * very lopsided list
         *
         */
        clearLists()

        //

        //
        l3.add(BLUE)
        l3.add(RED)
        l3.add(GREEN)
        l3.add(GREEN)
        l3.add(GREEN)
        l3.add(GREEN)
        l3.add(GREEN)
        l3.add(GREEN)
        l3.add(GREEN)
        l3.add(YELL)
        mainList.add(l1)
        mainList.add(l2)
        mainList.add(l3)
        result = TopColor.topColor(mainList)
        expected.clear()
        expected.add(GREEN)
        assertEquals(expected,result)

        /**
         * def red
         *
         */
        clearLists()
        l1.add(BLUE)
        l1.add(RED)
        l1.add(GREEN)
        l1.add(RED)
        //
        l2.add(RED)
        l2.add(RED)
        l2.add(GREEN)
        l2.add(YELL)
        //
        l3.add(BLUE)
        l3.add(RED)
        l3.add(GREEN)
        l3.add(RED)
        mainList.add(l1)
        mainList.add(l2)
        mainList.add(l3)
        result = TopColor.topColor(mainList)
        expected.clear()

        expected.add(RED)

        assertEquals(expected,result)


        /**
         * empty
         *
         */
        clearLists()

        //

        //

        mainList.add(l1)
        mainList.add(l2)
        mainList.add(l3)
        result = TopColor.topColor(mainList)
        expected.clear()
        assertEquals(expected,result)

        /**
         *
         *  one of each
         */
        clearLists()
        l1.add(BLUE)
        l1.add(RED)
        l1.add(GREEN)
        l1.add(YELL)
        l1.add(BLUE)
        l1.add(RED)
        l1.add(GREEN)
        l1.add(YELL)
        l1.add(BLUE)
        l1.add(RED)
        l1.add(GREEN)
        l1.add(YELL)
        l1.add(BLUE)
        l1.add(RED)
        l1.add(GREEN)
        l1.add(YELL)
        l1.add(BLUE)
        l1.add(RED)
        l1.add(GREEN)
        l1.add(YELL)
        //
        l2.add(BLUE)
        l2.add(RED)
        l2.add(GREEN)
        l2.add(YELL)
        l2.add(BLUE)
        l2.add(RED)
        l2.add(GREEN)
        l2.add(YELL)
        l2.add(BLUE)
        l2.add(RED)
        l2.add(GREEN)
        l2.add(YELL)
        l2.add(BLUE)
        l2.add(RED)
        l2.add(GREEN)
        l2.add(YELL)
        l2.add(BLUE)
        l2.add(RED)
        l2.add(GREEN)
        l2.add(YELL)
        //
        l3.add(BLUE)
        l3.add(RED)
        l3.add(GREEN)
        l3.add(YELL)
        l3.add(BLUE)
        l3.add(RED)
        l3.add(GREEN)
        l3.add(YELL)
        l3.add(BLUE)
        l3.add(RED)
        l3.add(GREEN)
        l3.add(YELL)
        l3.add(BLUE)
        l3.add(RED)
        l3.add(GREEN)
        l3.add(YELL)
        l3.add(BLUE)
        l3.add(RED)
        l3.add(GREEN)
        l3.add(YELL)
        mainList.add(l1)
        mainList.add(l2)
        mainList.add(l3)
        result = TopColor.topColor(mainList)
        expected.clear()
        expected.add(BLUE)
        expected.add(GREEN)
        expected.add(RED)
        expected.add(YELL)
        assertEquals(expected,result)

        /**
         *  red dominates one list
         *
         */
        clearLists()
        l1.add(BLUE)
        l1.add(RED)
        l1.add(GREEN)
        l1.add(RED)
        l1.add(RED)
        l1.add(RED)
        l1.add(RED)
        l1.add(RED)
        //
        l2.add(BLUE)
        l2.add(RED)
        l2.add(GREEN)
        l2.add(YELL)
        //
        l3.add(BLUE)
        l3.add(RED)
        l3.add(GREEN)
        l3.add(YELL)
        mainList.add(l1)
        mainList.add(l2)
        mainList.add(l3)
        result = TopColor.topColor(mainList)
        expected.clear()
        expected.add(RED)
        assertEquals(expected,result)

        /**
         * purple and orange
         *
         */
        clearLists()
        l1.add(PURPLE)
        l1.add(ORANGE)
        l1.add(GREEN)
        l1.add(YELL)
        l1.add(ORANGE)
        l1.add(PURPLE)
        //
        l2.add(PURPLE)
        l2.add(ORANGE)
        l2.add(GREEN)
        l2.add(YELL)
        l2.add(ORANGE)
        l2.add(PURPLE)
        //
        l3.add(PURPLE)
        l3.add(ORANGE)
        l3.add(GREEN)
        l3.add(YELL)
        l3.add(ORANGE)
        l3.add(PURPLE)
        mainList.add(l1)
        mainList.add(l2)
        mainList.add(l3)
        result = TopColor.topColor(mainList)
        expected.clear()
        expected.add(ORANGE)
        expected.add(PURPLE)
        assertEquals(expected,result)

    }

    fun clearLists(){
        mainList.clear()
        l1.clear()
        l2.clear()
        l3.clear()
    }


}
