# quarkus-helloworld
This project demonstrates a simple JAX-RS REST API application that is written in Java and uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```
./mvnw quarkus:dev
```

### Live coding
After running Quarkus in dev mode, you will see:
```
2020-05-06 09:50:44,575 INFO  [io.qua.dep.QuarkusAugmentor] (XNIO-1 task-1) Beginning quarkus augmentation
2020-05-06 09:50:44,655 INFO  [io.qua.dep.QuarkusAugmentor] (XNIO-1 task-1) Quarkus augmentation completed in 80ms
2020-05-06 09:50:44,667 INFO  [io.quarkus] (XNIO-1 task-1) Quarkus 0.13.3 started in 0.092s. Listening on: http://[::]:8080
2020-05-06 09:50:44,667 INFO  [io.quarkus] (XNIO-1 task-1) Installed features: [cdi, resteasy]
2020-05-06 09:50:44,667 INFO  [io.qua.dev] (XNIO-1 task-1) Hot replace total time: 0.141s 
```

Access the endpoint via web browser or command line:
```
curl http://localhost:8080/
```

You will be able to see:
```
Hello World!
```

Don't stop the runtime and change the *return* code:
```
return "Live coding with Quarkus!"
```

Access the endpoint again:
```
curl http://localhost:8080/
```

You will see:
```
Live coding with Quarkus!
```

## Packaging and running the application

The application can be packaged using `./mvnw package`.
It produces the `code-with-quarkus-1.0.0-SNAPSHOT-runner.jar` file in the `/target` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/lib` directory.

The application is now runnable using `java -jar target/quarkus-helloworld-1.0.0-SNAPSHOT-runner.jar`.

## Creating a native executable

You can create a native executable using: `./mvnw package -Pnative`.

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: `./mvnw package -Pnative -Dquarkus.native.container-build=true`.

You can then execute your native executable with: `./target/quarkus-helloworld-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/building-native-image-guide.

## Deploy on OpenShift (s2i)

Create a new project on OpenShift:
```
oc new-project quarkus-helloworld
```

Create an Application Using a Remote Git Repository:
``
oc new-app registry.access.redhat.com/redhat-openjdk-18/openjdk18-openshift~https://github.com/jiajunngjj/quarkus-helloworld.git --name=quarkus-helloworld
```