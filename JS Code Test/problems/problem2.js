/*
Problem 2
Export a function that will take a string and will capitalize the first letter of each word.
*/

export const placeholder = () => {
  console.log("problem 2 solution");
};

export function capitalize(phrase) {
  var capitalizedPhrase = new Array(phrase.length); //Array for the phrase with capital letters.
  var finalSentence; //var to join the capitalizedPhrase array
  var letterToReplace; //var for letter in phrase
  var letterToReplaceCapitalized; //var for capitalized letter from phrase

  for (var i = 0; i < phrase.length; i++) {
    //traverse phrase
    letterToReplace = phrase[0]; //beginning of sentence capital letter (a space doesn't precede it to indicate its a new word)
    letterToReplaceCapitalized = letterToReplace.toUpperCase(); //capitalize letter
    capitalizedPhrase[0] = letterToReplaceCapitalized; //beginning of sentence for new phrase array

    if (i !== 0) {
      //assures above statement isn't overwritten
      if (phrase[i].match(/\s/g)) {
        //checks for spaces to indicate new words
        letterToReplace = phrase[i + 1]; //uses letter after the space as beginning of word.
        letterToReplaceCapitalized = letterToReplace.toUpperCase(); //capitalizes letter
        capitalizedPhrase[i + 1] = letterToReplaceCapitalized; //places capital letter in new array
        capitalizedPhrase[i] = phrase[i]; //places preceding space in new array
        i++; //moves loop position beyond capitalized letter to prevent overwriting
      } else {
        capitalizedPhrase[i] = phrase[i]; //places all other lowercase letters in proper place.
      }
    }
  }
  finalSentence = capitalizedPhrase.join(""); //joins string array to one string
  return finalSentence; //return correct string with first letter of each word capitalized
}
