public class CheckDisjointArrays {

    int checkForDisjointArrays(int size1, int arr1[], int size2, int arr2[])
    {
        int i;

        for(i = 0; i < size1; i++)
            insert(arr1[i]);

        for(i = 0; i < size2; i++)
        {
            if(search(arr2[i]) == 1)
                return 0;
        }

        return 1;

    }

    int size = 13;
    int arr[] = new int[size];

    void init()
    {
        int i;
        for(i = 0; i < size; i++)
            arr[i] = -1;
    }

    int insert(int value)
    {
        int key = value % size;
        int index = key;

        while(arr[index] != -1)
        {
            index = (index + 1) % size;

            if(index == key)
            {
                System.out.print("Hash Table Full\n");
                return 0;
            }
        }

        arr[index] = value;

        return 1;
    }

    int search(int value)
    {
        int key = value % size;
        int index = key;

        while(arr[index] != value)
        {
            index = (index + 1) % size;

            if(index == key)
                return 0;
        }

        return 1;
    }

    public static void main(String[] args) {
        CheckDisjointArrays obj = new CheckDisjointArrays();

        int arr1[] = {10, 14, 15, 18, 50};
        int arr2[] = {30, 60, 90};

        obj.init();

        if (obj.checkForDisjointArrays(5, arr1, 3, arr2) == 1) {
            System.out.print("1 ");
        } else {
            System.out.print("0 ");
        }

        int arr3[] = {19, 56, 50, 100};
        int arr4[] = {100, 200, 300, 400};

        obj.init();

        if (obj.checkForDisjointArrays(4, arr3, 4, arr4) == 0) {
            System.out.print("1 ");
        } else {
            System.out.print("0 ");
        }

        int arr5[] = {1, 2, 3};
        int arr6[] = {1, 2, 3};

        obj.init();

        if (obj.checkForDisjointArrays(3, arr5, 3, arr6) == 0) {
            System.out.print("1 ");
        } else {
            System.out.print("0 ");
        }

        int arr7[] = {3, 6, 9, 12, 15, 18};
        int arr8[] = {4, 8, 16};

        obj.init();

        if (obj.checkForDisjointArrays(6, arr7, 3, arr8) == 1) {
            System.out.print("1 ");
        } else {
            System.out.print("0 ");
        }

        int arr9[] = {90, 100, 190, 200};
        int arr10[] = {100, 200, 90, 190};

        obj.init();

        if (obj.checkForDisjointArrays(4, arr9, 4, arr10) == 0) {
            System.out.print("1 ");
        } else {
            System.out.print("0 ");
        }

    }
}
