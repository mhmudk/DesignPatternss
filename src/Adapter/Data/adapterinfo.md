# 1.  Imagine we have a system that use a specific interface 
#       AccountService  that contain a getAccountBalance method and return the balance of the account in Double.

# 2.  Now we want to integrate a new system that use a  different interface that return account balance in String format.
# 3.  To solve this problem, we can create an Adapter class that implement the AccountService interface and use the new system to get the account balance and convert it to Double format.
# 4.  The Adapter class will act as a bridge between the two systems and allow us to use the new system without changing the existing code that use the AccountService interface.
# 5.  This way, we can integrate the new system without changing the existing code and maintain the compatibility of the system.

