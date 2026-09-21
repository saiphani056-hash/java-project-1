import java.util.Scanner;

class ParkingLotSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("============================================================");
        System.out.println("          WELCOME TO PARKING LOT               ");
        System.out.println("============================================================");

        System.out.println("Car Enters the parking lot");
        boolean carEntered = true;

        if (carEntered) {
            System.out.println("Car entered the parking lot");
            System.out.print("Enter the number plate:");
            String numberPlate = scanner.nextLine();

            if (numberPlate.matches("[A-Z]{2}[0-9]{2}[A-Z]{2}[0-9]{4}")) {
                System.out.println("Valid number plate");

                boolean carAlreadyParked = false;
                if (carAlreadyParked) {
                    System.out.println("Car is already parked");
                } else {
                    System.out.println("Car is not parked");
                }

                int totalSlotsInEachLevel = 5;
                int totalLevels = 5;
                int totalSlots = totalSlotsInEachLevel * totalLevels;
                int availableSlots = totalSlots;
                int occupiedSlots = totalSlots - availableSlots;
                int token = 1;
                int level = 1;
                int slot = 1;

                if (occupiedSlots < totalSlots) {
                    occupiedSlots++;
                    availableSlots--;
                    token = occupiedSlots;
                    level = (occupiedSlots - 1) / totalSlotsInEachLevel + 1;
                    slot = (occupiedSlots - 1) % totalSlotsInEachLevel + 1;

                    System.out.println("Parking lot is available");
                    System.out.println("Total slots available: " + availableSlots);
                    System.out.println("Parking token: " + token);                    
                    System.out.println("Car has parked successfully");
                    System.out.println("Car is parked at level " + level + " and slot " + slot);
                    
                } else {
                    System.out.println("Parking lot is full");
                    level = (occupiedSlots / totalSlotsInEachLevel) + 1;
                    slot = (occupiedSlots % totalSlotsInEachLevel) + 1;

                }
            } else {
                System.out.println("Invalid number plate");
            }
        }

        scanner.close();
    }
}