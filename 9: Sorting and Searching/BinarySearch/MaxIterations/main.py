# to find the max number of iterations needed to binary search, the 
# formula is log_2(length).
# if the result is a decimal, round up

import math

def find_max_iters(arr):
    # finds the ceiling of log base 2(length of array)
    return math.ceil(  # rounds up
        math.log2(     # log base 2
            len(arr)   # length of the array/list
        )
    ) 

length = 1024
print(f"The max number of iterations to binary search and array of length {length} is...")
print(
    find_max_iters(range(length))
)