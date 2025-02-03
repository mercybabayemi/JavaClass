import diaryapp.Diaries;
import diaryapp.Diary;
import diaryapp.Entry;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    private Scanner input = new Scanner(System.in);
    private Diaries diaries;
    private Diary diary;

    public Main() {
        diaries = new Diaries();
    }

    public static void main(String[] args) {
       Main app = new Main();
       app.mainMenu();
    }

    public void mainMenu(){
        displayWelcome();
        usersChoice();
    }

    public void displayWelcome(){
        System.out.println("""
                Welcome to Diaries
                --- Main Menu ---
                1. Create a new diary
                2. Login to existing diary
                3. Show all diaries
                4. Delete diary from diaries
                5. Exit
                Enter your choice:
                """);
    }

    public void usersChoice(){
        int choice = validateIntInput(input);

        switch(choice) {
            case 1:
                createDiary();
                break;
            case 2:
                loginToExistingDiary();
                break;
            case 3:
                showAllDiaries();
                break;
            case 4:
                deleteDiaries();
            case 5:
                exit();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                mainMenu();
        }

    }

    private void deleteDiaries() {
        System.out.println("Enter username: ");
        String username = validateStringInput(input);

        System.out.println("Enter password: ");
        String password = validateStringInput(input);
        try {
            diaries.delete(username, password);
            System.out.println("Entry deleted.");
        }catch(NoSuchElementException e){
            System.out.println(e.getMessage());
        }
        mainMenu();
    }

    public void showAllDiaries() {
        if (diaries.getAllDiaries().isEmpty()) {
            System.out.println("No diaries available.");
        } else {
            for (Diary diary : diaries.getAllDiaries()) {
                System.out.println(diary);
            }
        }
        mainMenu();
    }

    public void createDiary(){
        System.out.println("Enter username: ");
        String username = validateStringInput(input);

        System.out.println("Enter password: ");
        String password = validateStringInput(input);

        diaries.add(username, password);
        System.out.println("Diary created successfully!");
        mainMenu();
    }

    public void loginToExistingDiary(){
        System.out.println("Enter username: ");
        String username = validateStringInput(input);
        System.out.println("Enter password: ");
        String password = validateStringInput(input);
        try{
            Diary existingDiary = diaries.findByUsername(username);
            existingDiary.unlockDiary(password);
            if(existingDiary.isLocked()){
                System.out.println("Incorrect password!");
            } else {
                System.out.println("Login successful!");
                diary = existingDiary;
                diaryEntryMenu(existingDiary);
            }

        }catch (NoSuchElementException e){
            System.out.println(e.getMessage());
        }
        mainMenu();
    }

    public void diaryEntryMenu(Diary existingDiary) {
        if (diary == null) {
            System.out.println("You need to log in first.");
            return;
        }
        displayDiaryWelcome();
        diaryChoice();
    }

    public void displayDiaryWelcome() {
        System.out.println("""
                ---- Diary Menu ----
                1. Create New Entry
                2. View Entry
                3. View Entries
                4. Update Entry
                5. Delete Entry
                6. Lock Diary
                7. Logout
                Enter your choice:
                """
        );
    }

    public void diaryChoice() {
        int choice = validateIntInput(input);
        switch(choice) {
            case 1:
                createEntry();
                break;
            case 2:
                viewEntry();
                break;
            case 3:
                viewEntries();
                break;
            case 4:
                updateEntries();
                break;
            case 5:
                deleteEntry();
                break;
            case 6:
                lockEntry();
                break;
            case 7:
                System.out.println("Logging out>>>>");
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
                diaryChoice();
        }
    }

    private void lockEntry() {
        try {
            diary.lockDiary();
            System.out.println("Diary is locked.");
        }catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Diary is empty.");
        }
        diaryEntryMenu(diary);
    }

    private void deleteEntry() {
        System.out.print("Enter entry ID to delete: ");
        int deleteId = validateIntInput(input);
        try {
            diary.deleteEntry(deleteId);
            System.out.println("Entry deleted.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid entry ID.");
        }catch(NoSuchElementException e){
            System.out.println(e.getMessage());
        }catch(NullPointerException e){
            System.out.println("Diary is empty");
        }
        diaryEntryMenu(diary);
    }

    private void updateEntries() {
        try {
            System.out.print("Enter entry ID to update: ");
            int updateId = validateIntInput(input);

            System.out.print("Enter new title: ");
            String newTitle = input.nextLine();

            System.out.print("Enter new body: ");
            String newBody = input.nextLine();
            diary.updateEntry(updateId, newTitle, newBody);

            System.out.println("Entry updated.");
        }catch (NullPointerException e){
            System.out.println("Diary is empty.");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Invalid entry ID.");
        }
        diaryEntryMenu(diary);
    }

    private void viewEntry() {
        System.out.print("Enter entry ID to view: ");
        int entryIdToFind = validateIntInput(input);

        System.out.println("-----Entry-----");
        try {
            diary.viewEntry(entryIdToFind);
        }catch (NoSuchElementException e){
            System.out.println(e.getMessage());
        }catch (NullPointerException e){
            System.out.println("Diary is empty");
        }
        diaryEntryMenu(diary);
    }

    private void viewEntries() {
        System.out.println("-----Entries-----");
        try {
            for (int i = 1; i <= diary.size(); i++) {
                Entry entry = diary.findEntryById(i);
                System.out.println(entry);
            }
        }catch (NullPointerException e){
            System.out.println("Diary is empty");
        }
        diaryEntryMenu(diary);
    }

    private void createEntry() {
        System.out.println("Enter title: ");
        String title = input.nextLine();
        System.out.println("Enter body: ");
        String body = input.nextLine();
        int entryId = diary.createEntry(title, body);
        System.out.println("Entry ID: " + entryId);
        System.out.println("Entry created successfully!");
        diaryEntryMenu(diary);
    }

    public void exit(){
        System.out.println("Goodbye!!!");
    }

    public int validateIntInput(Scanner input) {
        boolean validInput = false;
        int response = 0;

        while(!validInput){
            try {
                String userInput = input.nextLine().trim();
                if (userInput.isEmpty()) System.out.println("Input cannot be empty. Please enter a valid integer.");
                response = Integer.parseInt(userInput);
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
                input.nextLine();
            }
        }
        return response;
    }

    public String validateStringInput(Scanner input) {
        String response = "";
        boolean validInput = false;

        while (!validInput) {
            try {
                response = input.nextLine().trim();
                if (response.isEmpty()) throw new IllegalArgumentException("Input cannot be empty.");
                if (response.contains(" ")) throw new IllegalArgumentException("Input cannot contain consecutive spaces.");
                validInput = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return response;
    }
}