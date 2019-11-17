# ライフゲーム

## 使用した技術要素
- Java 11.0.2
- Apache Maven 3.6.2
- JUnit 5.2.2

## 作成動機・・・・・。
- [Global Day of Coderetreat 2019 in #tddyyχ](https://tddyyx.connpass.com/event/148920/)と言う、ペアプロ + TDD + 様々な言語で45分以内にライフゲームを作るイベントで、作り切る事ができず心残りなので、2日くらい掛けてライフゲームを完成させたいと思ったのが動機です。

## ライフゲームの仕様
- ゲームのルールは[ライフゲームのWiki参照](https://ja.wikipedia.org/wiki/%E3%83%A9%E3%82%A4%E3%83%95%E3%82%B2%E3%83%BC%E3%83%A0)。
- 盤面の縦横の長さと初期のセルを実行前に自由に設定した上で、上記のルールを全てカバーすることを目標とする。

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

* mavenをインストール
```
$ brew install maven
```
* mavenでプロジェクトを作成
```
mvn archetype:generate \
  -DarchetypeArtifactId=maven-archetype-quickstart \
  -DinteractiveMode=false \
  -DgroupId=game-of-life \
  -DartifactId=game-of-life
```