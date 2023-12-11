// BaseEntity.kt
data class BaseEntity(
    val id: Int,
    val name: String,
    val age: Int,
    val gender: String,
    val height: Double,
    val weight: Double,
    val isAlive: Boolean,
    val location: String,
    val occupation: String,
    val description: String
)

// Zombie.kt
data class Zombie(
    val decayRate: Double,
    val baseEntity: BaseEntity
) {
    fun bite() {
        println("${baseEntity.name} is biting!")
    }
}

// Human.kt
data class Human(
    val baseEntity: BaseEntity
) {
    fun talk() {
        println("${baseEntity.name} is talking.")
    }
}

fun main() {
    val zombie = Zombie(
        0.8, BaseEntity(
            1, "Zombie1", 100, "Undead", 1.8, 70.0,
            true, "Graveyard", "Walker", "A decaying creature with an insatiable hunger"
        )
    )

    val human = Human(
        BaseEntity(
            2, "John", 25, "Male", 1.75, 68.0,
            true, "City", "Developer", "A human being living in a modern society"
        )
    )

    zombie.bite()
    human.talk()

    println("Zombie ID: ${zombie.baseEntity.id}, Human ID: ${human.baseEntity.id}")
}
