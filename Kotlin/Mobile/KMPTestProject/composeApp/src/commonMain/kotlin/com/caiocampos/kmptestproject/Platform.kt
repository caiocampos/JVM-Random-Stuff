package com.caiocampos.kmptestproject

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform