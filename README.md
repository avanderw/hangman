# net.avdw.hangman
![top-language](https://img.shields.io/github/languages/top/avanderw/hangman)
![license](https://img.shields.io/github/license/avanderw/hangman)

_Simple ASCII hangman to be used from command line or discord._

## Showcase

## Getting started

```shell script
$ git clone https://github.com/avanderw/hangman.git
$ cd hangman/
$ mvn verify
$ java -jar ./target/hangman-jar-with-dependencies.jar --help
Usage: hangman [-hV] [COMMAND]
Simple ASCII hangman to be used from command line or discord.
  -h, --help      Show this help message and exit.
  -V, --version   Print version information and exit.
Commands:
```

## Usage

## Configuration

### Logging
_./tinylog.properties_
```properties
writer        = file
writer.file   = hangman.log
writer.level  = info
writer.format = [{level}] at .({class-name}.java:{line}) {message}
```
Further documentation can be found at [tinylog.org](https://tinylog.org/v2/configuration/)

## Support

### Installing supporting software
> It is recommended to make use of a package manager to simplify the setup of your environment

- Java 11
- Maven 3.3.9

#### Chocolatey (https://chocolatey.org/install)
```cmd
$ choco install ojdkbuild
$ choco install maven 
```

## Changelog
![last-commit](https://img.shields.io/github/last-commit/avanderw/hangman)
 
All notable changes to this project will be documented in [CHANGELOG](CHANGELOG.md). 
The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/) 
and adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## Roadmap
Refer to the file [.todo/todo.txt](.todo/todo.txt) for a list of potential future work.
Here is a [complete primer](https://github.com/todotxt/todo.txt) on the whys and hows of todo.txt.

## Contributing
![commit-activity](https://img.shields.io/github/commit-activity/y/avanderw/hangman)
 
We love contributions! Please read [CONTRIBUTING](CONTRIBUTING.md) for details on how to contribute.

## License 
This project is licensed under the GNU General Public License v3.0 - see the [LICENSE](LICENSE) file for details
