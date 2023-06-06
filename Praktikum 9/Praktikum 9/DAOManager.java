/**
 * File : DAOManager.java 06/06/2023
 * Penulis : Niko Geraldi Sinabariba
 * Deskripsi : Pengelola DAO dalam program
*/

public class DAOManager {
    private PersonDAO personDAO;
    public void setPersonDAO(PersonDAO person){
        personDAO = person;
    }

    public PersonDAO getPersonDAO(){
        return personDAO;
    }
}
