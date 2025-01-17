import numpy as np
from matplotlib import pyplot as plt 

x = np.arange(0, 10)
y = x**2  # Use ** for exponentiation

plt.title("Graph Drawing")
plt.xlabel("Time")
plt.ylabel("Distance")
plt.plot(x, y)

# Corrected annotations
plt.annotate('Second Entry', xy=(2, 4))  # Correct text argument
plt.annotate('Third Entry', xy=(4, 16))

plt.show()
