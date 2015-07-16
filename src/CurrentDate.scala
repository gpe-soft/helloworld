/**
 * User: gpe-soft
 * Date: 16-7-2015    22:28
 */

import java.util.{Locale, Date}
import java.text.DateFormat._

object CurrentDate {
  def main(args: Array[String]) {
    val now = new Date
    val df = getDateInstance(LONG, Locale.US)
    println("Today's date is: " + df.format(now))
  }
}
