package sk.samar.fitwise

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform