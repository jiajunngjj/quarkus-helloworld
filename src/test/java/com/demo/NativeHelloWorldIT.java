package com.demo;

import io.quarkus.test.junit.SubstrateTest;

@SubstrateTest
public class NativeHelloWorldIT extends HelloWorldTest {

    // Execute the same tests but in native mode.
}