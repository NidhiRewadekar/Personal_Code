print("Welcome to Pizza Parlour!")
size=input("Which size would you like? S, M or L ")
add_pepperoni=input("Do you want pepperoni? Y or N ")
extra_cheese=input("Do you want extra cheese? Y or N ")
bill=0
if size=="S":
  bill=bill+15
elif size=="M":
  bill=bill+20
elif size=="L":
  bill=bill+25

if add_pepperoni=="Y":
  if size=="S":
    bill=bill+2
  else:
    bill=bill+3

if extra_cheese=="Y":
  bill=bill+1

print(f"Your bill is {bill}")
