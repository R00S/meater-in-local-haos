package io.kitchen.meater.cooking

enum class CookingState {
    IDLE,
    COOKING,
    APPROACHING,     // within 10 °C of target
    WAITING_FOR_REST_ACK,
    RESTING,
    WAITING_FOR_DONE_ACK,
    DONE
}
