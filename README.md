# Assignment1 Documentation
Glad to see you on my assignment1 repository here would be explained a lot of things about tasks :shipit:

## :heavy_plus_sign: Task 1 (src)[src/task1.java]
**Description**: *Return the minimum value of an array*

**Explanation**: Base case: `n=1`, then we return the first element of the array
Otherwise, we compare the `arr[n-1]` element with the recursive execution of the function to which `n=n-1` is passed and return lesser

**Solution**:
```java
public static int findMin(int n, int[] arr) {
    int a = arr[n-1];
    if (n == 1) return a;
    int otherMin = findMin(n-1, arr);
    return a < otherMin ? a : otherMin;
}
```

## :heavy_plus_sign: Task 2
**Description**: *Return average value of array*

**Explanation**: I have divided the task into 2 functions.
1. `findSum` Find the sum using recursion, where the base condition is `n=1'. Under the basic condition, we return the first element of the array.
2. `findAverage` Divide the sum by the number of array elements

**Solution**:
```java
public static float findSum(int n, int[] arr){
    int a = arr[n-1];
    if (n == 1) return a;
    return a + findSum(n-1, arr);
}

public static float findAverage(int n, int[] arr) {
    float sm = findSum(Integer.valueOf(n), arr);
    return sm/n;
}
```

## :heavy_plus_sign: Task 3
**Description**: *Check a number for a prime*

**Explanation**: It can be understood that the numbers coming after the root of the number will be divided by the numbers that go before the root of the number.
So, we simplify the algorithm to `O(sqrt(n))`
, we cycle through each of the numbers with 2, because it is the minimum prime number up to `sqrt(n)` and check for divisibility.

**Solution**:
```java
public static String checkPrime(int n) {
    if (n > 1) {
        for (int i = 2; i < Math.sqrt(n) + 1; i++) {
            if (n % i == 0) return "Composite";
        }
        return "Prime";
    } else {
        return "Composite";
    }
}

```
## :heavy_plus_sign: Task 4
**Description**: *Return factorial number*

**Explanation**: Base condition: `n=1`, then we `return 1` (the 1st element in the sequence). Otherwise: multiply the current number by the factorial of the number by one less

**Solution**:
```java
public static int factorial(int n) {
    if (n == 1) {
        return 1;
    } else {
        return n * factorial(n-1);
    }
}
```

## :heavy_plus_sign: Task 5
**Description**: *Return the number on n-th position of fibonacci sequence*

**Explanation**: Two basic conditions: `n=0` and `n=1`, then we return the corresponding values.
Otherwise: the sum of two recursions with arguments `n-1` and `n-2`

**Solution**:
```java
public static int fib(int n) {
    return switch (n) {
        case 0 -> 0;
        case 1 -> 1;
        default -> fib(n - 1) + fib(n - 2);
    };
}
```

## :heavy_plus_sign: Task 6
**Description**: *Return base in power n*

**Explanation**: Base case: `base=1` or `base=0`. 
- When `base=1` we just return base. 
- When `base=0` we just return 1 (b.c. n^0 = 1)
- Otherwise, we return `base*power(base, power-1)` so that we loop n times.

**Solution**:
```java
public static int power(int base, int power) {
    return switch (power) {
        case 1 -> base;
        case 0 -> 1;
        default -> base * power(base, power-1);
    };
}
```

## :heavy_plus_sign: Task 7
**Description**: *Reverse an array*

**Explanation**: We increasing `start` and dicreasing `stop` variables and swap elements of array by `start` and `stop` indexes while `start < stop`. Where base `start=0`, `stop=arr.length-1`

**Solution**:
```java
public static void reverseArray(int[] arr) {
    reverse(arr, 0, arr.length-1);
}
public static void reverse(int[] arr, int start, int stop) {
    if (start < stop) {
        int temp = arr[start];
        arr[start] = arr[stop];
        arr[stop] = temp;
        reverse(arr, ++start, --stop);
    }
}
```

## :heavy_plus_sign: Task 8
**Description**: *Check is provided string is integer*

**Explanation**: 
- `boolean isNum` - return `true` if `String s` is number, `false` otherwise.
- `String recFunction` - while current position(`pos`) less than `stop` code check char at `pos` index
    - If `true` we continue with increased `pos`
    - Otherwise return "No"

**Solution**:
```java
public static String loop(String letter) {
    return recFunction(letter.split(""), 0, letter.length());
}
static String recFunction(String[] arr, int pos,  int stop) {
    if (pos < stop) {
        if (isNum(arr[pos])) {
            return recFunction(arr, ++pos, stop);
        } else {
            return "No";
        }
    }
    return "Yes";
}
static boolean isNum(String s) {
    try {
        Integer.parseInt(s);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
}
```

## :heavy_plus_sign: Task 9
**Description**: *Return the minimum value of an array*

**Explanation**: Base case: `n=1`, then we return the first element of the array
Otherwise, we compare the `arr[n-1]` element with the recursive execution of the function to which `n=n-1` is passed and return lesser

**Solution**:
```java
public static int findMin(int n, int[] arr) {
        int a = arr[n-1];
        if (n == 1) return a;
        int otherMin = findMin(n-1, arr);
        return a < otherMin ? a : otherMin;
}
```

## :heavy_plus_sign: Task 10
**Description**: *Return the minimum value of an array*

**Explanation**: Base case: `n=1`, then we return the first element of the array
Otherwise, we compare the `arr[n-1]` element with the recursive execution of the function to which `n=n-1` is passed and return lesser

**Solution**:
```java
public static int findMin(int n, int[] arr) {
        int a = arr[n-1];
        if (n == 1) return a;
        int otherMin = findMin(n-1, arr);
        return a < otherMin ? a : otherMin;
}
```
