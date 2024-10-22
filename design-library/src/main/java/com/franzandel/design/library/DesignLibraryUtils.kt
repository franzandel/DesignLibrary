package com.franzandel.design.library

@Deprecated(
    message = "Maintained for binary compatibility. Use send(name, address) instead",
    level = DeprecationLevel.HIDDEN
)
fun send(name: String) {
    println("send triggered, name : $name")
}

fun send(name: String, address: String = "") {
    println("send triggered, name : $name, address: $address")
}

