# Assignment1 Documentation
Glad to see you on my assignment1 repository here would be explained a lot of things about tasks :shipit:

## :heavy_plus_sign: Task 1
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

## :heavy_plus_sign: Task 5
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

## :heavy_plus_sign: Task 6
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

## :heavy_plus_sign: Task 7
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

## :heavy_plus_sign: Task 8
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
