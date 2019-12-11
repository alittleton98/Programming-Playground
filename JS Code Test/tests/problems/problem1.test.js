import { placeholder } from "./../../problems/problem1";
import { wordCounter } from "./../../problems/problem1";

describe("Test", () => {
  it("should not fail", () => {
    expect(true).toBe(true);
  });

  it("should function be exported properly", () => {
    expect(placeholder).toBeTruthy();
  });

  it("should function be exported properly", () => {
    expect(wordCounter).toBeTruthy();
  });

  test("tests a phrase to produce word count", () => {
    expect(wordCounter("this is a sentence")).toBe(4);
  });
});
