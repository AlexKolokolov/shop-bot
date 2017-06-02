package org.kolokolov

import com.typesafe.scalalogging.Logger
import info.mukel.telegrambot4s.Implicits._
import info.mukel.telegrambot4s.api._
import info.mukel.telegrambot4s.methods._
import info.mukel.telegrambot4s.models._
import org.kolokolov.MessageHandler._

import scala.io.Source


/**
  * Created by Kolokolov on 12.05.2017.
  */
class ShopBot extends TelegramBot with Polling with Commands {

  override val logger = Logger("HistoryLogger")

  lazy val token: String = Source.fromFile("bot.token").getLines.mkString

  on("/addusr") {
    implicit msg => args => {
      reply(s"User with name ${args.head} has been added")
      logger.info(s"User with name ${args.head} has been added")
    }
  }
}
