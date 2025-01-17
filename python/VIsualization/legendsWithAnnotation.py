import numpy as np 
from matplotlib import pyplot as plt 

x = np.arange(0,10)
y = x**2;
z = x**3;
t = X**4;

plt.title("Graph Drawing")
plt.xlabel("TIme")
plt.ylabel("Distance")
plt.plot(x,y)
plt.annotate(xy=[2,1],s'Second Entry)