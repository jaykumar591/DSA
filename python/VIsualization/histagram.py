import matplotlib.pyplot as plt 




# ages = [2,23,4,34,65,76,34,76,23,46,67,67]

# range = (0,100)

# bins = 10

# plt.hist(ages,bins,range,color='green',histtype='bar',rwidth=0.8)

# plt.xlabel("ages")
# plt.ylabel('No of people')

# plt.title("My histagram")

# plt.show()


x = [2,1,6,4,3,2,4,5,6,7,8,5,4,3,3,2,4,5,6,7]

plt.hist(x,bins=10,color='blue',alpha=0.5)

plt.show()