class DataSet:

    def __init__(self, sequence_of_numbers):
        self._data = tuple(sequence_of_numbers)

    @@property
    @@cached
    def variance(self):
        return statistics.variance(self._data)

