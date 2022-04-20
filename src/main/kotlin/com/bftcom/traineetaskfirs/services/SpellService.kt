package com.bftcom.traineetaskfirs.services

import org.springframework.stereotype.Service
import padeg.lib.Padeg
import java.util.stream.IntStream
import kotlin.streams.toList

@Service
class SpellService {

    fun spell(word: String): List<String> {
        return IntStream.range(1, 7)
            .mapToObj { Padeg.getAppointmentPadeg(word, it) }
            .toList()
    }
}