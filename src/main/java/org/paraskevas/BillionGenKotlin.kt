package org.paraskevas

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

class BillionNumberGenerator {

    suspend fun generateNumbers(): List<Int> = withContext(Dispatchers.Default) {
        println("Starting generation of one billion numbers...")

        val numbers = (0 until 1_000_000_000).toList()

        println("Finished generating numbers. Total numbers generated: ${numbers.size}")
        numbers
    }
}

fun main() = runBlocking {
    val generator = BillionNumberGenerator()

    val timeTaken = measureTimeMillis {
        generator.generateNumbers()
    }

    println("Total execution time: $timeTaken ms")
}