/**
 * File : DAOManager.java 06/06/2023
 * Penulis : Niko Geraldi Sinabariba
 * Deskripsi : Main program untuk akses DAO
*/

public class MainDAO {
    public static void main(String args[]){
        Person person = new Person("rio");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        try{
            m.getPersonDAO().savePerson(person);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
