package tech.qhuyy.lastlocation

data class SavedLocation(
    val worldName: String,
    val x: Double, val y: Double, val z: Double,
    val yaw: Float, val pitch: Float
)
