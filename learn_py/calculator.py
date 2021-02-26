print("-----------------Hello---------------")
num1 = input("Enter first number  :")
num2 = input("Enter second number :")
operator = input("Enter operator      :")

def add_numbers(a,b):
    c = a + b
    print(c)

def sub_numbers(d,e):
    f = d - e
    print(f)

def mul_numbers(g,h):
    i = g * h
    print(i)

def div_numbers(j,k):
    l = j / k
    print(l)

if (operator == '+'):
    add_numbers(num1,num2)
elif (operator == '-'):
    sub_numbers(num1,num2)
elif(operator == '*'):
    mul_numbers(num1,num2)
elif(operator == '/'):
    div_numbers(num1,num2)
else:
    print("Gon modaya")
