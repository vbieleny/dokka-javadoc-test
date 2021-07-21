package org.example.app

import org.example.library.JavaGroup
import org.example.library.KotlinGroup

fun main() {
	val kotlinGroup = KotlinGroup<String>("KotlinGroup")
    kotlinGroup.add("KotlinItem")

    val javaGroup = JavaGroup<String>("JavaGroup")
    javaGroup.add("JavaItem")
}
