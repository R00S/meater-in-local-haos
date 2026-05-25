package io.kitchen.meater.cooking

enum class CookingState {
    IDLE,
    COOKING,
    APPROACHING,     // within 10 °C of target
    GOAL_REACHED,
    RESTING,
    DONE
}
