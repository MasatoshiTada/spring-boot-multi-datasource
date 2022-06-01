Spring Bootで `DataSource` を2つ作るサンプル
=========================================

# 解説ブログ
[Spring BootでDataSourceのBeanを2つ作る]()

# 環境
- JDK 17
- Spring Boot 2.7.0
- PostgreSQL 14.3 (Docker Composeで2つ起動。後述)
- Docker Compose v2.5.1 

> 多少バージョンが違っていても同様に動くと思います。

# DB起動
```shell
docker compose -f docker-compose-postgres.yaml up -d --no-recreate
```

# DB停止
```shell
docker compose -f docker-compose-postgres.yaml stop
```

# 起動
`SpringBootMultiDatasourcesApplication` クラスから起動

または

`mvn spring-boot:run`

# curlでアクセス
```shell
curl -i http://localhost:8080/
```
