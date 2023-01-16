class ExampleClass:
    def __init__(self, x, y, z):
        self.x = x
        self.y = y
        self.z = z
    
    def method_example(self):
        print(self.x, self.y, self.z, sep=", ")
    
example_object = ExampleClass(1, 2, 3)
example_object.method_example()
# 1, 2, 3


