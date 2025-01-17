import matplotlib.pyplot as plt
import numpy as np 


x = np.linspace(0,5,11)

y = x**2

plt.subplot(1,2,1)
plt.plot(x,y,'--')
plt.subplot(1,2,2)
plt.plot(x,y,'g*-')
plt.xlabel("X Axis Title Here")

plt.xlabel("A Axis Title Here")
plt.ylabel("Y Axis Title Here")

plt.title("String Title Here")

plt.show()