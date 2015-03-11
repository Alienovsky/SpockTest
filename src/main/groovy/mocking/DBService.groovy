package mocking

/**
 * Created by Alien on 2015-03-11.
 */
class DBService {
    Dao dao;

    Integer getIdFromDB(){
        Integer id = new Integer();
        id = dao.retrieveId();
        return id;
    }

    Boolean getIsDataFromDB(){
        Boolean isData = new Boolean();
        isData = dao.retrieveIsData();
        return isData;
    }

}
