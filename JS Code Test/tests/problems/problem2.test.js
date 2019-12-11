import { placeholder } from "./../../problems/problem2";
import { capitalize } from "./../../problems/problem2";

describe("Test", () => {
  it("should not fail", () => {
    expect(true).toBe(true);
  });

  it("should function be exported properly", () => {
    expect(placeholder).toBeTruthy();
  });

  it("should function be exported properly", () => {
    expect(capitalize).toBeTruthy();
  });

  test("test to capitalize each word of a sentence", () => {
    expect(capitalize("a sentence to be capitalized")).toBe(
      "A Sentence To Be Capitalized"
    );
  });
});
