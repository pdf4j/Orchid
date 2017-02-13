package com.eden.orchid.bsdoc;

import com.eden.orchid.Theme;
import com.eden.orchid.api.compilers.OrchidCompiler;
import com.eden.orchid.api.compilers.OrchidPreCompiler;
import com.eden.orchid.api.resources.OrchidResources;

import javax.inject.Inject;
import java.util.Set;

public class BSDocTheme extends Theme {

    @Inject
    public BSDocTheme(OrchidResources resources, Set<OrchidCompiler> compilers, Set<OrchidPreCompiler> preCompilers) {
        super(resources, compilers, preCompilers);
    }
}
