package com.github.meklund;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeEchoResourceIT extends EchoResourceTest {

    // Execute the same tests but in native mode.
}