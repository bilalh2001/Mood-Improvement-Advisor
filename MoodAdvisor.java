import java.util.Scanner;

public class MoodAdvisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Mood Improvement Advisor!");
        System.out.print("How are you feeling today? (happy, sad, anxious, tired, bored): ");
        String mood = scanner.nextLine().toLowerCase();

        if (mood.intern() == "happy") {
            System.out.println("That's awesome! Keep spreading positivity and maybe go for a nature walk to enhance your mood even more.");
            System.out.print("Would you like a fun activity suggestion? (yes/no): ");
            String response = scanner.nextLine().toLowerCase();
            if (response.intern() == "yes") {
                System.out.println("Try painting or dancing to your favorite music!");
            }
        } else if (mood.intern() == "sad") {
            System.out.println("I'm sorry to hear that. Consider talking to a friend or listening to uplifting music.");
            System.out.print("Would you like a motivational quote? (yes/no): ");
            String response = scanner.nextLine().toLowerCase();
            if (response.intern() == "yes") {
                System.out.println("'The only way to do great work is to love what you do.' - Steve Jobs");
                System.out.print("Would you like a self-care tip? (yes/no): ");
                String nextResponse = scanner.nextLine().toLowerCase();
                if (nextResponse.intern() == "yes") {
                    System.out.println("Try journaling or practicing mindfulness.");
                }
            }
        } else if (mood.intern() == "anxious") {
            System.out.println("Take a deep breath. Meditation or light exercise can help ease anxiety.");
            System.out.print("Would you like a breathing exercise suggestion? (yes/no): ");
            String response = scanner.nextLine().toLowerCase();
            if (response.intern() == "yes") {
                System.out.println("Try the 4-7-8 breathing technique: Inhale for 4 seconds, hold for 7, and exhale for 8.");
                System.out.print("Would you like a calming music suggestion? (yes/no): ");
                String nextResponse = scanner.nextLine().toLowerCase();
                if (nextResponse.intern() == "yes") {
                    System.out.println("Listen to ambient or nature sounds for relaxation.");
                }
            }
        } else if (mood.intern() == "tired") {
            System.out.println("Rest is important. Consider a short nap or a warm cup of tea.");
            System.out.print("Would you like a relaxing playlist suggestion? (yes/no): ");
            String response = scanner.nextLine().toLowerCase();
            if (response.intern() == "yes") {
                System.out.println("Try 'Chill Vibes' on Spotify or 'Lo-Fi Beats' on YouTube.");
            }
        } else if (mood.intern() == "bored") {
            System.out.println("Boredom can be a great opportunity to explore new hobbies!");
            System.out.print("Would you like a hobby suggestion? (yes/no): ");
            String response = scanner.nextLine().toLowerCase();
            if (response.intern() == "yes") {
                System.out.println("Try learning a new instrument or experimenting with coding projects.");
            }
        } else {
            System.out.println("I couldn't quite understand that mood. But remember, self-care is key!");
        }

        scanner.close();
    }
}
