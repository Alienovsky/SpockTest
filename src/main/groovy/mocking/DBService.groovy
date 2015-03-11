package mocking

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

    String getAllDataAsString(){
        Integer id = dao.retrieveId();
        Boolean isData= dao.retrieveIsData();
        return id.toString() + " " + isData;
    }


}
