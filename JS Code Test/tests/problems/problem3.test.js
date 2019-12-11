import { placeholder } from "./../../problems/problem3";
import { palindrome } from "./../../problems/problem3";

describe("Test", () => {
  it("should not fail", () => {
    expect(true).toBe(true);
  });

  it("should function be exported properly", () => {
    expect(placeholder).toBeTruthy();
  });

  it("should function be exported properly", () => {
    expect(palindrome).toBeTruthy();
  });

  test("tests a phrase to determine if it is a palindrome", () => {
    expect(palindrome("anna")).toBe(true);
  });
});
