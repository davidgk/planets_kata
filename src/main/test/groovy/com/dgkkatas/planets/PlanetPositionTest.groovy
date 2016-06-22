package com.dgkkatas.planets

import com.dgkkatas.planets.domain.AbstractPlanet
import com.dgkkatas.planets.utils.PlanetsTestBuilders
import spock.lang.Specification

/**
 * Created by davidgk on 22/06/16.
 */
class PlanetPositionTest extends Specification{

    void "test if planet Vulcano moves check its position in several Days"(){

    given:
        AbstractPlanet vulcano = PlanetsTestBuilders.buildVulcano();

    when:
        vulcano.calculatePosition( day);

    then:
        assert vulcano.position.sinusInitDay == positionSinusInitDay
        assert vulcano.position.sinusEndDay == positionSinusEndDay
        assert vulcano.position.cosinusInitDay == postionCosinusInitDay
        assert vulcano.position.cosinusEndDay == postionCosinusEndDay

    where:
          day | positionSinusInitDay | positionSinusEndDay  | postionCosinusInitDay | postionCosinusEndDay
          0   | 1                    | 2                    | 0                     |2

    }
}
