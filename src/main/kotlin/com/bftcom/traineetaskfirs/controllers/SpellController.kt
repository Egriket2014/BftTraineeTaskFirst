package com.bftcom.traineetaskfirs.controllers

import com.bftcom.traineetaskfirs.services.SpellService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/spell")
class SpellController(

    private val spellService: SpellService
) {

    @GetMapping("/{word}")
    fun getSpell(@PathVariable("word") word : String) : List<String> {
        println(spellService.spell(word))
        return spellService.spell(word)
    }
}