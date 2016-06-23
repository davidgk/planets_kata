package com.dgkkatas.planets.utils

import com.dgkkatas.planets.domain.Planet


/**
 * Created by davidgk on 22/06/16.
 */
class PlanetsTestBuilders {

    static Planet buildPlanet(velocity,distance, direccion, name) {
        return new Planet(velocity, distance,direccion,name);
    }


}
