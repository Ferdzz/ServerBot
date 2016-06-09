## ServerBot - A fun Spigot/Bukkit plugin for Minecraft Servers (README still in progress)
ServerBot is a fun little Spigot/Bukkit plugin that is meant to add life to a Minecraft server without taking too much of a toll on the overall concept of the Vanilla game. The plugin also serves as my reintroduction into both Java development and Spigot plugin development. The goal here was to create something that was fun and usable but also something that is remotely challenging for me to work on to get my skills back in check, or at a working level once again.

<hr>

###<a name="top">Table of Contents</a>
1. [Plugin Details and Functions](#plugin-details)
2. [Plugin Commands](#plugin-commands)
3. [Plugin Permissions](#plugin-permissions)
4. [Changelog](#changelog)
5. [Known Issues / Task List](#known-issues)
6. [Credits](#credits)

<hr>
  
####<a name="plugin-details">Plugin Details and Functions</a>
ServerBot has a multitude of fun little features, mostly games that are text-based that allow players on the server to interact
with one another. 
- Eightball: Players can ask a question and expect a response much like that of a real eightball.
- Spin the bottle: Players can spin the bottle, it randomly chooses two people that are online in the server.
- Coin toss: Gives players the ability to let a virtual coin make their decisions
- Roll: Allows players to roll for a random number within the bounds in which they define with a paramter thats required in the command.
- Snip: Allows user to edit a certain word in someone's sentence, which is then output by the bot.
- Bye: Sends a farewell to the player displaying a link to a farewell picture!
- Chat logging: Allows server managers to define a list of words that causes the user's name and that sentence to be logged into an plain text file. (Useful for catching somone swearing or being insensitive to certain groups of people).

[Back to table of contents](#top)

<hr>

####<a name="plugin-commands">Plugin Commands</a>
|Command Name     |         Usage       |Description|
|---------------- |---------------------|-----------|
|Eightball        |/eightball <question>|Users ask a virtual eightball questions.|
|Spin the bottle  |/spinthebottle       |User spins the bottle, the plugin will randomly choose two people on the server.|
|Coin toss        |/coin                |User tosses a coin and lets chance dictate their choices.|
|Roll             |/roll <upper-bound>  |User rolls for a random number between 0 and the desired upper-bound number.|
|Snip             |/snip <to-replace> <replace-with>  |User edits a certain word in someone's sentence, which is then output by the bot.|
|Bye              |/bye                 |User gets sent a link to a farewell picture.|

[Back to table of contents](#top)

<hr>

####<a name="plugin-permissions">Plugin Permissions</a>
|Command Name     |   Permission Node   |
|---------------- |---------------------|
|Eightball        |serverbot.eightball  |
|Spin the bottle  |serverbot.bottle     |
|Coin toss        |serverbot.coin       |
|Roll             |serverbot.roll       |
|Snip             |serverbot.snip       |
|Bye              |serverbot.bye        |

[Back to table of contents](#top)

<hr>

#### <a name="changelog">Changelog (Latest Update: 05.27.2016)</a>
- **05.22.2016:** Set up the plugin in IntelliJ and got the plugin structure established. 
- **05.22.2016:** Implemented the eightball, coin, roll, and bye features.
- **05.23.2016:** Implemented the spin command.
- **05.23.2016:** Fixed the /roll command's faulty range and handled the number format error.
- **05.25.2016:** Implemented snip command.
- **05.27.2016:** Implemented handling for config files.
- **05.27.2016:** Implemented handling for color codes.

[Back to table of contents](#top)

<hr>

####<a name="known-issues">Known Issues / Task List</a>
- [x] Fix incorrect range on /roll due to faulty coding.
- [x] Fix error that will be thrown if an integer is not entered with /roll.
- [x] Implement snip command.
- [ ] Implement chat logging.
- [x] Add a customizable config.yml so server managers may define some parts of the bot output

[Back to table of contents](#top)

<hr>

####<a name="credits">Credits</a>
My ideas for this simple, yet fun and rewarding plugin was generated by observing the work that has been done by @SilentEvanesce on the Discord bot that is used on our server. So thank you very much!

[Back to table of contents](#top)

