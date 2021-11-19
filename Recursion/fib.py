#Write a recursive function called fib which accepts a number and returns the nth number n the Fibonacci sequence.

def fib(num):
    if (num < 2):
        return num
    return fib(num - 1) + fib(num - 2)
