package com.searoth.yelpandroidcodingquestion

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
    private val expected = ArrayList<String>()

    @Test
    fun `very lopsided list with two empty`(){
        clearLists()
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
        val result = TopColor.topColor(mainList)
        expected.clear()
        expected.add(GREEN)
        assertEquals(expected,result)
    }

    @Test
    fun `bad values`(){
        clearLists()
        l1.add(BLUE)
        l2.add("33")
        l3.add("swim")
        l3.add("jump")
        l3.add("dive")
        l3.add("33")
        l3.add("33")
        l3.add("33")
        l3.add("33")
        l3.add("get your skillset on")
        l3.add(YELL)
        mainList.add(l1)
        mainList.add(l2)
        mainList.add(l3)
        val result = TopColor.topColor(mainList)
        expected.clear()
        expected.add(BLUE)
        expected.add(YELL)
        assertEquals(expected,result)
    }

    @Test
    fun `bad values capital letters`(){
        clearLists()
        l1.add(BLUE)
        l2.add("bluE")
        l3.add("swim")
        l3.add("jump")
        l3.add("dive")
        l3.add("rED")
        l3.add("33")
        l3.add("orangE")
        l3.add("orang3")
        l3.add("get your skillset on")
        l3.add(YELL)
        mainList.add(l1)
        mainList.add(l2)
        mainList.add(l3)
        val result = TopColor.topColor(mainList)
        expected.clear()
        expected.add(BLUE)
        expected.add(YELL)
        assertEquals(expected,result)
    }

    @Test
    fun `definitely red`(){
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
        val result = TopColor.topColor(mainList)
        expected.clear()

        expected.add(RED)

        assertEquals(expected,result)
    }

    @Test
    fun `four of the same lists`(){
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
        val result = TopColor.topColor(mainList)
        expected.clear()
        expected.add(BLUE)
        expected.add(GREEN)
        expected.add(RED)
        expected.add(YELL)
        assertEquals(expected,result)
    }

    @Test
    fun `sub lists empty`(){
        clearLists()
        mainList.add(l1)
        mainList.add(l2)
        mainList.add(l3)
        val result = TopColor.topColor(mainList)
        expected.clear()
        assertEquals(expected,result)
    }

    @Test
    fun `all lists empty`(){
        clearLists()
        val result = TopColor.topColor(mainList)
        expected.clear()
        assertEquals(expected,result)
    }

    @Test
    fun `one of each and large`(){
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
        val result = TopColor.topColor(mainList)
        expected.clear()
        expected.add(BLUE)
        expected.add(GREEN)
        expected.add(RED)
        expected.add(YELL)
        assertEquals(expected,result)
    }

    @Test
    fun `red dominates one list and overall`(){
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
        val result = TopColor.topColor(mainList)
        expected.clear()
        expected.add(RED)
        assertEquals(expected,result)
    }

    @Test
    fun `purple and orange`(){
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
        val result = TopColor.topColor(mainList)
        expected.clear()
        expected.add(ORANGE)
        expected.add(PURPLE)
        assertEquals(expected,result)
    }

    @Test
    fun `all green`(){
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
        val result = TopColor.topColor(mainList)
        expected.add(GREEN)
        assertEquals(expected,result)
    }

    private fun clearLists(){
        mainList.clear()
        l1.clear()
        l2.clear()
        l3.clear()
        expected.clear()
        expected.clear()
    }


}
