import { add } from '../src/RomanNumerals';

describe('roman_numerals', () => {
  // Remove the ".skip" below to enable this test case
  test.skip('acceptance test', () => {
    expect(add('CXXIV', 'MDCCCXCV')).toEqual('MMXIX');
  });
});
