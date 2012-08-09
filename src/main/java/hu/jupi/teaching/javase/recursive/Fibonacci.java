package hu.jupi.teaching.javase.recursive;

class Fibonacci {

    public long fibonacci(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return fibonacci(n - 2) + fibonacci(n - 1);
        }
    }

    private long fibonacci2W(int i, int n, long n1, long n2) {
        if (i > n || n < 1 || i < 0) {
            throw new IllegalArgumentException();
        } else if (i == n) {
            return n1;
        } else {
            return fibonacci2W(i + 1, n, n1 + n2, n1);
        }
    }

    private long fibonacci3W(int n, long n1, long n2) {
        if (n < 0) {
            throw new IllegalArgumentException();
        } else if (n == 1) {
            return n1;
        } else {
            return fibonacci3W(n - 1, n1 + n2, n1);
        }
    }

    public long fibonacci2(int n) {
        return fibonacci2W(1, n, 1, 0);
    }

    public long fibonacci3(int n) {
        return fibonacci3W(n, 1, 0);
    }
}