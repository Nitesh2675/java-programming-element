public class EarthVolumeCalculator {
    public static void main(String[] args) {
        double radiusKm = 6378;
        
        double kmToMilesFactor = 0.239913;
  
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles3 = volumeKm3 * kmToMilesFactor;
        
        System.out.println("The volume of Earth in cubic kilometers is %.2f and in cubic miles is %.2f" ,volumeKm3,volumeMiles3);
    }
}