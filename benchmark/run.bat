
@ECHO OFF

REM go to the parent folder
CD .\..

REM compile the parent project
CALL mvn clean install -DskipTests

REM create a copy with the expected name
XCOPY /Y target\hypersistence-tsid-*-SNAPSHOT.jar target\hypersistence-tsid-0.0.1-BENCHMARK.jar*

REM go to the benchmark folder
CD benchmark

REM compile the benchmark project
CALL mvn validate
CALL mvn clean install

REM run the benchmark
CALL java -jar target/benchmarks.jar

@ECHO ON
