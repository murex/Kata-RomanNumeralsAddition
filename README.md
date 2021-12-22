[![Gradle](https://github.com/murex/Kata-RomanNumeralsAddition/actions/workflows/gradle.yml/badge.svg)](https://github.com/murex/Kata-RomanNumeralsAddition/actions/workflows/gradle.yml)
[![Maven](https://github.com/murex/Kata-RomanNumeralsAddition/actions/workflows/maven.yml/badge.svg)](https://github.com/murex/Kata-RomanNumeralsAddition/actions/workflows/maven.yml)
[![CMake](https://github.com/murex/Kata-RomanNumeralsAddition/actions/workflows/cmake.yml/badge.svg)](https://github.com/murex/Kata-RomanNumeralsAddition/actions/workflows/cmake.yml)
[![Check Markdown links](https://github.com/murex/Kata-RomanNumeralsAddition/actions/workflows/markdown-link-check.yml/badge.svg)](https://github.com/murex/Kata-RomanNumeralsAddition/actions/workflows/markdown-link-check.yml)
[![Add contributors](https://github.com/murex/Kata-RomanNumeralsAddition/actions/workflows/contributors.yml/badge.svg)](https://github.com/murex/Kata-RomanNumeralsAddition/actions/workflows/contributors.yml)

# Roman Numerals Addition

![Kata Image](./images/Abacus.jpg) <br>
"[Abacus](https://unsplash.com/photos/gdL-UZfnD3I)" by [Crissy Jarvis](https://unsplash.com/@crissyjarvis) is licenced under [Unsplash License](https://unsplash.com/license)

## Description

The main intent of this kata is to practice Mob Programming and agree on a preferred mobbing style for the team.

For this we will run a variant of the Roman Numerals Converter kata, where 
we intend this time to calculate the sum of 2 roman numbers.

To add a bit of fun, we will do it without any use of integers._

### A Few Examples

| Num 1 | + | Num 2 | = | Sum |
| --- | --- | --- | --- | --- |
| I | + | I | = | II |
| IV | + | X | = | XIV |
| XCIX | + | I | = | C |
| CXXIV | + | MDCCCXCV | = | MMXIX |

### Kata Organisation & Rules

| Step | Description |
| --- | --- |
| 1    | Start with a short briefing about mob programming theory<ul><li>What are the driver and navigator role</li><li>What is strong-style pairing</li><li>The driver as a smart input device</li><li>Why the driver remains silent</li></ul>Rule for today: never comment, delete, or ignore a passing test. |
| 2    | Start by practicing round robin (without any coding yet).<ul><li>The navigator is standing</li><li>The bell rings</li><li>Everybody raise their hands</li><li>Everyone moves one place to their left</li><li>Repeat for a full round</li></ul>For the rest of the session, we will use 4 minutes rounds (even for C++, 4 minutes are ok for this kata).<br>![Organisation](./images/MobOrganisation.png) |
| 3    | [Mini Retro](./MiniRetro.md) |
| 4    | Start work on the kata with silent observers and driver |
| 5    | [Mini Retro](./MiniRetro.md) |
| 6    | Continue coding. The observers are now allowed to speak, one at a time, only after they raise their hand |
| 7    | [Mini Retro](./MiniRetro.md) |
| 8    | Continue. This time, all observers are upgraded to navigators, but they should self-discipline to only speak one at a time |
| 9    | [Mini Retro](./MiniRetro.md) |
| 10   | Final retrospective: Agree on the team's preferred mobbing style |

## Getting Started

- [Java](java/GETTING_STARTED.md)
- [C++](cpp/GETTING_STARTED.md)

## Session Quick Retrospective

You can fill it from [here](QuickRetrospective.md)

## Useful Links

### For this Kata

- [Mob Programming Basics](https://mobprogramming.org/mob-programming-basics/)
- [Strong-Style Pairing](http://llewellynfalco.blogspot.com/2014/06/llewellyns-strong-style-pairing.html)
- [A video introducing Mob Programming](https://www.agilealliance.org/resources/sessions/mob-programming-aatc2017/) by Woody Zuill
- Some useful tips for [Remote Mob Programming](https://www.remotemobprogramming.org/)
- [Online roman decimal converter](https://www.calculateme.com/roman-numerals/to-roman)
- [Another one](https://www.calculator.org/calculate-online/mathematics/roman-numerals.html)
- [One more](https://goodcalculators.com/roman-numeral-converter/)

### General

- [TCR (Test && Commit || Revert) wrapper](tcr/TCR.md) utility
- Handy for any type of turn-based session: [Online Timer](https://agility.jahed.dev/)

## Session Information

### Style & Duration

- 2-hour [Mob Kata](doc/MobProgramming.md)

### Topic

- Mob Programming kata

### Focus Points

- Mob refactoring
- Teamwork
- Strong Style pairing
- Collective design

### Source Files

- [Java](java)
- [C++](cpp)

## License

`Kata-RomanNumeralsAddition` and the accompanying materials are made available
under the terms of the [MIT License](LICENSE.md) which accompanies this
distribution, and is available at the [Open Source site](https://opensource.org/licenses/MIT)

## Acknowledgements

See [ACKNOWLEDGEMENTS.md](ACKNOWLEDGEMENTS.md) for more information.

## Contributors

<table>
<tr>
    <td align="center" style="word-wrap: break-word; width: 150.0; height: 150.0">
        <a href=https://github.com/mengdaming>
            <img src=https://avatars.githubusercontent.com/u/1313765?v=4 width="100;"  style="border-radius:50%;align-items:center;justify-content:center;overflow:hidden;padding-top:10px" alt=Damien Menanteau/>
            <br />
            <sub style="font-size:14px"><b>Damien Menanteau</b></sub>
        </a>
    </td>
    <td align="center" style="word-wrap: break-word; width: 150.0; height: 150.0">
        <a href=https://github.com/aatwi>
            <img src=https://avatars.githubusercontent.com/u/11088496?v=4 width="100;"  style="border-radius:50%;align-items:center;justify-content:center;overflow:hidden;padding-top:10px" alt=Ahmad Atwi/>
            <br />
            <sub style="font-size:14px"><b>Ahmad Atwi</b></sub>
        </a>
    </td>
    <td align="center" style="word-wrap: break-word; width: 150.0; height: 150.0">
        <a href=https://github.com/philou>
            <img src=https://avatars.githubusercontent.com/u/23983?v=4 width="100;"  style="border-radius:50%;align-items:center;justify-content:center;overflow:hidden;padding-top:10px" alt=Philippe Bourgau/>
            <br />
            <sub style="font-size:14px"><b>Philippe Bourgau</b></sub>
        </a>
    </td>
    <td align="center" style="word-wrap: break-word; width: 150.0; height: 150.0">
        <a href=https://github.com/AntoineMx>
            <img src=https://avatars.githubusercontent.com/u/77109701?v=4 width="100;"  style="border-radius:50%;align-items:center;justify-content:center;overflow:hidden;padding-top:10px" alt=AntoineMx/>
            <br />
            <sub style="font-size:14px"><b>AntoineMx</b></sub>
        </a>
    </td>
</tr>
</table>
