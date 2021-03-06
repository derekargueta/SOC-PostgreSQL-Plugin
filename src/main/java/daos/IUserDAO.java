package daos;

import server.persistence.dto.UserDTO;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Kyle 'TMD' Cornelison on 4/5/2016.
 */
public interface IUserDAO {
    /**
     * Handles adding a user
     * @param dto
     */
    int addUser(UserDTO dto) throws SQLException;

    /**
     * Handles verifying user which returns userID
     *
     * @return
     */
    List<UserDTO> getUsers() throws SQLException;


    /**
     * delete a user
     */
    void deleteUsers() throws SQLException;
}
