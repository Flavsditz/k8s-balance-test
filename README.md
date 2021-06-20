# metric-test

Simple App for testing k8s load balancing

## running

    ./gradlew joobyRun

## building

    ./gradlew build

## docker

     docker build . -t metric-test
     docker run -p 3000:3000 -it metric-test
