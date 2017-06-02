package org.kolokolov.boot

import org.kolokolov.ShopBot

import scala.io.StdIn

/**
  * Created by andersen on 12.05.2017.
  */
object Boot extends App {
  val bot = new ShopBot
  bot.run()

  println("MessengerBot is running. Press ENTER to stop...")
  StdIn.readLine()
  bot.shutdown()
}
