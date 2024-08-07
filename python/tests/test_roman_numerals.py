import pytest

from roman_numerals.roman_numerals import add


class TestRomanNumerals:

    @pytest.mark.skip(reason="test currently disabled") # Comment or remove this line to enable this test case
    def test_acceptance_test(self) -> None:
        assert("MMXIX" == add("CXXIV", "MDCCCXCV"))
