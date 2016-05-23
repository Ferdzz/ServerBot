## ServerBot - A fun Spigot/Bukkit plugin for Minecraft Servers (README still in progress)
ServerBot is a fun little Spigot/Bukkit plugin that is meant to add life to a Minecraft server without taking too much of a toll
on the overall concept of the Vanilla game. The plugin also serves as my reintroduction into both Java development and Spigot plugin
development. The goal here was to create something that was fun and usable but also something that is remotely challenging for
me to work on to get my skills back in check, or at a working level once again.

<hr>
###<a name="top">Table of Contents</a>
1. [Plugin Details and Functions](#plugin-details)
2. [Plugin Commands](#plugin-commands)
3. [Plugin Permissions](#plugin-permissions)
4. [Changelog](#current-implementations)
5. [Credits](#credits)
<hr>
  
####<a name="plugin-details">Plugin Details and Functions</a>
ServerBot has a multitude of fun little functions, mostly games that text-based that allow players on the server to interact
with one another. In addition, the plugin also provides some moderation capabilities, allowing the server managers to kick,
ban, mute, unban, and unmute players. _Please note that not all of these methods have been implemented as of [05.22.2016]
Provided below is a list of all the features that this plugin implements;
- Eightball: Players can ask a question and expect a response much like that of a real eightball.
- Spin the bottle: Players can spin the bottle, it randomly chooses two people that are online in the server.
- Coin toss: Gives players the ability to let a virtual coin make their decisions
- Roll: Allows players to roll for a random number within the bounds in which they define with a paramter thats required in the command.
- Cat: Sends the player a link to a random cat picture!
- Bye: Sends a farewell to the player displaying a link to a farewell picture!
<hr>

####<a name="plugin-commands">Plugin Commands</a>
|Command Name     |         Usage       |Description|
|---------------- |---------------------|-----------|
|Eightball        |/eightball <question>|Users ask a virtual eightball questions.|
|Spin the bottle* |/spinthebottle       |User spins the bottle, the plugin will randomly choose two people on the server.|
|Coin toss        |/coin                |User tosses a coin and lets chance dictate their choices.|
|Roll             |/roll <upper-bound>  |User rolls for a random number between 0 and the desired upper-bound number.|
|Cat*             |/cat                 |User gets sent a link to a random cat picture.|
|Bye              |/bye                 |User gets sent a link to a farewell picture.|
"*" _to be implemented_
[Back to table of contents](#top)
<hr>

####<a name="plugin-permissions">Plugin Permissions</a>
|Command Name     |   Permission Node   |
|---------------- |---------------------|
|Eightball        |serverbot.eightball  |
|Spin the bottle* |serverbot.bottle     |
|Coin toss        |serverbot.coin       |
|Roll             |serverbot.roll       |
|Cat*             |serverbot.cat        |
|Bye              |serverbot.bye        |
"*" _to be implemented_
<hr>

####<a name="changelog">Changelog (Latest Update: 05.22.2016)</a>
-[05.22.2016] - Set up the plugin in IntelliJ and got the plugin structure established. 
-[05.22.2016] - Implemented the eightball, coin, roll, and bye features. 
<hr>

####<a name="credits">Credits</a>
My ideas for this simple, yet fun and rewarding plugin was generated by observing the work that has been done by @SilentEvanesce on the Discord bot that is used on our server. So thank you very much!

[Back to table of contents](#top)
