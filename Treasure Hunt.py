print("Welcome to Treasure Hunt!")
print("You have to find a treasure chest which will save your kingdom from enemies.")
direction=input("Where would you like to go? Left or Right? ").lower()
if direction=="left":
  print("You are killed because a tree fell on you. Game Over.")
else:
  #Move ahead lol
  mode=input("Do you want to swim or walk? ").lower()
  if mode=="swim":
    print("You are eaten up by the sharks. Game over.")
  else:
    # move ahead bro
    colour=input("Which door would you like to open? Red, Yellow, Blue or Green? ").lower()
    if colour=="red":
      print("You have been engulfed by a fire. Game Over")
    elif colour=="yellow":
        print("You have won the treasure! Hooray!")
    elif colour=="blue":
      print("You were drowned in water. Game Over.")
    elif colour=="green":
      print("You have been killed by a forest nymph. Game Over.")
    else:
      print("You have chosen a door which is not present. Try again.")
