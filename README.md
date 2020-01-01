# BattlePets
This program lets two users play Battle Pets in a console.

Battle Pets is a game designed by Dr. Douglas Selent at the University of Wisconsin-Platteville.
I implemented it with the help of Alex Ahlrichs, Jared Hollenerger, Zexin Liu, and Lincoln Schroeder
for a class titled Object-Oriented Analysis and Design.

Each player has a pet that does battle with opposing players' pets.
There are two types of players: human and AI.
At the start of the game, players choose their pet's type and specify game settings.

Battle Pets can be played in either tournament or normal mode. In normal mode,
gameplay consists of a battle, which consists of one or more fights, each consisting of
of one or more rounds. In tournament mode, there are multiple tiers of battles.

During a round, players choose which skill their pet uses to damage opposing pets.
Each skill inflicts random and conditional damage, depending on the type of pet and 
the cooldown of the pet's skills, as well as the cooldown time of opposing pets' skills.

There are also two skills shared by every pet type: Reversal of Fortune and
Shoot the Moon. Reversal of Fortune adds extra damage depending on past damage
inflicted by the pet. Shoot the Moon boosts damage if a player correctly
predicts the skill used by an opposing pet.

When a pet's HP falls below zero, a passive ability called Sleep Scent is applied.
Gameplay continues until only one pet has more than 0 HP.
At this time, a fight is concluded, and the program checks for a battle winner or a tie.
