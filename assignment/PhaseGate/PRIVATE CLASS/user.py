

my_dict = {'name':'alice','age':25}
new_data = {'city':'new york','age':26}

for key,value in new_data.items():
	my_dict[key] = value
print (my_dict)	
