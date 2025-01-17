import matplotlib.pyplot as plt 

value = [5, 6, 3, 7, 2]
names = ["A", "B", "C", "D", "E"]

# Set figure size using the figsize parameter
plt.figure(figsize=(10, 5))  # Width = 10, Height = 5
plt.barh(names, value, color="khaki")

plt.show()
