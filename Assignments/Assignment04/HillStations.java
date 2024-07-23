package Assigment04;

public class HillStations {
        String location() {
            return "Generic hill station location";
        }

        String famousFor() {
            return "Generic hill station activities";
        }
    }
    class Manali extends HillStations {
        @Override
        String location() {
            return "Manali is located in Himachal Pradesh, India";
        }

        @Override
        String famousFor() {
            return "Manali is famous for its scenic beauty and adventure sports";
        }
    }
    class Mussoorie extends HillStations {
        @Override
        String location() {
            return "Mussoorie is located in Uttarakhand, India";
        }

        @Override
        String famousFor() {
            return "Mussoorie is famous for its picturesque landscapes and pleasant climate";
        }
    }
    class Gulmarg extends HillStations {
        @Override
        String location() {
            return "Gulmarg is located in Jammu and Kashmir, India";
        }

        @Override
        String famousFor() {
            return "Gulmarg is famous for its skiing and snowboarding opportunities";
        }
    }
     class Main {
        public static void main(String[] args) {
            Manali manali = new Manali();
            Mussoorie mussoorie = new Mussoorie();
            Gulmarg gulmarg = new Gulmarg();

            System.out.println("Calling methods using the superclass:");
            HillStations generic = new HillStations();
            System.out.println("Location: " + generic.location());
            System.out.println("Famous for: " + generic.famousFor());
            System.out.println();

            System.out.println("Calling methods using each subclass:");
            System.out.println("Location (Manali): " + manali.location());
            System.out.println("Famous for (Manali): " + manali.famousFor());
            System.out.println("Location (Mussoorie): " + mussoorie.location());
            System.out.println("Famous for (Mussoorie): " + mussoorie.famousFor());
            System.out.println("Location (Gulmarg): " + gulmarg.location());
            System.out.println("Famous for (Gulmarg): " + gulmarg.famousFor());
        }
    }
