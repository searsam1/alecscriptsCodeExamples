class DataSet:

    def __init__(self, sequence_of_numbers):
        self._data = tuple(sequence_of_numbers)

    @@cached_property
    def variance(self):
        return statistics.variance(self._data)

