import java.util.Scanner;

interface VideoTape {
    void show(String title, String director, String available);
}

class Movie implements VideoTape {
    String title;


    String director;
    String available;
    
    public void show(String title, String director, String available) {
        
    }

    public void Store(String title, String director, String available) {
        this.title = title;
        this.director = director;
        this.available = available;
    }

    public void Display(String director2) {
        if (director2.equals(director)) {
            System.out.println("Title: " + title);
            System.out.println("Director: " + director);
            System.out.println("Length: 2hr 39min");
            System.out.println("Rating: ⭐️⭐️⭐️⭐️⭐️");
            System.out.println("Available: " + available);
        } else {
            System.out.println("Movie not available");
        }
    }
}

class MusicVideo implements VideoTape {
    String title;
    String artist;
    String available;
    
    public void show(String title, String director, String available) {
        
    }

    public void Store(String title, String artist, String available) {
        this.title = title;
        this.artist = artist;
        this.available = available;
    }

    public void Display(String artist2) {
        if (artist2.equals(artist)) {
            System.out.println("Title: " + title);
            System.out.println("Artist: " + artist);
            System.out.println("Available: " + available);
        } else {
            System.out.println("Music Video not available");
        }
    }
}

class VideoStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String director2;
        String artist2;
        
        System.out.println("1. Movie");
        System.out.println("2. Music Video");
        System.out.print("Enter your choice: ");
        
        switch (sc.nextInt()) {
            case 1:
                sc.nextLine(); 
                System.out.println("Enter the director name:");
                director2 = sc.nextLine();
                System.out.println("\n");
                Movie m = new Movie();
                m.Store("Baahubali", director2, "Yes");
                m.Display(director2);
                break;
            case 2:
                sc.nextLine(); 
                System.out.println("Enter the artist name:");
                artist2 = sc.nextLine();
                System.out.println("\n");
                MusicVideo mv = new MusicVideo();
                mv.Store("Tum Hi Ho", artist2, "Yes");
                mv.Display(artist2);
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
        
    }
}