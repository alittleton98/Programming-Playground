import { isModuleDeclaration } from "@babel/types";

/*
Problem 1
Export a function that will take a string and return will return the number of words
*/
export const placeholder = () => {
  console.log("problem 1 solution");
};

export function wordCounter(phrase) {
  //var wordCount = 1; //starts at one because a sentence must include at least one word
  var phraseArr = phrase.match(/\s/g); //global search of the phrase for spaces as spaces indicate a new word
  var wordCount = phraseArr.length; //wordCount = length of array returned by match() = number of spaces
  return wordCount + 1; //return number of spaces + 1 to account for inital word = total word count
}
