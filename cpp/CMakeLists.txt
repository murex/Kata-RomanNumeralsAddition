cmake_minimum_required(VERSION 3.19.3)

project(Kata-RomanNumeralsAddition CXX)

set(CMAKE_CXX_STANDARD 14)
enable_testing()

set_property(GLOBAL PROPERTY USE_FOLDERS ON)

set(CMAKE_ARCHIVE_OUTPUT_DIRECTORY ${CMAKE_BINARY_DIR}/lib CACHE PATH "Where to place compiled static libraries.")
set(CMAKE_LIBRARY_OUTPUT_DIRECTORY ${CMAKE_BINARY_DIR}/lib CACHE PATH "Where to place compiled shared libraries.")
set(CMAKE_RUNTIME_OUTPUT_DIRECTORY ${CMAKE_BINARY_DIR}/bin CACHE PATH "Where to place compiled executables.")

# We use CPM for 3rd-party dependencies management
include(cmake/CPM.cmake)
include(cmake/FindGoogleTest.cmake)

add_library(Kata-RomanNumeralsAddition-shared SHARED)

target_compile_definitions(Kata-RomanNumeralsAddition-shared PRIVATE ROMAN_NUMERALS_EXPORTS)

target_sources(Kata-RomanNumeralsAddition-shared
    PRIVATE
        ${CMAKE_CURRENT_SOURCE_DIR}/src/kata/roman_numerals/RomanNumerals.cpp
    PUBLIC
        ${CMAKE_CURRENT_SOURCE_DIR}/include/kata/roman_numerals/RomanNumerals.hpp
        ${CMAKE_CURRENT_SOURCE_DIR}/include/kata/roman_numerals/config.hpp
)

target_include_directories(Kata-RomanNumeralsAddition-shared
    PRIVATE
        ${CMAKE_CURRENT_SOURCE_DIR}/src
    PUBLIC
        ${CMAKE_CURRENT_SOURCE_DIR}/include
)

add_executable(Kata-RomanNumeralsAddition-test)

target_sources(Kata-RomanNumeralsAddition-test
    PRIVATE
        ${CMAKE_CURRENT_SOURCE_DIR}/test/RomanNumeralsTest.cpp
)

target_link_libraries(Kata-RomanNumeralsAddition-test
    PRIVATE
        Kata-RomanNumeralsAddition-shared
        gtest_main)

add_test(NAME ctest-Kata-RomanNumeralsAddition COMMAND Kata-RomanNumeralsAddition-test)

add_custom_target(Docs
    SOURCES
        ../README.md
        ../QuickRetrospective.md)

set_property(DIRECTORY ${CMAKE_CURRENT_SOURCE_DIR} PROPERTY VS_STARTUP_PROJECT Kata-RomanNumeralsAddition-test)
set_property(DIRECTORY ${CMAKE_CURRENT_SOURCE_DIR} PROPERTY XCODE_STARTUP_PROJECT Kata-RomanNumeralsAddition-test)

set_property(TARGET Kata-RomanNumeralsAddition-shared PROPERTY FOLDER "Kata")
set_property(TARGET Kata-RomanNumeralsAddition-test PROPERTY FOLDER "Kata")
set_property(TARGET Docs PROPERTY FOLDER "Kata")

set_property(TARGET gtest gtest_main PROPERTY FOLDER "Third-Party/GoogleTest")

set_property(GLOBAL PROPERTY PREDEFINED_TARGETS_FOLDER "CMake Generated")
