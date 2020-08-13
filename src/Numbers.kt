fun main() {
    val panjang = "20"
    val lebar = 12.6
    val tinggi = 10
    val volume : Double
    //to do
    val pa: Float = panjang.toFloat()
    val ti: Float = tinggi.toFloat()
    volume = 0.0
    var vo: Float = volume.toString().toFloat()
    vo = hitungVolume(pa.toDouble(),lebar, ti.toDouble())
    println("Volume dari balok yang mempunyai panjang $panjang, lebar $lebar, dan tinggi $tinggi ini adalah $vo")
}
fun hitungVolume(p : Double, l: Double, t : Double):Float
{
    val v = p * l * t
    //to do
    return v.toFloat()
}