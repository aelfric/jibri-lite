package org.jitsi.jibri

import org.jitsi.jibri.config.XmppCredentials
import org.jitsi.jibri.selenium.CallParams
import org.jitsi.jibri.service.impl.StreamingJibriService
import org.jitsi.jibri.service.impl.StreamingParams
import java.util.*


fun main(args: Array<String>) {
    val streamingParams = StreamingParams(
            CallParams(
                    CallUrlInfo(
                            "https://meet.jit.si/",
                            "InternalExplanationsSpeculateRuthlessly",
                            Collections.singletonList("config.prejoinPageEnabled=false"))
            ),
            "jsmith",
            XmppCredentials(),
            "rtmp://a.rtmp.youtube.com/live2/bw3f-tjgg-pxhr-m0bq-d354",
            ""
    )

    val streamingJibriService = StreamingJibriService(
            streamingParams
    )

    streamingJibriService.start()
}
