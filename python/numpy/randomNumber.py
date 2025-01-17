# Importing random from numpy
from numpy import random
import numpy as np

# Print random values
print(random.random())  # returns a random float between 0.0 and 1.0
print(random.randint(1, 10))  # returns a random integer between 1 and 10
print(random.choice([1, 2, 3, 4, 5]))  # returns a random element from the list

# List of 10 random integers between 1 and 10
lst = [random.randint(1, 10) for i in range(10)]
print(lst)  # returns a list of 10 random integers between 1 and 10

# List of 10 random floats between 0.0 and 1.0
another_list = random.random_sample((10,))
print(another_list)  # returns a list of 10 random floats between 0.0 and 1.0


# vector ized operations
list1 = [ 1, 2, 3, 4, 5]
list2 = [ 6, 7, 8, 9, 10]
# vectorized addition

vtr1 = np.array(list1)
vtr2 = np.array(list2)

vtr_add = vtr1 + vtr2
print(vtr_add)  # returns [7 9 11 13 15]

# vector dot product
# vtr_dot_product = vtr1.dot(vtr2)
vtr_dot_product = np.dot(vtr1, vtr2)
print(vtr_dot_product)  # returns 130

#  create matrix 
matrix = np.matrix(list)
print(matrix)  # returns a matrix of the product of the two vectors