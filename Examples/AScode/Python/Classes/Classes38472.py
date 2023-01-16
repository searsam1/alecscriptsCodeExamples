class ExampleClass:
    
    class_attrib = 5
    
    def __init__(self, x, y, z):
        self.x = x
        self.y = y
        self.z = z

obj = ExampleClass(1,2,3)
print(ExampleClass.class_attrib)
# 5
print(ExampleClass.z)
# AttributeError: type object 'ExampleClass' has no attribute 'z'

