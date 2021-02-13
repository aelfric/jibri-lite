package org.jitsi.jibri.service.impl;

import org.jitsi.jibri.CallUrlInfo;
import org.jitsi.jibri.config.XmppCredentials;
import org.jitsi.jibri.selenium.CallParams;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;
class StreamingJibriServiceTest {

  @Test
  void doSomething() {
    final StreamingParams streamingParams = new StreamingParams(
        new CallParams(
            new CallUrlInfo(
                "https://meet.jit.si/",
                "InternalExplanationsSpeculateRuthlessly",
                Collections.emptyList()
            )
        ),
        "",
        new XmppCredentials(),
        "bw3f-tjgg-pxhr-m0bq-d354",
        ""
    );

    final StreamingJibriService streamingJibriService = new StreamingJibriService(
        streamingParams
    );

    streamingJibriService.start();
  }
}