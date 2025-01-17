import numpy as np

lst = [1, 2, 3, 4, 5, 6, 7, -2, 8, 9, 10]

maximum = np.amax(lst)
minimum = np.amin(lst)
mean = np.mean(lst)
median = np.median(lst)
ptp = np.ptp(lst)  # Range of value along an axis (peak to peak)
standardDeviation = np.std(lst)
variance = np.var(lst)
avg = np.average(lst)

percentile = np.percentile(lst, )  # 3rd percentile
print("Maximum value is: ", maximum)
print("Minimum value is: ", minimum)
print("Mean value is: ", mean)
print("Median value is: ", median)
print("Peak to peak value is: ", ptp)
print("Standard Deviation value is: ", standardDeviation)
print("Variance value is: ", variance)
print("Average value is: ", avg)
print("Percentile value is: ", percentile)
