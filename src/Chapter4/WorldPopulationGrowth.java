package Chapter4;

public class WorldPopulationGrowth {
    public static void main(String[] args) {


                double population = 8.19e9;
                double growthRate = 0.0085;
                double targetPopulation = population * 2;
                int year = 1;

                System.out.println("Year\tPopulation (in billions)\tIncrease (in millions)");

                while (year <= 75) {
                    double increase = population * growthRate;
                    population = population + increase;
                    System.out.printf("%d\t%.3f\t\t\t\t%.2f\n", year, population / 1e9, increase / 1e6);

                    if (population >= targetPopulation) {
                        System.out.println("\n🌍 Population will double in year: " + year);
                        break;
                    }

                    year++;
                }

                if (year > 75 && population < targetPopulation) {
                    System.out.println("\n🌍 Population did not double in 75 years.");
                }
            }
        }