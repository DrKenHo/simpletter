# Simpletter

https://github.com/javajok/simpletter-api と通信することでTwitter風味な挙動をするwebアプリケーションです。

## Eclipse への取り込み

以下のコマンドを実行してください。

```
./gradlew eclipse
```

Eclipseの設定ファイルが作成され、プロジェクトのインポートができるようになります。

## アプリケーションの設定

通信先のAPIサーバーと、サンプルで使用するアカウントの設定です。
`application.yml` に書いてるので、必要に応じて上書きしてね。

* `javajok.api.url`
  * APIサーバーのURLになります。
  * APIサーバーをローカルでポートを変えずに起動した場合は変更いらないです。
* `javajok.userId`
  * ツイートに使用されるユーザーIDです。
  * 設定した値はサーバーで登録してやってください。
  * 登録されていないユーザーIDで投稿しても、しれっと無視されます。

## 動かし方

```
./gradlew bootRun
```

Webブラウザで次のURLを開いてみてください。

Browse http://localhost:8080

ワークショップの段取りを書いた画面が表示されます。
動作確認も兼ねています。

## サンプルの動かし方

Browse http://localhost:8080/sample

サンプルタイムライン表示も投稿も全部この画面です。
投稿はユーザーID固定です。 `javajok.userId` のユーザーをサーバー側で登録してやってください。

### サンプルメモ

この子は `${javajok.api.url}/timeline` を表示するのが主な仕事です。
結果は以下の形で返ってくることを想定しています。

```
{"tweets":[{"id":"xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx","text":"ついーとだよー","timestamp":"2015-10-20T12:34:56.789","userId":"xxxxxxx"}, ...]}
```

レスポンスは `Timeline<Tweet>` にマッピングします。
コードを単純にするために、クラス名/フィールド名とjsonやhtmlを直接あてていますので、変更するときは一緒にしなきゃです。

## ライセンス

[Apache License Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.txt)

