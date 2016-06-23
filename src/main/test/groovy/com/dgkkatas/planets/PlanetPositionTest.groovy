package com.dgkkatas.planets

import com.dgkkatas.planets.domain.Planet
import com.dgkkatas.planets.utils.Direccion
import com.dgkkatas.planets.utils.PlanetsTestBuilders
import spock.lang.Specification

/**
 * Created by davidgk on 22/06/16.
 */
class PlanetPositionTest extends Specification{

    public static String VULCANO = "Vulcano";
    public static String FERENGIS = "Ferengis";
    public static String BETASOIDES = "Betasoide";

    void "test if planet moves after x Days check its position in several Days"(){

    given:
        Planet planeta = createTestPlanet(planet)

    when:
        planeta.calculatePosition( day);

    then:
        assert planeta.currentPosition.initDay == initDayCurrent
        assert planeta.currentPosition.avancePerday == avanceCurrent
        assert planeta.lastPosition.initDay == initDayLast
        assert planeta.lastPosition.avancePerday == avanceDayLast

    where:
          planet      |day             | initDayCurrent | avanceCurrent  | initDayLast | avanceDayLast
          VULCANO     | 0              | 0              | 0.017          | null        | null
          FERENGIS    | 0              | 0              | -0.087         | null        | null
          BETASOIDES  | 0              | 0              | 0.052          | null        | null

    }

    public Planet createTestPlanet(planet){
        switch (planet){
            case VULCANO:
              return  PlanetsTestBuilders.buildPlanet(1,500,Direccion.RIGHT,VULCANO)
            break;
            case FERENGIS:
              return  PlanetsTestBuilders.buildPlanet(5,1000,Direccion.LEFT,FERENGIS);
            break
            case BETASOIDES:
              return  PlanetsTestBuilders.buildPlanet(3,2000,Direccion.RIGHT,BETASOIDES);
            break;
        }
    }
}
