package com.rylderoliveira.pdv

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform