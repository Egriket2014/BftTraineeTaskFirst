package com.bftcom.traineetaskfirs.controllers

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class SpellControllerTest {

    @Autowired
    private lateinit var spellController: SpellController

    //Что, Чего, Чему, Что(Кому), Чем, Чём

    @ParameterizedTest
    @MethodSource("data")
    fun getSpellParam(input: String, expected: List<String>) {
        assertEquals(expected, spellController.getSpell(input))
    }

    companion object {
        @JvmStatic
        fun data() = listOf(
            Arguments.of("Заклинание", listOf("Заклинание", "Заклинания", "Заклинанию", "Заклинание", "Заклинанием", "Заклинании")),
            Arguments.of("Кружка", listOf("Кружка", "Кружки", "Кружке", "Кружку", "Кружкой", "Кружке")),
            Arguments.of("Гора", listOf("Гора", "Горы", "Горе", "Гору", "Горой", "Горе")),
        )
    }

//    @Test
//    fun getSpellFirst() {
//        val expect = listOf("Гора", "Горы", "Горе", "Гору", "Горой", "Горе")
//        assertEquals(expect, spellController.getSpell("Гора"))
//    }
//
//    @Test
//    fun getSpellSecond() {
//        val expect = listOf("Заклинание", "Заклинания", "Заклинанию", "Заклинание", "Заклинанием", "Заклинании")
//        assertEquals(expect, spellController.getSpell("Заклинание"))
//    }
//
//    @Test
//    fun getSpellThird() {
//        val expect = listOf("Кружка", "Кружки", "Кружке", "Кружку", "Кружкой", "Кружке")
//        assertEquals(expect, spellController.getSpell("Кружка"))
//    }
}