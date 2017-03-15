package ReviseAssignment
import scala.io.StdIn
import scala.io.StdIn.readInt
import scala.util.control.Breaks
/**
  * Created by Mmekut on 3/14/2017.
  */
object TemperatureConversion  extends  App
{

  def centigradeToFahrenheit(tem:Float):Float=
  {
    val cal:Float=((tem * 9.0f))/(5.0f) + 32.0f
     cal

  }

  def fahrenheitToCentigrade(tem:Float):Float=
  {
    val cal:Float=(((tem - 32.0f))*5.0f)/9.0f
     cal

  }
  println(f" Thanks, the results in fahrenheit is ${TemperatureConversion.centigradeToFahrenheit(0)}%.2f  F")
  println(f" Thanks, the results in fahrenheit is ${TemperatureConversion.centigradeToFahrenheit(25)}%.2f  F")
  println(f" Thanks, the results in fahrenheit is ${TemperatureConversion.centigradeToFahrenheit(30)}%.2f  F")
  println(f" Thanks, the results in fahrenheit is ${TemperatureConversion.centigradeToFahrenheit(45)}%.2f  F")
  println(f" Thanks, the results in fahrenheit is ${TemperatureConversion.centigradeToFahrenheit(50)}%.2f  F")
  println(f" Thanks, the results in fahrenheit is ${TemperatureConversion.centigradeToFahrenheit(60)}%.2f  F")
  println(f" Thanks, the results in fahrenheit is ${TemperatureConversion.centigradeToFahrenheit(100)}%.2f  F")
  println(f" Thanks, the results in fahrenheit is ${TemperatureConversion.centigradeToFahrenheit(150)}%.2f  F")
  println(f" Thanks, the results in fahrenheit is ${TemperatureConversion.centigradeToFahrenheit(200)}%.2f  F")
  println()
  println()

  println(f" Thanks, the results in centigrade is ${TemperatureConversion.fahrenheitToCentigrade(0)}%.2f C")
  println(f" Thanks, the results in centigrade is ${TemperatureConversion.fahrenheitToCentigrade(25)}%.2f C")
  println(f" Thanks, the results in centigrade is ${TemperatureConversion.fahrenheitToCentigrade(30)}%.2f C")
  println(f" Thanks, the results in centigrade is ${TemperatureConversion.fahrenheitToCentigrade(45)}%.2f C")
  println(f" Thanks, the results in centigrade is ${TemperatureConversion.fahrenheitToCentigrade(50)}%.2f C")
  println(f" Thanks, the results in centigrade is ${TemperatureConversion.fahrenheitToCentigrade(60)}%.2f C")
  println(f" Thanks, the results in centigrade is ${TemperatureConversion.fahrenheitToCentigrade(100)}%.2f C")
  println(f" Thanks, the results in centigrade is ${TemperatureConversion.fahrenheitToCentigrade(150)}%.2f C")
  println(f" Thanks, the results in centigrade is ${TemperatureConversion.fahrenheitToCentigrade(200)}%.2f C")
}
