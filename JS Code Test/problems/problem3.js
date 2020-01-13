/*
Problem 3
Export a function that will take a string and will determine if it is a palindrome.
*/

export const placeholder = () => {
  console.log("problem 3 solution");
};

export function palindrome(phrase) {
  var phraseNoSpaces = new Array(phrase.length); //String array created to accomodate phrase with no spaces
  //spaces will break the logic as a sentence can be a palindrome with uneven spacing.
  var spaceCount = 0; //to count the number of spaces
  var check; //bool to return status of palindrome.
  var phraseNoSpacesLength = phraseNoSpaces.length - spaceCount; //length of the nospaces array. logic explanation
  // will follow, but this is the calculation

  for (var i = 0; i < phrase.length; i++) {
    //traverse initial phrase
    if (phrase[i].match(/\s/)) {
      //determine where spaces are
      spaceCount++; //count the number of spaces
      phraseNoSpaces[phraseNoSpaces.length - 1 - i] = ""; //places all spaces at end of new array
      continue; //continue
    } else {
      //if no space, then place letter in new array
      phraseNoSpaces[i - spaceCount] = phrase[i]; //space count required so the letters after a space will shift up into its place
    }
  }

  //phraseNoSpacesLength is used over phraseNoSpaces.length because the spaces at the end are not to be included in
  //determining whether or not the sentence is a palindrome. They are ignored in the for loop that follows because it never
  //reaches them.

  for (var j = 0; j < phraseNoSpacesLength / 2; j++) {
    //traverse array with no spaces
    if (phraseNoSpaces[j] === phraseNoSpaces[phraseNoSpacesLength - j - 1]) {
      //determine if letters at opposite sides of array are the same
      check = true; //bool if previous line evals to true
    } else {
      check = false; //bool if condition evals to false. If it ever does, sentence is not a palindrome and fails test
    }
  }
  return check; //return status of palindrome after checking.
}
