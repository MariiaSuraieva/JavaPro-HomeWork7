package phonebook;

import java.util.ArrayList;

public class PhoneBook {
    public static void main(String[] args) {
        ArrayList<Note> phoneBook = new ArrayList<>();
        Note note = new Note("Kotlovskyi","0636573414");
        Note note1 = new Note("Markovskaya","0636577667");
        Note note2 = new Note("Kotlovskyi","0937894556");
        Note note3 = new Note("Tirchenko","0986206453");
        Note note4 = new Note("Vasilenko","0665672334");
        Note note5 = new Note("Kotlovskyi","0674567887");
        addNote(phoneBook,note);
        addNote(phoneBook,note1);
        addNote(phoneBook,note2);
        addNote(phoneBook,note3);
        addNote(phoneBook,note4);
        addNote(phoneBook,note5);


        System.out.println(findAll(phoneBook,"Kotlovsky"));

    }



   public static void addNote(ArrayList<Note> phoneBook, Note note){
       phoneBook.add(note);
   }

   public static ArrayList<String> findAll(ArrayList<Note> phoneBook, String name){
        ArrayList<String> newArray = new ArrayList<>();
       for (int i = 0; i < phoneBook.size(); i++) {
           if(phoneBook.get(i).getName().equals(name))
               newArray.add(phoneBook.get(i).getName() + " - " + phoneBook.get(i).getPhoneNumber());
       }
       if(newArray.isEmpty())
           return null;
       return newArray;
   }
}
