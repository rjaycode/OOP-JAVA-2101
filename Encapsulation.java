class BankAccount:
    def __init__(self, balance=0):
        self.__balance = balance  # private variable

    def deposit(self, amount):
        self.__balance += amount

    def withdraw(self, amount):
        if amount <= self.__balance:
            self.__balance -= amount
        else:
            print("Insufficient funds!")

    def get_balance(self):
        return self.__balance

# Test
account = BankAccount(1000)
account.deposit(500)
print(account.get_balance())
  
