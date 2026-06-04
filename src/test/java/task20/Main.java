package task20;

public class Main {
    public static void main(String[] args) {
        PutPetTests petPost = new PutPetTests();
        GetPetTest petGet = new GetPetTest();
        DeletePetTest petDelete = new DeletePetTest();

        petPost.verifyPetCanBeModified("TestName", 6564);
        petGet.petExist(232323);
        petDelete.deletePet(232323);
        
    }
}
