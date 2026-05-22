# 25 Important Array Programs - Java Revision Pack

Each program below is written as a small standalone Java class. For practical exams, revise the logic first, then input/output formatting according to your college pattern.

## Shortlisted 25

1. One Odd Occurring
2. Find Element at a Given Index
3. Smaller and Larger in Sorted Array
4. Palindrome Array
5. Swap Kth Elements
6. Elements in the Range
7. Quick Left Rotation
8. First 1 in a Sorted Binary Array
9. Count Pair Sum
10. Sum of Distinct Elements
11. Check Arithmetic Progression
12. Maximum Triplet Sum in Array
13. Minimum Sum of Two Elements from Two Arrays
14. Rearranging Array
15. Even Occurring Elements
16. Fibonacci in the Array
17. Perfect Array
18. Farthest Index
19. Count Pairs Odd XOR
20. Minimum Move to Front Operations
21. Merge and Sort
22. Missing Number in Shuffled Array
23. Minimum Product of K Elements
24. Find Unique Element
25. Swap Array Elements

---

## 1. One Odd Occurring

```java
class OneOddOccurring {
    static int findOdd(int[] arr) {
        int ans = 0;
        for (int x : arr) ans ^= x;
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 3, 1, 3};
        System.out.println(findOdd(arr));
    }
}
```

## 2. Find Element at a Given Index

```java
class ElementAtIndex {
    static int getElement(int[] arr, int index) {
        if (index < 0 || index >= arr.length) return -1;
        return arr[index];
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        System.out.println(getElement(arr, 2));
    }
}
```

## 3. Smaller and Larger in Sorted Array

```java
class SmallerAndLargerSorted {
    static int[] smallerAndLarger(int[] arr, int x) {
        int smaller = -1, larger = -1;

        for (int value : arr) {
            if (value < x) smaller = value;
            if (value > x) {
                larger = value;
                break;
            }
        }
        return new int[] {smaller, larger};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 11, 12, 19};
        int[] ans = smallerAndLarger(arr, 5);
        System.out.println(ans[0] + " " + ans[1]);
    }
}
```

## 4. Palindrome Array

```java
class PalindromeArray {
    static boolean isPalindromeNumber(int n) {
        int original = n, rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return original == rev;
    }

    static boolean isPalindromeArray(int[] arr) {
        for (int x : arr) {
            if (!isPalindromeNumber(x)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {111, 222, 333, 121};
        System.out.println(isPalindromeArray(arr) ? "Yes" : "No");
    }
}
```

## 5. Swap Kth Elements

```java
import java.util.Arrays;

class SwapKthElements {
    static void swapKth(int[] arr, int k) {
        int n = arr.length;
        int temp = arr[k - 1];
        arr[k - 1] = arr[n - k];
        arr[n - k] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        swapKth(arr, 2);
        System.out.println(Arrays.toString(arr));
    }
}
```

## 6. Elements in the Range

```java
import java.util.HashSet;

class ElementsInRange {
    static boolean checkRange(int[] arr, int a, int b) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : arr) set.add(x);

        for (int i = a; i <= b; i++) {
            if (!set.contains(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 7, 8, 3};
        System.out.println(checkRange(arr, 2, 5) ? "Yes" : "No");
    }
}
```

## 7. Quick Left Rotation

```java
import java.util.Arrays;

class QuickLeftRotation {
    static void leftRotate(int[] arr, int d) {
        int n = arr.length;
        d %= n;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    static void reverse(int[] arr, int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        leftRotate(arr, 2);
        System.out.println(Arrays.toString(arr));
    }
}
```

## 8. First 1 in a Sorted Binary Array

```java
class FirstOneSortedBinaryArray {
    static int firstOne(int[] arr) {
        int l = 0, r = arr.length - 1, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == 1) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 1, 1};
        System.out.println(firstOne(arr));
    }
}
```

## 9. Count Pair Sum

```java
import java.util.HashMap;

class CountPairSum {
    static int countPairs(int[] arr, int target) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int count = 0;

        for (int x : arr) {
            count += freq.getOrDefault(target - x, 0);
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 1};
        System.out.println(countPairs(arr, 6));
    }
}
```

## 10. Sum of Distinct Elements

```java
import java.util.HashSet;

class SumDistinctElements {
    static int sumDistinct(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;

        for (int x : arr) {
            if (set.add(x)) sum += x;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};
        System.out.println(sumDistinct(arr));
    }
}
```

## 11. Check Arithmetic Progression

```java
import java.util.Arrays;

class CheckArithmeticProgression {
    static boolean isAP(int[] arr) {
        if (arr.length <= 2) return true;
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != diff) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {20, 15, 5, 0, 10};
        System.out.println(isAP(arr) ? "Yes" : "No");
    }
}
```

## 12. Maximum Triplet Sum in Array

```java
class MaxTripletSum {
    static int maxTripletSum(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int x : arr) {
            if (x > first) {
                third = second;
                second = first;
                first = x;
            } else if (x > second) {
                third = second;
                second = x;
            } else if (x > third) {
                third = x;
            }
        }
        return first + second + third;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(maxTripletSum(arr));
    }
}
```

## 13. Minimum Sum of Two Elements from Two Arrays

```java
class MinimumSumTwoArrays {
    static int minimumSum(int[] a, int[] b) {
        int minA = Integer.MAX_VALUE;
        int minB = Integer.MAX_VALUE;

        for (int x : a) minA = Math.min(minA, x);
        for (int x : b) minB = Math.min(minB, x);

        return minA + minB;
    }

    public static void main(String[] args) {
        int[] a = {5, 8, 3};
        int[] b = {4, 2, 9};
        System.out.println(minimumSum(a, b));
    }
}
```

## 14. Rearranging Array

Rearranges as max, min, second max, second min...

```java
import java.util.Arrays;

class RearrangingArray {
    static int[] rearrange(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int[] result = new int[n];
        int l = 0, r = n - 1, index = 0;

        while (l <= r) {
            if (index < n) result[index++] = arr[r--];
            if (index < n) result[index++] = arr[l++];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(rearrange(arr)));
    }
}
```

## 15. Even Occurring Elements

```java
import java.util.HashMap;

class EvenOccurringElements {
    static void printEvenOccurring(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int x : arr) freq.put(x, freq.getOrDefault(x, 0) + 1);

        for (int x : freq.keySet()) {
            if (freq.get(x) % 2 == 0) System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4};
        printEvenOccurring(arr);
    }
}
```

## 16. Fibonacci in the Array

```java
import java.util.HashSet;

class FibonacciInArray {
    static HashSet<Integer> buildFibSet(int max) {
        HashSet<Integer> fib = new HashSet<>();
        int a = 0, b = 1;
        while (a <= max) {
            fib.add(a);
            int c = a + b;
            a = b;
            b = c;
        }
        return fib;
    }

    static void printFibonacciNumbers(int[] arr) {
        int max = 0;
        for (int x : arr) max = Math.max(max, x);

        HashSet<Integer> fib = buildFibSet(max);
        for (int x : arr) {
            if (fib.contains(x)) System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 8, 5, 20, 1, 40, 13};
        printFibonacciNumbers(arr);
    }
}
```

## 17. Perfect Array

Array is perfect if it is same as its reverse.

```java
class PerfectArray {
    static boolean isPerfect(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            if (arr[l++] != arr[r--]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};
        System.out.println(isPerfect(arr) ? "Perfect" : "Not Perfect");
    }
}
```

## 18. Farthest Index

For each `i`, find farthest `j` such that `arr[j] > arr[i]`.

```java
class FarthestIndex {
    static int maxDistance(int[] arr) {
        int n = arr.length;
        int[] suffixMax = new int[n];
        suffixMax[n - 1] = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffixMax[i] = Math.max(arr[i], suffixMax[i + 1]);
        }

        int answer = 0;
        for (int i = 0; i < n; i++) {
            int l = i + 1, r = n - 1, best = i;
            while (l <= r) {
                int mid = l + (r - l) / 2;
                if (suffixMax[mid] > arr[i]) {
                    best = mid;
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
            answer = Math.max(answer, best - i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 2, 4};
        System.out.println(maxDistance(arr));
    }
}
```

## 19. Count Pairs Odd XOR

XOR is odd when one number is even and the other is odd.

```java
class CountPairsOddXor {
    static int countPairs(int[] arr) {
        int even = 0, odd = 0;
        for (int x : arr) {
            if (x % 2 == 0) even++;
            else odd++;
        }
        return even * odd;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(countPairs(arr));
    }
}
```

## 20. Minimum Move to Front Operations

Minimum moves to make array sorted by moving elements to front.

```java
import java.util.Arrays;

class MinimumMoveToFront {
    static int minMoves(int[] arr) {
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        int i = arr.length - 1;
        int j = sorted.length - 1;

        while (i >= 0) {
            if (arr[i] == sorted[j]) j--;
            i--;
        }
        return j + 1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 4, 3, 8};
        System.out.println(minMoves(arr));
    }
}
```

## 21. Merge and Sort

```java
import java.util.Arrays;

class MergeAndSort {
    static int[] mergeAndSort(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int index = 0;

        for (int x : a) result[index++] = x;
        for (int x : b) result[index++] = x;

        Arrays.sort(result);
        return result;
    }

    public static void main(String[] args) {
        int[] a = {10, 5, 15};
        int[] b = {20, 3, 2};
        System.out.println(Arrays.toString(mergeAndSort(a, b)));
    }
}
```

## 22. Missing Number in Shuffled Array

One array has all elements, the second has one missing element.

```java
class MissingNumberShuffledArray {
    static int missingNumber(int[] full, int[] shuffled) {
        int xor = 0;
        for (int x : full) xor ^= x;
        for (int x : shuffled) xor ^= x;
        return xor;
    }

    public static void main(String[] args) {
        int[] full = {4, 8, 1, 3, 7};
        int[] shuffled = {7, 4, 3, 1};
        System.out.println(missingNumber(full, shuffled));
    }
}
```

## 23. Minimum Product of K Elements

```java
import java.util.Arrays;

class MinimumProductKElements {
    static int minProduct(int[] arr, int k) {
        Arrays.sort(arr);
        int product = 1;
        for (int i = 0; i < k; i++) product *= arr[i];
        return product;
    }

    public static void main(String[] args) {
        int[] arr = {11, 8, 5, 7, 5, 100};
        System.out.println(minProduct(arr, 3));
    }
}
```

## 24. Find Unique Element

Every element occurs twice except one.

```java
class FindUniqueElement {
    static int unique(int[] arr) {
        int ans = 0;
        for (int x : arr) ans ^= x;
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 5, 3, 4};
        System.out.println(unique(arr));
    }
}
```

## 25. Swap Array Elements

Swaps adjacent elements.

```java
import java.util.Arrays;

class SwapArrayElements {
    static void swapAdjacent(int[] arr) {
        for (int i = 0; i + 1 < arr.length; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        swapAdjacent(arr);
        System.out.println(Arrays.toString(arr));
    }
}
```

---

## Last-Minute Revision Order

Revise these first if time is short:

1. XOR based: One Odd Occurring, Find Unique Element, Missing Number
2. Sorting based: Arithmetic Progression, Merge and Sort, Rearranging, Minimum Product
3. Hashing based: Count Pair Sum, Distinct Sum, Elements in Range, Even Occurring
4. Two-pointer/reverse based: Palindrome Array, Perfect Array, Quick Rotation, Swap Kth
5. Logic based: Count Odd XOR, Max Triplet Sum, Fibonacci in Array
