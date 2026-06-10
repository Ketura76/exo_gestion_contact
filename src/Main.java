public class Main {
    public static void main(String[] args) {


        ContactsManager myContactsManager = new ContactsManager();


        Contact contact1 = new Contact();
        contact1.name = "Ketura";
        contact1.phoneNumber = "0701020304";
        contact1.adresse = "Abobo";
        myContactsManager.addContact(contact1);


        Contact contact2 = new Contact();
        contact2.name = "Jean";
        contact2.phoneNumber = "0705060708";
        myContactsManager.addContact(contact2);


        Contact contact3 = new Contact();
        contact3.name = "Marie";
        contact3.phoneNumber = "0709101112";
        myContactsManager.addContact(contact3);


        Contact contact4 = new Contact();
        contact4.name = "Paul";
        contact4.phoneNumber = "0713141516";
        myContactsManager.addContact(contact4);


        Contact contact5 = new Contact();
        contact5.name = "Sophie";
        contact5.phoneNumber = "0717181920";
        myContactsManager.addContact(contact5);


        Contact resultat = myContactsManager.searchContact("Ketura");

        if (resultat != null) {
            System.out.println("Contact trouvé !");
            System.out.println("Nom : " + resultat.name);
            System.out.println("Téléphone : " + resultat.phoneNumber);
            System.out.println("Adresse : " + resultat.adresse);
        } else {
            System.out.println("Contact introuvable.");
        }
    }
}