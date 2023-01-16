class ExampleClass:
    def __private_method(self):
        return 0
    def pubic_method(self):
        # private methods are 
        # class-accessible
        return self.__private_method()

example = ExampleClass()
print( example.pubic_method() )
# 0

print( example.__private_method() )
# AttributeError: 'ExampleClass' object 
# has no attribute '__private_method'

