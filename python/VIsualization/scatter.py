import matplotlib.pyplot as plt 



# xvalue = [0,1,2,3,4,5]
# yvalue = [0,1,4,9,16,25]


# plt.figure(figsize=(45,45))
# plt.scatter(xvalue,yvalue,s=30,color='blue')

# plt.show()


x = [1,2,3,4,5,6,7,8,9,10]
y = [2,4,5,7,6,8,9,11,12,12]


plt.scatter(x,y,label='stars',color='green',marker='*',s=30)

plt.xlabel("x-axis")
plt.ylabel("y-axis")

plt.title("My scatter plot")

plt.legend()

plt.show()