package com.codingnomads.ioc.lab.initial;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.text.MessageFormat;

@Component
@RequiredArgsConstructor
public class CodingNomad {

    private final JDK jdk;
    private final IDE ide;
    private final Framework framework;

    public String createAwesomeSoftware() {
        return MessageFormat.format(
                "This coding nomad is creating awesome software using, " +
                        "IDE: ({0}:{1}), JDK: ({2}:{3}), Framework: ({4}:{5})",
                ide.getName(),
                ide.getVersion(),
                jdk.getName(),
                jdk.getVersion(),
                framework.getName(),
                framework.getVersion()
        );
    }

}
