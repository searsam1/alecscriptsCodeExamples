function getVowels(str) {
  const matches = str.match(/[aeiou]/gi);
  if (matches === null) {
    return 0;
  }
  return matches.length;
}

console.log(getVowels('dry'));
// expected output: 0

