package com.dgkkatas.planets

import com.dgkkatas.planets.domain.Planet
import com.dgkkatas.planets.utils.Direccion
import com.dgkkatas.planets.utils.PlanetsTestBuilders
import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by davidgk on 22/06/16.
 */
class PlanetPositionTest extends Specification{

    public static String VULCANO = "Vulcano";
    public static String FERENGIS = "Ferengis";
    public static String BETASOIDES = "Betasoide";

    @Unroll("test if planet #planet moves after #day Days check its position")
    void "test if planet moves after x Days check its position in several Days"(){

    given:
        Planet planeta = createTestPlanet(planet)

    when:
        planeta.calculatePosition( day);

    then:
        assert planeta.currentPosition.currentPosition == avanceCurrent

    where:
          planet      |day              | avanceCurrent
          VULCANO     | 0               | 0.017
          VULCANO     | 1               | 0.034
          FERENGIS    | 0               | 6.196
          FERENGIS    | 1               | 6.109
          BETASOIDES  | 0               | 0.052
          BETASOIDES  | 1               | 0.104
          VULCANO     | 100             | 1.717

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
