# ライフゲーム

## 使用した技術要素
- Java 11.0.2
- Apache Maven 3.6.2
- JUnit 3.8.1

## 作成動機・・・・・。
- [Global Day of Coderetreat 2019 in #tddyyχ](https://tddyyx.connpass.com/event/148920/)と言う、ペアプロ + TDD + 様々な言語で45分以内にライフゲームを作るイベントで、作り切る事ができず心残りなので、2日くらい掛けてライフゲームを完成させたいと思ったのが動機です。

## 開発環境のセットアップ手順
* HomeBrewインストール
```
$ /usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
$ brew update && brew cleanup
$ brew tap caskroom/cask
$ brew tap caskroom/versions
```

* Java11インストール
```
$ brew cask install java11
$ export JAVA_HOME=`/usr/libexec/java_home -v 11`
```

* sbtインストール
```
$ brew install maven
```
