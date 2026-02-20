package UnitConversionTool;
interface UnitConverter {

    // Kilometers to Miles
    static double kmToMiles(double km) {
        return km * 0.621371;
    }

    // Kilograms to Pounds
    static double kgToPounds(double kg) {
        return kg * 2.20462;
    }
}
