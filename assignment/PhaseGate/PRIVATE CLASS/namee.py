names = ["mariya", "BATMAN", "spongbob"]
new_names = []

for n in names:
	if n.islower():
		n = n.capitalize()
	else:
		n = "Relax" + n.capitalize()

	new_names.append(n)
names = new_names
print(names)

names = ["mariya","BATMAN","spongbob"]

[
n.capitalize() if n.islower()
else "Relax" + n.capitalize()
for n in names
]