class ExampleClass:
    def __init__(self,x):
        self.x = x
    def __private_method(self):
        return 0
    def pubic_method(self):
        # private methods are 
        # class-accessible
        return self.__private_method()

example = ExampleClass(1)

# __private_method 
# shouldn't be accessible
# outside of the class
print( example._ExampleClass__private_method() )

