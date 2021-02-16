
#include <kata/roman_numerals/RomanNumerals.hpp>

#include <string>
#include <gtest/gtest.h>

TEST(RomanNumerals, acceptance_test)
{
	EXPECT_EQ("MMXIX", kata::roman_numerals::add("CXXIV", "MDCCCXCV"));
}
