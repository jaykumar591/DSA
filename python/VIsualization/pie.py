import matplotlib.pyplot as plt

# Defining labels
activities = ['eat', 'sleep', 'work', 'play']

slices = [3, 7, 8, 6]  # Corrected variable name

colors = ['r', 'y', 'g', 'b']

# Correcting the explode tuple length
plt.pie(slices, labels=activities, colors=colors, startangle=90, shadow=True, 
        explode=(0, 0, 0, 0.1), radius=1.2, autopct='%1.1f%%')  # Adjusted explode tuple

plt.legend()
plt.show()
