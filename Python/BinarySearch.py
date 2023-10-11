def binary_search(arr, first, last, key):
    if not arr or len(arr) == 0:
        raise ValueError("Input array cannot be None or empty.")
    
    if last >= first:
        mid = first + (last - first) // 2

        if arr[mid] == key:
            return mid

        if arr[mid] > key:
            return binary_search(arr, first, mid - 1, key)
        else:
            return binary_search(arr, mid + 1, last, key)
    
    return -1

def main():
    arr = [10, 20, 30, 40, 50]
    key = 30
    last = len(arr) - 1

    result = binary_search(arr, 0, last, key)

    if result == -1:
        print("Element is not found!")
    else:
        print("Element is found at index:", result)

if __name__ == "__main__":
    main()
