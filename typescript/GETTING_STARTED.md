# Getting Started with Roman Numerals Addition kata in Typescript

## Prerequisites

- macOS, Linux or Windows
- [git](https://git-scm.com/) client
- [curl](https://curl.se/download.html) command line utility
- [node](https://nodejs.org/en/download)
- [yarn](https://classic.yarnpkg.com/lang/en/docs/install)
  <details><summary>Details</summary>

  You can install node directly or through nvm.

  </details>

## Getting ready

### 1 - Clone the kata repository

```shell
git clone https://github.com/murex/Kata-RomanNumeralsAddition.git
```

### 2 - Go to the kata's `typescript` directory

```shell
cd Kata-RomanNumeralsAddition/typescript
```

### 3 - Download dependencies

```shell
yarn install
```

## Running the kata

You can run the kata from the command line or from your IDE of choice.

You may also run it using [TCR](../tcr/TCR.md) if you want to add a bit of spice.

- [From a terminal with Yarn](#running-the-kata-from-a-terminal-with-yarn)
- [From a terminal with TCR](#running-the-kata-from-a-terminal-with-tcr)

<a name="running-the-kata-from-a-terminal-with-yarn"/></a>

### Running the kata from a terminal with Yarn

> ***Reminder***: the command below should be run from [Kata-RomanNumeralsAddition/typescript](.) directory

The kata comes with a Yarn test target pre-configured. Just type the following to run it.

```shell
yarn test
```

<a name="running-the-kata-from-a-terminal-with-tcr"/></a>

### Running the kata from a terminal with TCR

> ***Note to Windows users***
> 
> Use a **git bash** terminal for running the command below.
> _Windows CMD and PowerShell are not supported_

Type the following to start TCR:

```shell
./tcrw
```

Refer to [Using TCR](#using-tcr) section for additional details about TCR and available options.

<a name="using-tcr"/></a>

## Using TCR

### Cheat Sheet

Here are the main shortcuts available once TCR utility is running:

| Shortcut  | Description                                  |
|-----------|----------------------------------------------|
| `o` / `O` | Open in browser (with `web` subcommand only) |
| `d` / `D` | Enter driver role                            |
| `n` / `N` | Enter navigator role                         |
| `t` / `T` | Query timer status                           |
| `p` / `P` | Toggle on/off git auto-push                  |
| `l` / `L` | Pull from remote                             |
| `s` / `S` | Push to remote                               |
| `q` / `Q` | Quit current role / Quit TCR                 |
| `?`       | List available options                       |

### Additional Details

Refer to [TCR - Test && Commit || Revert](../tcr/TCR.md) page
for additional details and explanations about TCR utility.
