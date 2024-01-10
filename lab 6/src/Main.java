import java.util.*;
import java.util.Set;
import java.util.List;
import java.util.Map;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import java.util.stream.Collectors;



// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       InMemoryWorldDao c1 = InMemoryWorldDao.getInstance();

       //q1
        Map<String, City> highestPopulatedCityByCountry = c1.getCountries().values().stream()
                .collect(Collectors.toMap(
                        Country::getCode,
                        country -> country.getCities().stream()
                                .max(Comparator.comparingInt(City::getPopulation))
                                .orElse(new City())
                ));


        highestPopulatedCityByCountry.forEach((countryCode, city) -> {
            System.out.println("Highest populated city in " + countryCode + ": " +
                    (city != null ? city.getName() : "No cities in this country"));
        });


        //q2
        List<Country> countries = c1.getCountries().values().stream()
                .collect(Collectors.toList());
        List<City> mostPopulatedCityForEachContinent = countries.stream().collect(Collectors.groupingBy(Country::getContinent,
                        Collectors.flatMapping(country -> country.getCities().stream(),
                                Collectors.maxBy(Comparator.comparingInt(City::getPopulation)))))
                .values()
                .stream()
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());

        System.out.println(mostPopulatedCityForEachContinent);


        //q3
        List<City> highestPopulatedCapital = countries.stream()
                .filter(country -> country.getCapital() != 0)
                .map(country -> country.getCities().stream()
                        .filter(city -> city.getId() == country.getCapital())
                        .max(Comparator.comparingInt(City::getPopulation)))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .max(Comparator.comparingInt(City::getPopulation))
                .stream().collect(Collectors.toList());

        System.out.println(highestPopulatedCapital);






    }
}