# BattlePets
This program lets two users play Battle Pets in a console.

Battle Pets is a game designed by Dr. Douglas Selent at the University of Wisconsin-Platteville.
I implemented it with the help of Alex Ahlrichs, Jared Hollenerger, Zexin Liu, and Lincoln Schroeder
for a class titled Object-Oriented Analysis and Design.

Each player possesses a pet that does battle with opposing players' pets.
At the start of the game, players choose their pet's type and specify game settings.

Gameplay consists of a battle. A battle consists of one or more fights, which consists
of one or more rounds.

During a round, each player chooses which skill their pet uses to damage
the pets of other players. Each skill inflicts random and conditional damage,
depending on the type of pet and the cooldown of the pet's skills, as well
as the cooldown time of opposing pets' skills.

Gameplay continues until one or zero pets have zero or less hit points (HP).
At this time, a fight is concluded, and the program checks for a winner or a tie.

For future iterations, Battle Pets will receive AI and GUI functionality.
