# QazaPrayers


<p align="center">
  <img src="https://img.shields.io/badge/Language-Java-007396?style=flat-square">
  <img src="https://img.shields.io/badge/Library-TelegramBots-26A5E4?style=flat-square">
</p>

<h3>Overview</h3>

QazaPrayers Telegram bot is a prayer time application that displays the Islamic prayer times for different locations throughout Uzbekistan and  
helps to perform the prayers on time and not to miss them
Built with Java, it utilizes the TelegramBots library to interact with Telegram.

The bot fetches prayer times data from a reliable API and provides a user-friendly interface to display the prayer times for a selected location. Additionally, it includes a feature to remind the user to pray during the 5 daily prayers and tracks the prayers that have been performed and not performed. The user can check the missed prayers in the history section and remove them from the qaza prayers after the qaza prayers have finished.

<h3>Installation</h3>


To install the bot, follow these steps:

<ul>
  <li>Clone the project repository to your local machine.</li>
  <li>Ensure that Java is installed on your machine.</li>
  <li>Install the required packages using the command <code>mvn install</code>.</li>
  <li>Create a bot on Telegram using BotFather.</li>
  <li>Copy the bot token generated by BotFather.</li>
  <li>Open the <code>application.properties</code> file and paste the bot token in the <code>bot.token</code> property.</li>
</ul>

<h3>Usage</h3>

To use the bot, simply search for the bot username on Telegram and send it a message. You can launch the bot with the <u>/start</u> command, and the language selection will appear. After selecting the language, you will select your region of residence, and prayer times will be sent depending on your chosen region.

You can also use the <u>/help</u> command to get more information on how to use the bot.





