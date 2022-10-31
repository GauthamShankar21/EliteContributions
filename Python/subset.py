def subsetsUtil(A, subset=[], index=0):

    print(*subset)

    for i in range(index, len(A)):
        subset.append(A[i])

        subsetsUtil(A, subset, i + 1)

        subset.pop(-1)
    return


array = [1, 2, 3]
subsetsUtil(array)
