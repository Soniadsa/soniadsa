class Solution {
    public double[] convertTemperature(double celsius) {
     double kelvin = 0;
     double farenheit = 0;
            kelvin = celsius + 273.15;
            farenheit = celsius * 1.80 + 32.00;
        return new double[]{kelvin,farenheit};
    }
}