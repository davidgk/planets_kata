package com.dgkkatas.planets.utils

import com.dgkkatas.planets.domain.AbstractPlanet
import com.dgkkatas.planets.domain.Vulcano


/**
 * Created by davidgk on 22/06/16.
 */
class PlanetsTestBuilders {
    static AbstractPlanet buildVulcano() {
        return new Vulcano(1,500, Direccion.RIGHT);
    }
}
